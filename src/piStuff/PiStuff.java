package piStuff;

import java.math.*;
import java.util.ArrayList;

public class PiStuff {

    public static void main(String[] args) {
    	
        BigDecimal pi = BigDecimal.valueOf(Math.PI);
        
        System.out.println(pi);

        String piString = (pi.toString()).replace(".", "");


        ArrayList<Digit> piDigits = new ArrayList<>();


        for (int i = 0; i < piString.length(); i++)
        {
            int digit = Character.getNumericValue(piString.charAt(i));
            piDigits.add(new Digit(digit, i + 1));
        }


        for (Digit digitOrder : piDigits)
        {
            System.out.println("Digit: " + digitOrder.digit + ", Order: " + digitOrder.order);
        }

        Digit fifthDigit = piDigits.get(4);
        System.out.println("Fifth digit of Pi: " + fifthDigit.digit);
    }


    static class Digit
    {
        int digit;
        int order;

        Digit(int digit, int order)
        {
            this.digit = digit;
            this.order = order;
        }
    }
}