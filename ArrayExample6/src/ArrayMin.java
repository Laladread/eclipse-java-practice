
public class ArrayMin {
	
	public static void main(String[] args)
    {
 	 double[] a = { 2.3, 3.4 , 4.5, 5.6, 1.2, 7.8, 8.9 }; // 7 elements   
  
 	 int i;              // array index
	 int min_i;          // Current index with min value
     double min;	     // min = a[min_i] for efficiency
 
     min_i = 0;          // Assume a[0] is the current min. value
	 min = a[0];	     // For efficiency

 	 for ( i = 1 ; i < a.length ; i++ )
 	 {
 	    if ( a[i] < min ) 
 	    {
 	      min_i = i;  // Found a smaller min. value, update min_i
	      min = a[i]; // For efficiency
 	    }
 	 }
  
 	 System.out.println( min_i );  
 	 System.out.println( a[min_i] );
    }

}
