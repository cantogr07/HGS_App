/* 
*
* This class is the parent class for all 3 subclasses 
* Automobile, Minibus and Autobus
*
*/

public class Vehicle {

    protected int vehicle_type;

    protected double bridge_toll;

    // returns the type of the vehicle
    public int getVehicleType() {
        return this.vehicle_type;
    }

    // returns the cost for the bridge
    public double getCost() {
        return this.bridge_toll;
    }
}
