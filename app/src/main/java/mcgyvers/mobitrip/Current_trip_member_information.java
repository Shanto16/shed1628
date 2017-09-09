package mcgyvers.mobitrip;

import android.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;

import com.rengwuxian.materialedittext.MaterialEditText;

public class Current_trip_member_information extends AppCompatActivity {

    Button addmember,save,cancel;
    ListView membersInformation;


    //**********************************************
     // MODEL ITEMS TO BE USED IN ADAPTER

    MaterialEditText memberName,memberAmount,memberPhone;
    ImageView deleteMember;

    //********************************************

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_current_trip_member_information);
        ActionBar actionBar = getActionBar();


        addmember = (Button) findViewById(R.id.add_new_member);
        membersInformation = (ListView) findViewById(R.id.member_information_recycler);
        save = (Button) findViewById(R.id.save_members);
        cancel = (Button) findViewById(R.id.cancel_members);

        memberName = (MaterialEditText) findViewById(R.id.model_member_name);
        memberAmount = (MaterialEditText) findViewById(R.id.model_member_amount);
        memberPhone = (MaterialEditText) findViewById(R.id.model_member_phone);
        deleteMember = (ImageView) findViewById(R.id.delete_model);
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
