import access_specifier.AccessSpecifier;

public class Sample extends AccessSpecifier{

    @Override
    protected void add() {
        super.add();
    }

    //?Pratik Sherdiwala (Codelytics)
    public static void main(String[] args) {
        System.out.println("Sample Started");

        System.out.println(new AccessSpecifier().a);

        //new AccessSpecifier().add();

        new Sample().add();

    }
}
