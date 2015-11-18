package main;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTreeProperty;
import org.antlr.v4.runtime.tree.TerminalNode;

public class MiniCPrintListener extends MiniCBaseListener {
	ParseTreeProperty<String> newTexts = new ParseTreeProperty<String>();

	boolean isBinaryOperation(MiniCParser.ExprContext ctx) {
		return ctx.getChildCount() == 3 && ctx.getChild(1) != ctx.expr();
		// ��(�� expr ��)���� ����
	}

	@Override
	public void exitWhile_stmt(MiniCParser.While_stmtContext ctx) {
		String tmp = "";
		tmp += ctx.getChild(0).getText() + " (" + newTexts.get(ctx.getChild(2)) + ")\n" + newTexts.get(ctx.getChild(4));
		newTexts.put(ctx, tmp);
	}

	@Override
	public void enterVar_decl(MiniCParser.Var_declContext ctx) {
		int count = ctx.getChildCount();
		String tmp = "";
		if (count == 3) {
			tmp += newTexts.get(ctx.getChild(0)) + " " + ctx.getChild(1).getText() + ";";
		} else {
			tmp += newTexts.get(ctx.getChild(0)) + " " + ctx.getChild(1).getText() + "[];";
		}
		newTexts.put(ctx, tmp);
	}

	@Override
	public void exitDecl(MiniCParser.DeclContext ctx) {
		// System.out.println(newTexts.get(ctx.getChild(0)));
		newTexts.put(ctx, newTexts.get(ctx.getChild(0)));
	}

	@Override
	public void exitFun_decl(MiniCParser.Fun_declContext ctx) {
		String[] s = new String[6];
		s[0] = newTexts.get(ctx.getChild(0));
		s[1] = ctx.getChild(1).getText();
		s[2] = ctx.getChild(2).getText();
		s[3] = newTexts.get(ctx.getChild(3));
		s[4] = ctx.getChild(4).getText();
		s[5] = newTexts.get(ctx.getChild(5));

		// System.out.println(s[0] + " " + s[1] + " " + s[2] + s[3] + s[4] +"\n"
		// + s[5]);
		newTexts.put(ctx, s[0] + " " + s[1] + " " + s[2] + s[3] + s[4] + "\n" + s[5]);
	}

	@Override
	public void exitIf_stmt(MiniCParser.If_stmtContext ctx) {
		int count = ctx.getChildCount();
		String tmp = "";
		if (count == 5) {
			tmp += ctx.getChild(0).getText() + " (" + newTexts.get(ctx.getChild(2)) + ")\n"
					+ newTexts.get(ctx.getChild(4));
		} else {
			tmp += ctx.getChild(0).getText() + " (" + newTexts.get(ctx.getChild(2)) + ")\n"
					+ newTexts.get(ctx.getChild(4)) + "\n" + ctx.getChild(5).getText() + "\n"
					+ newTexts.get(ctx.getChild(6));
		}
		newTexts.put(ctx, tmp);
	}

	@Override
	public void exitProgram(MiniCParser.ProgramContext ctx) {
		int count = ctx.getChildCount();
		String tmp = "";
		for (int i = 0; i < count; i++) {
			tmp += newTexts.get(ctx.getChild(i)) + "\n\n";
		}
		System.out.println("\n" + tmp);
	}

	@Override
	public void exitParams(MiniCParser.ParamsContext ctx) {
		int count = ctx.getChildCount();
		if (count == 1) {
			// System.out.println(ctx.getChild(0).getText());
			newTexts.put(ctx, ctx.getChild(0).getText());
		} else {
			String tmp = "";
			for (int i = 0; i < count; i++) {
				if (i % 2 == 0) {
					tmp += newTexts.get(ctx.getChild(i));
				} else {
					tmp += ",";
				}
			}
			// System.out.println(tmp);
			newTexts.put(ctx, tmp);
		}
	}

	@Override
	public void exitExpr_stmt(MiniCParser.Expr_stmtContext ctx) {
		String tmp = "";
		tmp += newTexts.get(ctx.getChild(0)) + ";";
		newTexts.put(ctx, tmp);
	}

	@Override
	public void exitCompound_stmt(MiniCParser.Compound_stmtContext ctx) {
		int count = ctx.getChildCount();
		String tmp = "";
		String y = ctx.getParent().getParent().getChild(0).getText();
		// System.out.println(y);

		if (y.equals("while")) {
			for (int i = 0; i < count; i++) {
				if (i == 0) {
					tmp = "    {\n";
				} else if (i == count - 1) {
					tmp += "    }";
				} else {
					tmp += "        " + newTexts.get(ctx.getChild(i)) + "\n";
				}
			}
		} else if (y.equals("if")) {
			for (int i = 0; i < count; i++) {
				if (i == 0) {
					tmp = "        {\n";
				} else if (i == count - 1) {
					tmp += "        }";
				} else {
					tmp += "            " + newTexts.get(ctx.getChild(i)) + "\n";
				}
			}
		} else {
			for (int i = 0; i < count; i++) {
				if (i == 0) {
					tmp = "{\n";
				} else if (i == count - 1) {
					tmp += "}";
				} else {
					tmp += "    " + newTexts.get(ctx.getChild(i)) + "\n";
				}
			}
		}
		newTexts.put(ctx, tmp);

	}

