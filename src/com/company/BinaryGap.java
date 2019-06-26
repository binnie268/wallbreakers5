package com.company;

public class BinaryGap {
    public static void main(String[] args) {
        System.out.println(binaryGap(22));
    }

    public static int binaryGap(int n) {

        String binary = Integer.toBinaryString(n);
        int maxDistance = 0;
        int currentIndex = 0;

        for(int i = currentIndex; i < binary.length(); i++) {
            if(binary.charAt(i) == '1') {
                for(int j = i+1; j < binary.length(); j++) {
                    if(binary.charAt(j) == '1') {
                        if(j-i > maxDistance) {
                            maxDistance = j-i;
                        }
                        currentIndex = j;
                        break;
                    }
                }
            }
        }

        return maxDistance;
    }
}
