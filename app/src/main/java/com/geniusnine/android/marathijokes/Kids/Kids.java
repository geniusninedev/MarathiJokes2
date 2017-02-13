package com.geniusnine.android.marathijokes.Kids;

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



public class Kids extends AppCompatActivity {
    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_best);
        listView=(ListView)findViewById(R.id.listView);

        String[] values = new String[] {"शाम – आई ,पिवळा रंग महाग असतो का ग ?\n" +
                "आई – नाही.\n" ,"झंप्या : पप्पा….माझ्या मॅडम खूप सुंदर आहेत ना….\n" +
                "\n" +
                "वडील : अरे झंप्या, मॅडम आई समान असतात..!!!\n","हऱ्या : माझे स्वप्न आहे मी माझ्या वडिलांसारखच महिन्याला ५००००० रुपये कमवावेत.\n" +
                "नाऱ्या : तुझे बाबा महिन्याला ५००००० रुपये कमावतात ?","काळू - काय बाळू, एवढ पत्र पाठवूनही शेवटी माझ्या लग्नाला तू नाहीस न आलास ?\n" +
                "बाळू - अरे, पण तुझं पत्र मला मिळालंच नाही ना ?" +
                "काळू - अरे, पण मी पत्रात लिहिलं होतं ना की, पत्र मिळाले नाही तरी लग्नाला अवश्य यावे म्हणून ","शिक्षक : उशीर का झाला शाळेत यायला?\n" +
                "चिंटू : आई बाबा भांडत होते\n" +
                "शिक्षक : त्याचा उशिरा येण्याशी काय संबंध?\n" +
                "चिंटू : माझा एक बूट आईच्या आणि दुसरी बाबांच्या हातात होता","एकदा पाच मांजरी एका रिक्षेत शिरतात\n" +
                "रिक्षावाला म्हणतो, “इतके लोक रिक्षेत नाही मावणार”\n" +
                "तर त्या मांजरी काय म्हणाल्या? विचार करा… अरे विचार काय करताय?\n" +
                "सोप्पय उत्तर. त्या म्हणाल्या, “माऊ माऊ”"
,"५ मुलांना एका बाईक वर पाहून ट्राफिक पोलिसांनी थांबण्याचा इशारा केला.\n" +
                "एक मुलगा म्हणाला, “आधीच पाच जण बसलेत… तुम्ही कुठे बसणार?”","मुलगा : आई मी मित्राकडे खेळायला जाऊ?\n" +
                "आई : बाबांना विचार.\n" +
                "मुलगा : बाबा मी मित्राकडे खेळायला जाऊ?.\n" +
                "बाबा : आईला विचार\n" +
                "मुलगा : च्यायला, हे घर आहे की तलाठ्याचं ऑफिस","मनोज : आरे रवी तू सामोसा मधील आतील भाजीच का खात आहेस?\n" +
                "रवी : कारण माझी आई म्हणते बाहेरचं काही खाऊ नये","बंड्या : मी दहा दिवस झोपलो नाही\n" +
                "गण्या : का बरं ?\n" +
                "बंड्या : अभ्यास करण्यासाठी\n" +
                "गण्या : असं कसं जमलं तुला ?\n" +
                "बंड्या : अरे, मी रात्री झोपायचो ना"
,"सुरेश : काल रात्री मी इतिहासाच्या पुस्तकावर दहा तास घालवले\n" +
                "रमेश : काय, दहा तास ?\n" +
                "सुरेश : हो, रात्री पुस्तक उशाला घेऊनच झोपलो होतो","पिंट्या : काका डेटॉल साबण आहेत का?\n" +
                "दुकानदार (नाकातून बोटे काढत) : हो बाळा, आहेत\n" +
                "पिंट्या : तर मग डेटॉल साबणाने हात धुऊन क्रीमरोल द्या बघू एक","पप्पू : मम्मी मी उद्यापासून शाळेत नाही जाणार\n" +
                "मम्मी : का रे, आज परत पार खाल्ला काय?","एक लहान कुत्रं संताच्या मागे लागले होते. ते पाहून संता मात्र जोरजोरात हसत होता.\n" +
                "बंता- अरे यार, कुत्रं तुझ्या मागे लागले आहे आणि तुला काय इतके हसू येत आहे.\n" +
                "संता- बघ न यार, माझ्याजवळ एअरटेलचा फोन आहे व हे 'हच'चे नेटवर्क माझ्या मागे लागले आहे"," दोन लहान मुलं गप्पा मारत असतात.\n" +
                "एक म्हणतो, 'माझी आई सव्हिर्स करते.'\n" +
                "दुसरा म्हणतो, 'माझी आई टेनिस खेळत नाही'","बंडू : माज्ये बाबा कीनई, इतके उंच आहेत.. की ते आमच्या पहिल्या मजल्यावरच्या घरात येण्यासाठी ते कधीच जीने वापरत नाहीत.\n" +
                "खंडू : हॅ हे तर काईच नाय... माज्ये बाबा तर इतके उंच आहेत की ते एका ढांगेत आमच्या दुसऱ्या मजल्यावरच्या घरात शिरतात.\n" +
                "पांडू : अरे माझे बाबा एवढे उंच आहेत की ते छोटीशा उडीत गच्चीवरच पोचतात. आणि मग जिना उतरून घरी येतात.\n" +
                "धोंडू : हम्मं! खरं तर माझे पण बाबा खूपच उंच आहेत... पण ते ना असा वेडेपणा मात्र कधीच करत नाहीत.","संता : ए अॅण्ड बी, ए अॅण्ड बी, ए अॅण्ड बी, ए अॅण्ड बी....\n" +
                "बंता : ओये... इतने दिन बाद मिल रहा है बंदे. आणि हे काय बडबडतोयस.\n" +
                "संता : अरे ये तो अपूनकी इश्टायल है. इसका सिंपल मतलब है...\n" +
                "लाँग टाईम नो 'सी'","मुलगा : ओ काका, कुल्फी कितीला आहे?\n" +
                "कुल्फीवाला : १०, २०, ३० रुपयांना..\n" +
                "मुलगा कुल्फी खातो, आणि घरी जायला निघतो.\n" +
                "कुल्फीवाला : अरे, पैसे दे की?\n" +
                "मुलगा :आमच्या घरचे म्हणत्यात खा, प्या मजा करा..पण पैशाचा लाड नाही करायचा...!","एका झाडावर पाच पक्षी बसलेले असतात.\n" +
                "तिथे एक शिकारी येतो आणि गोळी झाडतो.\n" +
                "एका पक्ष्याला गोळी लागते. तो खाली कोसळतो.\n" +
                "गोळीबाराने घाबरून तीन पक्षी उडून जातात.\n" +
                "एक पक्षी मात्र झाडावर तसाच बसून राहतो...\n" +
                ".... का?","शिक्षक- झंप्या तू नेहमी शाळेत टोपी घालून का येतोस..?\n" +
                "झंप्या- कारण कुणाला कळायला नको कि माझ्या डोक्यात काय चालले आहे ते....."
        };

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, android.R.id.text1, values);


        // Assign adapter to ListView
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent i = new Intent(Kids.this,KidsJokes.class);
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

