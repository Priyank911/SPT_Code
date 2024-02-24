import java.io.*;

public class filewrite {
    public static void main(String[] args)throws IOException
     {
        File f1 = new File("D:\\fileWrite.txt");
        FileOutputStream fos = new FileOutputStream(f1);

        //Option: 1
        // String str = "Today is a Saturday but making a class";

        //Option: 2
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print("Enter The Sentence: ");
        String str= sc.nextLine();

        byte by [] = str.getBytes();
        for(int i=0; i <by.length; i++){
            fos.write(by[i]);
        }
        System.out.println("File is Successfully Write");
        sc.close();
        fos.close();
    }
}
