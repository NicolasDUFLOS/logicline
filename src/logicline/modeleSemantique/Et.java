package logicline.modeleSemantique;

import java.util.Set;

public class Et extends Formule {
	
	protected Formule left;
	protected Formule right;
	
	public Et(Formule left, Formule right){
		this.left = left;
		this.right = right;
	}

	@Override
	public String toString() {
		return left.toString() + " ∧ " + right.toString();
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
