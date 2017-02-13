package com.geniusnine.android.marathijokes.Funny;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;

import com.geniusnine.android.marathijokes.Best.ViewPagerAdapter;
import com.geniusnine.android.marathijokes.R;


/**
 * Created by Dev on 13-12-2016.
 */

public class FunnyJoke extends AppCompatActivity {

    String[] List;

    ViewPager viewPager;
    PagerAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_best_joke);

        List = new String[] {"एक वृद्ध महिला एका जोडप्याच्या घरी दोन वर्षांपासून राहते, शेवटी पती पत्नीला कंटाळून म्हणतो \n" +
                "पती - तुझी आई आपल्याजवळ गेल्या दोन वर्षांपासून राहतेय  तिला जायला सांग \n" +
                "पत्नी - (आश्चर्याने ) काय ? माझी आई ? मला वाटले कि ती तुमची आई आहे ","डॉकटर रुग्णाला \n" +
                "डॉक्टर : सकाळी उठल्यावर थोडं गरम पाणी पीत चला , काही दिवसात बर वाटेल \n" +
                "रुग्ण : काही उपयोग नाही , वीस वर्षपासून मी तेच कतोय , फरक एवढाच कि माझी बायको त्याला चहा म्हणते ","भविष्यवक्ता एका महिलेचा हात पाहून भविष्य सांगताना \n" +
                "\"तुम्ही लवकरच विधवा होणार आहात तुमच्या नवऱ्याचा खून होईल \"\n" +
                "महिला - पण मी त्यातून निर्दोष सुटेल ना?","\n" +
                "राजू : आरे ऊठ भूकंप आल्यासारखा वाटतोय, सार घर हलतंय \n" +
                "पंकज : आरे झोपणा घर पडेलच तर घरमालकाचं, आपण तर भाडेकरू आहोत ","एका रिक्षावाल्याला पोलिस अडवतो.\n" +
                "पोलिस: रिक्षा गॅसवर आहे?\n" +
                "रिक्षावाला: नाही.\n" +
                "पोलिस: मग डिझेलवर?\n" +
                "रिक्षावाला: नाही.\n" +
                "पोलिस: बरं पेट्रोलवर आहे म्हणजे?\n" +
                "रिक्षावाला: नाही\n" +
                "पोलिस: अरे मग कशावर आहे?\n" +
                "रिक्षावाला: हफ्त्यावर.","मालकीण : सकू, मला सारखं वाटत, कि आमचे हे आफिसमधल्या दुसऱ्या बाईच्या प्रेमात पडले आहेत\n" +
                "सकू (मोलकरीण ): असं नका बोलू बाईसाहेब , ते मला धोका नाही देऊ शकत !","मुलगी वडिलांना : बाबा एक मुलगा माझ्या मागे लागला आहे , सारखा मला \"आय लव्ह यु \" म्हणत असतो .\n" +
                "काय करू ?... \n" +
                "वडील : एक काम कर त्याच्याशी लग्न करून टाक, पुन्हा कधी तो तसे म्हणेल तर मी माझे नाव बदलून टाकेल ... ","एका ट्राफिक सिग्नल वर एका भिकाऱ्याला पाहून माणूस बोलला \n" +
                "\"तुला कुठेतरी पाऊल आहे ...\"\n" +
                "\n" +
                "भिकारी हसला व म्हणाला \n" +
                "भिकारी: \"साहेब... आपण फेसबुक वर फ्रेंड आहोत \"","एक उंदीर वाघाच्या लग्नामध्ये फुल जोशात नाचत असतो..,\n" +
                ".\n" +
                "हत्ती येतो आणि पाहुन उंदराला विचारतो, अरे तु इतका का खुश आहेस ? ,\n" +
                "किती जोशात नाचतोयस....!!!\n" +
                "...\n" +
                "उंदीर म्हणतो ,\" मित्रा तुला नाय कळणार ते , माझ्यालग्नाच्या अगोदर मी पण वाघ होतो\":","टिकू : बाबा , कुणावर रंगवणं चांगली गोष्ट आहे का ?\n" +
                "वडील : नाही रे ! चांगली माणसे कधीच रागवत नाही \n" +
                "टिकू : मग हे बघा माझं रिपोर्ट कार्ड मी नापास झालोय ","पत्नी : आहो ऐकलंत का? तो  माणूस दारू पिऊन नाचतोय ना त्याला मी १० वर्षांपूर्वी रिजेक्ट केलं होत \n" +
                "पती : होणं खरंच, पहाणं  आतापर्यंत सेलिब्रेट करतोय","पती : साहेब माझी पत्नी हरवली आहे \n" +
                "पोस्टमन : हे पोस्ट ऑफिस आहे , पोलीस स्टेशन नाही \n" +
                "पती : ओह .. माफकरा ...! आनंदामुळे कुठे जाऊ , काही कळत नाही !!","एक मित्र दुसऱ्या मित्राला सुंदर मुलीकडे पाहून \n" +
                "मित्र - आरे, जर ती मृत्यू असती, एक दिवस का होईना ती माझी असती \n" +
                "दुसरा मित्र - पण जर ती मृत्यू असती तर एके दिवशी ती सगळ्यांची असती ","घरी आलेले पाहुणे मुलाला विचारतात \n" +
                "पाहुणे: कुठल्या शाळेत जातो , बाळा \n" +
                "मुलगा:पहिली गोष्ट मी बाळ नाही , आणि दुसरी मी शाळेत जात नाही मला पाठवतात ... ","एक मुलगा देवाला विचारतो,\n" +
                "'तिला गुलाबाचं फूल का आवडतं???\n" +
                "ते तर एका दिवसात मरून जातं....!\n" +
                "मग तिला मी का आवडत नाही ???\n" +
                "मी तर तिच्यासाठी रोज मरत\n" +
                "असतो.....!\n" +
                "'देव उत्तर देतात,\n" +
                ".\n" +
                ".\n" +
                "'भारी रे....!\n" +
                "एक नंबर ....!\n" +
                "Whatsapp वर टाक...!!!","हैद्राबादी Mom: कायकू रोरा?\n" +
                "\n" +
                "sun: टिचर मारी मेरकू.\n" +
                "\n" +
                "mom: कायकू मारी टिचर ने?\n" +
                "...\n" +
                "sun: मई उसको मुरगी बोला\n" +
                "\n" +
                "mom: कायकू?\n" +
                "\n" +
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
                ".\n" +
                ".\n" +
                ".\n" +
                "मंग्या : भवाने , गेलीस उडत...म्हस्नात\n" +
                "जा !!!! :@ ....(message send) :","एकदा काय झाले\n" +
                "एक  मुलगी  आईला  म्हणते\n" +
                "आई  मी  सितार  बनवली  आहे\n" +
                "आई  म्हणाली  यालाच  म्हणतात   टाकाऊ  वस्तू  पासून  टिकाऊ  बनविणे \n" +
                "पण  सितारीच्या  तर  कुठून  आलंय \n" +
                "मुलगी म्हणाली\n" +
                "तुझ्या   सितारीच्या  काढल्या "," काका गाड़ी ढकलत पेट्रोल पंपावर येतात...\n" +
                "\n" +
                "(पेट्रोल - ७१ रु बघतात)\n" +
                "\n" +
                "पम्पवाला: कितिच टाकू?\n" +
                "\n" +
                "काका: १० रुपयांचा शिपड फक्त गाडीवर, बाहेर नेउन पेटवतो..."
        };






        getSupportActionBar().setDisplayHomeAsUpEnabled(true);



        viewPager = (ViewPager) findViewById(R.id.Pager);
        // Pass results to ViewPagerAdapter Class
        adapter = new ViewPagerAdapter(FunnyJoke.this,List);
        // Binds the Adapter to the ViewPager
        viewPager.setAdapter(adapter);

        int pos = getIntent().getIntExtra("key", 0);
        viewPager.setCurrentItem(pos);



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
