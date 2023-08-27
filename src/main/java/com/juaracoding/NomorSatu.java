package com.juaracoding;

public class NomorSatu {
    public static void main(String[] args){
        for (int num = 1; num <= 100; num++) {
            String output = "";

            if (num % 3 == 0) {
                output += "BIZZ";
            }

            if (num % 5 == 0) {
                output += "BUZZ";
            }

            if (output.isEmpty()) {
                output = Integer.toString(num);
            }

            System.out.println(output);
        }
    }
}
