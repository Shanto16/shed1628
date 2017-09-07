package mcgyvers.mobitrip;

import android.app.DatePickerDialog;
import android.content.Context;
import android.content.Intent;
import android.icu.text.SimpleDateFormat;
import android.icu.util.Calendar;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.DatePicker;

import com.rengwuxian.materialedittext.MaterialEditText;

import java.util.Locale;

import io.blackbox_vision.datetimepickeredittext.view.DatePickerEditText;

/**
 * Created by Shanto on 9/5/2017.
 */

public class NewTrip extends Fragment {

    Button members;

    DatePickerEditText trip_date;

    @Override
    public View onCreateView(LayoutInflater inflater, final ViewGroup container,
                             Bundle savedInstanceState) {
        final View rootView = inflater.inflate(R.layout.fragment_new_trip, container, false);
        final Context context = getActivity();

        members = rootView.findViewById(R.id.membersDetails);

        trip_date = rootView.findViewById(R.id.et_trip_date);

        trip_date.setManager(getFragmentManager());


        members.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getActivity(),Current_trip_member_information.class));

            }
        });




        return rootView;
    }




}
