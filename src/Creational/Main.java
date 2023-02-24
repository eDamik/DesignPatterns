package Creational;

public class Main {
    public static void main(String[] args) {
        SmartPhone iphone = SmartPhoneFactory.GetInstance("Iphone", "Iphone 7");
        System.out.println(iphone.toString());
    }
}
