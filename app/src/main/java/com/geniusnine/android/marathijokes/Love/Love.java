package com.geniusnine.android.marathijokes.Love;

/**
 * Created by Dev on 14-12-2016.
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


public class Love extends AppCompatActivity {
    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_best);
        listView=(ListView)findViewById(R.id.listView);

        String[] values = new String[] {
          "प्रियकर: प्रिये मी तुला माझ्या ह्या हृदयाच्या कप्प्यात बंद केले आहे...\n" +
                  "प्रेयसी: सोन्या...., बंद कशाला केलंयस..\n" +
                  "मी तिथून जाणार थोडीच आहे...!!...","प्रियकर : प्रिये माझ तुझ्यावर अगदी मना पासून प्रेम आहे.\n" +
                "प्रेयसी : Sorry पण माझ प्रेम 'महेश' वर आहे. त्याने कालच BMW विकत घेतली आहे....!","प्रियकर : प्रिये तू आता फार बदलली आहेस.\n" +
                "प्रेयसी : का रे..? तुला अस का वाटत...?" ,"आयटम : जानू, तू मला चांदण्यात फिरायला ने ना\n" +
                "पक्क्या दुसरया दिवशी रॉकेट घेऊन आला," +
                "आयटम : जानू, रॉकेट कशाला आणलस?","प्रियकर : तू माझ्याशी लग्न करशील का..?\n" +
                "प्रेयसी : नाही.\n" +
                "प्रियकर : का..?\n" +
                "प्रेयसी : माझ्या घरचे होकार नाही देणार.\n" +
                "...प्रियकर : कोण कोण आहे तुझ्या घरी..?",
                "ब्रेकअप च्या वेळी प्रियकर आणि प्रेयसी मधील संभाषण.\n" +
                "प्रेयसी : तुला माझ्या सारखी मुलगी शोधून देखील नाही सापडणार... "
,"ऎक मुलगा त्याच्या गर्लफ्रेंडसाठी\n" +
                "नविन मोबाईल घ्यायला जातो.\n" +
                "मुलगी : सोना मला सॅमसंग किंवा \n" +
                "नोकिया पाहिजे.","प्रियकर- प्रिये तुझी आठवण\n" +
                "आली,की तुझा फोटो समोर घेऊन\n" +
                "तुला बघत राहतो.\n" +
                "प्रियसी- मग\n" +
                "माझ्या आवाजाची आठवण\n" +
                "आली तर काय करतोस ?","मुलगी -आमच्या\n" +
                "कॉलेजमधली मुलं\n" +
                "माझ्या एका एका श्वासावर\n" +
                "मरतात.\n" +
                "मुलगा – मग तू चांगली टूथपेस्ट\n" +
                "का नाही वापरत?","BoyFriend & GirlFriend दोघे ही खुप हसत होते, अचानक GirlFriend\n" +
                "ने चेहरा लपवला\n" +
                ".\n" +
                "BoyFriend:- काय झाले?\n" +
                "GirlFriend :- काहीच नाही.\n" +
                "BoyFriend:- सांग ना?\n" +
                "GirlFriend :- काहीच नाही ना?\n" +
                "BoyFriend :- सांग ना प्लीज?","प्रियकर: प्रिये, सांग ना मी तुझ्यासाठी काय करू?\n" +
                "प्रेयसी: काय करशील?\n" +
                "प्रियकर: तू सांगशील ते करीन!\n" +
                "प्रेयसी: मग आधी नोकरी कर\n" +
                "प्रियकर: का?\n" +
                "प्रेयसी: म्हणजे एकदाचं लग्न तरी करता येईल!","बॉयफ्रेंड- मुझे Birthday पे gift में किस चाहिए,\n" +
                "गर्लफ्रेंड- हमेशा गन्दी बातें,\n" +
                "कुछ और माँग लो,\n" +
                "बॉयफ्रेंड- I Phone 6 दिला दो,\n" +
                "गर्लफ्रेंड- किस कौन सी दूँ कुत्ते कमीने !!!",
                "Boyfriend: (ख़ुप संतापून) फोन का नाही उचलला?\n" +
                "girlfriend: मी रिंगटोनवर नाचत होते... ","Boyfriend : तू उपाशीपोटी किती सफरचंद खाउ शकतेस ?\n" +
                "girlfriend : सहा\n" +
                "...\n" +
                "Boyfriend : चुक..... फक्त १\n" +
                "कारण १ सफरचंद खाल्ल्यानंतर तू उपाशीपोटी नसते...\n" +
                "girlfriend : मस्त सूपर जोक आहे हा...\n" +
                "मग ती मुलगी आपल्या मैत्रिणी ला हा जोक\n" +
                "सांगायला जाते\n" ,"रमबाईंचे नव-यावर अतिशय प्रेम होते. त्यांचा नवरा वारला ...\n" +
                "\"रमबाई आता नव-याशिवाय काही जगु शकत नाहीत\", असे सर्वजण म्हणु लागले, आणि ते खरंही झाले.\n" +
                "त्यांनी आठवडाभरात दुसरं लग्न केलं ..!","प्रियसी : तुझे माझ्यावर प्रेम आहे ना ?\n" +
                "प्रियकर : होग , पण तू असे का विचारतेस एकदम \n" +
                "प्रियसी : मला नाही वाटत असं \n" +
                "प्रियकर : पण तू असे बोलतेस \n" +
                "प्रियसी : तुझे नक्कीच माझ्यावर प्रेम आहेना ?\n" +
                "प्रियकर :अर्थातच \n" +
                "प्रियसी : नक्की ?\n" +
                "प्रियकर :हो ग !\n" +
                "प्रियसी : मग काल रात्री मी फेसबुक वर जे स्टेट टाकले त्याला लाइक का नाही केलेस ?","गर्लफ्रेँड- आज मी कशी दिसतेय ?\n" +
                "आत्ताच ब्युटी पार्लर मध्येजाऊन आली.\n" +
                "बॉयफ्रेँड- मग ??\n" +
                "बंद होतं का ब्युटी पार्लर?\uE105",
                "****\n" +
                "रोमिओ\n" +
                "रस्त्यावरील रोमिओ मुलगी जवळून जात असताना \n" +
                "रोमिओ : तू धरतीपे चाहे जहाँ रहे तुझे 'तेरी खुशबूसे पहचान लुंगा \n" +
                "मुलगी : आई शपत ! मला अगोदर पासून शंकाच होती , कि तू मेल्या कुत्राच आहे ","सोन्या आपल्या प्रियसीला \n" +
                "सोन्या : प्रिये मला एका प्रश्नाचे उत्तर दे \n" +
                "प्रियसी : विचारणा \n" +
                "सोन्या : तुझ्या आयुष्यातला मी पहिलाच ना ज्याने तुझे चुंबन घेतले ?\n" +
                "प्रियसी : अर्थातच , पण मला हे कळत नाही सगळे हाच प्रश्न का विचारतात ?","एक तरुणी एक साधू बाबा समोर \n" +
                "तरुणी : बाबा ! मला दोन प्रियकर आहेत , मला सांगा माझं लग्न कुणाशी होईल , कोण असेल तो भाग्यवान ?\n" +
                "बाबा : (हसून) पाहिल्याशी होईल आणि दुसरा भाग्यवान ठरेल "


        };

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, android.R.id.text1, values);


        // Assign adapter to ListView
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent i = new Intent(Love.this,LoveJokes.class);
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

