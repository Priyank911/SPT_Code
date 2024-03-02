public class ArrayNumInp {
    public static void main(String[] args) {
        int arr[] = new int[5];
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.println("Enter elements in array");
        for(int i = 0; i < arr.length; i++) {
           arr[i] = sc.nextInt(); 
        }
        System.out.println("Array Elements.....");

        //<---Using for loop------->>
        // for(int i = 0; i < arr.length; i++) {
        //     System.out.println(arr[i]);
        // }


        //<-----Using While loop---->>
        // int j = 0;
        // while (j<arr.length) {
        //     System.out.println(arr[j]);
        //     j++;
        // }

        //<----Using for each loo---->>
        for(int var: arr){
            System.out.println(var);
        }

        sc.close();
    }
}
