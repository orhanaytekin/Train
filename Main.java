public class Main {
    //recursive print star function
    static void Print(int n){
        if (n==0) return;
        System.out.println("*");
        Print(n-1);
    }
    public static void main(String[] args) {
    }
}
