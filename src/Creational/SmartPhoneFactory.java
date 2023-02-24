package Creational;

public class SmartPhoneFactory {
    public static SmartPhone GetInstance(String name, String modelName) {
        if (name == "Iphone") { return new Iphone(modelName); }
        if (name == "Samsung") { return new Samsung(modelName); }
        if (name == "Xiaomi") { return new Xiaomi(modelName); }
        return null;
    }
}
