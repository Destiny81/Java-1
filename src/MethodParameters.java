public class MethodParameters {


    static void myMethod(String fname, int age) {
        System.out.println(fname + "singla"+ " " + age);
    }
    public static void main (String[] args) {
        myMethod ("Liam", 0);
        myMethod ("Jenny", 2);
        myMethod ("Anja", 3);
        System.out.println(myMethod1(3));
    }
    // When a parameter is passed to the method, it is called an argument. fname is a parameter and jenny, anja are argument.
static int myMethod1(int x) {
        return 5 + x;
    }


}