package com.geniusnine.android.marathijokes.Funny;

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

public class Funny extends AppCompatActivity {
    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_best);
        listView=(ListView)findViewById(R.id.listView);

        String[] values = new String[] {"एक वृद्ध महिला एका जोडप्याच्या घरी दोन वर्षांपासून राहते, शेवटी पती पत्नीला कंटाळून म्हणतो ","डॉकटर रुग्णाला \n" +
                "डॉक्टर : सकाळी उठल्यावर थोडं गरम पाणी पीत चला , काही दिवसात बर वाटेल " ,"भविष्यवक्ता एका महिलेचा हात पाहून भविष्य सांगताना \n" +
                "\"तुम्ही लवकरच विधवा होणार आहात तुमच्या नवऱ्याचा खून होईल \"",
                "राजू : आरे ऊठ भूकंप आल्यासारखा वाटतोय, सार घर हलतंय \n" +
                "पंकज : आरे झोपणा घर पडेलच तर घरमालकाचं, आपण तर भाडेकरू आहोत ","एका रिक्षावाल्याला पोलिस अडवतो.\n" +
                "पोलिस: रिक्षा गॅसवर आहे?\n" +
                "रिक्षावाला: नाही.","मालकीण : सकू, मला सारखं वाटत, कि आमचे हे आफिसमधल्या दुसऱ्या बाईच्या प्रेमात पडले आहेत\n" +
                "सकू (मोलकरीण ): असं नका बोलू बाईसाहेब , ते मला धोका नाही देऊ शकत !","मुलगी वडिलांना : बाबा एक मुलगा माझ्या मागे लागला आहे , सारखा मला \"आय लव्ह यु \" म्हणत असतो .\n" +
                "काय करू ?... ","एका ट्राफिक सिग्नल वर एका भिकाऱ्याला पाहून माणूस बोलला \n" +
                "\"तुला कुठेतरी पाऊल आहे ...\"", "एक उंदीर वाघाच्या लग्नामध्ये फुल जोशात नाचत असतो..,\n" ,"टिकू : बाबा , कुणावर रंगवणं चांगली गोष्ट आहे का ?\n" +
                "वडील : नाही रे ! चांगली माणसे कधीच रागवत नाही ","पत्नी : आहो ऐकलंत का? तो  माणूस दारू पिऊन नाचतोय ना त्याला मी १० वर्षांपूर्वी रिजेक्ट केलं होत \n" +
                "पती : होणं खरंच, पहाणं  आतापर्यंत सेलिब्रेट करतोय","पती : साहेब माझी पत्नी हरवली आहे \n" +
                "पोस्टमन : हे पोस्ट ऑफिस आहे , पोलीस स्टेशन नाही \n" ,"एक मित्र दुसऱ्या मित्राला सुंदर मुलीकडे पाहून \n" +
                "मित्र - आरे, जर ती मृत्यू असती, एक दिवस का होईना ती माझी असती ","घरी आलेले पाहुणे मुलाला विचारतात \n" +
                "पाहुणे: कुठल्या शाळेत जातो , बाळा \n","एक मुलगा देवाला विचारतो,\n" +
                "'तिला गुलाबाचं फूल का आवडतं???\n" +
                "ते तर एका दिवसात मरून जातं....!\n" +
                "मग तिला मी का आवडत नाही ???\n" +
                "मी तर तिच्यासाठी रोज मरत","हैद्राबादी Mom: कायकू रोरा?\n" +

                "sun: टिचर मारी मेरकू.\n" +
                "mom: कायकू मारी टिचर ने?\n" +
                "sun: मई उसको मुरगी बोला\n" +

                "mom: कायकू?\n" +

                "sun: कायकू बोलेतो? हर एग्झाम में अंडाईच देती मेरेकू!","१ बे रोजगार मुलगा होता,\n" +
                "त्याने गुलाबाचे फूल फ्रीजर मध्ये\n" +
                "ठेवले,\n" +
                "आणि मग दुसर्या दिवशी ...\n" +
                "त्याला \"रोज-गार\" मिळाला !!!","जेव्हा मोबाईलचा नेटवर्क प्रोब्लेम\n" +
                "असतो !!\n" +
                "चिंगी sms करते : हाय बेबी :*\n" +
                "मंग्या : हाय जान .........(sending\n" +
                "failed)\n" +
                "... ... ...\n" +
                "चिंगी : आर यु देयर ?? :(\n" +
                "मंग्या : yes yes..आहे मि इथे बोल ना .....\n" +
                "(sending failed)\n" +
                "चिंगी : आर यु इग्नोरिंग मि ओर\n" +
                "व्हाट?? :X\n" +
                "मंग्या : हनी..नाही ग, आहे मि इथेच\n" +
                "बोल ....(sending failed)\n" +
                "चिंगी : इट्स ओवर ..पुन्हा बोलू नकोस तू\n" +
                "माझ्याशी कधीच !! :@\n" +
                "मंग्या : भवाने , गेलीस उडत...म्हस्नात\n" +
                "जा !!!! :@ ....(message send) :","एकदा काय झाले\n" +
                "एक  मुलगी  आईला  म्हणते\n" +
                "आई  मी  सितार  बनवली  आहे\n" +
                "आई  म्हणाली  यालाच  म्हणतात   टाकाऊ  वस्तू  पासून  टिकाऊ  बनविणे \n" +
                "पण  सितारीच्या  तर  कुठून  आलंय \n" +
                "मुलगी म्हणाली\n" +
                "तुझ्या   सितारीच्या  काढल्या "," काका गाड़ी ढकलत पेट्रोल पंपावर येतात...\n" +
                "(पेट्रोल - ७१ रु बघतात)\n" +
                "पम्पवाला: कितिच टाकू?\n" +
                "काका: १० रुपयांचा शिपड फक्त गाडीवर, बाहेर नेउन पेटवतो..."



        };

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, android.R.id.text1, values);


        // Assign adapter to ListView
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent i = new Intent(Funny.this,FunnyJoke.class);
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

