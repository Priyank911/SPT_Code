class Str_Con {
    static public void main(String...xys){ // Here we use "..." instead of arr"[]" it can also work :- Noted "..." called as elipse
    java.util.Scanner sc = new java.util.Scanner(System.in); // we can also use here ..... 
    // System.out.println("Enter Any Value");
    // String str = sc.next();
        String str = "123";
        System.out.println("------String Value------\n");
        System.out.println(str);
        System.out.println("\n---------- ---------\n");
        System.out.println("------Nummeric Value-------");
        int z = Integer.parseInt(str);
        System.out.println(z+5);
        sc.close();
    }
}
