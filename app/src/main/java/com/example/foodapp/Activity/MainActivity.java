package com.example.foodapp.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
/**
 * DJODI MARTIN
 * djodimartin@gmail.com
 *
 */
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.foodapp.Activity.Adaptor.CategoryAdaptor;
import com.example.foodapp.Activity.Adaptor.PopularAdaptor;
import com.example.foodapp.Activity.Domain.CategoryDomain;
import com.example.foodapp.Activity.Domain.FoodDomain;
import com.example.foodapp.Profil.LoginActivity;
import com.example.foodapp.Profil.ProfilActivity;
import com.example.foodapp.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView.Adapter adapter,adapter2;
    private RecyclerView recyclerViewCategoryList,recyclerViewPopularlist;
    private TextView akunnn_btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        akunnn_btn = findViewById(R.id.profillz_btn);
        akunnn_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, LoginActivity.class));
            }
        });
        recyclerViewCategory();
        recyclerViewPopular();
        bottomNavigation();
    }


    private void bottomNavigation() {
        FloatingActionButton floatingActionButton = findViewById(R.id.cartBtn);
        LinearLayout homeBtn = findViewById(R.id.home_btn);

        floatingActionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, CartListActivity.class));
            }
        });
        homeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, MainActivity.class));
            }
        });
    }


    private void recyclerViewCategory() {
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        recyclerViewCategoryList = findViewById(R.id.recyclerView);
        recyclerViewCategoryList.setLayoutManager(linearLayoutManager);

        ArrayList<CategoryDomain> category = new ArrayList<>();
        category.add(new CategoryDomain("Usus", "usus"));
        category.add(new CategoryDomain("Ampela", "atiampela"));
        category.add(new CategoryDomain("sate", "sate"));
        category.add(new CategoryDomain("Drink", "air"));
        category.add(new CategoryDomain("telor", "telor"));

        adapter = new CategoryAdaptor(category);
        recyclerViewCategoryList.setAdapter(adapter);
    }

    private void recyclerViewPopular() {
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        recyclerViewPopularlist = findViewById(R.id.recyclerView2);
        recyclerViewPopularlist.setLayoutManager(linearLayoutManager);



        ArrayList<FoodDomain> foodList = new ArrayList<>();

        foodList.add(new FoodDomain("Promo Paket Komplit", "nasi", "Promo Paket Nasi Komplit, 1 Usus, 1 Telor, 1 Hati Ampela, 1 Air Putih ",12.0));
        foodList.add(new FoodDomain("Sate Kulit", "sate", "Sate Kulit 1 pcs Rp. 2000",2.0));
        foodList.add(new FoodDomain("Hati Ampela", "atiampela", "Hati Ampela 1 pcs Rp. 4.000",4.0));
        foodList.add(new FoodDomain("Air Putih ", "air", "Air Putih Rp. 4000",4.0));
        foodList.add(new FoodDomain("Sate Usus", "usus", " Sate Usus 1 pcs Rp. 2000",2.0));
        foodList.add(new FoodDomain("Telor Puyuh", "telor", "Telor Puyuh 1 Pcs Rp. 3000",3.0));



        adapter2 = new PopularAdaptor(foodList);
        recyclerViewPopularlist.setAdapter(adapter2);
    }
}