
import java.util.Scanner;

public class Methodes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        int b;
        int z;
        String Symbl;
        int op;
        System.out.println("How many Operations you want to do ? ");
        op=sc.nextInt();
for (int i = 0; i < op; i++) {
    

        
       
        System.out.println("Entre first number ");
         a=sc.nextInt();
         System.out.println("Entre second number :");
         b=sc.nextInt();
         sc.nextLine();
        System.out.println("Which operation you want (+ | - | * | / | % ) or entre 0 for exit");
         Symbl=sc.nextLine();

         switch (Symbl) {
             case "+" :
                z =  add(a, b);
                System.out.println("Add of "+a+" and "+b+" is = "+z);
                 break;
                 case "/" :
                 z =  l9isma(a, b);
                 System.out.println("L9isma of "+a+" and "+b+" is = "+z);
                  break;
                  case "*" :
                  z =  derb(a, b);
                  System.out.println("Derb of "+a+" and "+b+" is = "+z);
                   break;
                   case "-" :
                   z =  na9is(a, b);
                   System.out.println("Na9is of "+a+" and "+b+" is = "+z);
                    break;
                    case "%" :
                    z =  mudelo(a, b);
                    System.out.println("Lba9i of "+a+" and "+b+" is = "+z);
                     break;
                     case "0" :
                     System.out.println("Exiting !!");
                     return;
             default:
                 System.out.println("makaynch hadchi li kateeb asa7bi ");
         }
}
        

    }
    static int add(int x,int y){
        return x+y;
    }
    static int na9is(int x,int y){
        return x-y;
    }
    static int derb(int x,int y){
        return x*y;
    }
    static int l9isma(int x,int y){
        return x/y;
    }
    static int mudelo(int x,int y){
        return x%y;
    }
}