	@Override
	public void exitArgs(MiniCParser.ArgsContext ctx) {
		String tmp = "";
		tmp += newTexts.get(ctx.getChild(0)) + "," + newTexts.get(ctx.getChild(2));
		newTexts.put(ctx, tmp);
	}

	@Override
	public void exitLocal_decl(MiniCParser.Local_declContext ctx) {
		int count = ctx.getChildCount();
		String tmp = "";
		if (count == 3) {
			tmp += newTexts.get(ctx.getChild(0)) + " " + ctx.getChild(1).getText() + ";";
		} else {
			tmp += newTexts.get(ctx.getChild(0)) + " " + ctx.getChild(1).getText() + "[];";
		}
		newTexts.put(ctx, tmp);
	}

	@Override
	public void exitType_spec(MiniCParser.Type_specContext ctx) {
		// System.out.println(ctx.getText());
		newTexts.put(ctx, ctx.getText());
	}

	@Override
	public void exitParam(MiniCParser.ParamContext ctx) {
		int count = ctx.getChildCount();
		if (count == 2) {
			String[] s = new String[2];
			s[0] = newTexts.get(ctx.getChild(0));
			s[1] = ctx.getChild(1).getText();
			// System.out.println(s[0]+" "+s[1]);
			newTexts.put(ctx, s[0] + " " + s[1]);
		} else {
			String tmp = "";
			tmp += newTexts.get(ctx.getChild(0)) + " " + ctx.getChild(1).getText() + "[]";
			newTexts.put(ctx, tmp);
		}
	}

	@Override
	public void exitExpr(MiniCParser.ExprContext ctx) {
		String s1 = null, s2 = null, op = null;
		int count = ctx.getChildCount();
		if (isBinaryOperation(ctx)) {
			s1 = newTexts.get(ctx.getChild(0));
			if (s1 == null) {
				s1 = ctx.getChild(0).getText();
			}
			s2 = newTexts.get(ctx.getChild(2));
			op = ctx.getChild(1).getText();
			// System.out.println(s1 + " " + op + " " + s2);
			newTexts.put(ctx, s1 + " " + op + " " + s2);
		} else if (count == 3) {
			String tmp = "";
			tmp += "(";
			tmp += newTexts.get(ctx.getChild(1)) + ")";
			newTexts.put(ctx, tmp);
		} else if (count == 1) {
			newTexts.put(ctx, ctx.getText());
		} else if (count == 4) {
			String tmp = "";
			tmp += ctx.getChild(0).getText() + " (" + newTexts.get(ctx.getChild(2)) + ")";
			newTexts.put(ctx, tmp);
		} else if (count == 6) {
			String tmp = "";
			tmp += ctx.getChild(0).getText() + "[" + newTexts.get(ctx.getChild(2))+"] = " + newTexts.get(ctx.getChild(5));
			newTexts.put(ctx, tmp);
		} else {
			String tmp = "";
			tmp += ctx.getChild(0).getText() + " " + newTexts.get(ctx.getChild(2));
			newTexts.put(ctx, tmp);
		}
	}

	@Override
	public void exitVar_decl(MiniCParser.Var_declContext ctx) {
		int count = ctx.getChildCount();
		if (count == 3) {
			String[] s = new String[2];
			s[0] = newTexts.get(ctx.getChild(0));
			s[1] = ctx.getChild(1).getText();
			// System.out.println(s[0]+" "+s[1]);
			newTexts.put(ctx, s[0] + " " + s[1]+";");
		} else {
			String tmp = "";
			tmp += newTexts.get(ctx.getChild(0)) + " " + ctx.getChild(1).getText() + "[];";
			newTexts.put(ctx, tmp);
		}
	}

	@Override
	public void exitStmt(MiniCParser.StmtContext ctx) {
		newTexts.put(ctx, newTexts.get(ctx.getChild(0)));
	}

	@Override
	public void exitReturn_stmt(MiniCParser.Return_stmtContext ctx) {
		String tmp = "";
		tmp += ctx.getChild(0).getText() + " " + newTexts.get(ctx.getChild(1)) + ";";
		newTexts.put(ctx, tmp);
	}

	@Override
	public void exitEveryRule(ParserRuleContext ctx) {
	}

	@Override
	public void visitTerminal(TerminalNode node) {

	}

	@Override
	public void visitErrorNode(ErrorNode node) {

	}
}
