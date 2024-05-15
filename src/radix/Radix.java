/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package radix;
import java.util.Scanner;

/**
 *
 * @author dell1
 */
public class Radix {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        String num;
        System.out.println("Enter the number");
        num=sc.nextLine();
        if(num.matches("[01]"))
        {
            System.out.println("Binary Radix=2");
        }
        else if(num.matches("[0-7]+"))
        {
            System.out.println("Octal Radix=8");
        }
        else if(num.matches("[0-9]+"))
        {
            System.out.println("Decimal Radix=10");
        }
        else if(num.matches("[0-9A-F]+"))
        {
            System.out.println("Hexa Radix=16");
        }
        else
        {
            System.out.println("Not a number");
        }
    }
}

