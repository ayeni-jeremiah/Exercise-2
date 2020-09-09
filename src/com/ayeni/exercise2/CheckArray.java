package com.ayeni.exercise2;

public class CheckArray {

	public static void main(String[] args) {
		//SAMPLE DATA
		int[] A = {1,2,3,4,0,6,7};
		int[] B = {5,7,8,9,0,2,3};
		int n = A.length;
				
		// TO ENCODE ARRAY
		EncodeArray array = new EncodeArray(A, B, n);
		array.encodeArray();
		
		int[] newArray = array.newArray;
//		for (int i = 0; i < newArray.length; i++) {
//			System.out.println(newArray[i]);
//		}
		
		//TO DECODE ARRAY
		DecodeArray array2 = new DecodeArray(newArray);
		
		array2.decodeArray();
//		int[] retrievedA = array2.previousA;
//		int[] retrievedB = array2.previousB;
//		
//		for (int i = 0; i < n; i++) {
//			System.out.println(retrievedA[i]);
//			System.out.println(retrievedB[i]);
//		}
	}

}
