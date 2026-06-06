
public class Studente extends Persona{
	
	int matricola;

	Studente(String nome, String cognome, int eta, int m){
		super(nome, cognome, eta);
		this.matricola = m;
	}
	
	/*
	 * FONDAMENTALE il concetto di super qui... Studente è un sotto insieme di Persona, quindi condivide attributi con Persona.
	 * Volendo definire un costruttore per Studente in cui si utilizzano attributi di Persona, dobbiamo far riferimento a
	 * quello che è stato definito in persona... Per fare questo usiamo il super... quindi super dice alla classe di Studente
	 * di guardare quello che è stato definito per la classe dalla quale viene estesa, Persona.
	 * 
	 * Importante notare che una classe puo essere sottoinsieme di un'altra sola classe. Questo implica che Super è univoco,
	 * una volta che gli attributi sono quelli di Persona solo...
	 * 
	 * Un altro punto: super deve corispondere ad uno dei costruttori di persona. Ci ricordiamo che i costruttori di persona
	 * variano in base agli argomenti (numero, ordine e tipo).. Nel presente caso abbiamo 1 solo costruttore di persona
	 * con 3 argomenti: nome, cognome e età. Quindi super dovrà essere super(String nome, String cognome, int eta).
	 * Se definessimo un altro costruttore per persona, potremmo definire un super diverso, per quel costruttore in particolare.
	 * 
	 * Si chiama super perché Persona è una superclasse di Studente.
	 * */
	
	/*
	 * definendo un metodo toString per Studente
	 * */
	
	@Override
	public String toString() {
		return this.nome + " " + this.cognome + ", " + eta + "; " + matricola;
	}
	
	/*
	 * Il triangolo verde nella riga di toString indica che stiamo facendo l'override del metodo definito in Persona.
	 * Eclipse lo fa in automatico. Possimao anche esplicitare con @Override (non obbligatorio).
	 * */
}
