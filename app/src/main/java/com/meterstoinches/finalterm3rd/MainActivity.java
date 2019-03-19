package com.meterstoinches.finalterm3rd;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void food(View view) {
        Intent s= new Intent(MainActivity.this,Main2Activity.class);
        startActivity(s);

    }

    public void hotels(View view) {
        Intent s= new Intent(MainActivity.this,Main3Activity.class);
        startActivity(s);
    }

    public void attr(View view) {
        Intent s= new Intent(MainActivity.this,Main4Activity.class);
        startActivity(s);
    }

    public void sugg(View view) {
        Intent s= new Intent(MainActivity.this,Main5Activity.class);
        startActivity(s);

    }
}
