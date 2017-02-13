package com.geniusnine.android.marathijokes.Stories;

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


public class Stories extends AppCompatActivity {
    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_best);
        listView=(ListView)findViewById(R.id.listView);

        String[] values = new String[] {
              "एकदा तरूण मूलाचा ग्रुप\n" +
                      "दिंडीला निघतो,\n" +
                      "गूरूजी कानमंत्र सांगतात ???","मराठी भाषा फारच अजब आहे ना...??\n" +
                "...गाडी 'बिघडली' असेल तर म्हणतात 'बंद' आहे.","एक शिक्षण अधिकारी\n" +
                "एकदा एका शाळेत गेला\n" +
                "सहजच एका वर्गात शिरला,\n" +
                "एक साथ नमस्ते - सारा वर्ग बोलला.\n" +
                "बसा, मुलांनो बसा - अधिकारी म्हणाला.","एके दिवशी काय झाले ?\n" +
                " जखम म्हणाली bandage ला\n" +
                "चल आपण लग्न करून संसारात अटकु ..\n" +
                "जखम म्हणाली bandage ला\n" +
                "चल आपण लग्न करून संसारात अटकु ..\n" +
                "bandage म्हणाले नको रे बाबा,\n" +
                "तू सुकलीस तर मी कोणाला चिटकू","एकदा संता बंताला स्वत:च्या घरी बोलावतो,\n" +
                "जेव्हा संता बंताच्या घरी जातो तेव्हा, बंताच्या घराला टाळे लावलेले असते आणि\n" +
                "तिथे लिहुन ठेवलेले असते “तुझा पोपट झालाय, चल फूट इथून”\n" +
                "संता खाली पडलेला खडु उचलतो आणि लिहितो\n" +
                "“मी आलोच नव्हतो”","झंप्या: ए पंप्या, एवढा घाबराघुबरा का झालायस बुवा तू?\n" +
                "पंप्या: अरे, थोडं कन्फ्युजन झालं यार.\n" +
                "झंप्या: म्हणजे?\n" +
                "पंप्या: अरे मी रस्त्यावरून चाललो असताना मला समोर काहीतरी दिसलं. मला वाटलं की साप आहे. पण नेमकी ती काठी होती.\n" +
                "झंप्या: हात्तिच्या... एवढंच ना.\n" +
                "पंप्या: हो रे... पण मग त्या सापाला मारण्यासाठी म्हणून मी जी काठी उचलली ना, तो खरा साप निघाला.","कावळा: चिऊताई, चिऊताई, दार उघड!\n" +
                "चिमणी: थांब माझ्या बाळाला पावडर लावते...\n" +
                "कावळा: माझ्या सोबत माझी मुलगी पण आहे...\n" +
                "बाळ: आई, पावडर मी लावतो, तू पहिले दार उघड!"
,"‘मित्राकडे गेलो होतो गं!’ उशीरा घरी आलेला गंपू बायकोला कारण सांगतो.\n" +
                "खरं-खोटं तपासण्यासाठी बायको त्याच्या दहा मित्रांना फोन करते.\n" +
                "दहा पैकी पाच जण सांगतात, ‘हो, आलेला ना इथे!’\n" +
                "तिघे सांगतात, ‘हा काय, आत्ताच गेला...’\n" +
                "उरलेले दोघे म्हणतात, ‘अहो वहिनी, हा काय इथेच आहे! देऊ का त्याच्याकडे फोन?’","रामू: ए राजू, तुला मी एका सेकंदात अख्खे गाणे म्हणून दाखवू?\n" +
                "राजू: शक्यच नाही, चल म्हणून दाखव पाहू\n" +
                "रामू: गाऽऽणे!\n" +
                "राजू: अरे वा! चल, मीसुद्धा तुला फटाका न फोडता अगदी तुझ्या दोन्ही कानांजवळ फटाक्याचा मोठा आवाज काढून दाखवतो\n" +
                "रामू: दाखव की... त्याचे बोलणे पूर्ण होण्याआधीच राजू त्याच्या कानांखाली पेटवतो\n" +
                "फाऽऽट फाऽऽट...","पुण्यातल्या मुलींना बर्थ डे गिफ्ट काय द्याल?\n" +
                "एक डझन स्कार्फ...!","(संता मित्राच्या पार्टी मध्ये ड्रिंक घेत उभा होता, एवढ्यात त्याच लक्ष एका सुंदर मुलीकडे गेलं)\n" +
                "संता: तू माझ्या बरोबर डान्स करशील का?\n" +
                "मुलगी (तुच्छतेने): मै बच्चे के साथ डान्स नही करती...\n" +
                "संता: ओ\u200Dह... माफ कर हा, मला माहित नव्हतं तू प्रेग्नन्ट आहेस","आज बॅंकेचा कॅशियर बेशुध्द होता होता राहिला...\n" +
                "जेव्हा ४ - ५ तास लाईनमध्ये उभे राहून एक बाई दोन हजाराची नोट बघून म्हणाली\n" +
                "“भाऊ, याच्यात अजून कलर्स दाखवा ना”.","मुलाचा निबंध\n" +
                "…….आवडता पक्षी–बदक !!…..." ,"एक माणूस दुसर्या शहरात\n" +
                "नौकरीसाठी जातो,\n" +
                "तिथे पोहचल्यावर त्याने विचार\n" +
                "केला की ,बायकोला इमेल\n" +
                "करावा म्हणून.\n" +
                "चुकून तो इमेल दुसरीकडे जातो.","टोपीवाल्याची गोष्ट आठवते\n" +
                "का लहानपणीची???\n" +
                "आता त्याचा रिमेक ऐका...\n" +
                "एक टोपीवाला गावातून जात असतो, तो दमतो,\n" +
                "म्हणून\n" +
                "झाडाखाली विश्रांती घेतो...","नवरा: हॅलो मिसेस बायको, मला तुझी मुलाखत घ्यायची आहे...\n" +
                "बायको: आता नको, मला सिरिअल्स बघायच्या आहेत\n" +
                "नवरा: थोड्या वेळाने लाईट जाणार आहे, डायरेक्ट संध्याकाळीच येणार आहे. पेपर-बिपर वाचतेस की नाही?","एका गृहस्थाला सपाटून भूक लागली , म्हणून तो हॉटेल शोधत होता.तेवढ्यात त्याला पाटी दिसली.\n" +
                "त्यावर लिहिलं होतं , ' जेवणाची उत्तमसोय '\n" +
                "जवळ गेल्यावर त्याला दोन हॉल दिसले .\n" +
                "एकावर लिहिलं होतं ' शाकाहारी '\n" +
                "तर दुसर्याववर ' मांसाहारी '\n" +
                "तो मांसाहारी हॉलमध्ये शिरला.\n","मुलीच्या नजरेतून:- ती पहिल्या बेंचवरुन\n" +
                "वळुन बघते\n" +
                "अणि मनातल्या मनात बोलते,\n" +
                "\"thank God!! .. आलाय आज.\""
,"एकदा एका शाळे मध्ये गणिताचे मास्तर आणि इतिहासाचे मास्तर यांचे काही करणा मुळे भांडण होते.\n" +
                "इतिहासाचे मास्तर म्हणतात मी तुज्या अंगावर औरंगजेबाचे सैन्य घालीन .\n" +
                "तर गणिताचे मास्तर म्हणतात की मी तुला आणि त्या औरंगजेबाच्या सैन्याला कंसा मध्ये टाकून शून्याने गुणाकार करेन ","एक भुर्टा चोर आपल्या खिसेकापू मित्राला म्हणाला .आज एक बाई दार उघड टाकुन शेजरनी कड़े गेली असताना\n" +
                "मी घरात शिरलो आणि माल घेवुन बाहेर पडत असताना ती बाई दारात हजर .\n" +
                "'मग काय मार खावा लागला का ?'मित्राने विचारले\n" +
                "'छे छे ,दूध ज्लाल्याचा वास आला म्हणून ग्यास बंद करायला आत शिरलो,'अशी सबब सांगताच ती बाई आत पलाली आणि मी बाहेर.","एक वयोवृद्ध फ्रेंच गृहस्थ क्षमायाचनेसाठी चर्चमध्ये गेले. अत्यंत नम्र स्वरात ते धर्मगुरूला म्हणाला, ‘‘माझ्याकडून घडलेल्या पापाबद्दल मला क्षमा असावी, दुसऱ्या महायुद्धाच्या काळात एका मध्यरात्रीच्या सुमारास एका सुंदर स्त्रीनं माझ्या घराचा दरवाजा ठोठावला. तिला आत घेतल्यानंतर तिनं स्वत:ला शत्रूपासून वाचविण्याची मला विनंती केली. दया येऊन मी तिला माझ्या घरातील माळ्यावर लपविलं.’’\n" +
                "‘मित्रा,  यात  क्षमा मागण्यासारखं तुझ्याकडून काहीच घडलेलं नाही.’ धर्मगुरू, म्हणाले, ‘‘उलट आसऱ्यासाठी आलेल्या एका असहाय अबलेला आश्रय देऊन तू एक महान कार्यच केलंस.’’" };

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, android.R.id.text1, values);


        // Assign adapter to ListView
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent i = new Intent(Stories.this,StoriesDetail.class);
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

