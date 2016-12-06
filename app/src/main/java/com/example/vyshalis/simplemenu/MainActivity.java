package com.example.vyshalis.simplemenu;

import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {


    @Override

    public boolean onCreateOptionsMenu(Menu menu) {

        // Inflate the menu; this adds items to the action bar if it is present.

        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.my_menu, menu);

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        RelativeLayout relativeLayout;
        relativeLayout = (RelativeLayout) findViewById(R.id.relative_layout);
        switch (item.getItemId())

        {

            case R.id.id_blue_color:
                relativeLayout.setBackgroundColor(getResources().getColor(R.color.colorAccent));

                break;

            case R.id.id_red_color:
                relativeLayout.setBackgroundColor(getResources().getColor(R.color.colorPrimaryDark));

                break;

            case R.id.id_green_color:
                relativeLayout.setBackgroundColor(getResources().getColor(R.color.colorPrimary));

                break;

            case R.id.id_purple_color:
                relativeLayout.setBackgroundColor(getResources().getColor(R.color.colorPrimaryDark));

                break;

            case R.id.id_yellow_color:
                relativeLayout.setBackgroundColor(getResources().getColor(R.color.colorPrimaryDark));

                break;
        }

        return true;
    }
}



