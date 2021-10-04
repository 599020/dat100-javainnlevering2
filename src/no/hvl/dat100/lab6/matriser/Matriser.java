package no.hvl.dat100.lab6.matriser;

public class Matriser {

	// a)
	public static void skrivUt(int[][] matrise) {
		
		for (int [] rad : matrise) {
			
			for ( int plass : rad ) {
				System.out.print(plass + " ");
			}
		System.out.println();
		}
	}

	// b)
	public static String tilStreng(int[][] matrise) {

		String utSkrift = "";
		
		for (int [] rad : matrise) {
			System.out.print("\n");
			for (int plass : rad ) {
				utSkrift = plass + ",";
				System.out.print(utSkrift + " ");
			}
			
		}
			System.out.println();
			return utSkrift;
	}

	// c)
	public static int skaler(int tall, int[][] matrise) {
		
		int sum = 0;
		
		for (int [] rad : matrise) {
			
			for ( int plass : rad ) {
				 sum = plass * tall;
				 if (sum < 10) {
					 System.out.print(sum + "  ");
				 }
				 else 
				System.out.print(sum + " ");
			}
			System.out.println();
		}
		return sum;



	}

	// d)
	public static boolean erLik(int[][] a, int[][] b) {
		
		boolean like = true;
		
		for (int r = 0; r < a.length; r++) {
			
			for ( int p = 0; p < a[r].length; p++ ) {
				if (a[r][p] != b[r][p]) {
					like = false;
					
					
				}
				 
			}
		}
		System.out.println(like);
		return like;
		

	}
		
	
	// e)
	public static int[][] speile(int[][] matrise) {

		// Valgte ikke å gjøre denne
		throw new UnsupportedOperationException("speile ikke implementert");
	
	}

	// f)
	public static int[][] multipliser(int[][] a, int[][] b) {

		// Valgte ikke å gjøre denne
		throw new UnsupportedOperationException("multipliser ikke implementert");
	
	}
}
