/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package denomination;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Denomination {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int amount,d1,d5,d10,d20,d50,d100,d200,d500,d2000;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the amount in rupees :");
        amount=sc.nextInt();
        if(amount>2000)
        {
        while(amount>=2000)
        {
            d2000=amount/2000;
            amount=amount%2000;
            System.out.println("2000 rupees ="+d2000);
            break;
        }
        }
        else
        {
            System.out.println("2000 rupees = 0");
        }
        if(amount>500)
        {
            while(amount>=500)
            {
                d500=amount/500;
                amount=amount%500;
                System.out.println("500 rupees ="+d500);
                break;
            }
        }
        else
        {
            System.out.println("500 rupee = 0");
        }
        if(amount>100)
        {
            while(amount>=100)
            {
                d100=amount/100;
                amount=amount%100;
                System.out.println("100 rupees ="+d100);
                break;
            }
        }
        else
        {
            System.out.println("100 rupee = 0");
        }
        if(amount>50)
        {
            while(amount>=50)
            {
                d50=amount/50;
                amount=amount%50;
                System.out.println("50 rupees ="+d50);
                break;
            }
        }
        else
        {
            System.out.println("50 rupee = 0");
        }
        if(amount>20)
        {
            while(amount>=20)
            {
                d20=amount/20;
                amount=amount%20;
                System.out.println("20 rupees ="+d20);
                break;
            }
        }
        else
        {
            System.out.println("20 rupee = 0");
        }
        if(amount>10)
        {
            while(amount>=10)
            {
                d10=amount/10;
                amount=amount%10;
                System.out.println("10 rupees ="+d10);
                break;
            }
        }
        else
        {
            System.out.println("10 rupee = 0");
        }
        if(amount>5)
        {
            while(amount>=5)
            {
                d5=amount/5;
                amount=amount%5;
                System.out.println("5 rupees ="+d5);
                break;
            }
        }
        else
        {
            System.out.println("5 rupee = 0");
        }
        if(amount>1)
        {
            while(amount>=1)
            {
                d1=amount/1;
                amount=amount%1;
                System.out.println("1 rupees ="+d1);
                break;
            }
        }
        else
        {
            System.out.println("1 rupee = 0");
        }
    }   
        
    
}
