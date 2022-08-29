package access_specifier.encapsulation;

public class TestPerson {
    //?Pratik Sherdiwala (Codelytics)
    public static void main(String[] args) {

        Person person = new Person();
        System.out.println(person.getAge());

        person.setAge(50);

        System.out.println(person.getAge());//

        System.out.println(person.getName());
        person.setName("Sona");
        System.out.println(person.getName());
    }
}
