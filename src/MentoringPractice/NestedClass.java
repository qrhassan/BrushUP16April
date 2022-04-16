package MentoringPractice;

//Parent Class
public class NestedClass {
    String countryName = "Bangladesh";
    int populationMillion = 164;
    static boolean overPopulated = true;

    //Child Class
    public static class ChildClass {
        int victoryYear = 1971;
        double peopleDiedMillion = 3.5;
        static String outCome = "Independent";

        //Child Class main method
        public static void main(String[] args) {

            NestedClass object = new NestedClass();
            System.out.println("Country Name is " + object.countryName);
            System.out.println("Population is " + object.populationMillion);
            System.out.println("It is overpopulated" + NestedClass.overPopulated);
        }
    }


    //Parent main method
    public static void main(String[] args) {

        ChildClass object1 = new ChildClass();
        System.out.println(object1.peopleDiedMillion);
        System.out.println(object1.victoryYear);
        System.out.println(ChildClass.outCome);

    }
}
