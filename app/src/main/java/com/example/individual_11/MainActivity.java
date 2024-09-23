package com.example.individual_11;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.fragment.app.FragmentTransaction;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button boton_show, boton_close;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        boton_show = findViewById(R.id.btn_show);
        boton_close = findViewById(R.id.btn_close);

        boton_close.setOnClickListener(this);
        boton_show.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        int id = view.getId();
        if (id == R.id.btn_close) {
            finish();
        }else if (id == R.id.btn_show){
            FragmentRadius fragmentRadius = new FragmentRadius();
            FragmentTransaction fragmentTransaction     = getSupportFragmentManager().beginTransaction();
            fragmentTransaction.replace(R.id.fragmentContainerView6, fragmentRadius);
            fragmentTransaction.addToBackStack(null);
            fragmentTransaction.commit();

            Fragment_Img fragment_img = new Fragment_Img();
            FragmentTransaction fragmentTransaction_img    = getSupportFragmentManager().beginTransaction();
            fragmentTransaction_img.replace(R.id.fragmentContainerView5, fragment_img);
            fragmentTransaction.addToBackStack(null);
            fragmentTransaction_img.commit();

        }

    }
}