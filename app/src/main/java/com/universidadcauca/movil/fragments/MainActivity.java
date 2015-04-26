package com.universidadcauca.movil.fragments;

import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import com.universidadcauca.movil.fragments.fragments.ColorFragment;


public class MainActivity extends ActionBarActivity {

    ColorFragment color;

    ColorFragment color2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        color = new ColorFragment();
        color.init(ColorFragment.ORANGE);

        color2 =  new ColorFragment();
        color2.init(ColorFragment.VIOLET);


        FragmentTransaction fT = getSupportFragmentManager().beginTransaction();

        fT.replace(R.id.container,color);

        if(!getResources().getBoolean(R.bool.port))
            fT.replace(R.id.container2, color2);

        fT.commit();

        setContentView(R.layout.activity_main);
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
}
