package br.cefet.aps.bnf;

public abstract class Expression {
	private Expression expression;
	private Term term;
	
	protected Expression(){
		super();
	}
	
	public Expression(Expression expression, Term term){
		super();
		this.expression = expression;
		this.term = term;
	}
	
	//Protected Setters
	protected void setExpression(Expression expression) {
		this.expression = expression;
	}

	protected void setTerm(Term term) {
		this.term = term;
	}

	public double calculate(){
		if(expression != null)
			return term.calculate() + expression.calculate();
		else
			return term.calculate();
	};
	

}
