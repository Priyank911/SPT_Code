public class Nullpointer {
    void fun1(){
        System.out.println("Function are Working...");
    }
    public static void main(String args[]){
        Nullpointer obj = null;
       // obj = new Day_1_nullpointer();
        obj.fun1(); 
    // Here we get null pointer Exception
    }
}
