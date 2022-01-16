
import java.io.IOException;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Moment
 */


public class Calculator {

    private static boolean MainMenu = true;
    private static boolean SubMenu = true;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
       
        while (MainMenu) {
            while (SubMenu) {
                System.out.println("¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬");
                System.out.println("Hello and Welcome to our Calculator Program\nPlease keep hands and feet in the vehicle at all time.");
                System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
                System.out.println("Please select one of the options.");
                System.out.println("A: Addition.");
                System.out.println("---------------------------------------------------------------------------------------");
                System.out.println("S: Subtraction.");
                System.out.println("---------------------------------------------------------------------------------------");
                System.out.println("M: Multiplication.");
                System.out.println("---------------------------------------------------------------------------------------");
                System.out.println("D: Division.");
                System.out.println("---------------------------------------------------------------------------------------");
                
                
                String Selection = input.next();
                Selection = Selection.toUpperCase();
                switch (Selection) {
                    case "A":
                        Addition();
                        break;
                    case "S":
                        Subtraction();
                        break;
                    case "M":
                        Multiplication();
                        break;
                    case "D":
                        Division();
                        break;
                    
                    
                  
                    default:
                        System.out.println("Invalid Selection");
                        break;
                }
                System.out.println("¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬");
                System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
                System.out.println("Would you like to Select another Option\n1 ) Yes\n2 ) No");
                System.out.println("¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬");
                System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
                if (input.nextInt() == 1) {
                    SubMenu = true;
                } else {
                    SubMenu = false;
                }
            }
            SubMenu = true;
            System.out.println("¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬");
            System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
            System.out.println("Would You Like To Continue With The Program\n1 ) Yes\n2 ) No");
            System.out.println("¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬");
            System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
            if (input.nextInt() == 1) {
                MainMenu = true;
            } else {
                System.out.println("");
                System.exit(0);

            }
        }

    }

   


    private static void Addition() {
      double x;
      double y;
      double z;
      
      
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number you wish to Add:");
        x = input.nextInt();
        
       
        System.out.println("Enter the second number you wish to Add:");
        y = input.nextInt();
        
        z = (x+y);
        System.out.println(x + "+" + y + "=" + z);
    

        }
    

    

    private static void Subtraction() {
      double x;
      double y;
      double z;
      
      
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number you wish to Subtract:");
        x = input.nextInt();
        
       
        System.out.println("Enter the second number you wish to Subtract:");
        y = input.nextInt();
        
        z = (x-y);
        System.out.println(x + "-" + y + "=" + z);
    

        }
    
        

    private static void Multiplication() {
      double x;
      double y;
      double z;
      
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number you wish to Multiply:");
        x = input.nextInt();
        
       
        System.out.println("Enter the second number you wish to Multiply:");
         y = input.nextInt();
        
         z = (x*y);
         System.out.println(x + "x" + y + "=" + z);
    

        }
    

    private static void Division() {
         
      double x;
      double y;
      double z;
      
      
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number you wish to Division:");
        x = input.nextInt();
        
       
        System.out.println("Enter the second number you wish to Division:");
         y = input.nextInt();
        
         z = (x/y);
         System.out.println(x + "/" + y + "=" + z);
    

        }
    }
