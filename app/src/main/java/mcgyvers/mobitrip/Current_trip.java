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

    TextView _expense;
    ColorfulRingProgressView expenseProgress;


    Button team_expense, my_expense;

    @Override
    public View onCreateView(LayoutInflater inflater, final ViewGroup container,
                             Bundle savedInstanceState) {
        final View rootView = inflater.inflate(R.layout.fragment_current_trip, container, false);
        final Context context = getActivity();


        team_expense = rootView.findViewById(R.id.team_expense_button);
        my_expense = rootView.findViewById(R.id.my_expense_button);
        expenseProgress = rootView.findViewById(R.id.expense_progressbar);
        _expense = rootView.findViewById(R.id.pcnt_expense);

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
