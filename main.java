import java.util.*;


public class main {
	
	public static void printListaPersona(LinkedList<Persona> l) {
		for(Persona i:l) {
			System.out.println(i.toString());
		}
	}

	public static void main(String[] args) {
		System.out.println("\nPossiamo introdurre il concetto di oggetti uguale con il seguente esempio:");
		Persona persona1 = new Persona("Andre", "Baffini", 26);
		Persona persona2 = new Persona("Andre", "Baffini", 26);
		
		LinkedList<Persona> lista1 = new LinkedList<Persona>();
		lista1.add(persona1);
		
		System.out.println("\nLa lista colegata è:" + lista1);
		//questo stampa informazioni sulla classe, non il contenuto della lista...
		//per farlo abbiamo costruito un metodo:
		printListaPersona(lista1);
		System.out.println("\nContiene p1? " + lista1.contains(persona1));
		System.out.println("\nContinene p2? " + lista1.contains(persona2));
		
		/*
		 * Dobbbiamo ricordare che int[] a = {1,2,3,4} è un ARRAY, quindi imutabile... non abbiamo metodi come add ecc.
		 * */
		
		/*
		 * Sarebbe possibile definire un metodo che da l'uguagliaza di oggetti in base al contenuto, non se sono
		 * lo stesso oggetto o meno.
		 * */
		
		/*
		 * Ora vediamo i concetti di extends e implements... essenzialmente il primo viene utilizzatto quando una classe è sotto insieme
		 * di un'altra classe e quindi può ereditare gli attributi e metodi di quella classe (eventualmente facendo l'override.
		 * implements viene utilizzatto quando la classe dalla quale vogliamo ereditare attributi e metodo è una classe abstract.
		 * 
		 * Per questo introdurremo due nuove classi: studente e professore.
		 * Chiaramente entrambe sono sottoinsiemi di Persona. Avranno metodo specifici e magari attributi in più,
		 * ma dovranno ereditare gli attributi di persona, che è comune ad entrambe le classi.
		 * */
		
		System.out.println("\nStudio classe Studente e Professore");
		Studente studente1 = new Studente("Andre", "Baffini", 26, 123456);
		System.out.println(studente1.toString());
		
		System.out.println("\nEsempio di Studente sottoinsieme di Persona");
		
		Persona persona3 = (Persona) studente1;
		System.out.println("\nPrint persona3: " + persona3.toString());
		
		//usa il metodo di Studente, non di persona..
		System.out.println("\nInstance of Persona? ");
		System.out.println(persona3 instanceof Persona);
		System.out.println("Instance of Studente? ");
		System.out.println(persona3 instanceof Studente);
		
		/*
		 * Proviamo ad specificare l'uniqueIdentifier per uno studente
		 * */
		
		System.out.println("\nUniqueIdentifier Studente: testing private variable:");
		Studente studente2 = new Studente("Andre", "Baffini", 26, 123456);
		studente2.setUniqueIdentifier(1293802932);
		System.out.println("\nUniqueIdentifier studente2: " + studente2.getUniqueIdentifier());
		
		/*
		 * Come possiamo notare, siccome Studente è una sottoclasse di Persona, eredita i suoi metodi ed attributi.
		 * In particolare eredita uniqueIdentifier ed i metodo per settarlo ed accederlo.
		 * */

	}

}
