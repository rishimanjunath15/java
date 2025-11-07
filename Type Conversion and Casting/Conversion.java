

// byte a = 123;
// int b = 78;


//1. this is conversion
// b=a (its not posssible)
// a=b (its possible)



//2. this is casting
// b = byte(a)


class Conversion{
    public static void main(String[] args) {
        

        //1.conversion
        byte a = 10;
        int b = a;
        System.out.println(b);   


        //2.type casting

        byte c = 67;
        int d = (int)c;
        System.out.println(d);

        // it will print error and its not possible to convert from int to byte 
        // int m =76;
        // byte n = m;
        // System.out.println(n);

        // we can do it by casting

        int m =76;
        byte n = (byte)m;
        System.out.println(n);


        //3.type promoting
        byte x = 10;
        byte y = 10;
        int z = x*y;
        System.out.println(z);


    }
}
