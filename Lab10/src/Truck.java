// Carter T. Threatt
public class Truck extends Vehicle {
    private double loadCapacity; // in tons
    private double towingCapacity; // in tons

    // Default Constructor
    public Truck() {
        super(); // Call Vehicle's default constructor
        this.loadCapacity = 0.0;
        this.towingCapacity = 0.0;
    }

    // Parameterized Constructor
    public Truck(String manufacturerName, int numberOfCylinders, String ownerName, double loadCapacity, double towingCapacity) {
        super(manufacturerName, numberOfCylinders, ownerName);
        setLoadCapacity(loadCapacity);
        setTowingCapacity(towingCapacity);
    }

    // Accessor Methods
    public double getLoadCapacity() {
        return loadCapacity;
    }

    public double getTowingCapacity() {
        return towingCapacity;
    }

    // Mutator Methods
    public void setLoadCapacity(double loadCapacity) {
        if (loadCapacity >= 0) {
            this.loadCapacity = loadCapacity;
        } else {
            System.out.println("Invalid load capacity. Must be non-negative.");
        }
    }

    public void setTowingCapacity(double towingCapacity) {
        if (towingCapacity >= 0) {
            this.towingCapacity = towingCapacity;
        } else {
            System.out.println("Invalid towing capacity. Must be non-negative.");
        }
    }

    // equals Method
    @Override
    public boolean equals(Object obj) {
        if (!super.equals(obj)) return false;
        if (!(obj instanceof Truck)) return false;
        Truck other = (Truck) obj;
        return Double.compare(loadCapacity, other.loadCapacity) == 0 &&
               Double.compare(towingCapacity, other.towingCapacity) == 0;
    }

    // toString Method
    @Override
    public String toString() {
        return super.toString() +
               "\nLoad Capacity: " + loadCapacity + " tons" +
               "\nTowing Capacity: " + towingCapacity + " tons";
    }
}
