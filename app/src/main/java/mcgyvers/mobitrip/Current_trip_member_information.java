package mcgyvers.mobitrip;

import android.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.Button;

public class Current_trip_member_information extends AppCompatActivity {

    Button _addmember;
    RecyclerView _RVmembersInformation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_current_trip_member_information);
        ActionBar actionBar = getActionBar();


        _addmember = (Button) findViewById(R.id.add_new_member);
        _RVmembersInformation = (RecyclerView) findViewById(R.id.member_information_recycler);
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
