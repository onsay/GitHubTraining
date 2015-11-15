/* LAB 6
*Winter 2015
*Jacob Nick
* Following program is my own effort/work. If part of my code is not based on my own effort then otherwise I will acknowledge the author/site and reference it clearly.
*/

package jn;

import java.util.ArrayList;

public class Garage {
    
    /**
     * An ArrayList of Autos containing all Autos in the Garage
     */
    private ArrayList<Auto> cars;
    
    /**
     * Default Constructor, instantiates a basic Garage object
     */
    public Garage(){
        cars = new ArrayList<>();
    }
    /**
     * Adds a new Auto to the Garage
     * @param car new Auto
     */
    public void addCar(Auto car){
    	
        cars.ensureCapacity(cars.size()+1);
        cars.add(car);
    }
    /**
     * Returns the average number of miles driven by all Autos in
     * the Garage
     * @return double
     */
    public double averageMiles() {
        double sum = 0;
        for (Auto car : cars) {
            sum += car.getMilesDriven();
        }
        return sum/cars.size();
    }
    /**
     * Returns an ArrayList of all Autos in the Garage
     * @return ArrayList of type Auto
     */
    public ArrayList<Auto> getCars(){
        return cars;
    }
    /**
     * Returns a String representing the "fullness" of the Garage
     * @return "full" if greater than 100 Autos, "below minimum"
     * if less than 25 Autos, "normal load" otherwise
     */
    public String occupancy() {
        if(cars.size()>=100)
            return "full";
        else if(cars.size()<25)
            return "below minimum";
        else
            return "normal load";
    }
    /**
     * Sets all Autos in the Garage to those in newCars
     * @param newCars new ArrayList of Autos
     */
    public void setCars(ArrayList<Auto> newCars){
        cars = newCars;
    }
    /**
     * Returns the total number of gallons of gas used by all Autos
     * in the Garage
     * @return double
     */
    public double totalGallons(){
        double sum = 0;
        for (Auto car : cars) {
            sum += car.getGallonsOfGas();
        }
        return sum;
    }
    /**
     * Compares an Object to the current Garage object to determine
     * equality
     * @param o the Object to be compared against
     * @return true if equal, false otherwise
     */
    @Override
    public boolean equals(Object o){
        if(!(o instanceof Garage))
            return false;
        else{
            Garage test = (Garage) o;
            return cars.equals(test.getCars());
        }
    }
    /**
     * Returns a String representation of the Garage object
     * @return String
     */
    @Override
    public String toString(){
        String output = "Cars in Garage\n";
        for(int i=0;i<cars.size();i++){
            output+="Model: " + cars.get(i).getModel() + "\n";
            output+=" miles driven: " + cars.get(i).getMilesDriven() + "\n";
            output+=" gallons of gas: " + cars.get(i).getGallonsOfGas() + "\n";
        }
        return output;
    }
}
