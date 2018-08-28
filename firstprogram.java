import java.util.Scanner;
class Main
 {
public static void main(String[] args)
   {
        Scanner ar=new Scanner (System.in);
        System.out.print("Enter value A: ");
        int A=ar.nextInt();
        System.out.print("Enter value B: ");
        int B=ar.nextInt();
        int C;
        System.out.print("Enter operator(+,-,/,*):");
        char operator=ar.next().charAt(0);
        switch(operator)
        {
          case '+':
          C=A+B;
          System.out.println("output: "+C); 
          break;

          case '-':
          C=A-B;
            System.out.println("output: "+C); 
          break;

          
           case '*':
          C=A*B;
            System.out.println("output: "+C); 
          break;

         
           case '/':
         
           if(B==0)
         {
         System.out.println("infinity");
         }
         else
         {
         C=A/B;
          System.out.println("output: "+C); 
         }

          break;

          default :
          System.out.println("wrong statement");
          break;             

        }

      
  }
  
}