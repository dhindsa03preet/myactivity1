package com.example.myactivity1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

import static android.icu.lang.UCharacter.GraphemeClusterBreak.V;

public class MainActivity extends AppCompatActivity {
Button bn1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bn1=findViewById(R.id.button);
        bn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              /*  Snackbar snb=Snackbar.make(findViewById(R.id.myView),"Done !",Snackbar.LENGTH_LONG);
                snb.show();*/
              Snackbar snb=Snackbar.make(findViewById(R.id.myView) , "Action Snakbar",Snackbar.LENGTH_INDEFINITE).setAction("retry!");
                      public void Onclick(ViewV);

            }
        });
    }
}
