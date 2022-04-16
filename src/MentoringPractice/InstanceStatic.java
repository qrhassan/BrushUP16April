package MentoringPractice;


public class InstanceStatic {

    String carName = "Mitsubishi";
    public static int yearModel = 2019;
    double carPrice = 32700.50;
    static String dealerName = "Wantagh";

    public static void main(String[] args) {

        InstanceStatic object = new InstanceStatic();
        System.out.println("Car name: " + object.carName);
        System.out.println("Car model: " + object.yearModel);
        System.out.println("Car price: " + object.carPrice);
        System.out.println("Dealer name: " + InstanceStatic.dealerName);


    }
}
