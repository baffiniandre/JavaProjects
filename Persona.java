
public class Persona {

	String nome;
	String cognome;
	int eta;
	/*
	 * Per uno esempio di private: caso in cui non possiamo accedere alla variabile direttamente con instanceOfClass.VariabilePrivate = newValue.
	 * Per accedere solo tramite un approsito metodo.
	 */
	private Integer uniqueIdentifier;
	
	Persona(String n, String c, int e){
		this.nome = n;
		this.cognome =c;
		this.eta = e;
	}
	
	@Override
	public String toString() {
		return nome + " " + cognome + ", " + eta;
	}
	
	/*
	 * FONDAMENTALE: il decorator @Override è essenziale per far funzionare il metodo come abbiamo visto.
	 * senza questo, il metodo toString non viene impostato come abbiamo definito, il il sistemo utilizza quello
	 * standard, che stampa className@System.identityHashCode().
	 * */
	
	public void setUniqueIdentifier(int newValue) {
		if(newValue <0) {
			throw new RuntimeException("Invalid Identifier");
		} else {
			this.uniqueIdentifier = newValue;
		}
		
	}
	
	public boolean identifierDefined() {
		if(!this.uniqueIdentifier.equals(null)) { //uso la classe Integer per poter utilizzare il metodo equals.
			return true;
		} else {
			return false;
		}
	}
	
	public int getUniqueIdentifier() {
		if(!identifierDefined()) {
			throw new RuntimeException("uniqueIdentifier not present");
		} else {
			return uniqueIdentifier;
		}
	}

	
}
