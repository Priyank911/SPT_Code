// Q1:- Write a Progam using Array
public class ArrayEx {
    public static void main(String[] args) {
        int arr[] = {10,20,30,40,50};
        //int arr[] = new int[5];
        // arr[0]= 10;
        // arr[1]= 15;
        // arr[2]= 20;
        // arr[3]= 30;
        // arr[4]= 40;

        //<--- If you want to print the no of array element---->
        int size = arr.length;
        System.out.println("No of Elements: "+ size);
        for(int i=0; i<size ; i++){
            System.out.println(arr[i]);
        }
    }
}










/*
Note:- length V/S length()

length() ---> its a predefined function in the java , its use for return the no. character's in a String 


*/