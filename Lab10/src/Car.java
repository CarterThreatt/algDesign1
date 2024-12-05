// Carter T. Threatt
public class Car extends Vehicle {
    private double gasMileage; // in miles per gallon
    private int numberOfPassengers;

    // Default Constructor
    public Car() {
        super(); // Call Vehicle's default constructor
        this.gasMileage = 0.0;
        this.numberOfPassengers = 0;
    }

    // Parameterized Constructor
    public Car(String manufacturerName, int numberOfCylinders, String ownerName, double gasMileage, int numberOfPassengers) {
        super(manufacturerName, numberOfCylinders, ownerName);
        setGasMileage(gasMileage);
        setNumberOfPassengers(numberOfPassengers);
    }

    // Accessor Methods
    public double getGasMileage() {
        return gasMileage;
    }

    public int getNumberOfPassengers() {
        return numberOfPassengers;
    }

    // Mutator Methods
    public void setGasMileage(double gasMileage) {
        if (gasMileage >= 0) {
            this.gasMileage = gasMileage;
        } else {
            System.out.println("Invalid gas mileage. Must be non-negative.");
        }
    }

    public void setNumberOfPassengers(int numberOfPassengers) {
        if (numberOfPassengers >= 0) {
            this.numberOfPassengers = numberOfPassengers;
        } else {
            System.out.println("Invalid number of passengers. Must be non-negative.");
        }
    }

    // equals Method
    @Override
    public boolean equals(Object obj) {
        if (!super.equals(obj)) return false;
        if (!(obj instanceof Car)) return false;
        Car other = (Car) obj;
        return Double.compare(gasMileage, other.gasMileage) == 0 &&
               numberOfPassengers == other.numberOfPassengers;
    }

    // toString Method
    @Override
    public String toString() {
        return super.toString() +
               "\nGas Mileage: " + gasMileage + " gallons" +
               "\nNumber of Passengers: " + numberOfPassengers;
    }
}
