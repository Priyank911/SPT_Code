import java.util.Scanner;
class ExpDemo{

    void fun1(){
        try{
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the num Value:- ");
            int val1 = sc.nextInt();
            System.out.print("Enter the Deno Value:- ");
            int val2 = sc.nextInt();
            int div = val1 / val2;
            System.out.print("Division: "+ div);
            sc.close();
        }
//  /* Child */       catch(ArithmeticException e){ // It can take only 1min of time to handle expection but it can handle only Arithmetic Expection 
//             // System.out.println("Error Occured....");
//             // System.out.println(e);
//             System.out.println(e.getMessage());
//         }
//  /* Child */        catch(ArrayIndexOutOfBoundsException ae){
//             System.out.println(ae);
//         }
               catch(ArithmeticException | ArrayIndexOutOfBoundsException ae){
                // System.out.println("Error Occured....");
//             // System.out.println(e);
                 System.out.println(ae.getMessage());
            }
 /* Parent */        catch(Exception z){ // here you can go lower to higher ---> child -->to--->parent you cant go parent to child its show error
            System.out.println(z);
        }
        finally{
            System.out.println("finally block..... No impact either exception occur or not");
        }
    }
    void fun2(){
        System.out.println("Second Function are Run..");
    }
    public static void main(String[] args){
        ExpDemo obj = new ExpDemo();
        obj.fun1();
        obj.fun2();
    }
}