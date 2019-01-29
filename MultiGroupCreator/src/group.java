
import  java.io.File;
import java.io.IOException;
import java.util.*;

public class group
	{
		static int size = 0;
		static int groupSize = 0;
		static int lastGroupSize = 0;
		static int temp = 0;
			
		public static void main(String[] args) throws IOException
		{
			//asks user for the number of groups they would like to have 
			System.out.println("How many groups of students would you like to have?");
			Scanner groupInput = new Scanner(System.in); 
			int groupNumber = groupInput.nextInt();
			
			//reads the name file and declares the arraylist for the names
			Scanner nameList = new Scanner(new File ("Names.txt"));
			ArrayList<String> students = new ArrayList <String> ();
			
			//iterates through the arraylist and adds the names
			while (nameList.hasNext())
				{
					students.add(nameList.nextLine());
				}
			
			int studentsSize = students.size();
				
			size = studentsSize / groupNumber;
			temp = size % groupNumber;
			lastGroupSize = size + 1;
					
			System.out.println("Your students are separated into " + (groupNumber - temp) + " group(s) of " + size + ", and " + temp + " group(s) of " + lastGroupSize + ".");
			
			System.out.println("These are the groups of your students:");
			System.out.println(" ");
			
			
		}
			
			
	}

