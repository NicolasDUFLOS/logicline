package logicline.modeleSemantique;

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
		// TODO Auto-generated method stub
		return null;
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
