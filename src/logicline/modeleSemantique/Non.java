package logicline.modeleSemantique;

import java.util.Set;

public class Non extends Formule {
	
	protected Formule formule;
	
	public Non (Formule formule){
		this.formule = formule;
	}

	@Override
	public String toString() {
		return "¬" + formule.toString();
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
