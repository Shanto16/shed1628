package mcgyvers.mobitrip.dataModels;

import java.text.SimpleDateFormat;
import java.util.ArrayList;

/**
 * Created by edson on 09/09/17.
 * base object for the trips
 */

public class Trip {

    private String tripId;
    private String origin;
    private String destination;
    private Integer amount;
    private Integer commonExp;
    private android.icu.text.SimpleDateFormat date;

    private ArrayList<Member> members;

    public Trip(){}

    public Trip(String origin, String destination, Integer amount, Integer commonExp, ArrayList<Member> Members, android.icu.text.SimpleDateFormat date){
        //programatically generate tripId
        this.origin = origin;
        this.destination = destination;
        this.amount = amount;
        this.commonExp = commonExp;
        this.members = Members;
        this.date = date;
    }

    public String getTripId() {
        return tripId;
    }

    public void setTripId(String tripId) {
        this.tripId = tripId;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public Integer getCommonExp() {
        return commonExp;
    }

    public void setCommonExp(Integer commonExp) {
        this.commonExp = commonExp;
    }

    public ArrayList<Member> getMembers() {
        return members;
    }

    public void setMembers(ArrayList<Member> Members) {
        this.members = Members;
    }


    public android.icu.text.SimpleDateFormat getDate() {
        return date;
    }

    public void setDate(android.icu.text.SimpleDateFormat date) {
        this.date = date;
    }
}
