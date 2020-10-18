public class Person {
    private String name;

    public void setName(String name) {
        this.name = name; // private string name = constructor name;
    }

    public String getName() {
        return name;
    }

    public static void main(String[] args) {
        Person person = new Person();
        person.setName("Bob");

        System.out.println(person.getName());


        int i = 5;
        setPersonName(person, i);
        System.out.println(person.getName() + " " + i);

       System.out.println(person.getName());


        System.out.println(person.getName());
    }

    private static void setPersonName(Person person, int num) {
        person.setName("Linda");
        num = 99;
    }

}
