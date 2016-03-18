package logicline.modeleSemantique;

import java.util.HashSet;
import java.util.Set;

public class Variable extends Formule {

	protected String var;

	public Variable(String var) {
		this.var = var;
	}

	public String toString() {
		return "("+this.var + ")";
	}

	public Set<String> variablesLibres() {
		HashSet<String> res= new HashSet<String>();
		res.add(this.var);
		return res;
	}

	public Formule substitue(Substitution s) {
		Formule f = s.get(toString());
		if ((f == null))
			return this;
		else
			return f;
	}
	

	public boolean valeur() throws VariableLibreException {
		// TODO Auto-generated method stub
		return false;
	}

}
