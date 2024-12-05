// Carter T. Threatt
public class Vehicle {
    private String manufacturerName;
    private int numberOfCylinders;
    private String ownerName;

    // Default Constructor
    public Vehicle() {
        this.manufacturerName = "Unknown";
        this.numberOfCylinders = 1; // Minimum of 1 cylinder
        this.ownerName = "No owner";
    }

    // Parameterized Constructor
    public Vehicle(String manufacturerName, int numberOfCylinders, String ownerName) {
        setManufacturerName(manufacturerName);
        setNumberOfCylinders(numberOfCylinders);
        setOwnerName(ownerName);
    }

    // Accessor Methods
    public String getManufacturerName() {
        return manufacturerName;
    }

    public int getNumberOfCylinders() {
        return numberOfCylinders;
    }

    public String getOwnerName() {
        return ownerName;
    }

    // Mutator Methods
    public void setManufacturerName(String manufacturerName) {
        this.manufacturerName = manufacturerName;
    }

    public void setNumberOfCylinders(int numberOfCylinders) {
        if (numberOfCylinders > 0) {
            this.numberOfCylinders = numberOfCylinders;
        } else {
            System.out.println("Invalid number of cylinders. Must be greater than 0.");
            this.numberOfCylinders = 1;
        }
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    // equals Method
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Vehicle)) return false;
        Vehicle other = (Vehicle) obj;
        return manufacturerName.equals(other.manufacturerName) &&
               numberOfCylinders == other.numberOfCylinders &&
               ownerName.equals(other.ownerName);
    }

    // toString Method
    @Override
    public String toString() {
        return "Manufacturer's Name: " + manufacturerName +
               "\nNumber Of Cylinders: " + numberOfCylinders +
               "\nOwner's Name: " + ownerName;
    }
}
