package inc.machine_code.recyclerview;

import android.app.LauncherActivity;
import android.content.Context;
import android.graphics.Bitmap;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class CountryAdapter extends RecyclerView.Adapter<CountryAdapter.ViewHolder> {

    private Context mCtx;

    public List<CountryList> countryList= new ArrayList<>();

    public CountryAdapter(Context mCtx, List<CountryList> countryList) {
        this.mCtx = mCtx;
        this.countryList = countryList;
    }



    public class ViewHolder extends CountryViewHolder{

        TextView tv_countryName,tv_countryCount;
        ImageView imageView;
        LinearLayout linearLayout;


        public ViewHolder(View v){
            super(v);
            tv_countryName=v.findViewById(R.id.tv_country_name);
            tv_countryCount=v.findViewById(R.id.tv_count_satellite_number);
            imageView=v.findViewById(R.id.iv_country_flag);
            linearLayout.findViewById(R.id.linearLayout);
        }

        public void onBind( int position) {


            CountryList country=countryList.get(position);

           imageView.setImageResource(countryList.get(position).getImage());
            tv_countryName.setText(String.valueOf(country.getCountryName()));
            tv_countryCount.setText(String.valueOf(country.getSatelliteCount()));
        }

    }

    public class EmptyHolder extends CountryViewHolder{

        public EmptyHolder(View view){
            super(view);
        }
    }


    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.country_flage,parent,false));


    }


    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, final int position) {

        LauncherActivity.ListItem listItem =countryList.get(position);
        holder.onBind(position);
        holder.linearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }

    @Override
    public int getItemCount() {
        return countryList.size();
    }

    class CountryViewHolder extends RecyclerView.ViewHolder{
        ImageView p_country_flag;
        TextView p_country_name,
                 p_satellite_count;



        public CountryViewHolder(View view){
            super(view);

            p_country_flag=view.findViewById(R.id.iv_country_flag);
            p_country_name =view.findViewById(R.id.tv_country_name);
            p_satellite_count=view.findViewById(R.id.tv_count_satellite_number);
        }
    }
}

