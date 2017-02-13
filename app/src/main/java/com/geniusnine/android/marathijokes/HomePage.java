package com.geniusnine.android.marathijokes;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.geniusnine.android.marathijokes.FunnyImages.FunnyImages;
import com.geniusnine.android.marathijokes.Graffiti.Graffiti;

public class HomePage extends AppCompatActivity {
    Button Jokes, Funny, Graffity;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);

        Jokes = (Button) findViewById(R.id.ButtonJokes);
        Funny = (Button) findViewById(R.id.ButtonFunny);
        Graffity = (Button) findViewById(R.id.ButtonGraffiti);
        Jokes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent aptitude = new Intent(getApplicationContext(), Joke.class);
                startActivity(aptitude);
            }
        });

        Funny.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent aptitude = new Intent(getApplicationContext(), FunnyImages.class);
                startActivity(aptitude);
            }
        });
        Graffity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent aptitude = new Intent(getApplicationContext(), Graffiti.class);
                startActivity(aptitude);
            }
        });
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        switch (keyCode) {
            case KeyEvent.KEYCODE_BACK:
                /*Intent i=new Intent(this,Splash_Screen.class);
                i.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity;*/
                AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(this);
                alertDialogBuilder.setMessage("Are you sure you want to close App?");
                alertDialogBuilder.setPositiveButton("Yes",
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface arg0, int arg1) {

                                finish();
                            }
                        });

                alertDialogBuilder.setNegativeButton("No",
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface arg0, int arg1) {

                            }
                        });

                //Showing the alert dialog
                AlertDialog alertDialog = alertDialogBuilder.create();
                alertDialog.show();
                return true;
        }
        return super.onKeyDown(keyCode, event);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.joke, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        switch (item.getItemId()) {
            case android.R.id.home:

                // app icon in action bar clicked; goto parent activity.
                this.finish();
                return true;
            default:
                if (id == R.id.action_send) {
                    Intent i = new Intent(Intent.ACTION_SEND);
                    i.setType("text/plain");
                    i.putExtra(Intent.EXTRA_TEXT, "message to share");
                    startActivity(Intent.createChooser(i, "Share via"));
                    return true;
                }
                return super.onOptionsItemSelected(item);

        }
    }

}
