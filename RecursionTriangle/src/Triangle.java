/**
		 * A triangular shape composed of stacked unit squares like this
		 * []
		 * [][]
		 * [][][]
		 * ...
		 */
public class Triangle {

	private int width;
	
	/**
	 * Constructs a triangular shape
	 * @param aWidth the width (and height) of the triangle
	 */
	
	public Triangle(int aWidth)
	{
		width = aWidth;
	}
	
	/**
	 * Computes the area of the Triangle
	 * @return the area
	 */
	
	public int getArea()
	{
		if(width <= 0)
		{
			return 0;
		}
		else if(width == 1)
		{
			return 1;
		}
		
		
		else
		{
			Triangle smallerTriangle = new Triangle(width - 1);
			
			int smallerArea = smallerTriangle.getArea();
			
			return smallerArea + width;
		}
		
		
	}
	public static void main(String[] args) {
		
		Triangle t = new Triangle(10);
		int area = t.getArea();
		
		
		System.out.println("Area: " + area);
		System.out.println("Expected: 55");
		
		

	}

	private static Triangle newTriangle(int i) {
		// TODO Auto-generated method stub
		return null;
	}

}
