public class Laptop { // parameterization of constructor
    int yearFromClass ; // goal : set these data using the constructor
    String modelFromClass;
    String makeFromClass;
    String keysFromClass;

    public Laptop() { // default constructor
    }
        public Laptop (int yearFromConstructor, String modelFromConstructor){
            this.yearFromClass = yearFromConstructor;
            this.modelFromClass = modelFromConstructor;

        }
        public Laptop(int yearFromConstructor, String modelFromConstructor, String keyFromConstructor){
            this.yearFromClass = yearFromConstructor;
            this.modelFromClass = modelFromConstructor;
            this.keysFromClass = keyFromConstructor;
                    }
        public Laptop(int yearFromConstructor) {
        this.yearFromClass = yearFromConstructor;
        }
        public static void main (String [] args){
         Laptop laptop = new Laptop();
         laptop.printDetailsOfLaptop();

         Laptop laptop3 = new Laptop(2019,"mac", "32");
         laptop3.printDetailsOfLaptop();
             }
             public void printDetailsOfLaptop() {
        System.out.println(yearFromClass);
        System.out.println(modelFromClass);
        System.out.println(keysFromClass);
             }

}
