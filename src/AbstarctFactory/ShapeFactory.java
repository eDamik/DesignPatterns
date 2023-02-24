package AbstarctFactory;

public class ShapeFactory extends AbstartFactory {

    @Override
    IShape getShape(String shape) {
        if (shape == null) { return null; }

    }
}
