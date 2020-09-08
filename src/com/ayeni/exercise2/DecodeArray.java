package com.ayeni.exercise2;

public class DecodeArray {

	int[] A;
	int length;
	int[] previousA;
	int[] previousB;

	public DecodeArray(int[] A) {
		this.A = A;
		this.length = A.length;
		this.previousA = new int[length];
		this.previousB = new int[length];
	}

	// converyt Decimal To Binary
	private String convertToBinary(int decimal) {
		return Integer.toBinaryString(decimal);
	}

	// split the binary from added hexadecimal
	private String[] splitHexadecimal(String binary) {
		int binaryLength = binary.length();
		int firstEnd = binaryLength - 16;
		String first = "";
		String second = "";
		String[] AB = new String[2];

		if (binaryLength > 16) {
			first = binary.substring(binaryLength - 16);
			second = binary.substring(0, firstEnd);

			AB[0] = first;
			AB[1] = second;
			return AB;
		} else {
			//B was mostlikely 0
			AB[0] = binary;
			AB[1] = "0";
			return AB;
		}
	}

	//convert back to decimal
	private Integer convertToDecimal(String binary) {
		return Integer.parseInt(binary, 2);
	}

	public void decodeArray() {
		if (length >= 1) {
			for (int i = 0; i < length; i++) {
				String binary = convertToBinary(A[i]);
				String[] AB = splitHexadecimal(binary);
				if (AB.length > 1) {
					previousA[i] = convertToDecimal(AB[0]);
					previousB[i] = convertToDecimal(AB[1]);
				}
			}
		}
	}

}
