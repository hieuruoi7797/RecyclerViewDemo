package vn.hieuruoi.recyclerviewdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
     protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }
    public void initView(){
        RecyclerView recyclerView = findViewById(R.id.recycler_view);
        recyclerView.setHasFixedSize(true);
        LinearLayoutManager layoutManager= new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false);
        recyclerView.setLayoutManager(layoutManager);
        ArrayList<Data> arrayList = new ArrayList<>();
        arrayList.add(new Data(R.drawable.chh,"CÁ HỒI HOANG"));
        arrayList.add(new Data(R.drawable.ngot,"NGỌT"));
        arrayList.add(new Data(R.drawable.gac_mai,"GÁC MÁI"));
        arrayList.add(new Data(R.drawable.quai_vat_ti_hon,"QUÁI VẬT TÍ HON"));
        arrayList.add(new Data(R.drawable.nhung_dua_tre,"NHỮNG ĐỨA TRẺ"));
        Adapter adapter = new Adapter(arrayList,getApplicationContext());
        recyclerView.setAdapter(adapter);

    }
}


