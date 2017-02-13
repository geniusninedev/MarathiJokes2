package com.geniusnine.android.marathijokes.Navra;

/**
 * Created by Dev on 14-12-2016.
 */

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;

import com.geniusnine.android.marathijokes.Best.ViewPagerAdapter;
import com.geniusnine.android.marathijokes.R;


public class NavraJokes extends AppCompatActivity {

    String[] List;

    ViewPager viewPager;
    PagerAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_best_joke);

        List = new String[] {"बायको : कशी दिसते मी?\n" +
                "नवरा : एकदम Piyanka Chopra सारखी दिसतेस\n" +
                "बायको : खरंच? DON वली कि KRISH वाली?\n" +
                "नवरा : BURFI वाली\n" +
                "मग काय, बायको ने धुतला MARY KOM बनून","बायकोने भली मोठी रांगोळी काढली आणि विचारले, “कशी दिसतेय रांगोळी?”\n" +
                "रांगोळी नेमकी बदकाची होती का मोराची हे कळतच नव्हतं म्हणून हुशारीने म्हणालो, “काय सुंदर पक्षी रंगवला आहे.”\n" +
                "तर बायको भडकली नी म्हणाली, “हत्ती आहे तो … ”\n" +
                "हात्तिच्यामारी\n" +
                "\n","बायको निर्माण करताना देवाने सांगितले की, “चांगली आणि समजूतदार बायको जगाच्या प्रत्येक कोपऱ्यात भेटेल”\n" +
                "त्यानंतर देवाने जग गोल बनवले… आता बसा बोंबलत आणि जगाचा कोपरा शोधत","बायकोच्या छळाला वैतागलेला नवरा शेवटी आयुष्य संपवायला तिसऱ्या मजल्याच्या कठड्यावर उभा राहतो. उडी मारणार इतक्यात बायकोचा आवाज येतो, “आहो ऐकलंत का, माझ्या मैत्रिणी आल्या आहेत, जरा येत का? ओळख करून देते.”\n" +
                "नवरा : हो, हो, आलोच","हॅलो, ऍम्ब्युलन्स का?\n" +
                "हो, बोला मॅडम, कुठे पाठवायची ऍम्ब्युलन्स ला? काय झालं?\n" +
                "माझ्या साडीवर कॉफी सांडली\n" +
                "बापरे, खूप भजलाय का?\n" +
                "नाही, मी ठीक आहे, माझा नवरा हसला माझ्यावर\n" +
                "समजलं मॅडम, पाठवतो ऍम्ब्युलन्सला\n" +
                "\n","बायको : माझी मैत्रीण येणार आहे. दोन दिवस तुम्ही बाहेर झोपा.\n" +
                "नवरा : ठीक आहे पण तू पण वाचन दे “माझी मैत्रीण आली की तू पण दोन दिवस बाहेर झोपशील”"
,"बायकांनी भरलेल्या एका बसचा अपघात होतो. सगळ्यांचा त्यात मृत्यू होतो. सगळे नवरे जवळपास एक आठवडा रडत होते. गण्या मात्र २ आठवडे होऊन गेले तरी अजुन रडतच होता.\n" +
                "मित्रांनी खूप खूपच खोदून-खोदून विचारल्यावर कारण कळलं….. त्याच्या बायकोची बस चुकली होती","नवरा बायको बसमध्ये चढतात.\n" +
                "बायको : दीड तिकीट द्या.\n" +
                "कंडक्टर : दीड कोणाचे?\n" +
                "बायको : माझं एक फुल आणि आमचे हे हाफ मॅड असल्याने याचं आर्ध तिकीट\n" +
                "कंडक्टर – तरीसुद्धा तुम्हाला दोन फुल तिकीटे घ्यावी लागतील.\n" +
                "बायको – का?\n" +
                "कंडक्टर – तुमचे पती हाफ मॅड म्हणून अर्ध. आणि तुम्ही दीड शहाण्या… असे दोन फुल","एका माणसाला संध्याकाळी कामावरुन घरी जाताना रस्त्यात फॅमिली डॉक्टर भेटतात.\n" +
                "डॉक्टर : काय म्हणताय? डोकेदुखी कशी आहे आता?\n" +
                "माणूस : माहेरी गेलीय गणपतीसाठी","पती : तू तर म्हणाली होतीस रात्रीच्या जेवणात दोन ऑप्शन्स आहेत म्हणून, इथं तर एकच भाजी दिसतेय\n" +
                "पत्नी : ऑप्शन्स दोनच आहेत\n" +
                "१. खायचं असेल तर खा\n" +
                "२. नाहीतर बोंबलत जा","बायको : आहो ऐकलं का? मी काय म्हणतेय? नवरा जर मेला तर त्याला स्वर्गात गेल्यानंतर म्हणे अप्सरा मिळतात… हे खरे आहे का?\n" +
                "नवरा : हो तर\n" +
                "बायको : आणि बायको मारून स्वर्गात गेली तर तिला कोण भेटते?\n" +
                "नवरा : बायकोला ना? बायकोला तिथे माकडं भेटतात\n" +
                "बायको : जाळलं मेलं जिणं ते… असं कसं बायकांचं नशीब? इथं बी माकड आन तिथं बी माकडच","डॉक्टर : आता तुमच्या बायकोची तब्ब्येत कशी आहे?\n" +
                "नवरा : बरं वाटतंय तिला आता, आज सकाळीच भांडली माझ्याशी","बायको आकाशात चांदणी बघून म्हणते, “अशी कोणती चीज आहे जी तुम्ही रोज बघू शकता पण आणू शकत नाही?”\n" +
                "नवरा : शेजारीण …. बायकोने घरात नेऊन लई चोपला\n" +
                "\n","बायकांच्या मनात काय चाललेलं असतं बघा …\n" +
                "काल रात्रभर पाऊस पडत होता, सकाळी सकाळी मी बायकोला घेऊन धरणावर फिरायला गेलो. मस्त रोमँटिक वातावरण होते, ते एन्जॉय केले. धरणाच्या पाण्यावर जोरात पडणारा पाऊस खरंच खूप छान वाटत होता. निसर्गाच्या सानिध्यात आनंद घेत होतो इतक्यात…\n" +
                "बायको म्हणाली : बरोबर येताना धुणं घेऊन आले असते तर बरं झाले असते … !","लहानपणीची अफवा\n" +
                "बेडकाला दगड मारला की मुकी बायको मिळणार\n" +
                "जाम घाबरायचो तेव्हा\n" +
                "आता वाटतंय, दगड मारला असता तर बरे झाले असते","नवरा : अग ऐकतेस का, मला जर नगरसेवक केलं तर मी अख्ख शहर बदलून टाकीन, मला जर मुख्यमंत्री केलं तर महाराष्ट्र बदलून टाकीन आणि पंतप्रधान केलं तर पूर्ण देश बदलून टाकीन.\n" +
                "बायको : तुम्हाला कोणी चावलं की काय? लय बडबडताय. हे बदलीन, ते बदलीन… दारू कमी प्या… लुंगी समजून माझा पारकर घातलाय तो बदला आधी",
                "एकदा नवरा बायको हातात हात घालून बागेत फिरत असतात. तिकडून एक वात्रट मुलगा येतो आणि म्हणतो, “काका काल वाली जास्तच मस्त होती”\n" +
                "नवरा आता चार दिवसांपासून भुकेला त्या मुलाला शोधतोय \uD83D\uDE42","बायको : आहो मी एक रुपयाचे तीन कांदे आणले\n" +
                "नवरा : कसे काय?\n" +
                "बायको : एक मी विकत घेतला आणि दुसरा पळवून आणला\n" +
                "नवरा : मग तिसरा?\n" +
                "बायको : तिसरा त्याने फेकून मारला"

        };






        getSupportActionBar().setDisplayHomeAsUpEnabled(true);



        viewPager = (ViewPager) findViewById(R.id.Pager);
        // Pass results to ViewPagerAdapter Class
        adapter = new ViewPagerAdapter(NavraJokes.this,List);
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
