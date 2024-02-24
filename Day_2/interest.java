import java.io.DataInputStream;
import java.io.IOException;

public class interest {
    public static void main(String[] args) throws IOException
    {
        DataInputStream dis = new DataInputStream(System.in);

        System.out.println("Enter The principle");
        String str1= dis.readLine();
        double pri = Double.parseDouble(str1);

        System.out.println("Enter rate of interest");
        String Str2 = dis.readLine();
        float rate = Float.parseFloat(Str2);

        System.out.println("Enter The period");
        String str3 = dis.readLine();
        int time = Integer.parseInt(str3);
        
        double intrest = (pri*rate*time)/100;
        System.out.println("SI: " +intrest);
    }
}
