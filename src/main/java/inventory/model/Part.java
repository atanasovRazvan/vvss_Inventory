
package inventory.model;


public abstract class Part {

    // Declare fields
    private int partId;
    private String name;
    private double price;
    private int numberInStock;
    private int min;
    private int max;
    
    // Constructor
    public Part(int partId, String name, double price, int numberInStock, int min, int max) {
        this.partId = partId;
        this.name = name;
        this.price = price;
        this.numberInStock = numberInStock;
        this.min = min;
        this.max = max;
    }
    
    // Getters
    public int getPartId() {
        return partId;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getnumberInStock() {
        return numberInStock;
    }

    public int getMin() {
        return min;
    }

    public int getMax() {
        return max;
    }
    
    // Setters
    public void setPartId(int partId) {
        this.partId = partId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setnumberInStock(int numberInStock) {
        this.numberInStock = numberInStock;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public void setMax(int max) {
        this.max = max;
    }
    
    /**
     * Generate an error message for invalid values in a part
     * Valid part will return an empty string
     * @param name
     * @param price
     * @param numberInStock
     * @param min
     * @param max
     * @param errorMessage
     * @return 
     */
    public static String isValidPart(String name, double price, int numberInStock, int min, int max, String errorMessage) {
        if(name.equals("")) {
            errorMessage += "A name has not been entered. ";
        }
        if(price < 0.01) {
            errorMessage += "The price must be greater than 0. ";
        }
        if(numberInStock < 1) {
            errorMessage += "Inventory level must be greater than 0. ";
        }
        if(min > max) {
            errorMessage += "The Min value must be less than the Max value. ";
        }
        if(numberInStock < min) {
            errorMessage += "Inventory level is lower than minimum value. ";
        }
        if(numberInStock > max) {
            errorMessage += "Inventory level is higher than the maximum value. ";
        }
        return errorMessage;
    }

    @Override
    public String toString() {
        return this.partId+","+this.name+","+this.price+","+this.numberInStock+","+
                this.min+","+this.max;
    }
}
