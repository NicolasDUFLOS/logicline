package logicline.modeleSemantique;

import java.util.HashSet;
import java.util.Set;

public class Implique extends Formule {
	
	protected Formule left;
	protected Formule right;
	
	public Implique(Formule left, Formule right){
		this.left = left;
		this.right = right;
	}

	@Override
	public String toString() {
		return "(" + left.toString() + " ⇒ " + right.toString() + ")";
	}

	@Override
	public Set<String> variablesLibres() {
		HashSet<String> res= new HashSet<String>();
		res.add(this.left.toString());
		res.add(this.right.toString());
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
