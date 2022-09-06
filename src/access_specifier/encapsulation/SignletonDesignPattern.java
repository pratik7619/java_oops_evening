package access_specifier.encapsulation;

class Netflix {

    //Global constant
    private static final Netflix netflix;

    static {
        netflix = new Netflix();
    }

    private Netflix() {
        System.out.println("I am constructor");
    }

    public static Netflix getInstance() {
        return netflix;
    }

    public void watchMovie(String movieName) {
        //movieName | Singham
        System.out.println("Watching Movie: " + movieName);
    }
}


public class SignletonDesignPattern {
    //?Pratik Sherdiwala (Codelytics)
    /*
     ! Singleton Class
     ============================================================================
     * The main purpose of Singleton Design Pattern is throughout the project
     * only one instance will be created.
     *
     * Steps to create Singleton Class.
     *
     * 1. Constructor should be private.
     * 2. Create a static getter method to access instance of that class.
     * 3. Create global static final object in Singleton class.
     * */
    public static void main(String[] args) {

        Netflix pratik = Netflix.getInstance();
        pratik.watchMovie("Singham");
        System.out.println("Address :" + pratik);//Netflix@123db

        System.out.println("----------------------------");

        Netflix deep = Netflix.getInstance();
        deep.watchMovie("Hit");
        System.out.println("Address :" + deep);//Netflix@456db
        System.out.println("----------------------------");

        TestPerson.main(args);
    }
}
