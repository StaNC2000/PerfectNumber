package com.eS;

public class PerfectNumber {

    public static boolean isPerfectNumber(int number){
        int divider = 1;
        int dividerSummary = 0;

        if (number < 1){
            return false;
        }

        for (divider = 1; divider < number; divider++){
            if (number % divider == 0){
                dividerSummary = dividerSummary + divider;
//                System.out.println("Divider "  + divider + " dividerSummary " + dividerSummary + " number " + number);
                if (dividerSummary == number){
                    return true;
                }
            }
        }
        return false;
    }



    public static void main(String[] args) {
	// write your code here

        System.out.println(isPerfectNumber(6));
        System.out.println(isPerfectNumber(28));
        System.out.println(isPerfectNumber(-6));
        System.out.println(isPerfectNumber(31));
        System.out.println(isPerfectNumber(6666));
    }
}
