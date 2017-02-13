package com.geniusnine.android.marathijokes.Engineer;

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

public class Engineer extends AppCompatActivity {
    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_best);
        listView=(ListView)findViewById(R.id.listView);

        String[] values = new String[] {"एक Engineer बॅटिंग करत होता....\n" +
                "त्याचे" +
                "४० रन्स पूर्ण\n" +
                "झाले की त्यांनी बॅट वरकरून अभिवादन\n" +
                "केले...","एक Engineer आजारी पडतो, सकाळी बायको\n" +
                "त्याच्याजवळ जाते आणि म्हणते ,\n" +
                "'' यावेळी एखाद्या जनावरांच्या doctor ला\n" +
                "दाखवा... तरच तुम्ही बरे व्हाल ..''","जितकी पाकिस्तानची लोकसंख्या आहे...\n" +
                "तितके लेकरं तर भारतात Engg. ला YD होतात","एक मुलगा पाणी पुरीवाल्याला म्हणतो :\n" +
                "\" भावा हे engineering काँलेज कस आहे ?","Q. 1,००० पाने लिहियला किती दिवस लागतात?\n" +
                "Ans. वकील - ५ वर्ष\n" +
                "डाँक्टर - 1 वर्ष","संगणक अभियंता असलेल्या नवरा बायको मध्ये आपल्या मुलांसमोर वाद होत असतो\n" +
                "नवरा : अग्ग माझे फक्त तुझ्यावरच प्रेम आहे","मुलाला पाहयला आलेल्या काकुंनी मुलाला एकच प्रश्न केला… मुलगा ढसाढसा रडला.\n" +
                "प्रश्न : तूझ घरभाडे, किराणा, लाईटबील, पेट्रोल, दूध भाजीपाला, मोबाईल खर्च, loan EMI, वजा करून Package किती आहे?","डाँक्टर (इंजिनीअरिंग च्या विद्यार्थ्याला):\n" +
                "तुमची १ किडनी फेल झाली आहे.\n" +
                "विद्यार्थी आधी खूप खूप रडला...., मग डोळे\n" +
                "पुसत बोलला","शब्दाने शब्द वाढतात म्हणून आम्ही oral मध्ये शांत असतो...","Engineer to rikshawala : Are o\n" +
                "bhai khali\n" +
                "ho kya??????\n" +
                ". Rikshawala: Haan bilkul khali\n" +
                "hoon\n" +
                "sahab....\n" +
                "Engineer : Aao Chalo Phir\n" +
                "Taash khelte hain...","केमिस्ट्रीच्या लॅबमध्ये काम करणाऱ्या एका विद्यार्थ्याला डिपार्टमेंटमधल्या फ्रिजमध्ये एका खोक्यावर प्रा. विसरभोळ्यांच्या गाडीची चावी सापडली. प्राध्यापक\n" +
                "महाशयांच्या स्मरणशक्तीची ख्याती माहीत असल्याने त्याने ती प्राध्यापकांकडे सुपूर्द केली. सरांनी त्याचे आभार मानले आणि विचारले, कुठे सापडली चावी तुला? विद्याथीर् म्हणाला, फ्रिजमध्ये! विसरभोळे घाईघाईने म्हणाले,",
                "पायलटची बायको ... \" गेलास उडत...\"\n" +
                        "मंत्र्याची बायको ... \" पुरे झाली तुमची आश्वासनं.\"\n" +
                        "शिक्षकाची बायको ... \" मला नका शिकवू...\"\n" +
                        "रंगारयाची बायको ... \" थोबाड रंगवीन.\"\n" +
                        "धोब्याची बायको ... \" चांगली धुलाइ करीन.\"\n" +
                        "सुताराची बायको ... \" ठोकुन सरळ करीन.\"","Engineering is a mysterious degree. After completing it, Every student says \"Yeh mai kya kar baitha\"","संगणक अभियंता असलेल्या नवरा बायको मध्ये आपल्या मुलांसमोर वाद होत असतो\n" +
                "नवरा : अग्ग माझे फक्त तुझ्यावरच प्रेम आहे\n" +
                "बायको : छे, तुम्ही माझ्यावर कधीच मनापासून प्रेम केले नाही\n" +
                "नवरा : (मुलांच्या डोक्यावर हात ठेऊन ) मग यांना काय मी गुगलवर सर्च करून आणलेत काय ?","महाभारत मे इंजीनियर्स के बारे मे लिखा है..\n" +
                "!!!!!!","पुणेकर \n" +
                "मुलाला पाहयला आलेल्या काकुंनी मुलाला एकच प्रश्न केला… मुलगा ढसाढसा रडला.\n" +
                "प्रश्न : तूझ घरभाडे, किराणा, लाईटबील, पेट्रोल, दूध भाजीपाला, मोबाईल खर्च, loan EMI, वजा करून Package किती आहे?\n" +
                "आजूनही त्याचे आईवडील समजूत घालतायत…:","टीचर (स्टूडेंट से) : सेमेस्टर सिस्टम से क्या फायदा है, बताओ?\n" +
                "स्टूडेंट : फायदा तो पता नहीं,\n" +
                "पर बेइज्जती साल में दो बार हो जाती है।","काय जिंदगी आहे?\n" +
                "डॉक्टर ला वाटते तुम्ही आजारी पडावे.\n" +
                "पोलिसाला वाटते तुम्ही काही तरी गुन्हा करावा.\n" +
                "वकीलाला वाटते तुम्ही कुठेतरी कधीतरी कसतरी कायद्याच्या कचाट्यात अडकाव.\n" +
                "एका इंजीनियर ला वाटत तुम्ही कर्ज काढून का होईना पण घर बांधाव.\n" +
                "अंतयात्रेचे सामान विकणार्याला वाटते तुम्ही मरावे.\n" +
                "फक्त आणि फक्त\n" +
                "एका  “शिक्षकाला वाटत तुम्ही जीवनात यशस्वी व्हावे व सुंदर जीवन जगावे","एका विद्यार्थ्याच्या आयुष्यातील सर्वात महत्वाचा सन….\n" +
                "परीक्षा…..\n" +
                "दिवे पण लागतात..!\n" +
                "फटाके पण फुटतात..!!\n" +
                "Band पण वाजतो..!!!\n" +
                "आणि\n" +
                "घरचे आरती पण ओवाळतात..!!!!","माय म्हणे लेकराले जोजो बाळा जोजो,\n" +
                "सारं काही होजो पण Engineer नको होजो."


        };

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, android.R.id.text1, values);


        // Assign adapter to ListView
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent i = new Intent(Engineer.this,EngineerJoke.class);
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

