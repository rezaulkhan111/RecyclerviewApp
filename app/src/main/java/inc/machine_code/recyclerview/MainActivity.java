package inc.machine_code.recyclerview;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<CountryList> countryList;

    Bitmap photo;//(Bitmap) R.drawable.argentina;
    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

     mRecyclerView=(RecyclerView) findViewById(R.id.rv_country_name_flag);
     mRecyclerView.setHasFixedSize(true);
     mRecyclerView.setLayoutManager(new LinearLayoutManager(this));

     countryList=new ArrayList<>();



        countryList.add(new CountryList(6,"ALGERIA","6",R.mipmap.ic_algeria_foreground));
        countryList.add(new CountryList(6,"ARGENTINA","18",R.mipmap.ic_argentina_foreground));
        countryList.add(new CountryList(6,"AUSTRALIA","21",R.mipmap.ic_australia_foreground));
        countryList.add(new CountryList(6,"AZERBAIJAN","1",R.mipmap.ic_azerbaijan_foreground));
        countryList.add(new CountryList(6,"BELARUS","2",R.mipmap.ic_belarus_foreground));
        countryList.add(new CountryList(6,"BOLIVIA","1",R.mipmap.ic_bolivia_foreground));
        countryList.add(new CountryList(6,"BRAZIL","17",R.mipmap.ic_brazil_foreground));
        countryList.add(new CountryList(6,"BULGARIA","1",R.mipmap.ic_bulgaria_foreground));
        countryList.add(new CountryList(6,"CANADA","48",R.mipmap.ic_canada_foreground));
        countryList.add(new CountryList(6,"CHILE","3",R.mipmap.ic_chile_foreground));


        countryList.add(new CountryList(6,"CHINA","296",R.mipmap.ic_china_foreground));
        countryList.add(new CountryList(6,"CZECHIA","3",R.mipmap.ic_czechia_foreground));
        countryList.add(new CountryList(6,"DENMARK","9",R.mipmap.ic_denmark_foreground));
        countryList.add(new CountryList(6,"ECUADOR","2",R.mipmap.ic_ecuador_foreground));
        countryList.add(new CountryList(6,"EGYPT","5",R.mipmap.ic_egypt_foreground));
        countryList.add(new CountryList(6,"ESTONIA","1",R.mipmap.ic_estonia_foreground));
        countryList.add(new CountryList(6,"FRANCE","68",R.mipmap.ic_france_foreground));
        countryList.add(new CountryList(6,"GERMANY","52",R.mipmap.ic_germany_foreground));
        countryList.add(new CountryList(6,"GREECE","4",R.mipmap.ic_greece_foreground));
        countryList.add(new CountryList(6,"INDIA","88",R.mipmap.ic_india_foreground));
        countryList.add(new CountryList(6,"INDONESIA","16",R.mipmap.ic_indonesia_foreground));
        countryList.add(new CountryList(6,"IRAN","1",R.mipmap.ic_iran_foreground));
        countryList.add(new CountryList(6,"IRAQ","1",R.mipmap.ic_iraq_foreground));
        countryList.add(new CountryList(6,"ISRAEL","17",R.mipmap.ic_israel_foreground));
        countryList.add(new CountryList(6,"ITALY","27",R.mipmap.ic_italy_foreground));
        countryList.add(new CountryList(6,"JAPAN","173",R.mipmap.ic_japan_foreground));

        countryList.add(new CountryList(6,"KAZAKHSTAN","6",R.mipmap.ic_kazakhstan_foreground));
        countryList.add(new CountryList(6,"LAOS","1",R.mipmap.ic_laos_foreground));
        countryList.add(new CountryList(6,"LATVIA","1",R.mipmap.ic_latvia_foreground));
        countryList.add(new CountryList(6,"LITHUANIA","1",R.mipmap.ic_lithuania_foreground));
        countryList.add(new CountryList(6,"LUXEMBOURG","4",R.mipmap.ic_luxembourg_foreground));
        countryList.add(new CountryList(6,"MALAYSIA","7",R.mipmap.ic_malaysia_foreground));
        countryList.add(new CountryList(6,"MEXICO","12",R.mipmap.ic_mexico_foreground));
        countryList.add(new CountryList(6,"MOROCCO","1",R.mipmap.ic_morocco_foreground));
        countryList.add(new CountryList(6,"NETHERLANDS","6",R.mipmap.ic_netherlands_foreground));
        countryList.add(new CountryList(6,"NIGERIA","6",R.mipmap.ic_nigeria_foreground));
        countryList.add(new CountryList(6,"NORTH KOREA","2",R.mipmap.ic_north_korea_foreground));
        countryList.add(new CountryList(6,"NORTH KOREA","2",R.mipmap.ic_norway_foreground));


        countryList.add(new CountryList(6,"PAKISTAN","3",R.mipmap.ic_pakistan_foreground));
        countryList.add(new CountryList(6,"PERU","1",R.mipmap.ic_peru_foreground));
        countryList.add(new CountryList(6,"PHILIPPINES","2",R.mipmap.ic_philippines_foreground));
        countryList.add(new CountryList(6,"POLAND","2",R.mipmap.ic_poland_foreground));
        countryList.add(new CountryList(6,"PORTUGAL","2",R.mipmap.ic_portugal_foreground));
        countryList.add(new CountryList(6,"RUSSIA","1505",R.mipmap.ic_russia_foreground));
        countryList.add(new CountryList(6,"SAUDI ARABIA","13",R.mipmap.ic_saudi_arabia_foreground));
        countryList.add(new CountryList(6,"SINGAPORE","9",R.mipmap.ic_singapore_foreground));
        countryList.add(new CountryList(6,"SLOVAKIA","1",R.mipmap.ic_slovakia_foreground));
        countryList.add(new CountryList(6,"SOUTH AFRICA","6",R.mipmap.ic_south_africa_foreground));
        countryList.add(new CountryList(6,"SOUTH KOREA","24",R.mipmap.ic_south_korea_foreground));
        countryList.add(new CountryList(6,"SPAIN","23",R.mipmap.ic_spain_foreground));

        countryList.add(new CountryList(6,"SWEDEN","12",R.mipmap.ic_sweden_foreground));
        countryList.add(new CountryList(6,"TAIWAN","9",R.mipmap.ic_taiwan_foreground));
        countryList.add(new CountryList(6,"THAILAND","9",R.mipmap.ic_thailand_foreground));
        countryList.add(new CountryList(6,"TURKEY","14",R.mipmap.ic_turkey_foreground));
        countryList.add(new CountryList(6,"UNITED ARAB EMIRATES","9",R.mipmap.ic_united_arab_emirates_foreground));
        countryList.add(new CountryList(6,"UNITED KINGDOM","42",R.mipmap.ic_united_kingdom_foreground));
        countryList.add(new CountryList(6,"USA","1619",R.mipmap.ic_united_states_of_america_foreground));
        countryList.add(new CountryList(6,"URUGUAY","1",R.mipmap.ic_uruguay_foreground));
        countryList.add(new CountryList(6,"VENEZUELA","3",R.mipmap.ic_venezuela_foreground));
        countryList.add(new CountryList(6,"VIETNAM","3",R.mipmap.ic_vietnam_foreground));




       CountryAdapter adapter= new CountryAdapter( this,countryList);

        mRecyclerView.setAdapter(adapter);

    }
}

