package mcgyvers.mobitrip.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.rengwuxian.materialedittext.MaterialEditText;

import java.util.ArrayList;

import mcgyvers.mobitrip.R;
import mcgyvers.mobitrip.dataModels.Member;

/**
 * Created by edson on 14/09/17.
 */

public class MemberData extends RecyclerView.Adapter<MemberData.MyViewHolder> {

    private ArrayList<Member> members;
    private Context context;

    public MemberData(ArrayList<Member> members, Context context) {
        this.members = members;
        this.context = context;
    }


    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
        View itemView = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.my_trips_model, viewGroup, false);
        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        final Integer pos = position;
        final Member member = members.get(pos);

        holder.memberName.setText(member.getName());
        holder.memberAmount.setText(member.getAmount());
        holder.memberPhone.setText(member.getPhone());


    }

    @Override
    public int getItemCount() {
        return 0;
    }


    public class MyViewHolder extends RecyclerView.ViewHolder {
        MaterialEditText memberName;
        MaterialEditText memberAmount;
        MaterialEditText memberPhone;
        ImageView deleteMember;
        public MyViewHolder(View view) {
            super(view);

            memberName = (MaterialEditText) view.findViewById(R.id.model_member_name);
            memberAmount = (MaterialEditText) view.findViewById(R.id.model_member_amount);
            memberPhone = (MaterialEditText) view.findViewById(R.id.model_member_phone);
            deleteMember = (ImageView) view.findViewById(R.id.delete_model);
        }
    }
}
