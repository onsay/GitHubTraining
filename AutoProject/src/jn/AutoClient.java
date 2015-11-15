
package jn;

import java.util.ArrayList;

public class AutoClient {
    
    public static void main(String[] args){
        Garage g1 = new Garage();
        g1.addCar(new Auto("BMW", 10, 25));
        g1.addCar(new Auto("BMW", 20, 35));
        Garage g2 = new Garage();
        g2.addCar(new Auto("Volvo", 100, 25));
        g2.addCar(new Auto("Ford", 200, 35));
        System.out.print("Garage object: g1(arraylist) contains auto objects " + "\n" + g1);
        System.out.println();
        System.out.print("Garage object: g2(arraylist) contains many auto objects " + "\n" + g2 + "\n");
        
        if(g1.equals(g2))
            System.out.println("The garages are equal");
        else
            System.out.println("The garages are not equal");
        
        ArrayList<Auto> temp = g2.getCars();
        g1.setCars(temp);
        if(g1.equals(g2))
            System.out.println("After changing g1, the garages are equal");
        else
            System.out.println("After changing g1, the garages are not equal");
        
        System.out.println("Average number of miles per car in garage: " + g1.averageMiles());
        System.out.println("Total gallons used by cars in garage: " + g1.totalGallons());
        
        System.out.println("\nWith 2 cars, garage occupancy: " + g1.occupancy());
        
        for(int i=0;i<30;i++)
            g1.addCar(new Auto());
        System.out.println("After adding 30 cars, garage occupancy: " + g1.occupancy());
        
        for(int i=0;i<80;i++)
            g1.addCar(new Auto());
        System.out.println("After adding 80 more cars, garage occupancy: " + g1.occupancy());
    }
    
}
