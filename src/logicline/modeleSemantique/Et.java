package logicline.modeleSemantique;

import java.util.HashSet;
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
		HashSet<String> res= new HashSet<String>();
		res.addAll(this.left.variablesLibres());
		res.addAll(this.right.variablesLibres());
		return res;
	}

	@Override
	public Formule substitue(Substitution s) {
		return new Et(left.substitue(s), right.substitue(s));
	}

	@Override
	public boolean valeur() throws VariableLibreException {
		// TODO Auto-generated method stub
		return false;
	}
	
	public Formule supprImplications(){
		return new Et(left.supprImplications(), right.supprImplications());
	}

	protected Formule negation() {
		return new Et(left.negation(), right.negation());
	}
	
	public Formule entrerNegations(){
		return new Et(left.entrerNegations(), right.entrerNegations());
	}
	
	public boolean contientEt(){
		return true;
	}
	
}
