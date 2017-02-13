package com.geniusnine.android.marathijokes.Ganya;

/**
 * Created by Dev on 13-12-2016.
 */

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;

import com.geniusnine.android.marathijokes.Best.ViewPagerAdapter;
import com.geniusnine.android.marathijokes.R;


public class GanyaJoke extends AppCompatActivity {

    String[] List;

    ViewPager viewPager;
    PagerAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_best_joke);

        List = new String[] {"आर्मी ट्रेनिंग के दौरान ,\n" +
                "अफसर ने गण्या से पूछा : ‘ये हाथ में क्या है ?’\n" +
                "गण्या : “सर , बन्दुक है …!”\n" +
                "अफसर : “ये बन्दुक नहीं ! तुम्हारी\n" +
                "इज़्ज़त है , शान है , ये तुम्हारी माँ है माँ . !!”\n" +
                "फिर अफसर ने दूसरे सिपाही पप्पु से पूछा : “ये हाथ\n" +
                "में क्या है ?”\n" +
                "पप्पु : “सर , ये गण्या की माँ है ,\n" +
                "उसकी इज़्ज़त है , उसकी शान है और\n" +

                "हमारी मावशी है मावशी ..!","मास्तर : सांगा पाण्यापेक्ष्या \n" +
                "हलके काय आहे..??\n" +
                "गण्या : सर भजी\n" +
                "मास्तर : कसे काय.. ?\n" +
                "गण्या : सर तेल पाण्यावर तरंगते\n" +
                "आणि भजी तेलावर ....\n" +
                "\n" +
                "गुरूजी सकट अख्खी शाळा कोमात. ","\n" +
                "सर- मुलांनो, कुणाकुणाला स्वर्गात जायचंय ??\n" +
                "काही विद्यार्थी हात वर करतात..\n" +
                "सर- आता सांगा बरं, कुणाकुणाला नरकात जायचंय ?\n" +
                "मग, बाकीचे काहीजण हात वर करतात..\n" +
                "पण आपला गण्या हातच वर करत नाही..\n" +
                "सर त्याला विचारतात, तु दोन्ही वेळी एकदाही का हात वर का नाही केलंस ??\n" +
                "गण्या-सर,\n" +
                "ज्यांना स्वर्गात जायचंय, त्यांना स्वर्गात जाऊ द्या आणि ज्यांना नरकात जायचंय त्यांना नरकात जाऊ द्या..\n" +
                "कारण..\n" +
                "माझ्या आईने सांगितलंय शाळा सुटली की सरळ घरी ये.नाही तर तंगड तोडीन","\n" +
                "एक सुंदर मुलगी गण्याला : आय लव यु …!\n" +
                "गण्या डोकं खाजवत : नगं बाबा आमची आय खवळन…","गुरूजी: तुझी हजेरी कमी आहे.. तू परीक्षेला नाही बसू शकत.....\n" +
                "गण्या: फिकीर नाॅट गुरूजी... आपल्याला जराबी घमेंड नाय ...आपून उब्यानेच पेपर लिवू बगा...\n" +
                "गुरूजींनी शाळा सोडली...","सर : सांग गण्या तुझा जन्म कुठे झाला????\n" +
                "गण्या : अहमदनगर...\n" +
                "सर : चल त्याची स्पेलिँग सांग बरं...\n" +
                "हुशार गण्या थोडा विचार करतो\n" +
                "आणि म्हणतो : नाही, नाही.... माझाजन्म पुण्यात झाला..","सर: इंग्रजांनी चंद्रावर\n" +
                "पाणी &बर्फाचा शोध लावला आहे.\n" +
                "आता सांगा तुम्ही यातून काय शिकल\n" +
                ".\n" +
                ".\n" +
                ".\n" +
                ".\n" +
                "गण्या : सर आता फक्त आपल्याला दारू\n" +
                "आणि चकणा घेऊन जायच आहे. ","सर - किती निर्लज़ज आहेस तु गण्या ?\n" +
                "तु १०० पैकी फक्त ५ गुण मिळवले\n" +
                "आणि तरी सुध्दा हसत आहेस मुर्खा??????\n" +
                ".\n" +
                "गण्या- सर , मी हसत आहे कारण\n" +
                "उत्तरपञिकेत मी तर पिक्चरच गाण लिहलहोत\n" +
                "फक्त ,\n" +
                "तर मग हे ५ गुण आले कुठुन.","गण्या दारु पिउन\n" +
                "घरी येतो..\n" +
                "वडिलांना संशय येऊ नये\n" +
                "म्हणून laptop उघडून\n" +
                "बसतो..\n" +
                "थोड्या वेळाने,\n" +
                "वडील- गण्या, दारू पिऊन\n" +
                "आलायस का?\n" +
                "गण्या- नाही हो..!!\n" +
                "वडील- मग\n" +
                "माझी suitcase उघडून\n" +
                "काय type करतोयस?\n","एके ठिकाणी एका खटारा गाडीची विक्री चालू असते....!!!\n" +
                "\n" +
                "लोकं जोरजोरात बोली लावत असतात..!!\n" +
                "\n" +
                "१० लाख..!!\n" +
                "१२ लाख..!!\n" +

                "१५ लाख..!!\n" +
                "... गण्या हे ऐकून अचंबित होतो आणि विचारतो “या खटारा गाडीचे एवढे पैसे का...??”\n" +
                "\n" +
                "विक्रेता : अहो या गाडीचे आत्तापर्यंत कमीत कमी १० अपघात झाले आहेत आणि प्रत्येक वेळी नेमका बायकोचाच अपघातात मृत्यू होतो...!!!\n" +
                "\n" +
                "गण्या : २० लाख...!!!","  गण्या : मास्तर ,मला सांगा आपल्या गावात पहिली तंदूर भट्टी कोणत्या धाब्यावर लावली..??\n" +
              "मास्तर: अरे मला कस माहित ? हा काय प्रश्न आहे का ?\n" +
              "गण्या: जर तुम्हाला आपल्या गावातली पहिली तंदूर भट्टी नाही माहित तर मग आम्हाला देशातली पहिली अणुभट्टी कुठे लागली हे का विचारता ....?\n" +
               "मास्तर : अरे गाढवा मी काय दररोज धाब्यावर जात नाही मला कस माहिती ?\n" +
               "गण्या : मग आम्ही काय दररोज अणुभट्टीवर जातो का शेकोटी शेकोटी खेळायला .........!\"","गण्या शाळेत असताना ....\n" +
                " \n" +
                "एकदा खुप हसत होता...\" \n" +
              "ते पाहून एक मुलगी उठली आणि\" \n" +
               "म्हणाली \"कायला दात काढून हसत राहिलाय बे\"\" \n" +
             "गण्या : तू कोण हायीस ग ?\" \n" +
               "मुलगी : म्या मोनीटर हाय\" \n" +
                "गण्या : आजकाल मोनीटर चा नाय तर\\n\" \n" +
               "एलसीडी चा जमाना हाय.","स्थळ – शाळा\n" +
                "मास्तर – तुझा परीक्षेचा सीट नंबर A086957845 आहे…\n" +
                ".\n" +
                ".\n" +
                ".\n" +
                ".\n" +
                ".\n" +
                ".\n" +
                "गण्या – गुरूजी, २००-३०० रु. जास्त घ्या..\n" +
                "\n" +
                "पण मला फॅन्सी नंबर द्या..\n" +
                "\uD83D\uDE1C\uD83D\uDE1C\uD83D\uDE1D\uD83D\uDE1D\uD83D\uDE03\uD83D\uDE01\n" +
                "\n"
," गण्या : काय रे तुझे आणि वहिणी चे भांडण मिटले का???\n" +
                "\n" +
                "मन्या : हो..गुडघ्यावर रांगत रांगत आली होती माझ्याकडे..\n" +
                "\n" +
                "गण्या : हो का.?\n" +
                "मग काय म्हणाल्या रे वहिणी...!\n" +
                "\n" +
                "मन्या : कॉट च्या खाली लपु नका, या बाहेर....\n" +
                "मारणार नाही मी","एकदा बंड्याचे वडील गण्याला घेऊन प्राणिसंग्रहालय पाहायला जातात.\n" +
                "\n" +
                "वाघाच्या पिंजर्याजवळ जाताच ते गण्याला म्हणतात, “बघ तो वाघ किती भयानक आहे. किती हिंस्र आहे.”\n" +
                "\n" +
                "गण्याच्या चेहर्यावर अगदी गंभीर भाव असतात. तो थोडा वैतागतो मनातून आणि शेवटी पप्पांना प्रश्न करतो.\n" +
                "\n" +
                "गण्या : पप्पा, जर तो वाघ पिंजर्यातून बाहेर आला आणि त्याने तुम्हाला खाल्लं…\n" +
                "\n" +
                "पप्पा : ...तर मग? (जिज्ञासेने)\n" +
                "\n" +
                "गण्या : मी किती नंबरच्या बसने घरी जाऊ?","आपला गण्या पहिल्यांदाच\n" +
                "चर्च मध्ये गेला....\n" +
                ".\n" +
                ",\n" +
                ",\n" +
                ",.\n" +
                "तेव्हा अचानचक\n" +
                "लाईट\n" +
                "गेली आणि काळोख\n" +
                "पसरला...\n" +
                "तेवढ्यातच चर्च\n" +
                "मधिल\n" +
                "घंटा वाजली \"TONNN\".\n" +
                ".\n" +
                ".\n" +
                ".\n" +
                ",\n" +
                ",\n" +
                "गण्या फूल 2 जोशात -\n" +
                "आईचा घो UNDERTAKER\n" +
                "आला रं.... .. ..","\n" +
                "Master :तुझा जन्म कोणत्या वारी झाला?\n" +
                "गण्या :मंगळवारी,\n" +
                "गण्या :मास्तर तुमचा जन्म कोणत्या वारी झाला\n" +
                "Master :रविवारी\n" +
                "गण्या :गप बसा राव मास्तर...\n" +
                "रविवारी सुट्टी असती","गन्याची परीक्षा सुरु असते...\n" +
                "परीक्षेमध्ये मास्तर खुप कडक\n" +
                "असतो आणि पेपर पण कठीण असतो ,\n" +
                "गण्याला कॉपी पण करता येत नसते....\n" +
                ".\n" +
                "शेवटचा बेँचवर बसलेल्या गण्याने परीक्षकला एक चिठ्ठी दिली...\n" +
                ".\n" +
                "परीक्षकाने चिठ्ठी वाचली आणि चुपचाप आपल्या खुर्चीवर जाऊन बसला...\n" +
                "गण्याचा पुढे बसलेल्या मिञाने विचारले:\n" +
                "\"यार तु काय लिहल होत त्या चिठ्ठीत ?\"\n" +
                ".\n" +
                ".\n" +
                "मी चीठित लिहले,\n" +
                "\"सर, तुमची पँट मागून फाटली आहे."," मन्या : गण्या, इतर लोकांना जमत नाही. पण, फक्त तुलाच जमते अशी एखादी गोष्ट सांग.\n" +
                "गण्या : सोप्पय.\n" +
                "मन्या : सोप्पय? तर सांग ना.\n" +
                "गण्या : मी लिहिलेलं हस्ताक्षर केवळ मी आणि मीच वाचू शकतो."
        };



        getSupportActionBar().setDisplayHomeAsUpEnabled(true);



        viewPager = (ViewPager) findViewById(R.id.Pager);
        // Pass results to ViewPagerAdapter Class
        adapter = new ViewPagerAdapter(GanyaJoke.this,List);
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
