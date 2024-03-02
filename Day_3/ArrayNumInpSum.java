public class ArrayNumInpSum {
    public static void main(String[] args) {
        int arr[] = new int[5];
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.println("Enter the Elements: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt(); 
        }
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        System.out.println("Sum of all elements: "+ sum);
        sc.close();
    }
}
