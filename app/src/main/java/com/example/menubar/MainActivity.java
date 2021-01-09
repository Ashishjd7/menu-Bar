package com.example.menubar;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.provider.Settings;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu)  //create menu on ur activity
    {
        //MenuInflater inflater = getMenuInflater();
        //inflater.inflate(R.menu.my_menu,menu);

        getMenuInflater().inflate(R.menu.my_menu,menu);//second menu will send reference to inbuilt menu
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) //to put functionality on menu items
    {
       int a = item.getItemId();
      //  switch (item.getItemId())
        switch (a)
        {
            case R.id.item1:
                Toast.makeText(this," Item 1",Toast.LENGTH_SHORT).show();
                break;

            case R.id.item2:
               Toast.makeText(this, "Item 2",Toast.LENGTH_SHORT).show();
                break;

            case R.id.item3:
               // Intent i = new Intent(Settings.ACTION_SETTINGS);
               // startActivity(i);
                //startActivity(new Intent(Settings.ACTION_SETTINGS));
                Toast.makeText(this, "Item Settings",Toast.LENGTH_SHORT).show();
                break;

            default:
                Toast.makeText(this, "Click an option from menu",Toast.LENGTH_SHORT).show();
        }

        return super.onOptionsItemSelected(item);
    }
}
