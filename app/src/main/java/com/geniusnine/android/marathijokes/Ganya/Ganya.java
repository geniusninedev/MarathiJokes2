package com.geniusnine.android.marathijokes.Ganya;

/**
 * Created by Dev on 13-12-2016.
 */

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

public class Ganya extends AppCompatActivity {
    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_best);
        listView=(ListView)findViewById(R.id.listView);

        String[] values = new String[] {"आर्मी ट्रेनिंग के दौरान ,\n" +
                "अफसर ने गण्या से पूछा : ‘ये हाथ में क्या है ?’\n" +
                "गण्या : “सर , बन्दुक है …!”","मास्तर : सांगा पाण्यापेक्ष्या \n" +
                "हलके काय आहे..??\n" +
                "गण्या : सर भजी\n" +
                "मास्तर : कसे काय.. ?","सर- मुलांनो, कुणाकुणाला स्वर्गात जायचंय ??\n" +
                "काही विद्यार्थी हात वर करतात..\n" +
                "सर- आता सांगा बरं, कुणाकुणाला नरकात जायचंय ?",
                "एक सुंदर मुलगी गण्याला : आय लव यु …!\n" +
                "गण्या डोकं खाजवत : नगं बाबा आमची आय खवळन…","गुरूजी: तुझी हजेरी कमी आहे.. तू परीक्षेला नाही बसू शकत.....\n" +
                "गण्या: फिकीर नाॅट गुरूजी... आपल्याला जराबी घमेंड नाय ...आपून उब्यानेच पेपर लिवू बगा...\n" +
                "गुरूजींनी शाळा सोडली...","सर : सांग गण्या तुझा जन्म कुठे झाला????\n" +
                "गण्या : अहमदनगर...\n" +
                "सर : चल त्याची स्पेलिँग सांग बरं...","सर: इंग्रजांनी चंद्रावर\n" +
                "पाणी &बर्फाचा शोध लावला आहे.\n" +
                "आता सांगा तुम्ही यातून काय शिकल","सर - किती निर्लज़ज आहेस तु गण्या ?\n" +
                "तु १०० पैकी फक्त ५ गुण मिळवले\n" +
                "आणि तरी सुध्दा हसत आहेस मुर्खा??????","गण्या दारु पिउन\n" +
                "घरी येतो..\n" +
                "वडिलांना संशय येऊ नये\n" +
                "म्हणून laptop उघडून\n" +
                "बसतो..","एके ठिकाणी एका खटारा गाडीची विक्री चालू असते....!!!\n" +
                "लोकं जोरजोरात बोली लावत असतात..!!\n" +
                "१० लाख..!!",
                "गण्या : मास्तर , आज मी तुम्हाला प्रश्न विचारणार ?\n" +
                "मास्तर : बर बाळा, विचार ." ,"गण्या शाळेत असताना ....\n" +
                "एकदा खुप हसत होता...","स्थळ – शाळा\n" +
                "मास्तर – तुझा परीक्षेचा सीट नंबर A086957845 आहे…\n"," गण्या : काय रे तुझे आणि वहिणी चे भांडण मिटले का???\n" +
                "मन्या : हो..गुडघ्यावर रांगत रांगत आली होती माझ्याकडे..\n" +
                "गण्या : हो का.?\n" +
                "मग काय म्हणाल्या रे वहिणी...!\n" +
                "मन्या : कॉट च्या खाली लपु नका, या बाहेर....\n" +
                "मारणार नाही मी","एकदा बंड्याचे वडील गण्याला घेऊन प्राणिसंग्रहालय पाहायला जातात.\n" +
                "वाघाच्या पिंजर्याजवळ जाताच ते गण्याला म्हणतात, “बघ तो वाघ किती भयानक आहे. किती हिंस्र आहे.”\n" +
                "गण्याच्या चेहर्यावर अगदी गंभीर भाव असतात. तो थोडा वैतागतो मनातून आणि शेवटी पप्पांना प्रश्न करतो.\n" +
                "गण्या : पप्पा, जर तो वाघ पिंजर्यातून बाहेर आला आणि त्याने तुम्हाला खाल्लं…\n" +
                "पप्पा : ...तर मग? (जिज्ञासेने)\n" +
                "गण्या : मी किती नंबरच्या बसने घरी जाऊ?","आपला गण्या पहिल्यांदाच\n" +
                "चर्च मध्ये गेला....\n" +
                "तेव्हा अचानचक\n" +
                "लाईट\n" +
                "गेली आणि काळोख\n" +
                "पसरला...\n" +
                "तेवढ्यातच चर्च\n" +
                "मधिल\n" +
                "घंटा वाजली \"TONNN\".\n" +
                "गण्या फूल 2 जोशात -\n" +
                "आईचा घो UNDERTAKER\n" +
                "आला रं.... .. ..","Master :तुझा जन्म कोणत्या वारी झाला?\n" +
                "गण्या :मंगळवारी,\n" +
                "गण्या :मास्तर तुमचा जन्म कोणत्या वारी झाला\n" +
                "Master :रविवारी\n" +
                "गण्या :गप बसा राव मास्तर...\n" +
                "रविवारी सुट्टी असती","गन्याची परीक्षा सुरु असते...\n" +
                "परीक्षेमध्ये मास्तर खुप कडक\n" +
                "असतो आणि पेपर पण कठीण असतो ,\n" +
                "गण्याला कॉपी पण करता येत नसते....\n" +
                "शेवटचा बेँचवर बसलेल्या गण्याने परीक्षकला एक चिठ्ठी दिली...\n" +
                "परीक्षकाने चिठ्ठी वाचली आणि चुपचाप आपल्या खुर्चीवर जाऊन बसला...\n" +
                "गण्याचा पुढे बसलेल्या मिञाने विचारले:\n" +
                "\"यार तु काय लिहल होत त्या चिठ्ठीत ?\"\n" +
                "मी चीठित लिहले,\n" +
                "\"सर, तुमची पँट मागून फाटली आहे."," मन्या : गण्या, इतर लोकांना जमत नाही. पण, फक्त तुलाच जमते अशी एखादी गोष्ट सांग.\n" +
                "गण्या : सोप्पय.\n" +
                "मन्या : सोप्पय? तर सांग ना.\n" +
                "गण्या : मी लिहिलेलं हस्ताक्षर केवळ मी आणि मीच वाचू शकतो."


        };

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, android.R.id.text1, values);


        // Assign adapter to ListView
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent i = new Intent(Ganya.this,GanyaJoke.class);
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

