package design_patterns.structural.decorator;


public class GPSDecorator extends CarDecorator {
    public GPSDecorator(Car car) {
        super(car);
    }

    @Override
    public void assemble() {
        super.assemble();
        System.out.println("Adding GPS features.");
    }
}

