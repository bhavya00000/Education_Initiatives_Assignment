package design_patterns.structural.decorator;

public class Main {
    public static void main(String[] args) {
        Car basicCar = new BasicCar();
        Car gpsCar = new GPSDecorator(basicCar);
        Car fullyLoadedCar = new MusicSystemDecorator(gpsCar);

        System.out.println("Basic Car Assembly:");
        basicCar.assemble();

        System.out.println("\nCar with GPS:");
        gpsCar.assemble();

        System.out.println("\nFully Loaded Car (GPS + Music System):");
        fullyLoadedCar.assemble();
    }
}
