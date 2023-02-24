package Creational;

public abstract class SmartPhone {
    public abstract String GetModel();
    @Override
    public String toString() {
        return "Model: " + this.GetModel();
    }
}
