public class Main {
    //recursive print star function
    static void Print(int n){
        if (n==0) return;
        System.out.println("*");
        Print(n-1);
    }

    //returns nth fibonacci number
    static int  Fib(int n){
        if (n<=1) return n;
        else return Fib(n-1)+Fib(n-2);
    }
    public static void main(String[] args) {
        //0 1 1 2 3 5 8 13 21
        System.out.println(Fib(20));
    }
}
