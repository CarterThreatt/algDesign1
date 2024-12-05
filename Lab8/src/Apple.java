// Apple.java
public class Apple {
    // Attributes
    private String type;
    private double weight;
    private double price;

    // Default Constructor
    public Apple() {
        this.type = "Gala";
        this.weight = 0.5;
        this.price = 0.88;
    }

    // Parameterized Constructor
    public Apple(String xType, double xWeight, double xPrice) {
        setType(xType);
        setWeight(xWeight);
        setPrice(xPrice);
    }

    // Accessor Methods
    public String getType() {
        return type;
    }

    public double getWeight() {
        return weight;
    }

    public double getPrice() {
        return price;
    }

    // Mutator Methods
    public void setType(String type) {
        if (type.equals("Red Delicious") || type.equals("Golden Delicious") || type.equals("Gala") || type.equals("Granny Smith")) {
            this.type = type;
        } else {
            System.out.println("Invalid value for type!");
            this.type = null;
        }
    }

    public void setWeight(double weight) {
        if (weight >= 0 && weight <= 2) {
            this.weight = weight;
        } else {
            System.out.println("Invalid value for weight!");
            this.weight = 0.0;
        }
    }

    public void setPrice(double price) {
        if (price >= 0) {
            this.price = price;
        } else {
            System.out.println("Invalid value for price!");
            this.price = 0.0;
        }
    }

    // Method to display values
    public void writeOutput() {
        System.out.println("Type: " + type);
        System.out.println("Weight: " + weight + " kg");
        System.out.println("Price: $" + price);
    }
}
