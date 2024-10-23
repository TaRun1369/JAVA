// package Sixth;

class Calculator{
    public int add(int a,int b){
        return a+b;
    }
}
public class lec6 {
    public static void main(String args[]) {
        System.out.println("Classes and Object in Java");

        Calculator obj = new Calculator();
        int result = obj.add(5, 4);
        System.out.println(result);
    }
}
