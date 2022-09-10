/* 
*
* This is the class where daily pass information of vehicles are recorded
*
*/

import java.util.ArrayList;

public class Database {
    private static ArrayList<String[]> vehicleLogs;

    // A log with properties of vehicles in it
    public static String[] createLog(HGS save) {
        String[] result = new String[8];
        result[0] = "" + save.getHGSNumber();
        result[1] = save.getVehicleOwnerName();
        result[2] = save.getVehicleOwnerSurname();
        result[3] = "" + save.getVehicleType();
        result[4] = save.getPassDate();
        result[5] = save.getPassTime();
        result[6] = "" + save.getBalance();
        result[7] = "" + save.getVehicle().getCost();
        return result;
    }

    public static void appendLog(String[] log) {
        vehicleLogs.add(log);
    }

    public static void report() {
        System.out.print("Today's yield: ");
        double total = 0;
        for (String[] str : vehicleLogs) {
            total += Double.parseDouble(str[7]);
        }
        System.out.println(total);

    }
}
