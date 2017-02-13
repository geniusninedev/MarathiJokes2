package com.geniusnine.android.marathijokes.Vakil;

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

public class Vakil extends AppCompatActivity {
    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_best);
        listView=(ListView)findViewById(R.id.listView);

        String[] values = new String[] {"पेशंट:- डॉक्टर, प्लास्टिक सर्जरी करायची आहे, साधारण किती खर्च येईल?\n" +
                "डॉक्टर:- ३ लाख रुपये.","डॉक्टर : तुझे तीन दात कसे तुटले ??\n" +
                "रुग्ण : बायकोने दगडासारखी भाकरी तयार केली होती.","डॉक्टर: कस येण केलं?? झंप्या: तब्येत ठीक न्हवती ओ....छातीत दुखत होत.."
                ,"डॉक्टर एका वेड्याला : हे काय आहे..? . . वेडा : हे मी 500 पानांच पुस्तक लिहल आहे .. . ." +
                " डॉक्टर : पण तु 500 पानांवर लिहलस काय .. ?? ","सह्याद्री चॅनेलवर हॅलो सखी कार्यक्रमात विचारलेला प्रश्न :-\n" +
                "मुलगी : \n" +
                "माझं वय अठरा वर्षे आहे. माझा रंग गोरा आहे. माझी त्वचा खुप मुलायम आणि नाजुक आहे. मी रात्री काय लावुन झोपू?","एक माणूस फोनवर डॉक्टरांशी जिवाचा आटापिटा करुन सांगत होता, " +
                "'' डॉक्टर माझी बायको गरोदर आहे, आणि तिच्या प्रसववेदना सुरु झालेल्या असून तिच्या डिलेव्हरीसाठी फक्त दोन मिनीट बाकी आहेत.''","मुलगी: प्लीज, डॉक्टर माझ्या प्रियकराला आत बोलवा ना,\n" +
                "डॉक्टर: भरोसा ठेव माझ्यावर मी चांगला डॉक्टर आहे.",
                "पेशंट: विचित्र आजार झालाय..\n" +
                        "जेवणानंतर भूक लागत नाही..\n" +
                        "सकाळी उठल्यावर झोप लागत नाही..","Patient : डॉ. मला नविन त्रास सुरू झालाय.\n" +
                "मी दुसरं वाक्य बोललो की पहिलं वाक्य विसरुन जातो.\n" +
                "डॉ. :- हा त्रास तुम्हाला कधीपासून आहे?","डॉकटर रुग्णाला\n" +
                "डॉक्टर : सकाळी उठल्यावर थोडं गरम पाणी पीत चला , काही दिवसात बर वाटेल\n" +
                "रुग्ण : काही उपयोग नाही , वीस वर्षपासून मी तेच कतोय , फरक एवढाच कि माझी बायको त्याला चहा म्हणते","डॉक्टर : आपण कोणता साबण वापरता ?\n" +
                "गण्या : बजरंगाचा लींबाचा साबण","संताची जाम गोची झाली होती. त्याला त्याच्या बायकोचं म्हणणं नीट ऐकूच येईना झालं होतं. त्याची बायको तर त्याच्यावर वैतागायची. याच वैतागाने संताने तडक दवाखाना गाठला.\n" +
                "संता : डॉक्टर, अहो माझ्या कानाचं काहीतरी करा. मला आजार झालाय. अहो, बायकोचं म्हणणं मला ऐकूच येत नाहीये.\n" +
                "डॉक्टर : संताजी, अहो हा आजार नाही, तुमच्यावर देवाने कृपा केली आहे","एका वजनदार काकूंना डॉक्टरांनी वजन घटवण्यासाठी घोड्यावरून रपेट करण्याचा सल्ला दिला. एक महिन्यानंतर वजन २० किलोने कमी झाले... घोड्याचे!"
                ,"एक मित्र : डॉक्टरांनी म्हटलं होतं की ते मला स्वत:च्या पायावर उभं करतील.\n" +
                "दुसरा मित्र : मग काय झालं?\n" +
                "पहिला मित्र : त्यांची फी भरण्यासाठी मला गाडी विकावी लागली!!!"
                ,"वैद्यक शास्त्रातील एकच गोष्ट क्रिकेटमध्ये येऊन अगदी चपखल बसली आहे, ती म्हणजे त्रिफळा. खेळणा-याचे इथे चूर्ण व्हावे.","दिर्घ अजाराने त्रासलेले अण्णा डॉ. कर्वेकडे जातात.\n" +
                "डॉ. कर्वे : तुमचे फ़ॅमिली डॉक्टर कोणते?\n" +
                "अण्णा : डॉ. देशपांडे.\n" +
                "डॉ. कर्वे : अहो, ते डॉक्टर मुर्खासारखा चुकीचा सल्ला देतात." +
                "तुम्हाला कोणता दिला?" +
                "अण्णा : तुमच्याकडे जाण्याचा..........","डॉकटर रुग्णाला "+"डॉक्टर : सकाळी उठल्यावर थोडं गरम पाणी पीत चला , काही दिवसात बर वाटेल ","सुधा : डॉकटर मला पचनाचे औषधं घ्या . \n" +
                "डॉकटर: (तपासून) तुझी पचनशक्ती एकदम ठीक आहे " +
                "सुधा : पण आई तर म्हणते मला कुठलीही गोष्ट पचत नाही ","एक माणूस आणि त्याच्या बायकोने दाताच्या डॉक्टरच्या ऑफिसमधे प्रवेश केला. तो माणूस डॉक्टरांना म्हणाला, ''" +
                " डॉक्टर .. मी खुप घाईत आहे.. खरं म्हणजे बाहेर गाडीत माझे दोन मित्र बसून गोल्फ खेळायला जाण्यासाठी माझी वाट पाहत आहेत.. तुम्ही असं करा.. दाताला भूल वैगेरे देण्याच्या भानगडीत पडू नका " +
                "आणि दात डायरेक्ट कडचीत पकडून ओढून काढा ... आम्हाला 10 वाजता गोल्फ क्लबला पोहोचायचं आहे आणि आता 9.30 वाजुन गेले आहेत... इंजक्शन देवून भूलीचा असर पडण्यासाठी थांबण्यास माझ्याजवळ वेळ नाही आहे...''" +
                "त्या डॉक्टरने विचार केला, ' काय धीट माणूस आहे... भूल दिल्याशिवाय दात काढायला सांगतो... ' म्हणून त्या डॉक्टरने त्या माणसाला विचारले. " +
                "'' साहेब .. कोणता दात काढायचा आहे?''" +
                "तो माणूस आपल्या बायकोकडे वळत म्हणाला, ''हनी जरा तोंड उघड आणि त्यांना दाखव बरं''","एका पागल पेशंटने डॉक्टरला विचारले - डॉक्टर जर बिना दातांचा कुत्रा जर मला चावला तर तुम्ही काय उपचार कराल?" +
                "डॉक्टर - काही नाही तुला एक बिना सुईचे इंजक्शन देईन. "
        };

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, android.R.id.text1, values);


        // Assign adapter to ListView
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent i = new Intent(Vakil.this,VakilJoke.class);
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

