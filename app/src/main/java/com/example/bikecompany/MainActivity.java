package com.example.bikecompany;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.recyclerViewBikeCompanies);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        List<String> bikeCompanies = Arrays.asList(
                "Yamaha",
                "Honda",
                "Suzuki",
                "Kawasaki",
                "Ducati",
                "BMW",
                "Harley-Davidson",
               "Buel",
                "Zontes",
                "KTM",
                "Husqvarna","Norton Motorcycles","CFMOTO","Rieju","Bajaj","Hyosung",
               "Lambretta"






        );

        BikeCompanyAdapter adapter = new BikeCompanyAdapter(bikeCompanies);
        recyclerView.setAdapter(adapter);
    }
}
