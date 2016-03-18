package logicline.modeleSemantique;

import java.util.HashSet;
import java.util.Set;

public class Equivalence extends Formule {
	
	protected Formule left;
	protected Formule right;
	
	public Equivalence (Formule left, Formule right){
		this.left = left;
		this.right = right;
	}
	
	@Override
	public String toString() {
		return "(" + left + ") ⇔ (" + right + ")";
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
		return new Equivalence(left.substitue(s), right.substitue(s));
	}

	@Override
	public boolean valeur() throws VariableLibreException {
		// TODO Auto-generated method stub
		return false;
	}
	
	@Override
	public Formule supprImplications() {
		return new Et(new Ou(new Non(left.supprImplications()),
				right.supprImplications()), new Ou(left.supprImplications(),
				new Non(right.supprImplications())));
	}
	
	public boolean contientEt(){
		return left.contientEt() || right.contientEt();
	}
}
