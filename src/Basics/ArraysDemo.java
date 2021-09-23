package Basics;
import java.util.*;
public class ArraysDemo {

	public static void main(String[] args) {
		int[] arr1;
		arr1 = new int[3];
		
		System.out.println(arr1.length);
		System.out.println(arr1[0]);
		
		double[] d = new double[5];
		System.out.println(d[0]);
		
		boolean[] b = new boolean[5];
		System.out.println(b[0]);
		
		int[] arr2 = {3,2,1};
		System.out.println(Arrays.toString(arr2));
		Arrays.sort(arr2);
		System.out.println(Arrays.toString(arr2));
		
		int[][] matrix = new int[2][2];
		matrix[0][0] = 1;
		
		System.out.println(matrix[0][0]);
		System.out.println(matrix[0][1]); //default value will print e.g.0
		
	}

}
