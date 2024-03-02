public class ArrayExForeach {
    public static void main(String[] args) {
        int arr[] = {10,20,30,40,50};

        //<-----Using for loop ---->>

        // for(int i=0; i<arr.length ; i++){
        //     System.out.println(arr[i]);
        // }

        //<-----Using for each loop --->>
        
        int count = 0;
        for(int var : arr){
            System.out.println(var);
            count++;

        }
        System.out.println("No of Elements: " +count);
    }
}
