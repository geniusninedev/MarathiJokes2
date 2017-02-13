package com.geniusnine.android.marathijokes;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.geniusnine.android.marathijokes.Best.Best;
import com.geniusnine.android.marathijokes.Engineer.Engineer;
import com.geniusnine.android.marathijokes.Funny.Funny;
import com.geniusnine.android.marathijokes.Ganya.Ganya;
import com.geniusnine.android.marathijokes.Kids.Kids;
import com.geniusnine.android.marathijokes.Love.Love;
import com.geniusnine.android.marathijokes.Navra.Navra;
import com.geniusnine.android.marathijokes.Puneri.Puneri;
import com.geniusnine.android.marathijokes.Rajnikant.Rajnikant;
import com.geniusnine.android.marathijokes.Sardar.Sardar;
import com.geniusnine.android.marathijokes.Stories.Stories;
import com.geniusnine.android.marathijokes.Vakil.Vakil;
import com.geniusnine.android.marathijokes.WhatsApp.WhatsApp;


public class Joke extends AppCompatActivity {
    public static String[] list = {"Best Marathi Jokes", "Funny Jokes ", "WhatsApp Funny Jokes ", "रजनीकांत Jokes", "गण्या Jokes", "डॉक्टर Jokes", "इंजिनीअर Jokes",
            "Kids Jokes", "पुणेरी Jokes", "नवरा-बायको Jokes", "सरदारजी Jokes", "प्रेमहास्य", "मराठी विनोदी कथा"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joke);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        ArrayAdapter adapter = new ArrayAdapter<String>(this, R.layout.mylist, R.id.textView1, list);
        ListView categories = (ListView) findViewById(R.id.listview);
        categories.setAdapter(adapter);

        categories.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                if (position == 0) {
                    Intent intent = new Intent(Joke.this, Best.class);
                    startActivity(intent);
                }
                if (position == 1) {
                    Intent intent = new Intent(Joke.this, Funny.class);
                    startActivity(intent);
                }
                if (position == 2) {
                    Intent intent = new Intent(Joke.this, WhatsApp.class);
                    startActivity(intent);
                }
                if (position == 3) {
                    Intent intent = new Intent(Joke.this, Rajnikant.class);
                    startActivity(intent);
                }
                if (position == 4) {
                    Intent intent = new Intent(Joke.this, Ganya.class);
                    startActivity(intent);
                }
                if (position == 5) {
                    Intent intent = new Intent(Joke.this, Vakil.class);
                    startActivity(intent);
                }
                if (position == 6) {
                    Intent intent = new Intent(Joke.this, Engineer.class);
                    startActivity(intent);
                }
                if (position == 7) {
                    Intent intent = new Intent(Joke.this, Kids.class);
                    startActivity(intent);
                }
                if (position == 8) {
                    Intent intent = new Intent(Joke.this, Puneri.class);
                    startActivity(intent);
                }
                if (position == 9) {
                    Intent intent = new Intent(Joke.this, Navra.class);
                    startActivity(intent);
                }

                if (position == 10) {
                    Intent intent = new Intent(Joke.this, Sardar.class);
                    startActivity(intent);
                }
                if (position == 11) {
                    Intent intent = new Intent(Joke.this, Love.class);
                    startActivity(intent);
                }
                if (position == 12) {
                    Intent intent = new Intent(Joke.this, Stories.class);
                    startActivity(intent);
                }


            }
        });

     /*Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);*/

       /* FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });*/
/*
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);*/
    }



    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }



    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
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


    /*@SuppressWarnings("StatementWithEmptyBody")
   /* @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_camera) {
            Intent funny = new Intent(getApplicationContext(), FunnyImages.class);
            startActivity(funny);

        } else if (id == R.id.nav_gallery) {
            Intent grafity = new Intent(getApplicationContext(), Graffiti.class);
            startActivity(grafity);
        } else if (id == R.id.nav_share) {

        } else if (id == R.id.nav_send) {

        }*/

       /* DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
    return true;
}*/
    }
}
