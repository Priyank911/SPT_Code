import java.io.DataInputStream;
import java.io.IOException;
class datainput {
    public static void main(String...xyz) throws IOException
    {
        DataInputStream dis = new DataInputStream(System.in);
        System.out.println("Enter I value");
        String str1 = dis.readLine();
        int var1 = Integer.parseInt(str1);
        System.out.println("Enter II Value");
        String str2 = dis.readLine();
        int var2 = Integer.parseInt(str2);

        int res = var1 + var2;
        System.out.println("Sum: " +res);
    }
}
