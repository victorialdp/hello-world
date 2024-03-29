/*********************************************************************************
(Sum elements column by column) Method  returns the sum of all the elements in
a specified column in a matrix. Program reads a 3-by-4 matrix and displays the 
sum of each column.                                                                        
*********************************************************************************/ 
import java.util.Scanner;

public class Exercise08_01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
		//declare matrix and set size 
		double[][] m = new double[3][4];
        System.out.println("Enter a "+m.length+" by "+m[0].length+" matrix row by row");
        
		//for loop to collect matrix
		for (int i=0; i<m.length;i++) {
			for (int j=0; j<m[0].length;j++) {
				m[i][j] = input.nextDouble();
			}
		}
        
        System.out.println("Sum of elements at column 0 is "+sumColumn(m, 0));
        System.out.println("Sum of elements at column 1 is "+sumColumn(m, 1));
        System.out.println("Sum of elements at column 2 is "+sumColumn(m, 2));
        System.out.println("Sum of elements at column 3 is "+sumColumn(m, 3));
        
    }
	
    public static double sumColumn(double[][] m, int columnIndex) {
        double total = 0;
		for (int i = 0; i <m.length; i++) {
			total += m[i][columnIndex];
		}
		
		return total;
    }
}
