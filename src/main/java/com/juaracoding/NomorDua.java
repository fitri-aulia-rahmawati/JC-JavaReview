package com.juaracoding;

public class NomorDua {
    public static void main(String[] args) {
        int nomor = 9;
        for (int i = 1; i <= 5; i++) {
            for (int j = i; j <= nomor; j++) {
                if (j % 2 == 1) {
                    System.out.print(j);
                } else {
                    System.out.print("_");
                }
            }
            nomor--;
            System.out.println();
        }
    }
}
