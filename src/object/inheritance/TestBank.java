package object.inheritance;

public class TestBank {
    //?Pratik Sherdiwala (Codelytics)
    public static void main(String[] args) {

        HDFC hdfc = new HDFC();
        System.out.println(hdfc.getClass().getSimpleName() + " : Rate of Interest => " + hdfc.getRateOfInterest());

        ICICI icici = new ICICI();
        System.out.println(icici.getClass().getSimpleName() + " : Rate of Interest => " + icici.getRateOfInterest());


        Axis axis = new Axis();
        System.out.println(axis.getClass().getSimpleName() + " : Rate of Interest => " + axis.getRateOfInterest());

    }
}
