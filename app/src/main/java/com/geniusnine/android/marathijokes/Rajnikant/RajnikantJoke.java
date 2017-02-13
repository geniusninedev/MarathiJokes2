package com.geniusnine.android.marathijokes.Rajnikant;

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


public class RajnikantJoke extends AppCompatActivity {

    String[] List;

    ViewPager viewPager;
    PagerAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_best_joke);

        List = new String[] {"रजनीकांतचा मुलगा : \n" +
                "\"आय्यो मेरा पप्पा इतना लंबा है के खडे खडे\n" +
                "चलता पंखा रोक देता है!\"\n" +
                ".\n" +
                "मकरंद अनासपुरेचा मुलगा : \n" +
                "\" उसमे कोणती मोठी गोष्ट है? मेरे वडील भी लम्बेच है,\n" +
                "लेकीन वो ऐसा आगाउपणा नाही करते.\"","एकदा रजनीकांत पाणी गरम करायला ज्वालामुखीवर गेला\n" +
                "आणि तिकडे बेशुद्ध पडला\n" +
                "का ????\n" +
                ".\n" +
                ".\n" +
                ".\n" +
                ".\n" +
                "कारण त्याने तिकडे पाहिल की\n" +
                "मकरंद अनासपुरे ज्वालामुखीवर पापड भाजत बसला होता .....","एकदा रजनीकांत ने एका छोट्या कृश मुलाला रक्तदान केले . . . . . आज त्या मुलाला लोक \"द ग्रेट खली\" म्हणून ओळखतात...."
                ,"रजनीकांत एकदा चहा पीत होता....\n" +
                "अचानक त्याने चाकू काढला \n" +
                "आणि चहाचे २ तुकडे केले....\n" +
                "\n" +
                "आणि ...\n" +
                "\n" +
                "तेव्हापासूनच कटिंग चहा सुरु झाला ","एकदा रजनीकांत व मकरंद (मक्या) बोलत असतात.\n" +
                "\n" +
                "रजनिकांत : मी तर माझ्या ” जी. एफ़ ” ला ती जगात कोठेही असली तरी तिच्या परफ़्युमच्या वासाने ओळखु शकतो.\n" +
                ".\n" +
                ".\n" +
                "मकरंद (मक्या) : तुझ्या मायला तुझ्या !\n" +
                "रजन्या, आधल्या जन्मात तु कुत्रा होतास की काय ??","एकदा टॉम क्रूज़, जॅकी चॅन आणि रजनीकांत गप्पा मारत असतात. त्यांच्यात स्पर्धा लागते - प्रत्येकाने जास्तीत जास्त लांब प्रवास करायचा.\n" +
                "\n" +
                "जॅकी अख्खी पृथ्वी पालथी घालतो !\n" +
                "(फक्त ८० दिवसात) टॉम तर चंद्रावर जातो !!\n" +
                "आणि आपला रजनी, चक्क मंगळावर पोहोचतो !!!\n" +
                "\n" +
                "मंगळावर (हाताची घडी घालून उभा असलेला) मक्या त्याची विचारपूस करतो... \"तुझ्या मायला राजन्या मला सांगितले नाहीस ते रेस लावल्याचे.. !"
                ,"दिवाळीत उडवलेल रॉंकेट परग्रहावरच्या वस्तीत जावून पडत व तिथल्या वस्तीत भीषण आग लागते .\n" +
                ".\n" +
                "त्यांना तपासाच्या शेवटी कळते कि हे रॉंकेट पृथ्वी वरुन आलय !\n" +
                "शोध घेत घेत ते रजनीकांत कडे येतात.\n" +
                "\n" +
                "रजनीकांतला विचारपूस केली असता रजनीकांत मकरंद चे नाव सांगतो .\n" +
                ".\n" +
                "आणि मग .\n" +
                "मग काय !\n" +
                "त्यंच्यात चर्चा होवून हे ठरत कि उगाच प्रकरण वाढवण्यात काही फायदा नाही.....\n" +
                "\n" +
                "मकरंद कडे अजून रॉंकेट शिल्लक आहेत... :P\n","रजनीकांत तिस-या इयत्तेत शिकत असताना \n" +
                "त्यांची रफ नोट वही चोरीला गेली. \n" +
                "तीच वही आज विकिपीडिया नावाने प्रसिद्ध आहे. ","असाच आणखि एक किस्सा....\n" +
                "रजनि शाळेत असताना...\n" +
                "स्पेलींग पाठ करत होता....\n" +
                "कोणितरी त्याचि ति कच्ची कागदं चोरली..\n" +
                "आनि ऑक्सफ़र्ड डीक्शनरी तयार केली.","रजनीकांतने दात मजबूत व्हावेत म्हणून लहानपणी एक खास टूथ पावडर वापरली.. तिलाच आपण आज \n" +
                "\n" +
                "‘अंबुजा सिमेंट’ म्हणून ओळखतो.","रजनीकांत मक्याला विचारतो \n" +
                "\n" +
                "रजनीकांत -Prove sin x = 6 n \n" +
                "\n" +
                "मक्या - हात्तेच्या मायला … लई सोपय\n" +
                "मक्या ने  बाजूचे  'n' cancel केले \n" +
                "आणि खाली लिहिले \n" +
                "six=6 \n" +
                "तुझ्या मायला तुझ्या … असले फालतू प्रश्न विचारात जाऊ नको मला !","एकदा क्रिकेट खेळत असताना रजनीकांतने एक चेंडू फक्त स्थिर बॅटने नुसताच तटवला.. आज त्या चेंडूला लोक प्लुटो या नावाने ओळखतात."
                ,"\n" +
                "रजनीकांतने एकदा ठरवलं की आपल्याकडचं किमान एक टक्का ज्ञान तरी जगाला द्यायचं.. त्यातूनच ‘गुगल’चा जन्म झाला.",
                "रजनीकांत एकदा चेन्नईमध्ये मॉर्निग वॉकसाठी बाहेर पडला, दुपारी त्याला अमेरिकन पोलिसांनी अटक केली.. बिना पासपोर्ट-व्हिसा अमेरिकेत प्रवेश केल्याबद्दल.",
                "मुंबईतली वीज कधी कधी अचानक थोडय़ा वेळासाठी गायब होते.. कारण, तेव्हा रजनीकांतने आपला फोन चार्जिगला लावलेला असतो.","Rajnikanth bought 2 elephants ,2 camels and 2 horses frm zoo?\n" +
                ".\n" +
                ".\n" +
                ".Y?\n" +

                "To Play chess!!!!!!","Ram n raavan were fighting\n" +
                "suddenly\n" +
                ".\n" +
                ".\n" +
                ".\n" +
                "Ram:chal bye\n" +
                "raavan:kyu dar gaya\n" +
                "ram:piche dekh rajnikant aa raha hai……..","रजनीकांतला संशोधक म्हणून नोकरी मिळते.\n" +
                "\n" +
                "कुठलीही गोष्ट घडली की त्यातून काही ना काही निष्कर्ष काढून हा मोकळा होत असे.\n" +
                "\n" +
                "एकदा तो खडकवासला धरणाच्या चौपाटीवर फिरायला गेलेला असतो. त्याचवेळी तिथे एक घटना घडते.\n" +
                "\n" +
                "एक व्यक्ती पाण्यात उडी मारते, पण बराच वेळ झाला तरी बाहेर काही येत नाही.\n" +
                "मग दोन व्यक्ती उड्या मारतात, पण त्याही बाहेर येत नाहीत.\n" +
                "\n" +
                "यावरून रजनीकांत असा निष्कर्ष काढतो की, माणूस पाण्यात विरघळतो.","लाईट बिल खूप जास्त आल्यामुळे चिडून आई\n" +
                "रजनीकांतला ओरडत असते ....\n" +
                ".\n" +
                ".\n" +
                "आई: काय रे, एवढं बिल कसं काय आलं? सारखे\n" +
                "का लाईट चालू ठेवतोस???\n" +
                ".\n" +
                ".\n" +
                "रजनीकांत: यूँ तो मैं बतलाता नहीं.....पर अँधेरे से\n" +
                "डरता हूँ मैं माँ !!!! तुझे\n" +
                "सब है पता है ना माँ ?","एक रजनीकांत पावसात भिजत रस्त्यावरून जात\n" +
                "असतो..\n" +
                "एक मुलगी त्याला भिजतांना बघते..\n" +
                "त्या मुलीकडे छत्री असते तर..?????\n" +
                "ती त्या रजनीकांतला छत्रीत यायला सांगते..\n" +
                "... ... पण\n" +
                " रजनीकांत नकार देतो..\n" +
                "तात्पर्य:\n" +
                "तात्पर्य वगैरे काही नाही, पोरगी खास\n" +
                "नव्हती.."
        };


        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        viewPager = (ViewPager) findViewById(R.id.Pager);
        // Pass results to ViewPagerAdapter Class
        adapter = new ViewPagerAdapter(RajnikantJoke.this,List);
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
