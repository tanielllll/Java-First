// Marasigan_Nathaniel_H 
// CpE 2202

import  java.util.Scanner;
public class Main {
    public static void main(String[] args){
       Scanner sc= new Scanner(System.in);     
        System.out.print("Input first number: ");  
        int a= sc.nextInt();  
        System.out.print("Input second number: ");  
        System.out.print(" "); 
        int b= sc.nextInt();  
        int x=a+b;
        System.out.println("Sum: "+ x);
        int y=a-b;
         System.out.println("Product: " + y);
          int z=a*b;
          System.out.println("Difference: "+ z);
          int w=a/b;
          System.out.println("Quotient: " + w);
    }  
}  
