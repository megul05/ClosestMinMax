package ClosestMinMax;

import java.util.*;

public class ClosestMinMax {
	
	 public static void closest(int array[], int size) {
	        int min = Integer.MAX_VALUE;
	        int max = Integer.MIN_VALUE;
	        for (int i = 0; i < size; i++) {
	            if (array[i] < min) {
	                min = array[i];
	            }
	            if (array[i] > max) {
	                max = array[i];
	            }
	        }
	        int latestMinIndex = -1;
	        int latestMaxIndex = -1;
	        int result = Integer.MAX_VALUE;
	        for (int i = 0; i < size; i++) {
	            if (array[i] == min) {
	                latestMinIndex = i;
	                if (latestMaxIndex >= 0) {
	                    result = Math.min(result, i - latestMaxIndex + 1);
	                }
	            }
	            if (array[i] == max) {
	                latestMaxIndex = i;
	                if (latestMinIndex >= 0) {
	                    result = Math.min(result, i - latestMinIndex + 1);
	                }
	            }
	        }
	      
	        System.out.println(result);
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scan = new Scanner(System.in);
	        System.out.print("Enter the size of array: ");
	        int size = scan.nextInt();
	        int array[] = new int[size];
	        System.out.println("Enter Elements of Array");
	        for (int i = 0; i < size; i++) {
	            array[i] = scan.nextInt();
	        }
	        scan.close();
	        closest(array, size);

	}

}
