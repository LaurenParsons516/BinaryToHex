package com.lauren.binarytohex;

public class Converter {
    public static void main(String[]args) {
        String ar = "1011 1010 1101";
        Converter.binaryToHexConverter(ar);
    }
    public static void binaryToHexConverter(String binaryNum) {
        String[] arrOfStr = binaryNum.split(" ");
        String hexNum = "";

        for(String s: arrOfStr){
            switch(s){
                case "0000":
                    System.out.print("0");
                    break;
                case "0001":
                    System.out.print("1");
                    break;
                case "0010":
                    System.out.print("2");
                    break;
                case "0011":
                    System.out.print("3");
                    break;
                case "0100":
                    System.out.print("4");
                    break;
                case "0101":
                    System.out.print("5");
                    break;
                case "0110":
                    System.out.print("6");
                    break;
                case "0111":
                    System.out.print("7");
                    break;
                case "1000":
                    System.out.print("8");
                    break;
                case "1001":
                    System.out.print("9");
                    break;
                case "1010":
                    System.out.print("A");
                    break;
                case "1011":
                    System.out.print("B");
                    break;
                case "1100":
                    System.out.print("C");
                    break;
                case "1101":
                    System.out.print("D");
                    break;
                case "1110":
                    System.out.print("E");
                    break;
                case "1111":
                    System.out.print("F");
                    break;
            }
        }
    }
}
