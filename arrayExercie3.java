package Package;

public class arrayExercie3 {

	public static void main(String[] args) {

		int [] [] t = new int [10] [] ;
		
        for (int i=0 ; i<10 ; i++)
        { t[i] = new int [i+1] ;
        for (int j=0 ; j<t[i].length ; j++)
        t[i] [j] = i+j ;

        }

        for (int i=0 ; i<10 ; i++){ 
        	System.out.print ("tableau numero " + i + " = ");
        	for (int j=0 ; j<t[i].length ; j++)
        	System.out.print (t[i] [j] +" ") ;
        System.out.println () ;

        }
        
	}

}
