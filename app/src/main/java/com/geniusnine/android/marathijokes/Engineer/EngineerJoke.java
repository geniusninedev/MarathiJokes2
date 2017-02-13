package com.geniusnine.android.marathijokes.Engineer;

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


public class EngineerJoke extends AppCompatActivity {

    String[] List;

    ViewPager viewPager;
    PagerAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_best_joke);

        List = new String[] {
                "एक Engineer बॅटिंग करत होता....\n" +
                "त्याचे\n" +
                "४० रन्स पूर्ण\n" +
                "झाले की त्यांनी बॅट वरकरून अभिवादन\n" +
                "केले...\n" +
                "दूसरा बॅट्समन जवळ\n" +
                "आला आणि म्हणाला,\"अरे वेड्या.\n" +
                "फक्त ४० रन्स झाले आहेत..\n" +
                "५० किंवा १०० नाही\"\n" +
                "त्यावर इंजिनीअर म्हणाला. तू गप रे\n" +
                "८वी फेल.....\n" +
                "४०ची किंमत फक्त इंजीनिअरच समजू शकतो.","एक Engineer आजारी पडतो, सकाळी बायको\n" +
                "त्याच्याजवळ जाते आणि म्हणते ,\n" +
                "'' यावेळी एखाद्या जनावरांच्या doctor ला\n" +
                "दाखवा... तरच तुम्ही बरे व्हाल ..''\n" +
                "Engineer - ... कसं काय ?\n" +
                "बायको -\n" +
                "रोज सकाळी कोंबड्यासारखे लवकर उठता ...\n" +
                "घोड्यासारखे धावत ऑफ़ीसला जाता ...\n" +
                "गाढवासारखे दिवसभर काम करता ...\n" +
                "लांडग्यासारखे इकडून तिकडून information गोळा\n" +
                "करुन Report तयार करता..\n" +
                "माकडा सारखे Boss च्या इशाऱ्यावर नाचता ...\n" +
                "घरी येवून कुत्र्यासारखे आमच्यावर ओरडता ...\n" +
                "आणी मग रात्री म्हशीसारखे ढाराढूर झोपता ...\n" +
                "''माणसांचा doctor तुम्हाला काय डोंबलं बरं करु\n" +
                "शकणार आहे... ? ''","जितकी पाकिस्तानची लोकसंख्या आहे...\n" +
                "तितके लेकरं तर भारतात Engg. ला YD होतात","एक मुलगा पाणी पुरीवाल्याला म्हणतो :\n" +
                "\" भावा हे engineering काँलेज कस आहे ?\n" +
                "\n" +
                "पाणी पुरीवाला :\" एकदम जबरदस्त आहे\n" +
                "मी पण engineering इथेच केलेली आहे !","Q. 1,००० पाने लिहियला किती दिवस लागतात?\n" +
                "Ans. वकील - ५ वर्ष\n" +
                "डाँक्टर - 1 वर्ष\n" +
                "पायलट - ५ महिने \n" +
                "लेखक - ३ महिने \n" +
                "इंजिनीयर - सबमिशन कधी आहे ते सांगा एका रात्रीत लिहुन" +
                "काढतो","संगणक अभियंता असलेल्या नवरा बायको मध्ये आपल्या मुलांसमोर वाद होत असतो\n" +
                "नवरा : अग्ग माझे फक्त तुझ्यावरच प्रेम आहे\n" +
                "बायको : छे, तुम्ही माझ्यावर कधीच मनापासून प्रेम केले नाही\n" +
                "नवरा : (मुलांच्या डोक्यावर हात ठेऊन ) मग यांना काय मी गुगलवर सर्च करून आणलेत काय ?","मुलाला पाहयला आलेल्या काकुंनी मुलाला एकच प्रश्न केला… मुलगा ढसाढसा रडला.\n" +
                "\n" +
                "प्रश्न : तूझ घरभाडे, किराणा, लाईटबील, पेट्रोल, दूध भाजीपाला, मोबाईल खर्च, loan EMI, वजा करून Package किती आहे?\n" +
                "आजूनही त्याचे आईवडील समजूत घालतायत…:","डाँक्टर (इंजिनीअरिंग च्या विद्यार्थ्याला):\n" +
                "तुमची १ किडनी फेल झाली आहे.\n" +
                "विद्यार्थी आधी खूप खूप रडला...., मग डोळे\n" +
                "पुसत बोलला,\n" +
                ".\n" +
                ".\n" +
                ".\n" +
                ". RECHECKING मध्ये निघेल का??","शब्दाने शब्द वाढतात म्हणून आम्ही oral मध्ये शांत असतो...","Engineer to rikshawala : Are o\n" +
                "bhai khali\n" +
                "ho kya??????\n" +
                ".\n" +
                ".\n" +
                ".\n" +
                ". Rikshawala: Haan bilkul khali\n" +
                "hoon\n" +
                "sahab....\n" +
                ".\n" +
                ". .\n" +
                "Engineer : Aao Chalo Phir\n" +
                "Taash khelte hain...","केमिस्ट्रीच्या लॅबमध्ये काम करणाऱ्या एका विद्यार्थ्याला डिपार्टमेंटमधल्या फ्रिजमध्ये एका खोक्यावर प्रा. विसरभोळ्यांच्या गाडीची चावी सापडली. प्राध्यापक\n" +
                "महाशयांच्या स्मरणशक्तीची ख्याती माहीत असल्याने त्याने ती प्राध्यापकांकडे सुपूर्द केली. सरांनी त्याचे आभार मानले आणि विचारले, कुठे सापडली चावी तुला? विद्याथीर् म्हणाला, फ्रिजमध्ये! विसरभोळे घाईघाईने म्हणाले," +
                " 'अरे, मग होती तिथेच ठेव. माझ्या बायकोचा वाढदिवस आहे आज. तिच्यासाठी घेतलेला केक फ्रिजमध्ये आहे. विसरलो तर खैर नाही..'"
,"पायलटची बायको ... \" गेलास उडत...\"\n" +
                "मंत्र्याची बायको ... \" पुरे झाली तुमची आश्वासनं.\"\n" +
                "शिक्षकाची बायको ... \" मला नका शिकवू...\"\n" +
                "रंगारयाची बायको ... \" थोबाड रंगवीन.\"\n" +
                "धोब्याची बायको ... \" चांगली धुलाइ करीन.\"\n" +
                "सुताराची बायको ... \" ठोकुन सरळ करीन.\"\n" +
                "तेल विक्रेत्याची बायको ... \" गेलात तेल लावत.\"\n" +
                "न्हाव्याची बायको ... \" केसाने गळा काप्लात की हो माझा.\"\n" +
                "डेंटिसची बायको ... \" दात तोडुन हातात देइन.\"\n" +
                "शिंप्याची बायको ... \" मल शिवलंस तर याद राख.\"\n" +
                "अभिनेत्याची बायको ... \" कशाला नाटक करता?\"\n" +
                "वाण्याची बायको ... \" नुसत्या पुड्या सोडु नका \"\n" +
                "रेल्वे ड्रायव्हरची बायको.... \" आली का गाडी रुळावर/लायनीवर ?\"\n" +
                "संगणक अभियंत्याची बायको..... \" तुला डिलीट करून टाकीन\n" +
                "आणि\n" +
                "मेनेजरची बायको म्हणेल.....\"तुम्हाला बरोबर म्यानेज करते....","Engineering is a mysterious degree. After completing it, Every student says \"Yeh mai kya kar baitha\""
                ,"संगणक अभियंता असलेल्या नवरा बायको मध्ये आपल्या मुलांसमोर वाद होत असतो\n" +
                "नवरा : अग्ग माझे फक्त तुझ्यावरच प्रेम आहे\n" +
                "बायको : छे, तुम्ही माझ्यावर कधीच मनापासून प्रेम केले नाही\n" +
                "नवरा : (मुलांच्या डोक्यावर हात ठेऊन ) मग यांना काय मी गुगलवर सर्च करून आणलेत काय ?","महाभारत मे इंजीनियर्स के बारे मे लिखा है..\n" +
                "!!!!!!\n" +
                "\n" +
                "महाभारत के युद्ध के बाद एक बार विश्रम करते हुये\n" +
                "युधिष्ठिर ने कृष्ण से प्रश्न किया:\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "हे माधव ,कलयुग मे जब मनुष्य लोभी व अत्याचारी\n" +
                "होगा तब इस संसार का पालन , परोपकार व धर्म का\n" +
                "पालन कौन करेगा !\n" +
                "\n" +
                "कृष्ण ने उत्तर दिया ;\n" +
                "हे तात ,मै तुम्हे एक विशेष वर्ग के पुरुषों की कथा\n" +
                "सुनाता हूँ ,\n" +
                "\n" +
                "“कलयुग मे धन का समुचित व संकलित आदान\n" +
                "प्रदान करने वाले , ऋण दायक ,प्रशासक के भिन्न\n" +
                "प्रयासों का पालन कर प्रजा की भलाई करने\n" +
                "वाले ,बुद्धिमान परोपकारी ,परिश्रमी पुरुष जन्म लेंगे,\n" +
                "जो विभिन्न कष्टदायक परिस्तिथियों मे भी बिना\n" +
                "अन्न जल के भी सूर्यास्त से मध्यरात्रि तक बिजली से\n" +
                "संचालित यंत्रों पर अनवरत कार्य करते हुए अपने\n" +
                "उच्चाधिकारियों के निर्देशों का पालन करेंगे.. एवम\n" +
                "प्रजा के जीवन को सुखमय बनाने के लिये अपने\n" +
                "कुल, देश से दूरस्थ होकर भी तथा नाना प्राकार के\n" +
                "कष्टों को झेलते हुए इस संसार का कल्याण करेंगे..\n" +
                "\n" +
                "वे पराक्रमी पुरुष विकट समस्याओं से भयभीत ना\n" +
                "होते हुए न्यूनतम वेतन पर परिश्रम करते रहेंगे..\n" +
                "\n" +
                "उच्चकुलीन, शालीन, ज्ञानवान व विनम्र होने के\n" +
                "कारण वे कभी उच्चाधिकारियों व प्रशासक के प्रति\n" +
                "आक्रोश नही करेंगे तथा न्यूनतम वेतन मे ही किसी\n" +
                "प्रकार निर्वाह करेंगे ।\n" +
                "\n" +
                "उच्चाधिकारियों व प्रशासकों द्वारा प्रताडित,\n" +
                "अपमानित व दण्डित होने पर भी ये लज्जाहीन होकर\n" +
                "अपने कार्यों के निर्वाह मे डटे रहेंगे ।\n" +
                "\n" +
                "हे तात , कालांतर में यही निरीह परंतु जीवट पुरुष इंजीनियर कहलायेँगे तथा संसार का कल्याण करेंगे.”\n" +
                "\n" +
                "कथा इति समाप्तम !  \uD83D\uDE42  \uD83D\uDE42","पुणेकर \n" +
                "मुलाला पाहयला आलेल्या काकुंनी मुलाला एकच प्रश्न केला… मुलगा ढसाढसा रडला.\n" +
                "\n" +
                "प्रश्न : तूझ घरभाडे, किराणा, लाईटबील, पेट्रोल, दूध भाजीपाला, मोबाईल खर्च, loan EMI, वजा करून Package किती आहे?\n" +
                "आजूनही त्याचे आईवडील समजूत घालतायत…:","टीचर (स्टूडेंट से) : सेमेस्टर सिस्टम से क्या फायदा है, बताओ?\n" +
                "\n" +
                "स्टूडेंट : फायदा तो पता नहीं,\n" +
                "पर बेइज्जती साल में दो बार हो जाती है।","काय जिंदगी आहे?\n" +
                "डॉक्टर ला वाटते तुम्ही आजारी पडावे.\n" +
                "पोलिसाला वाटते तुम्ही काही तरी गुन्हा करावा.\n" +
                "वकीलाला वाटते तुम्ही कुठेतरी कधीतरी कसतरी कायद्याच्या कचाट्यात अडकाव.\n" +
                "एका इंजीनियर ला वाटत तुम्ही कर्ज काढून का होईना पण घर बांधाव.\n" +
                "अंतयात्रेचे सामान विकणार्याला वाटते तुम्ही मरावे.\n" +
                "\n" +
                "फक्त आणि फक्त\n" +
                "\n" +
                "एका  “शिक्षकाला वाटत तुम्ही जीवनात यशस्वी व्हावे व सुंदर जीवन जगावे","एका विद्यार्थ्याच्या आयुष्यातील सर्वात महत्वाचा सन….\n" +
                "..\n" +
                "..\n" +
                "..\n" +
                "परीक्षा…..\n" +
                "..\n" +
                "..\n" +
                "दिवे पण लागतात..!\n" +
                "फटाके पण फुटतात..!!\n" +
                "Band पण वाजतो..!!!\n" +
                "आणि\n" +
                "घरचे आरती पण ओवाळतात..!!!!","माय म्हणे लेकराले जोजो बाळा जोजो,\n" +
                "सारं काही होजो पण Engineer नको होजो.\n" +
                "\n" +
                "Engineer होऊन लेका कोणता तीर मारशिन\n" +
                "गध्यासारखा राबशिन अन कुत्र्यासारखा जगशिन\n" +
                "दहावी शिकुण त्याच्यापेक्षा\n" +
                "कारकुन होजो\n" +
                "सारं काही होजो पण Engineer नको होजो.\n" +
                "\n" +
                "Admission साठी आधि लेका वनवन फिरशिन\n" +
                "Semester च्या नावाखाली रोजरोज मरशिन\n" +
                "BA करुण त्यापेक्षा लिपिक तरी होजो\n" +
                "सारं काही होजो पण Engineer नको होजो.\n" +
                "\n" +
                "BHEL सारख्या कंपनीत जेव्हा नौकरी तुले लागन\n" +
                "लग्नकराले बी लेका पोरगी नाही भेटन\n" +
                "बिना शिकुन तेच्यापेक्षा नेताबिता होजो\n" +
                "सारं काही होजो पण Engineer नको होजो\n" +
                "\n" +
                "कंपनीत नौकरी करुण राब राब राबशिन\n" +
                "बायका पोर घरी सोडुन सन्यासासारखा जगशिन\n" +
                "तुप रोटी नाही,\n" +
                "बाळा चटनी भाकर खाजो सार काही होजो, पण Engineer नको होजो.\n" +
                "सार काही होजो, पण Engineer नको होजो."


        };



        getSupportActionBar().setDisplayHomeAsUpEnabled(true);



        viewPager = (ViewPager) findViewById(R.id.Pager);
        // Pass results to ViewPagerAdapter Class
        adapter = new ViewPagerAdapter(EngineerJoke.this,List);
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
