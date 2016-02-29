package logicline.modeleSemantique;

import java.util.HashSet;
import java.util.Set;

public class Constante extends Formule {
	
	protected boolean cons;

	public Constante(boolean cons) {
		this.cons = cons;
	}
	@Override
	public String toString() {
		if (this.cons)
			return "T";
		else
			return "⊥";
	}

	@Override
	public Set<String> variablesLibres() {
		HashSet<String> res= new HashSet<String>();
		res.add(this.toString());
		return res;
	}

	@Override
	public Formule substitue(Substitution s) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean valeur() throws VariableLibreException {
		// TODO Auto-generated method stub
		return false;
	}

}
