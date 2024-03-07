

/**
 * Recursion Lab
 * Write a recursive method to sum 
 * the values in an array of integers
 * 
 * @author Sokha_Heng
 * Due Date: 02/20/2024
 */
public class ArraySum {
    public int sumOfArray(Integer[] a, int index) {
    	//base case
    	if(index < 0) {
    		return 0;
    	}
    	//recursive case
    	return a[index] + sumOfArray(a, index - 1);
    	
    	
    }
}
