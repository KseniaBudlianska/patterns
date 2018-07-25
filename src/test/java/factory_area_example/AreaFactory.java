package factory_area_example;


public class AreaFactory {

    public Area getArea(Areas area) {
        if (area.equals(Areas.RECTANGLE)) {
            return new RectangleArea();
        } else if (area.equals(Areas.SQUARE)) {
            return new SquareArea();
        } else if (area.equals(Areas.TRIANGLE)) {
            return new TriangleArea();
        } else return null;
    }

    enum Areas {
        RECTANGLE,
        SQUARE,
        TRIANGLE;
    }

    public static void main(String[] args) {
        new AreaFactory().getArea(Areas.RECTANGLE).printFormula();
        new AreaFactory().getArea(Areas.SQUARE).printFormula();
        new AreaFactory().getArea(Areas.TRIANGLE).printFormula();
    }
}
