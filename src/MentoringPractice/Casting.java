package MentoringPractice;

public class Casting {

    public static void main(String[] args) {

        //Narrowing Casting
        double myDouble = 9.78;
        int myInt = (int) myDouble; //Manual Casting double to int
        System.out.println(myDouble);
        System.out.println(myInt);

        //Widening Casting
        int myInt1 = 90;
        double myDouble1 = myInt; //Automatic Casting int to double
        System.out.println(myInt1);
        System.out.println(myDouble1);
    }
}
