package textFiles;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;


public class readFile {

	public static void main(String[] args) {
		
		ArrayList list = new ArrayList();
		Scanner input = new Scanner(System.in);
		System.out.println("Enter file name: ");	
		
		String fileName = input.next();
		
		try {
			//Scanner fileIn = new Scanner(new File("text.rtf"));
			
			FileReader inputFile = new FileReader("source.txt");
			
			BufferedReader bufferReader = new BufferedReader(inputFile); 
				String line;
				while((line = bufferReader.readLine()) !=null) {
					String[] numbers = line.split(" ");
					for (int i =0; i<numbers.length;i++)
					{
						int nextNumber = Integer.parseInt(numbers[i]);
						list.add(nextNumber);
					}
				}

		}catch (Exception e) 
		
		{
			System.out.println("File was not found" + e.getMessage() + e.getStackTrace());
		}
		
		for (int i =0; i<list.size();i++)
		{
			System.out.println(list.get(i));
		}
		

	}

}
