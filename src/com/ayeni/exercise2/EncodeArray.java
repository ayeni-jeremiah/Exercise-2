package com.ayeni.exercise2;

public class EncodeArray {

	int[] A;
	int[] B;
	int n;
	int[] newArray;

	public EncodeArray(int[] A, int[] B, int n) {
		this.A = A;
		this.B = B;
		this.n = n;
		newArray = new int[n];
	}

	private int encodeInteger(int x, int n) {
		n = n << (1 << (1 << (1 << 1)));
		x = x | n;
		return x;
	}

	public void encodeArray() {
		for (int i = 0; i < n; i++) {
			A[i] = encodeInteger(A[i], B[i]);
//			System.out.println(A[i]);
			newArray[i] = A[i];
		}
	}
}
