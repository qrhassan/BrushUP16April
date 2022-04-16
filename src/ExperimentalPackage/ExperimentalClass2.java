package ExperimentalPackage;

import MentoringPractice.InstanceStatic;

public class ExperimentalClass2 {

//    public ExperimentalClass2 () {  //Default Constructor
//        System.out.println("I am from different package");

    public static void main(String[] args) {

        InstanceStatic object3 = new InstanceStatic();
        System.out.println(InstanceStatic.yearModel);

    }
}
