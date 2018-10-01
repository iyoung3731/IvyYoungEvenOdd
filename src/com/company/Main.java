package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        String input = "abcdefg";
        System.out.println("input = "+input);
        System.out.println("oddCharacters = "+oddCharacters(input));
        System.out.println("evenCharacters = "+evenCharacters(input));
        System.out.println("evenFirstOddSecond = "+evenFirstOddLast(input));
    }

    public static String oddCharacters(String input) {
        int index = 1;
        String output = "";
        while (index < input.length()) {
            output = output + input.substring(index, index+1);
            index = index + 2;
        }
        return output;
    }
    public static String evenCharacters(String input) {
        int index = 0;
        String output = "";
        while (index < input.length()) {
            output = output + input.substring(index, index+1);
            index = index + 2;
        }
        return output;
    }
    public static String evenFirstOddLast(String input) {
        int indexOdd = 1;
        String outputEven = "";
        String outputOdd = "";
        int indexEven = 0;
        while (indexOdd < input.length()) {
            outputOdd = outputOdd + input.substring(indexOdd, indexOdd+1);
            indexOdd = indexOdd + 2;
        }
        while (indexEven <input.length()) {
            outputEven = outputEven + input.substring(indexEven, indexEven+1);
            indexEven = indexEven + 2;
        }
        return outputEven + outputOdd;
    }
}
