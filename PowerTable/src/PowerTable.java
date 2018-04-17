/**
 * This program prints a table of powers of x
 * @author LalaDread
 *
 */
public class PowerTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		final int nCol = 4;
		final double nRow = 10;
		
		// Print table header
		
		for (int n = 1; n <= nCol; n++)
		{
			System.out.printf("%10d", n);
		}
		System.out.println();
		
			for (int n = 1;n <= nCol; n++)
			{
				System.out.printf("%10s", "x");
			}
		
		System.out.println();
		
		//Print table body
		
				for(double x = 1; x <= nRow; x++)
					{
						//Print table row
					
					for(int n = 1; n <= nCol; n++)
						{
							System.out.printf("%10.0f", Math.pow(x,n));
						}
					System.out.println();
					}

	}

}
