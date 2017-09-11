package mcgyvers.mobitrip;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by Shanto on 9/6/2017.
 */

public class YourTrips extends Fragment {

    RecyclerView my_trips;


    //****FOR MODEL****
    ImageView trip_bg;
    TextView trip_name;
    TextView trip_date;
    TextView trip_members;
    TextView trip_expense;


    @Override
    public View onCreateView(LayoutInflater inflater, final ViewGroup container,
                             Bundle savedInstanceState) {
        setHasOptionsMenu(true);
        final View rootView = inflater.inflate(R.layout.fragment_your_trips, container, false);


        my_trips = rootView.findViewById(R.id.my_trips_recyclerView);

        trip_bg = rootView.findViewById(R.id.bg_trip);
        trip_date = rootView.findViewById(R.id.tour_date);
        trip_name = rootView.findViewById(R.id.tour_name);
        trip_members = rootView.findViewById(R.id.trip_total_member);
        trip_expense = rootView.findViewById(R.id.trip_expense_per_head);

        return rootView;
    }

    @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        inflater.inflate(R.menu.menu_sort, menu);
        super.onCreateOptionsMenu(menu,inflater);
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle item selection
        switch (item.getItemId()) {
            case R.id.sort_asc:
                Toast.makeText(getActivity(), "Order by ascending", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.sort_desc:
                Toast.makeText(getActivity(), "Order by descending", Toast.LENGTH_SHORT).show();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }



}
