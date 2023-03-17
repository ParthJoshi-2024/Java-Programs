import java.sql.Array;
import java.util.Arrays;

// VarArgs is also Variable Length Arguments
// In this, when we donot kow the exact number of arguments to be passed in any function, then we uses this.
public class VarArgs {
    public static void main(String[] args) {
        System.out.println("This is main function");
        show(10,20,"Nida","Parth","Bulbul","Bulbule","Ishu","ishu");
        // It is must to pass arguments when we are using the VarArgs.

    }
    static void show(int a,int b,String ...s){
        // It returns array to us
        // VarsArgs is used to place the rest parameters at a single place, so it is must to use it at the last place in the function paramter list.
        System.out.println("This is show Function");
        System.out.println(Arrays.toString(s));
    }
}
