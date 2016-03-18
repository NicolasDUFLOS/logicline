package logicline.modeleSemantique;

import java.util.HashSet;
import java.util.Set;

public class Non extends Formule {
	
	protected Formule formule;
	
	public Non (Formule formule){
		this.formule = formule;
	}

	@Override
	public String toString() {
		return "(¬" + formule.toString() + ")";
	}

	@Override
	public Set<String> variablesLibres() {
		HashSet<String> res= new HashSet<String>();
		res.addAll(this.formule.variablesLibres());
		return res;
	}

	@Override
	public Formule substitue(Substitution s) {
		return new Non(formule.substitue(s));
	}

	@Override
	public boolean valeur() throws VariableLibreException {
		// TODO Auto-generated method stub
		return false;
	}
	
	public Formule supprImplications(){
		return new Non(formule.supprImplications());
	}
	
	public Formule negation(){
		return formule.entrerNegations();
	}
	
	public Formule entrerNegations(){
		return formule.negation();
	}
	
	public boolean contientEt(){
		return formule.contientEt();
	}

}
