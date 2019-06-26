package com.company;

public class NumberComplement {
    public static void main(String[] args) {
        System.out.println(findComplement(8));
    }

    public static int findComplement(int num) {
        String binaryString = Integer.toBinaryString(num);

        char[] binaryCharArray = binaryString.toCharArray();

        for (int i = 0; i < binaryCharArray.length; i++) {
            if (binaryCharArray[i] == '0') {
                binaryCharArray[i] = '1';
            } else {
                binaryCharArray[i] = '0';
            }
        }

        String finalString = String.valueOf(binaryCharArray);
        return Integer.parseInt(finalString, 2);
    }

}
