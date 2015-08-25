package com.example.s14003.englishmaster;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;



public class Main extends AppCompatActivity implements View.OnClickListener {

    private ImageButton image1;
    private ImageButton image2;
    private ImageButton image3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        image1 = (ImageButton)findViewById(R.id.imagebuton);
        image1.setOnClickListener(this);
        image2 = (ImageButton)findViewById(R.id.imagebuton2);
        image2.setOnClickListener(this);
        image3 = (ImageButton)findViewById(R.id.imagebuton3);
        image3.setOnClickListener(this);


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    /**
     * Called when a view has been clicked.
     *
     * @param v The view that was clicked.
     */
    @Override
    public void onClick(View v) {
        if (image1 == v) {
            Intent it = new Intent(this, Sentaku.class);
            startActivity(it);
        } else if (image2 == v) {

        } else if (image3 == v) {

        }
    }
}
