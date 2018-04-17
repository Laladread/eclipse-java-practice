public class SumArray1
{
   public static void main(String[] args)
   {
      double[] a = { 2.3, 3.4 , 4.5, 5.6, 6.7, 7.8, 8.9 }; // 7 elements
      
      
      //Scanner in = new Scanner(System.in);
      //int n;
      //double[] a;
     
     
      //System.out.print("How many numbers in input: ");
      //n = in.nextInt();                  // n = # values
      
      //a = new double[n];      // Create an array of n elements
      //int i;
     
    	/* ------------------
    	   Read in the values
    	   ------------------ */
    	//for ( i = 0; i < a.length; i++ )
    	//{
    	 //System.out.print("Enter a number: ");
    	 // a[i] = in.nextDouble();            // Read in number
    	//}
     
      int i;            // Array index
      double sum;       // Running sum

      sum = 0.0;

      for ( i = 0 ; i < a.length ; i++ )
      {
         sum = sum + a[i];    // Add a[i] to the running sum
                              // Common error: sum = a[i]
                              // This will store a[i] into sum
      }

      System.out.println( sum );
   }
}