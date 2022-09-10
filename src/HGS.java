/* 
*
* This file contains the information about passing vehicles
*
*/
public class HGS {

    private int HGSNo;
    private String vehicleOwnerName;
    private String vehicleOwnerSurname;
    private int vehicleType;

    private String passTime;
    private String passDate;

    private double balanceOfOwner;

    private Vehicle vehicle;

    // Getter methods
    public int getHGSNumber() {
        return this.HGSNo;
    }

    public String getVehicleOwnerName() {
        return this.vehicleOwnerName;
    }

    public String getVehicleOwnerSurname() {
        return this.vehicleOwnerSurname;
    }

    public int getVehicleType() {
        return this.vehicleType;
    }

    public String getPassTime() {
        return this.passTime;
    }

    public String getPassDate() {
        return this.passDate;
    }

    public double getBalance() {
        return this.balanceOfOwner;
    }

    public Vehicle getVehicle() {
        return this.vehicle;
    }

    // Setter methods
    public void setHGSNumber(int HGSNo) {
        this.HGSNo = HGSNo;
    }

    public void setVehicleOwnerName(String vehicleOwnerName) {
        this.vehicleOwnerName = vehicleOwnerName;
    }

    public void setVehicleOwnerSurname(String vehicleOwnerSurname) {
        this.vehicleOwnerSurname = vehicleOwnerSurname;
    }

    public void setVehicleType(int vehicleType) {
        this.vehicleType = vehicleType;
    }

    public void setPassTime(String passTime) {
        this.passTime = passTime;
    }

    public void setPassDate(String passDate) {
        this.passDate = passDate;
    }

    public void setBalance(double balanceOfOwner) {
        this.balanceOfOwner = balanceOfOwner;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public HGS(int HGSNo, String vehicleOwnerName, String vehicleOwnerSurname, Vehicle vehicle,
            int vehicleType, String passDate, String passTime, double balanceOfOwner) {
        this.HGSNo = HGSNo;
        this.vehicleOwnerName = vehicleOwnerName;
        this.vehicleOwnerSurname = vehicleOwnerSurname;
        this.vehicle = vehicle;
        this.vehicleType = vehicleType;
        this.passDate = passDate;
        this.passTime = passTime;
        this.balanceOfOwner = balanceOfOwner;
    }

}
