//Tax 7%
//Tip 15%
//Display cost of meal, tax, tip and total bill on screen

package MentoringPractice;

import java.util.Scanner;

public class ScannerLearn {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in); //Syntax
        System.out.println("Enter order number");
        String orderNumber = scan.nextLine();
        System.out.println("Enter the quantity");
        int quantity = 4;
        scan.nextLine();
        System.out.println("Enter the price");
        double price = 11.99;
        double foodCost = quantity*price;
        double roundOffCost = Math.round(foodCost*100.0)/100.0;
        scan.nextLine();

        float salesTax = 0.07f;
        double totalCost = roundOffCost + (roundOffCost*salesTax);
        double roundOff = Math.round(totalCost*100.0)/100.0;



        System.out.println("----------------------------------");
        System.out.println("\t"+"\t"+"BD Kebab House"+"\t"+"\t");
        System.out.println("----------------------------------");
        System.out.println("\t"+"\t"+"Restaurant Bill"+"\t"+"\t");
        System.out.println("Food cost " +"\t"+"\t"+"\t"+"\t"+ roundOffCost);
        System.out.println("Meal Tax " +"\t"+"\t"+"\t"+"\t"+ salesTax);
        System.out.println("Food cost After tax " +"\t"+ roundOff);
        System.out.println("\t"+"\t"+"    THANK YOU   "+"\t"+"\t");

        //Close the scanner
        scan.close();
    }
}
