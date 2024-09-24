package design_patterns.structural.decorator;

public class MusicSystemDecorator extends CarDecorator {
    public MusicSystemDecorator(Car car) {
        super(car);
    }

    @Override
    public void assemble() {
        super.assemble();
        System.out.println("Adding Music System features.");
    }
}
