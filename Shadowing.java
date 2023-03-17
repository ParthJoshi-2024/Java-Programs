public class Shadowing {
    static int num = 50;
    public static void main(String[] args) {
        System.out.println("Hello Nida");
        int a = 12;
        System.out.println("A is " + a);
        System.out.println("num is " + num);
        int num = 100;  
        // Here shadowing is done, the varaible static num looses its scope till this main funciton scope.
        System.out.println("Now num is " + num);
        func();

    }
    static void func(){
        System.out.println("Inside function func, the num is " + num);
    }
}
