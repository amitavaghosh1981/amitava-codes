    import java.io.*;
    import java.util.*;
    import java.text.*;
    import java.math.*;
    import java.util.regex.*;

    public class Solution {

        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            double mealCost = scan.nextDouble(); // original meal price

            int taxPercent = scan.nextInt(); // tax percentage
            int tipPercent = scan.nextInt(); // tip percentage


            scan.close();

            double totalmealCost=mealCost+(((double) taxPercent/100)*mealCost+((double) tipPercent/100)*mealCost);
            System.out.println(totalmealCost);
            // Write your calculation code here.

            // cast the result of the rounding operation to an int and save it as totalCost
            int totalCost = (int) Math.round(mealCost+(taxPercent/100)+(tipPercent/100));


        }
    }