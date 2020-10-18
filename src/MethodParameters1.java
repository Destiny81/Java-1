public class MethodParameters1 {

      private String name;

    public static void main(String[] args) {
        myMethod2("John");
        myMethod2("Jessica");

        //MethodParameters1 parameters = new MethodParameters1();
        //parameters.setName("Jyoti");

    }

    public static void myMethod2(String fname){
              System.out.println(fname + " "+"Doe");

    }

    public void myMethod2(String name, int i) {
        this.name = name;
        System.out.println(name);
    }
public String getName() {
        return name;
}


}
