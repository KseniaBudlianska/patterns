package factory_area_example;

public class TriangleArea implements Area {

    @Override
    public void printFormula() {
        System.out.println("height * base /2");
    }
}
