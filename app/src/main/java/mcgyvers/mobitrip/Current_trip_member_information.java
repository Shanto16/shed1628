package mcgyvers.mobitrip;

import android.app.ActionBar;
import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ListView;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.rengwuxian.materialedittext.MaterialEditText;

import java.util.ArrayList;

import mcgyvers.mobitrip.adapters.MemberData;
import mcgyvers.mobitrip.dataModels.Member;
import mcgyvers.mobitrip.dataModels.Trip;

public class Current_trip_member_information extends AppCompatActivity {

    Button addmember,save,cancel;
    RecyclerView membersInformation;



    MaterialEditText name,contact_num,amount;
    ImageButton add_now;


    //**********************************************
     // MODEL ITEMS TO BE USED IN ADAPTER

    MaterialEditText memberName,memberAmount,memberPhone;
    ImageView deleteMember;

    //********************************************

    MemberData mAdapter;
    ArrayList<Member> memberList = new ArrayList<>();
    LinearLayoutManager layoutManager;
    SharedPreferences sharedPreferences;
    SharedPreferences.Editor editor;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_current_trip_member_information);
        ActionBar actionBar = getActionBar();


        addmember = (Button) findViewById(R.id.add_new_member);
        membersInformation = (RecyclerView) findViewById(R.id.member_information_recycler);
        save = (Button) findViewById(R.id.save_members);
        cancel = (Button) findViewById(R.id.cancel_members);



        //*****************Recyclerview Model**************************
        memberName = (MaterialEditText) findViewById(R.id.model_member_name);
        memberAmount = (MaterialEditText) findViewById(R.id.model_member_amount);
        memberPhone = (MaterialEditText) findViewById(R.id.model_member_phone);
        deleteMember = (ImageView) findViewById(R.id.delete_model);




        //*****************FIXED FIELDS**************************
        name = (MaterialEditText) findViewById(R.id.fixed_model_member_name);
        contact_num = (MaterialEditText) findViewById(R.id.fixed_model_member_phone);
        amount = (MaterialEditText) findViewById(R.id.fixed_model_member_amount);
        add_now = (ImageButton) findViewById(R.id.fixed_add_model);






        mAdapter = new MemberData(memberList, getApplicationContext());
        layoutManager = new LinearLayoutManager(getApplicationContext());
        membersInformation.setLayoutManager(layoutManager);
        membersInformation.setItemAnimator(new DefaultItemAnimator());
        membersInformation.setAdapter(mAdapter);

        sharedPreferences = this.getSharedPreferences(getString(R.string.preference_file_key), Context.MODE_PRIVATE);
        editor = sharedPreferences.edit();

        //getCurrentTrip();

    }

    private Trip getCurrentTrip() {
        String data = sharedPreferences.getString(getString(R.string.trips_array), "[]");
        Gson gson = new Gson();
        Trip trip = null;
        ArrayList<Trip> getAllTrips = gson.fromJson(data, new TypeToken<ArrayList<Trip>>(){}.getType());
        for(int i = 0; i < getAllTrips.size(); i++){
            if(!getAllTrips.get(i).isCompleted()){
                trip = getAllTrips.get(i);
                return trip;
            }
        }

        return trip;

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                // app icon in action bar clicked; goto parent activity.
                this.finish();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
