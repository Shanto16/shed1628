package mcgyvers.mobitrip;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.timqi.sectorprogressview.ColorfulRingProgressView;

/**
 * Created by Shanto on 9/7/2017.
 */

public class Current_trip extends Fragment {

    float max = 5000, min = 2045;

    float pcnt = (min / max) * 100;

    TextView _expense,spent,currentLocation, temp,weather;
    ColorfulRingProgressView expenseProgress;


    Button team_expense, my_expense,hospitals,policeStation,maps,navigation,restaurants,hotels,fuel,spots,dismiss,finish;

    @Override
    public View onCreateView(LayoutInflater inflater, final ViewGroup container,
                             Bundle savedInstanceState) {
        final View rootView = inflater.inflate(R.layout.fragment_current_trip, container, false);
        final Context context = getActivity();


        Typeface regular = Typeface.createFromAsset(getActivity().getAssets(), "fonts/Regular.ttf");
        Typeface bold = Typeface.createFromAsset(getActivity().getAssets(), "fonts/Bold.ttf");



        team_expense = rootView.findViewById(R.id.team_expense_button);
        my_expense = rootView.findViewById(R.id.my_expense_button);
        expenseProgress = rootView.findViewById(R.id.expense_progressbar);
        _expense = rootView.findViewById(R.id.pcnt_expense);
        spent = rootView.findViewById(R.id.spent_card);
        currentLocation = rootView.findViewById(R.id.current_location_text);
        temp = rootView.findViewById(R.id.temp_text);
        weather = rootView.findViewById(R.id.weather_text);

        hospitals = rootView.findViewById(R.id.nav_hospitals);
        policeStation = rootView.findViewById(R.id.nav_police);
        maps = rootView.findViewById(R.id.nav_maps);
        navigation = rootView.findViewById(R.id.nav_current);
        restaurants = rootView.findViewById(R.id.nav_restaurants);
        hotels = rootView.findViewById(R.id.nav_hotels);
        fuel = rootView.findViewById(R.id.nav_fuel);
        spots = rootView.findViewById(R.id.nav_spots);
        dismiss = rootView.findViewById(R.id.nav_dismiss);
        finish = rootView.findViewById(R.id.nav_finish);






        hospitals.setTransformationMethod(null);
        policeStation.setTransformationMethod(null);
        maps.setTransformationMethod(null);
        navigation.setTransformationMethod(null);
        restaurants.setTransformationMethod(null);
        hotels.setTransformationMethod(null);
        fuel.setTransformationMethod(null);
        spots.setTransformationMethod(null);
        dismiss.setTransformationMethod(null);
        finish.setTransformationMethod(null);
        team_expense.setTransformationMethod(null);
        my_expense.setTransformationMethod(null);







        hospitals.setTypeface(regular);
        policeStation.setTypeface(regular);
        maps.setTypeface(regular);
        navigation.setTypeface(regular);
        restaurants.setTypeface(regular);
        hotels.setTypeface(regular);
        fuel.setTypeface(regular);
        spots.setTypeface(regular);
        dismiss.setTypeface(regular);
        finish.setTypeface(regular);
        team_expense.setTypeface(regular);
        my_expense.setTypeface(regular);
        weather.setTypeface(regular);
        temp.setTypeface(regular);
        currentLocation.setTypeface(regular);

        _expense.setTypeface(bold);
        spent.setTypeface(bold);







        expenseProgress.setPercent(pcnt);
        _expense.setText(Float.toString(pcnt)+"%");

        my_expense.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // custom dialog
                final Dialog dialog = new Dialog(context);
                dialog.setContentView(R.layout.my_expense_dialog);
                dialog.setTitle("My Expense");


                Button save_button = dialog.findViewById(R.id.my_expense_save);

                save_button.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        dialog.dismiss();
                    }
                });


                ImageView addExpense = dialog.findViewById(R.id.add_new_expense);
                addExpense.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Toast.makeText(getActivity(), "A new 'my_expense_model.xml' will be added in this listView here. ", Toast.LENGTH_LONG).show();
                    }
                });


                dialog.show();

            }
        });


        team_expense.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // custom dialog
                final Dialog dialog = new Dialog(context);
                dialog.setContentView(R.layout.model_team_expense);
                dialog.setTitle("Team Expense");

                ListView team_expense = dialog.findViewById(R.id.team_expense_listview);
                Button ok_button = dialog.findViewById(R.id.team_expense_dismiss);

                ok_button.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                        dialog.dismiss();
                    }
                });


                dialog.show();

            }
        });


        return rootView;
    }
}
