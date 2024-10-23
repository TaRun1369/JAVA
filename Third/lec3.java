class lec3 {

    public static void main(String args[]){
        // Type Conversion and Casting 

        // in same type of data - Conversion of bigger data type to smaller data type is possible example 
        byte b = 10;
        int a = 266;
        // a = b; // this is possible as byte is smaller than int
        // b = a; // this is not possible as int is bigger than byte
        System.out.println(a);
        System.out.println(b);

        b = (byte)a; // this is possible as we are explicitly converting int to byte - Casting 
        System.out.println(b); // gives 266%256 = 10

        float f = 10.5f;
        int t = (int)f;
        System.out.println(t); // gives 10.5 = 10

        // Type Promotion 

        byte a1 = 10;
        byte b1 = 30;
        int res = a1*b1;
        System.out.println(res); // gives 300 // this is type promotion
    }
}
