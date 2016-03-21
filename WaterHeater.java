/**
 * Created by Destro on 3/21/2016.
 */
import java.util.*;

public class WaterHeater extends ServiceCall {

    public String age;

    public WaterHeater(String serviceAddress, String problemDescription, Date date, String age) {
        super(serviceAddress, problemDescription, date);


    }

    static int mandatoryFee = 20;

    @Override
    public String toString() {

        //String typeString = FurnaceTypeManager.getTypeString(furnaceType);
        String resolvedDateString = (resolvedDate == null) ? "Unresolved" : this.resolvedDate.toString();
        String resolutionString = (this.resolution == null) ? "Unresolved" : this.resolution;
        String feeString = (fee == UNRESOLVED) ? "Unresolved" : "$" + Double.toString(fee);


        return "Water Heater Service Call " + "\n" +
                "Service Address= " + serviceAddress + "\n" +
                "Problem Description = " + problemDescription + "\n" +
                "Reported Date = " + reportedDate + "\n" +
                "Resolved Date = " + resolvedDateString + "\n" +
                "Resolution = " + resolutionString + "\n" +
                "Fee = " + feeString + "\n" +
                "Mandatory city fee = " + mandatoryFee;
    }
}