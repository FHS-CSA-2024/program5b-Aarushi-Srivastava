public class Car {
    // Private class variables
    private String carName;
    private int milesDriven;
    private int gallonsUsed;

    // Constructor with no parameters(initalize string with "" and rest with 0
    //this. is to be able to use the same name
    public Car() {
        this.carName = "";
        this.milesDriven = 0;
        this.gallonsUsed = 0;
    }

    // Constructor with parameters identify the type of the variable
    public Car(String carName, int milesDriven, int gallonsUsed) {
        this.carName = carName;
        this.milesDriven = milesDriven;
        this.gallonsUsed = gallonsUsed;
    }

    // Getter and setter methods
    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public int getMilesDriven() {
        return milesDriven;
    }

    public void setMilesDriven(int milesDriven) {
        this.milesDriven = milesDriven;
    }

    public int getGallonsUsed() {
        return gallonsUsed;
    }

    public void setGallonsUsed(int gallonsUsed) {
        this.gallonsUsed = gallonsUsed;
    }

    // Method to calculate average miles per gallon
    public double calculateAverage() {
        if (gallonsUsed == 0) {
            return 0; // don't allow division by 0
        }
        double average = (double) milesDriven / gallonsUsed;
        return Math.round(average * 10.0) / 10.0; // Round to nearest 10th
    }

    // toString method to return the outcome
    
    public String toString() {
        return carName + " averaged " + calculateAverage() + " m/g";
    }
}

