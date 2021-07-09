package com.mr.rvxobjectclassmodel;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.mr.rvxobjectclassmodel.adapter.MobilAdapter;
import com.mr.rvxobjectclassmodel.model.MobilModel;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rvDataMobil;
    private MobilAdapter mobilAdapter;
    private RecyclerView.LayoutManager layoutManager;
    private List<MobilModel> listMobil = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setUI();
    }

    private void setUI() {

        rvDataMobil = findViewById(R.id.rv_data_mobil);
        rvDataMobil.setHasFixedSize(true);
        layoutManager = new LinearLayoutManager(this);
        rvDataMobil.setLayoutManager(layoutManager);
        listMobil.add(new MobilModel("BMW", "M3 Competition", "Red Luxury", "Gasoline", "IDR 3.400.000.000,00"));
        listMobil.add(new MobilModel("Mercedes Benz", "S-Class", "Black", "Gasoline", "IDR 2.900.000.000,00"));
        listMobil.add(new MobilModel("Porsche", "GT-S 991", "Yellow", "Gasoline", "IDR 4.100.000.000,00"));
        listMobil.add(new MobilModel("Range Rover", "Evoque", "Grey Metallic", "Gasoline", "IDR 899.000.000,00"));
        listMobil.add(new MobilModel("McLaren", "720s", "Blue", "Gasoline", "IDR 7.400.000.000,00"));
        listMobil.add(new MobilModel("Koenigsegg", "Jesko", "White Luxury", "Gasoline", "IDR 45.000.000.000,00"));
        listMobil.add(new MobilModel("Rolls Royce", "Ghost", "Black Metallic", "Gasoline", "IDR 21.500.000.000,00"));
        mobilAdapter = new MobilAdapter(listMobil, this);
        rvDataMobil.setAdapter(mobilAdapter);
        mobilAdapter.notifyDataSetChanged();

    }
}