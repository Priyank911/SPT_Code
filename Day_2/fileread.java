import java.io.*;

public class fileread {
    public static void main(String[] args) throws IOException
    {
        File f1 = new File("D:\\FIle_handling.txt");
        FileInputStream fis = new FileInputStream(f1);

        int sz = fis.available(); // available() method will be return, no of character's in a file


        for(int i=1;i<=sz;i++){
            System.out.print((char)fis.read());
        }
        fis.close();
    }
}











/*
  Value For Alpha:- 
  A  --  65       a -- 97
  B  --  66       b -- 98
  C  --  67       c -- 99
  D  --  68       d -- 100
  E  --  69       e -- 101
  F  --  70       f -- 102
  G  --  71       g -- 103
  H  --  72       h -- 104
  I  --  73       i -- 105
  J  --  74       j -- 106
  K  --  75       k -- 107
  L  --  76       l -- 108
  M  --  77       m -- 109
  N  --  78       n -- 110
  O  --  79       o -- 111
  P  --  80       p -- 112
  Q  --  81       q -- 113
  R  --  82       r -- 114
  S  --  83       s -- 115
  T  --  84       t -- 116
  U  --  85       u -- 117
  V  --  86       v -- 118
  W  --  87       w -- 119
  X  --  88       x -- 120
  Y  --  89       y -- 121
  Z  --  90       z -- 122

 */