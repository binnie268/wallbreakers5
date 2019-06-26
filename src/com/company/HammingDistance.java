package com.company;

public class HammingDistance {

    public static void main(String[] args) {
        System.out.println(hammingDistance(297630147
                ,147274294));
    }

    public static int hammingDistance(int x, int y) {

        String binary1 = String.format("%4s",Integer.toBinaryString(x)).replace(' ', '0');
        String binary2 = String.format("%4s",Integer.toBinaryString(y)).replace(' ', '0');
        int count = 0;

        for(int i = 0; i < binary1.length(); i++) {
            if (binary1.charAt(i) != binary2.charAt(i)) {
                count++;
            }
        }

        return count;
    }


    public static int hammingDistance2(int x, int y) {

        int difference = x^y;
        int n = 0;

        while(difference != 0) {
            n++;
            difference &= (difference-1);
        }

        return n;
    }


}
