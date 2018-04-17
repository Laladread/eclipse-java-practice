/*
 * Final Keyword has numerous ways to use:
 * cannot be subclassed
 * cannot be overridden by subclasses
 *  A final variable can only be initialized once
 */
public class Final {

	public static void main(String[] args) {
		Hello hel = new Hello(10);
		//hel.number = 20;
		for(int i=0; i< 5; i++)
		{
			hel.add();
			System.out.printf("%s", hel);
		}

	}

}
