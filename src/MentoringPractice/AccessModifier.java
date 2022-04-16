package MentoringPractice;

import ExperimentalPackage.ExperimentalClass2;

public class AccessModifier {

    //Access modifier before the variable, main method and class
    //Public Access modifier doesn't have any restriction- open to another package also
    //Private Access modifier is only accessible only in the same class
    //Protective Access Modifier can be accessible only in the same package
    //Default Access Modifier is same as Protective

    public String location = "Alexandria";
    private int zipCode = 22312;
    protected static String state = "Virginia";
    String myAddress = "Same as above";

    public static void main(String[] args) {
        AccessModifier object = new AccessModifier();
        System.out.println(object.location);
        System.out.println(object.zipCode);
        System.out.println(AccessModifier.state);
        System.out.println(object.myAddress);

        ExperimentalClass object1 = new ExperimentalClass();

        ExperimentalClass2 object2 = new ExperimentalClass2();
    }
}
