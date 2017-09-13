package mcgyvers.mobitrip.dataModels;

import org.json.JSONException;
import org.json.JSONObject;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.SimpleTimeZone;

/**
 * Created by edson on 09/09/17.
 * base object for the trips
 */

public class Trip {

    private String tripId;
    private String origin;
    private String destination;
    private String coverPic;
    private Integer amount;
    private Integer commonExp;
    private String date;


    private ArrayList<Member> members;

    public Trip(){}

    public Trip(String origin, String destination, Integer amount, Integer commonExp, ArrayList<Member> Members, String date, String tripId){
        //programatically generate tripId
        this.origin = origin;
        this.destination = destination;
        this.amount = amount;
        this.commonExp = commonExp;
        this.members = Members;
        this.date = date;

        this.tripId = tripId; //later on generate them upon checking the local storage
    }

    public JSONObject getTripJson(){
        JSONObject trip = new JSONObject();
        try{
            trip.put("tripId", this.tripId);
            trip.put("origin", this.origin);
            trip.put("destination", this.destination);
            trip.put("coverPic", this.coverPic);
            trip.put("amount", this.amount);
            trip.put("commomExp", this.commonExp);
            trip.put("date", this.date);
        } catch (JSONException e){
            e.printStackTrace();
        }

        return  trip;
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


    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getCoverPic() {
        return coverPic;
    }

    public void setCoverPic(String coverPic) {
        this.coverPic = coverPic;
    }
}
