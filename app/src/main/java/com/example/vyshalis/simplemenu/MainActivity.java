package com.example.vyshalis.simplemenu;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

   // @Override

    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

  //  @Override

    public boolean onCreateOptionsMenu(android.view.MenuItem item) {
        switch (item.getItemId()) {
            case R.id.item_share:
                Toast.makeText(MainActivity.this, "Share", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.item_delete:
                Toast.makeText(MainActivity.this, "Delete", Toast.LENGTH_SHORT).show();
                return true;

        }
        return super.onOptionsItemSelected(item);
    }

}
