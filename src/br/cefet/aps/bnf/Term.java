package br.cefet.aps.bnf;

public abstract class Term{
	private Term term;
	private Constant constant;
	
	protected Term(){
		super();
	}
	
	public Term(Term term, Constant constant){
		super();
		this.term = term;
		this.constant = constant;
		
	}
	
	public Term(Constant constant){
		this.constant = constant;
	}
	
	protected void setTerm(Term term){
		this.term = term;
	}
	
	protected void setConstant(Constant constant){
		this.constant = constant;
	}
	
	public double calculate() {
		if(term != null)
			return constant.calculate() * term.calculate();
		else
			return constant.calculate();
	}

}
