import java.util.Scanner;

/*
 * @author Sumit Kumar
 * 2018-03-06  
 */

public class SH1 {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		
		System.out.println("Enter value 1");
		double value1 = s.nextDouble();
		
		System.out.println("Enter ErrorTerm");
		double errorterm1 = s.nextDouble();
		
		System.out.println("Enter value 2");
		double value2 = s.nextDouble();
				
		System.out.println("Enter ErrorTerm");
		double errorterm2 = s.nextDouble();
		
		System.out.println("Write the function you want to perform either Addition or Subtraction");
		
		double value_add_result = value1 + value2;
		double errorterm_add_result = errorterm1 + errorterm2;
		
		double value_sub_result = value1 - value2;
		double errorterm_sub_result = errorterm1 - errorterm2;
		
		String input = s.next();
		
		if (input.equals("addition")) {
			System.out.println("Answer " + value_add_result + " ± " + errorterm_add_result);
		}
		else if(input.equals("subtraction")) {
			System.out.println("Answer " + value_sub_result + " ± " + errorterm_sub_result);
		}
		else {
			System.out.println("Enter Addition or Subtraction");
		}
		s.close();
	}

}
