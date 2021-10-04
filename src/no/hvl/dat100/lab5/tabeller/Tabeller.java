package no.hvl.dat100.lab5.tabeller;

public class Tabeller {

	// a)
	public static void skrivUt(int[] tabell) {

		for (int i = 0; i < tabell.length; i++) {
			System.out.print(tabell[i] + " ");
			}
		System.out.println();
	}
	

	

	// b)
	public static String tilStreng(int[] tabell) {

		String Utskrift = "";
		
		for (int i = 0; i < tabell.length; i++) {
			Utskrift += tabell[i] + ",";
		}
		System.out.print("[" + Utskrift + "]");
		System.out.println();
		return Utskrift;
		
		
	}

	// c)
	public static int summer(int[] tabell) {

		int i = 0;
		int sum = 0;
		while (i < tabell.length){
			sum += tabell[i];
			i++;
		}
		System.out.println("Summen av alle elementene er: " + sum);
		return sum;
		}

	// d)
	public static boolean finnesTall(int[] tabell, int tall) {

		boolean funnet = false;
		int i = 0;
		
		while (i < tabell.length && !funnet) {
			if (tabell[i] == tall) {
				funnet = true;
			}
			i++;
		}
			
		System.out.println(funnet);
		return funnet;
		
			
		}

	// e)
	public static int posisjonTall(int[] tabell, int tall) {

		int i = 0;
		
		while (i < tabell.length && tabell[i] != tall && tabell [i] != -1) {
			i++;
				}
		System.out.println("Posisjon: " + i);
			return i;
		
	 }

	// f)
	public static int[] reverser(int[] tabell) {

		for (int i = tabell.length - 1; i >= 0; i--) {
			System.out.print(tabell[i] + " ");
		}
		System.out.println();
		return tabell;
	}

	// g)
	public static boolean erSortert(int[] tabell) {

		boolean sortert = true;
		int i = 1;
		
		while (sortert && i < tabell.length) {
			if (tabell[i-1] <= tabell[i])
				i++;
			else
				sortert = false;
		}
		System.out.print(sortert);
		System.out.println();
		return sortert;
		}

	// h)
	public static int [] settSammen(int[] tabell1, int[] tabell2) {
		
		
		
		int i = 0;
		int t = 0;
		
		while (i < tabell1.length  && t < tabell2.length  ) {
		
		if (i == tabell1.length ) {
			
			for ( t = tabell1 [t]; t < tabell2.length; t++) {
				System.out.print(tabell1[t] + " ");
			}
			
	 }
		
		
		else if (t == tabell2.length ) {
			
			for ( i = tabell1 [i]; i < tabell1.length; t++) {
				System.out.print(tabell1[i] + " ");
			}
		}
		
		else if (tabell1 [i] <= tabell2 [t]) {
		System.out.print(tabell1 [i] + " " );	
		i++;
		}
		
		
		   
		
		
		else if (tabell1 [i] >= tabell2 [t]) {
		System.out.print(tabell2[t] + " ");
		t++;
		}
		
		
		}
		return tabell2;

}
	
}
