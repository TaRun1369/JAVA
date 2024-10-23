
public class lec4 {
    public static void main(String[] args) {
        // Operators in Java
        // Arithmetic Operators
        int a = 10;
        int b = 20;
        int c = a + b;
        System.out.println("The sum of a and b is " + c);
        int d = b - a;
        System.out.println("The difference of a and b is " + d);
        int e = a * b;
        System.out.println("The product of a and b is " + e);
        int f = b / a;
        System.out.println("The division of a and b is " + f);
        int g = b % a;
        System.out.println("The modulus of a and b is " + g);

        // Assignment Operators
        int x = 10;
        x += 5;
        System.out.println(x);
        x -= 5;
        System.out.println(x);
        x *= 5;
        System.out.println(x);
        x /= 5;
        System.out.println(x);
        x %= 5;
        System.out.println(x);

        // Comparison Operators
        System.out.println(10 > 20);
        System.out.println(10 < 20);
        System.out.println(10 >= 20);
        System.out.println(10 <= 20);
        System.out.println(10 == 20);
        System.out.println(10 != 20);

        // Logical Operators
        System.out.println(10 > 20 && 10 < 20);
        System.out.println(10 > 20 || 10 < 20);
        System.out.println(!(10 > 20));

        // Bitwise Operators
        System.out.println(10 & 20);
        System.out.println(10 | 20);
        System.out.println(10 ^ 20);
        System.out.println(~10);
        System.out.println(10 << 2);
        System.out.println(10 >> 2);
        System.out.println(10 >>> 2);

        // Ternary Operator
        int i = 10;
        int j = 20;
        int k = i > j ? i : j;
        System.out.println(k);
    }
}
