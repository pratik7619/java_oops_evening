package access_specifier.domain;

import access_specifier.data.DataOne;

public class DomainOne extends DataOne {
    //?Pratik Sherdiwala (Codelytics)

    public static void main(String[] args) {

        DataOne dataOne = new DataOne();
        //System.out.println(dataOne.x); => Can't access because of default member

        System.out.println(dataOne.y);

        //System.out.println(dataOne.s1);
        System.out.println(new DomainOne().s1);
        //System.out.println(new DomainOne().z);
    }
}
