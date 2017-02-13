package com.geniusnine.android.marathijokes.Sardar;

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


public class Sardar extends AppCompatActivity {
    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_best);
        listView=(ListView)findViewById(R.id.listView);

        String[] values = new String[] {"एका सरदारजीने आपल्या गर्ल फ्रेंडला फोन केला, '' डार्लींग आज संध्याकाळी 6 वाजता माझ्या घरी ये... आज घरी कुणीच नाही आहे. ''"
,"प्रश्न - जर एक सरदार चंद्रावर गेला तर त्याला काय म्हणाल ?\n" +
                "उत्तर - प्रॉब्लेम\n" +
                "प्रश्न - जर दहा सरदार चंद्रावर गेले तर त्याला काय म्हणाल ?\n" +
                "उत्तर - प्रॉब्लेम्स","प्रश्न - सरदारचे डोळे कसे चमकवाल?\n" +
                "उत्तर - त्याच्या कानात टॉर्चचा उजेड टाकून....","जाहिरातीमुळे काही समस्या फार लवकर सोडविल्या जावू शकतात..." +
                "एका सरदारजीने कुठेतरी वाचले आणि पेपरमध्ये नाईट वॉचमनसाठी जाहिरात दिली...\n" +
                "त्याच रात्री त्याच्या घरी चोरी झाली.",
                "एका सरदाराने गुरुद्वाराच्या बाहेर काढून ठेवलेली चप्पल चोरी जावू नए म्हणून एक बढिया शक्कल लढवली...\n" +
                "दोन्ही चप्पल ला कुलूप लाऊन बाहेरच ठेवला ","एका टीव्हीवर सुरु असलेल्या कॉमेडी प्रोग्रॅममध्ये भाग घेतलेल्या एका सरदारजीला त्याच्या प्रेझेन्स ऑफ माईंडवर खुप गर्व होता. प्रोग्रॅमच्या जजने त्याचा गर्व तोडण्याचे ठरविले आणि त्याला पहीला प्रश्न विचारला,\n" +
                " '' सरदारजी... एस. एम. एस. चा फूलफॉर्म  काय आहे?''","प्रश्न - उंच भिंतीवर बल्ब फीट करण्यासाठी किती सरदार लागतील? \n" +
                "\n" +
                "उत्तर - दोन, एक शिडीवर चढून बल्ब होल्डरमधे घालण्यासाठी आणि दुसरा शिडी फिरवीण्यासाठी.","सरदार : रात  भर  ट्रेन  में  नींद  hi नाहीं  आई , उपर  का  सीट   मिल  था …\n" +
                "दोस्त : तोच  एक्सचंगे  क्यूँ  नाहीं  किया \n" +
                "सरदार : अरेरे  बेवकूफ , किस्से  करता … नीचे  के  सीट  पे  कोई  भी  नाहीं  था ","सरदार : येऊ  केला  (banana) कैसा  दिया ?\n" +
                "शॉपकिपर :एक  रुपिया .\n" +
                "सरदार : 60 पैसे  का  देता  है ?\n" +
                "स .की : 60 पैसे  में  तो  सिर्फ  चिल्का  मिलेगा .\n" +
                "सरदार : लय  40 पैसा , चिल्का  राख  और  केला  दे  दे ……..","सरदार-Shirt k liye kapda dikhaiye\n" +
                "Salesman-plain me dikhau?\n" +
                "सरदार-nahi, Helicopter me dikha saale .... Sardar dekha nahi ki mazak shuru..","एक  सरदारजी   ताईंचे  तिकीट   काढायला  जातो  आणि   3 तिकिटे  विकत  घेतो . टिकेट्स  देणारा   विचारतो ,\n" +

                " \" सरदारजी , तुम्ही  एकटेच  जाणार  मूग  तीन  तिकिटे  कशाला ?\" "

             ,"एक सिंधी, एक पठान आणि एक सरदारजी एका बेटावर अडकले होते. " +
                "सिंध्याने पोहून किनाऱ्यावर जाण्याचा प्रयत्न केला पण जवळजवळ 20 टक्के अंतर पोहून झाल्यावर तो थकला आणि बेटावर पोहत परतला. ",
                "तिन सरदार एका लिफ्टमधे होते जेव्हा अचानक ती लिफ्ट बंद पडली, कारण लाईट गेली होती. त्यांनी त्यांचा मोबाईल वापरुन बाहेरुन मदत घेण्याचा प्रयत्न केला, पण तिघांच्याही मोबाईलला रेंज मिळत नव्हती. \n" +
                "काही तास असेच लिफ्टमधे घालविल्यानंतर एका सरदाराने सुचवले, '' मला वाटते मदत मिळविण्याचा सगळ्यात चांगला उपाय म्हणजे सगळ्यांनी सोबत ओरडायला पाहिजे''" ,"एका सरदाराने 1 एप्रिलला सीटी बसमधे कंडक्टरकडून 5 रुपयाचे टिकीट विकत घेतले आणि तो कंडक्टरला म्हणाला, '' एप्रिल फुल''\n" +
                "'' कसे काय?'' कंडक्टरने विचारले.\n" +
                "'' कारण माझ्याजवळ ऑलरेडी बसचा पास आहे''","सरदार ची बायको त्याचा मित्र बंता सोबत पळून गेली होती तेव्हा त्याच्या एका नातेवाईकाने आपली सहानुभूती व्यक्त केली. \n" +
                "नातेवाईक - अरेरे खुप वाईट झालं ... तु तिला खुप मीस करीत असशिल नाही?\n " +
                "सरदार - हो खुप मिस करतो ... पण तिला नाही त्याला ... कारण बंता माझा एकूलता एक चांगला मित्र होता. ","सरदारजी पोलिस स्टेशनमधे गेला आणि त्याने पोलिस स्टेशनमधे तक्रार नोंदवली -\n" +
                "सरदारजी - साहेब मला फोनवर धमक्या मिळत आहेत \n" +
                "पोलिस - कोण आहे तो जो तुम्हाला धमक्या देत आहे? \n" +
                "सरदारजी - साहेब ... टेलिफोनवाले... म्हणतात बिल नाही भरलं तर कापून टाकीन. ","सरदारला आपला कुत्रा विकायचा होता. आणि बंता त्याला विकत घेणार होता. \n" +
                "बंता - हा कुत्रा विश्वासू तर आहे ना ?\n" +
                "सरदार - हो आहेना, मी याला आतापर्यंत तिनदा विकलेले आहे, पण तो एवढा विश्वासू आहे की प्रत्येक वेळी पुन्हा माझ्याजवळच परत येतो. ","सरदार- यार मला 1000 रुपए उधार देतोस का?. \n" +
                " मित्र - मी तुला 1000 रुपए उधार देऊ शकत नाही ... कारण आपली मैत्री या हजार रुपयापेक्षा कितीतरी जास्त मौल्यवान आहे. \n" +
                "सरदार - काही हरकत नाही ... तु मला 2000 रुपए उधार दे. ","एक सरदारजी टॅक्सीतून घरुन विमान तळाकडे निघाला होता. पण जाता जाता एका जागी मधेच ड्रायव्हरने टॅक्सी थांबवली.\n" +
                "सरदारजी - काय झालं?\n" +
                "ड्रायव्हर - साहेब आता आपण पुढे जावू शकणार नाही ... कारण पेट्रोल संपलं आहे..\n" +
                "काही हरकत नाही ... मग टॅक्सी मागे घरी परत घे... ","एका सरदाराला एकदा ब्लॅंक एसएमएस आला. सरदाराने त्या मोबाईल नंबरवर फोन केला , '' अरे दोस्ता तुला माहित आहेका तुझ्या मोबाईलची शाई संपलेली आहे''"

        };

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, android.R.id.text1, values);


        // Assign adapter to ListView
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent i = new Intent(Sardar.this,SardarJokes.class);
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

