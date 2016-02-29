package logicline.modeleSemantique;

import java.util.Set;

public class Implique extends Formule {
	
	protected Formule left;
	protected Formule rigth;
	
	public Implique(Formule left, Formule rigth){
		this.left = left;
		this.rigth = rigth;
	}

	@Override
	public String toString() {
		return left.toString() + "=>" + rigth.toString();
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
