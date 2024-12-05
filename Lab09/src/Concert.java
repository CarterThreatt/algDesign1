public class Concert {
    // Attributes
    private String bandName;
    
    private int capacity;
    
    private int numTicketsSoldByPhone;
    
    private int numTicketsSoldAtVenue;
    
    private double priceByPhone;
    
    private double priceAtVenue;

    // Default Constructor
    public Concert() {
    	
        this.bandName = "No name yet";
        
        this.capacity = 0;
        
        this.numTicketsSoldByPhone = 0;
        
        this.numTicketsSoldAtVenue = 0;
        
        this.priceByPhone = 0.0;
        
        this.priceAtVenue = 0.0;
        
    }

    // Parameterized Constructor
    public Concert(String bandName, int capacity, double priceByPhone, double priceAtVenue) {
    	
        this.bandName = bandName;
        
        this.capacity = capacity;
        
        this.numTicketsSoldByPhone = 0;
        
        this.numTicketsSoldAtVenue = 0;
        
        this.priceByPhone = priceByPhone;
        
        this.priceAtVenue = priceAtVenue;
    }

    // Accessors (Getters)
    public String getBandName() {
    	
        return bandName;
    }

    public int getCapacity() {
    	
        return capacity;
    }

    public int getNumTicketsSoldByPhone() {
    	
        return numTicketsSoldByPhone;
    }

    public int getNumTicketsSoldAtVenue() {
    	
        return numTicketsSoldAtVenue;
    }

    public double getPriceByPhone() {
    	
        return priceByPhone;
    }

    public double getPriceAtVenue() {
    	
        return priceAtVenue;
    }

    // Mutators (Setters)
    public void setBandName(String bandName) {
    	
        this.bandName = bandName;
    }

    public void setCapacity(int capacity) {
    	
        if (capacity >= 0) {
        	
            this.capacity = capacity;
            
        } else {
        	
            System.out.println("Capacity must be non-negative.");
            
        }
    }

    public void setPriceByPhone(double priceByPhone) {
    	
        if (priceByPhone >= 0) {
        	
            this.priceByPhone = priceByPhone;
            
        } else {
        	
            System.out.println("Price by phone must be non-negative.");
            
        }
    }

    public void setPriceAtVenue(double priceAtVenue) {
    	
        if (priceAtVenue >= 0) {
        	
            this.priceAtVenue = priceAtVenue;
            
        } else {
        	
            System.out.println("Price at venue must be non-negative.");
            
        }
    }

    // Method to calculate total tickets sold
    public int totalNumberOfTicketsSold() {
    	
        return numTicketsSoldByPhone + numTicketsSoldAtVenue;
        
    }

    // Method to calculate remaining tickets
    public int ticketsRemaining() {
        return capacity - totalNumberOfTicketsSold();
    }

    // Method to buy tickets at the venue
    public void buyTicketsAtVenue(int tickets) {
    	
        if (ticketsRemaining() >= tickets) {
        	
            numTicketsSoldAtVenue += tickets;
            
        } else {
        	
            System.out.println("Not enough tickets available.");
            
        }
    }

    // Method to buy tickets by phone
    public void buyTicketsByPhone(int tickets) {
    	
        if (ticketsRemaining() >= tickets) {
        	
            numTicketsSoldByPhone += tickets;
            
        } else {
        	
            System.out.println("Not enough tickets available.");
            
        }
    }

    // Method to calculate total sales
    public double totalSales() {
    	
        return (numTicketsSoldAtVenue * priceAtVenue) + (numTicketsSoldByPhone * priceByPhone);
        
    }
}
