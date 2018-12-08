package Passwordvalidation;
import java.util.Scanner;
        public class Passwordvalidation {
    public static void main(String[] args) {
         System.out.println("enter new password");
         Scanner s=new Scanner (System.in);
         String a=s.nextLine();
         System.out.println("Renter new password");
         String b=s.nextLine();
         if(a.matches(b))
         {
         System.out.println("updated password succesfully");
         }
         else
         {
           System.out.println("wrong password");
         }
         
    }
    }
    

