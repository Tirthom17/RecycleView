package com.exaimple.myapplication;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView re_view;
    ArrayList<MainActivity2> examlist = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
      intview();
      setupRecyclerView();

    }

    private void setupRecyclerView(){

    }

    void intview(){
        re_view = findViewById(R.id.re_view);
    }
void getData(){
    examlist.add(new MainActivity2("","Redtape","1200","Redtape Shoes and Apparel | Buy Men's, Women's footwear and clothing from India's premier Fashion Brand Red tape and Get up to 70% off."));
}

}