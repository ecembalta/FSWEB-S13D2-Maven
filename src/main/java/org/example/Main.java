package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    public static boolean isPalindrome(int number) {
        String strNumber = String.valueOf(number).replace("-", "");
        String[] chars = strNumber.split("");
        String reversed = "";

        for (int i = chars.length - 1; i >= 0; i--) {
            reversed += chars[i];
        }

        int reversedNumber = Integer.parseInt(reversed);
        return reversedNumber == Math.abs(number);
    }

    public static boolean isPerfectNumber(int number){
        int sum = 0;
        if (number<0){
            return false;
        }

        for(int i=1; i<=number/2 ; i++){

            if(number % i==0){
                sum += i;
            }
        }

        return sum == number;
    }

    public static String numberToWords(int number){
        if(number<0){
            return "Invalid Value";
        }
        String strNumber = String.valueOf((number));
        String[] chars = strNumber.split("");

        String wordsOfNumber = "";

        for(int i =0; i<chars.length; i++){
            switch (chars[i]){
                case "0":
                    wordsOfNumber += "Zero";
                    break;
                case "1":
                    wordsOfNumber += "One";
                    break;
                case "2":
                    wordsOfNumber += "Two";
                    break;
                case "3":
                    wordsOfNumber += "Three";
                    break;
                case "4":
                    wordsOfNumber += "Four";
                    break;
                case "5":
                    wordsOfNumber += "Five";
                    break;
                case "6":
                    wordsOfNumber += "Six";
                    break;
                case "7":
                    wordsOfNumber += "Seven";
                    break;
                case "8":
                    wordsOfNumber += "Eight";
                    break;
                case "9":
                    wordsOfNumber += "Nine";
                    break;
            }
            if(i< chars.length-1){
                wordsOfNumber += " ";
            }
        }

        return wordsOfNumber;
    }
}