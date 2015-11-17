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

	}

	@Override
	public void exitDecl(MiniCParser.DeclContext ctx) {
		int count = ctx.getChildCount();
		if (count == 5) {
			
		} else if (count == 3) {

		} else if (count == 6) {
			String[] s = new String[6];
			s[0] = newTexts.get(ctx.getChild(0));
			s[1] = ctx.getChild(1).getText();
			s[2] = ctx.getChild(2).getText();
			s[3] = newTexts.get(ctx.getChild(3));
			s[4] = ctx.getChild(4).getText();
			s[5] = newTexts.get(ctx.getChild(5));
			
			newTexts.put(ctx, s[0]+" "+s[1]+" "+s[2]+s[3]+s[4]+"\n"+s[5]);
		}
	}

	@Override
	public void exitFun_decl(MiniCParser.Fun_declContext ctx) {

	}

	@Override
	public void exitIf_stmt(MiniCParser.If_stmtContext ctx) {

	}

	@Override
	public void exitProgram(MiniCParser.ProgramContext ctx) {
		String s1 = null;
		s1 = newTexts.get(ctx);
		System.out.println(s1);
	}

	@Override
	public void exitParams(MiniCParser.ParamsContext ctx) {
		int count = ctx.getChildCount();
		if(count==1){
			newTexts.put(ctx, ctx.getText());
		}else{
			
		}
	}

	@Override
	public void exitExpr_stmt(MiniCParser.Expr_stmtContext ctx) {

	}

	@Override
	public void exitCompound_stmt(MiniCParser.Compound_stmtContext ctx) {

	}

	@Override
	public void exitArgs(MiniCParser.ArgsContext ctx) {

	}

	@Override
	public void exitLocal_decl(MiniCParser.Local_declContext ctx) {

	}

	@Override
	public void exitType_spec(MiniCParser.Type_specContext ctx) {
		newTexts.put(ctx, ctx.getText() + " ");
	}

	@Override
	public void exitParam(MiniCParser.ParamContext ctx) {

	}

	@Override
	public void exitExpr(MiniCParser.ExprContext ctx) {
		String s1 = null, s2 = null, op = null;
		if (isBinaryOperation(ctx)) {
			s1 = newTexts.get(ctx.expr(0));
			s2 = newTexts.get(ctx.expr(1));
			op = ctx.getChild(1).getText();
			newTexts.put(ctx, s1 + " " + op + " " + s2);
		}
	}

	@Override
	public void exitVar_decl(MiniCParser.Var_declContext ctx) {

	}

	@Override
	public void exitStmt(MiniCParser.StmtContext ctx) {

	}

	@Override
	public void exitReturn_stmt(MiniCParser.Return_stmtContext ctx) {

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
