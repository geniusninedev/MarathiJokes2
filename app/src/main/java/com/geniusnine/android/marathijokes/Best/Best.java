package com.geniusnine.android.marathijokes.Best;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.geniusnine.android.marathijokes.R;


public class Best extends AppCompatActivity {
    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_best);
        listView=(ListView)findViewById(R.id.listView);

        String[] values = new String[] {"नवरा - तुझी बहीण तुझ्या मानाने किती सुंदर आहे\n"+"बायको - मग तिच्याशीच करायचे होते लग्न. मला कशाला गटवलीत?",

                "बायकोच्या सततच्या बडबडीमुळे चंदू जाम वैतागला होता.\n" +
                        "चंदू : तू जर पाच मिनिटं गप्प बसलीस ना तर मी तुला पाचशे रुपये देईन.","बायको : काय हो...इतक्या हळू आवाजात कोणाशी बोलताय?","शिरप्याचं गाढव हरवलं. तरीही तो देवाला धन्यवाद देऊ लागला.\n" +
                "गणा : काय रं शिरप्या, तुझं गाढव हरवलं आनि तरी बी तू देवाचे आभार मानतुयंस?",
                "पती : तू आणि फक्त तूच या घराला स्वर्ग बनवू शकतेस?\n" +
                        "पत्नी : कसं काय?","न्यूटनचा मृत्यू कसा झाला???","गर्लफ्रेण्ड : आपण कुठे चाललोय?\n" +
                "बॉयफ्रेण्ड : लाँग ड्राइव्हवर!","एकदा टाटा मोटर्स चे काही अधिकारी \"नॅनो\" बद्दलचा प्रतिसाद पाहण्यासाठी पुण्यात सर्व्हे घेत असतात. फिरत फिरत ते सदाशिव पेठेत तात्यांच्या घरी येतात.","मन्या पाटील लंगडत लंगडत शाळेत ऊशीरा पोचला.\n" +
                "इंग्रजीचे सर ओरडले.\"व्हाय आर यू लेट?\"","गण्या : अरे मित्रा \" अरेंज मॅरेज \" म्हणजे काय ?\n" +
                "बंड्या : सोप्प आहे रे , समज... तू रस्त्यावरून चालला आहेस आणी अचानक तुला नागीण चावते ","इंग्लिश मॉम म्हणते गुड नाइट\n" +
                "हिंदी मा म्हणते शुभ रात्री","पक्क्याच बायकोबरोबर भांडण चाललं होते....\n" +
                "बायको (वैतागून) : तुमच्या डोक्यात ना नुसतं शेण भरलय......","मंग्या कानात बाळी घालून फिरत होता,\n" +
                "चंद्या : कानात बाळी? हि नवीन फॅशन तू कधी पासून सुरू केलीस?\n" +
                "मंग्या : अरे बायको माहेरी जाऊन आल्यापासून..","मुलगा : बाबा 1 ग्लास पाणी द्या ना ?\n" +
                "बाप : स्वतः उठुन घे...?\n" +
                "मुलगा : प्लीज द्या ना बाबा..." +
                "बाप : आता थोबाडित मारीन तुझ्या!","बहिण : मुलगा कसा आहे?\n" +
                "भाऊ : मुलगा चांगला आहे, engineer आहे, दिसायला फिल्मचा हिरो वाटतो...\n" +
                "बहिण : कुठल्या फिल्मचा हिरो?\n" +
                "भाऊ : \"पा\".","नवरा : तू मला आत्ता कुत्रा म्हणालीस?\n" +
                "बायको लक्षच देत नाही,","बाप : या वेळी नापास झालास तर यापुढे मला 'बाबा' म्हणून हाक मारू नकोस चंद्या.\n" +
                "सालाबादाप्रमाणे याही वर्षी आपला चंद्या नापास झाला,\n" +
                "बाप : काय लागला निकाल?","आजोबा : पिंट्या लप, तुला शोधत तुझी टीचर आली आहे.\n" +
                "पिंट्या : आजोबा तुम्हिच लपा.\n" +
                "आजोबा : का रे.. ???","Bf: मला  तुझे  \"दात\" खूप  आवडतात ...\n" +
                "GF: अय्यां...खरच ..का  रे ??\n" +
                "BF: कारण  \"yellow \" माझा  फेवरीट कलर आहे"," स्थळ-सदाशिव पेठेतील हॉटेल.\n" +
                "गृहस्थ-मी इथले स्वच्छतागृह वापरू शकतो का?","पत्नी : तू तुझ्या मित्रांना असं का सांगितलंस की, मी खूप चांगला स्वयंपाक\n" +
                "करते?\n" +
                "पती : तुझ्याशी लग्न करण्याचं काही तरी कारण त्यांना सांगायला हवं होतं ना!"


        };

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, android.R.id.text1, values);


        // Assign adapter to ListView
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent i = new Intent(Best.this,BestJoke.class);
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

