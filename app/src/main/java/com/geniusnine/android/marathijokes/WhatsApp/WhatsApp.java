package com.geniusnine.android.marathijokes.WhatsApp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.geniusnine.android.marathijokes.R;


/**
 * Created by Dev on 13-12-2016.
 */

public class WhatsApp extends AppCompatActivity {
    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_best);
        listView=(ListView)findViewById(R.id.listView);

        String[] values = new String[] {"प्रेमात असो कि दवाखान्यात सगळे एकच विचारतात  Serious आहे का…..","तू बोलताना मी पहात बसतो,\n" +
                "तू हसताना मी पहात बसतो,","गावात ओळखत नाही कुत्रं…\n" +
                "आणि Facebook वर\n" +
                "याचे हजारो मित्रं…","काय माहीत रावं तिला तिच्या सौंदर्याचा एवढा का गर्व आहे..\n" +
                "बहूतेक तिचं आधार_कार्ड आजुन आलेल नसेल..!\uD83D\uDE1C","स्वर्ग काय आहे?\n" +
                "अमेरिकन पगार , इंग्लंड ची कार , चाईनिस जेवण आणि भारतीय बायको","बाईक वर गावातून एक चक्कर मारून आलो…..\n" +
                "च्यायला ‘घोस्ट रायडर’ बनल्यासारखं वाटत होतं…..\n" +
                "तापमान 47°\uD83D\uDE02","नशीबवान त्यांना म्हणावं ज्यांना खरं प्रेम मिळतं.,च्यायला आम्हाला वेळेवर रिक्षापण भेटत नाही…","आपल्या \u202AGf\u202C/Bf ला \u202A\u200Eमाझं Pillu\u202C, \u200Eमाझं Baby,\u202C बोलणाऱ्या \u200Eमुलांनो\u202C,मुलींनो\n" +
                "पुढच्या \u202A\u200Eरविवारी\u202C त्यांना Polio Doss पाजुन\u202C आना..","आपल देवा कडे एकच मागणे पुढच्या वर्षी आरतिला माज्या सोबत ती असुदे आणि तुज्या आरतीच ताट तिच्या हातात असुदे रे देवा…",
                "तुला राणी करीन तुला खुशीत ठेवीन सांग हात माझा धरशिल का, फिदा झालो तुझ्यावर मी तुझा दिल मला देशील का ..","Open आणी Close किती विरोधी अर्थी शब्द आहेत…. \n" +
                "पण गंमत अशी आहे की , \n" +
                "आपले मन Open त्याच्याच जवळ होते, जो आपल्या Close आहे……","वकिलांना त्यांचा विषय सोडून बाकीचे सर्व विषय सोपे वाटतात.","लहानपणी शाळेत असताना जेव्हा मस्ती\n" +
                "करायचो तेव्हा गुरूजी शिक्षा म्हणून दोन\n" +
                "मुलींच्या मध्ये बसवायचे."," कुणी चुकला की__आम्ही ठोकलाच!!","मि असाच आहे, पटल तर घ्या नाय तर द्या सोडून…."," एका क्रिकेटप्रेमीने या खेळात बिलकुल रस नसलेल्या आपल्या बायकोला मॅच बघायला नेले. " +
                "सुरुवातीच्या काही ओव्हर्समध्येच ती कंटाळली. काही ओव्हर्सनंतर एकाबॅट्समनने सिक्सर लगावत चेंडू सीमापार भिरकावला. बायको म्हणाली, 'बरं झालं, बॉल हरवला, आता तरी खेळ थांबेल...'" +
                ", आता तरी खेळ थांबेल...'","आपल्या Gf/Bf ला माझं Pillu, माझं Baby, बोलणाऱ्या मुलांनो,मुलींनो\n" +
                "पुढच्या रविवारी त्यांना Polio Doss पाजुन आना..","गुरूजी - सगळ्यांनी आपल्याला काय आवडतं ते सांगा.  बंड्या तू सांग बरं.\n" +
                "बंड्या - मला कविता आवडते.\n" +
                "गुरूजी - वा वा. कोणती कविता आवडते?\n" +
                "बंड्या - ती तिस-या बाकावरची.","वडील आपल्या छोट्या मुलीसोबत चर्चा करीत असतांना \n" +
                "वडील : बाळ ! मला एक सांग मोठी झाल्यावर तू काय करणार ?\n" +
                "मुलगी : काही विशेष नाही. आई बनेल , शिक्षण घेईल , लग्न करेल बस !\n" +
                "वडील : वाह खूप छान , फक्त जे काही करशील ते योग्य क्रमाने कर म्हणजे झालं ","घरी आलेला पाहुणा नास्ता करीत असताना \n" +
                "पाहुणा : तुमचा कुत्रा फारच समंजस दिसतोय , तो सारखा माझ्याकडे बघतो आणि शेपटी हलवितो \n" +
                "गृहिणी : अरे रे चुकून मी त्याचीच प्लेट तुम्हाला दिलीय "


        };

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, android.R.id.text1, values);


        // Assign adapter to ListView
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent i = new Intent(WhatsApp.this,WhatsAppJoke.class);
                i.putExtra("key", position);
                startActivity(i);


            }
        });

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
    }
}

