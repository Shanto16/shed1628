package mcgyvers.mobitrip;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by Shanto on 9/7/2017.
 */

public class Current_trip extends Fragment {

    Button team_expense;

    @Override
    public View onCreateView(LayoutInflater inflater, final ViewGroup container,
                             Bundle savedInstanceState) {
        final View rootView = inflater.inflate(R.layout.fragment_current_trip, container, false);
        final Context context = getActivity();



        team_expense = rootView.findViewById(R.id.team_expense_button);


        team_expense.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // custom dialog
                final Dialog dialog = new Dialog(context);
                dialog.setContentView(R.layout.expense_model);
                dialog.setTitle("Team Expense");

                // set the custom dialog components - text, image and button
                TextView name_text = (TextView) dialog.findViewById(R.id.expense_name_text);
                name_text.setText("Edson");

                EditText expense_edit =(EditText) dialog.findViewById(R.id.expense_expense_edit);
                expense_edit.setText("2540");
                ImageView call_member = (ImageView) dialog.findViewById(R.id.expense_call_member);

                call_member.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Toast.makeText(getActivity(), "It will open up the dialer of phone", Toast.LENGTH_SHORT).show();
                    }
                });


                dialog.show();

            }
        });

        return rootView;
    }
}
