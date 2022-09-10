/* 
*
* This file is the gate in which the owner's balance is updated and
* new records are saved into the database
*
*/
public class Booth {
    public static void boothEnter(HGS currentVehicle) {
        double bridge_toll = currentVehicle.getVehicle().getCost();
        double currentBalance = currentVehicle.getBalance();

        if (currentBalance < bridge_toll) {
            try {
                throw new Exception("Insufficient funds!");
            } catch (Exception e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        } else {
            currentVehicle.setBalance(currentBalance - bridge_toll);
        }

        // Create a new log for a new vehicle and append it to the array
        String[] log = Database.createLog(currentVehicle);
        Database.appendLog(log);

    }

   
}
