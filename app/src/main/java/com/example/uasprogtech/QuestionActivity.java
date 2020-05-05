package com.example.uasprogtech;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class QuestionActivity extends AppCompatActivity {
    TextView soalSoal;
    RadioGroup radioGroup;
    RadioButton rb1,rb2,rb3,rb4;
    Button tombolNext;

    String questions[] = {
            //soal1
            "Which of these is an online auction and shopping website?",
            //soal2
            "Which of these streaming services produced 'Stranger Things' and 'House of Cards'",
            //soal3
            "Which of these companies is formally referred to as the Hewlett-Packard Company",
            //soal4
            "What restaurant is best known for their donuts?",
            //soal5
            "Which car manufacturer of luxury sport cars is based in italy?",
            //soal6
            "Which drink is considered an energy drink?",
            //soal7
            "The company Nestle is also known for selling what product?",
            //soal8
            "Iron man is a part of which comic book company?",
            //soal9
            "Which social media platform is known for 'snapping' picture ",
            //soal10
            "Which camera is used in sports and high action movement?"
    };
    String answers[] = {
            //jawaban soal 1
            "eBay",
            //jawaban soal 2
            "Netflix",
            //jawaban soal 3
            "HP",
            //jawaban soal 4
            "Dunkin Donuts",
            //jawaban soal 5
            "Lamborghini",
            //jawaban soal 6
            "Monster",
            //jawaban soal 7
            "Baby food",
            //jawaban soal 8
            "Marvel",
            //jawaban soal 9
            "Snapchat",
            //jawaban soal 10
            "GoPro"};
    String opt[] = {
            //pilihan soal 1
            "Facebook","Pinterest","eBay","Bing",
            //pilihan soal 2
            "Crave TV","Hooq","Amazon Prime","Netflix",
            //pilihan soal 3
            "HP","Asus","Samsung","Dell",
            //pilihan soal 4
            "McDonalds","Dunkin Donuts","JCO","Cinnabon",
            //pilihan soal 5
            "Porsche","Chevrolet","Lamborghini","Audi",
            //pilihan soal 6
            "Root beer","Monster","Coca-cola","Fanta",
            //pilihan soal 7
            "Chicken","Coffee","Alcohol","Baby food",
            //pilihan soal 8
            "Grim brothers","Marvel","D.C","Warner brothers",
            //pilihan soal 9
            "Snapchat","Facebook","Twitter","LinkedIn",
            //pilihan soal 10
            "Canon","GoPro","Kodak","Fujifilm"
    };
    int flag=0;
    public static int marks=0,correct=0,wrong=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question);

//        final TextView score = (TextView)findViewById(R.id.textView4);
        tombolNext =findViewById(R.id.tombol_next);
        soalSoal=(TextView) findViewById(R.id.soal_soal);

        radioGroup=(RadioGroup)findViewById(R.id.pilihan_gorup);
        rb1=(RadioButton)findViewById(R.id.radioButton);
        rb2=(RadioButton)findViewById(R.id.radioButton2);
        rb3=(RadioButton)findViewById(R.id.radioButton3);
        rb4=(RadioButton)findViewById(R.id.radioButton4);
        soalSoal.setText(questions[flag]);
        rb1.setText(opt[0]);
        rb2.setText(opt[1]);
        rb3.setText(opt[2]);
        rb4.setText(opt[3]);

        tombolNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(radioGroup.getCheckedRadioButtonId()== -1){
                    Toast.makeText(getApplicationContext(), "Please select the choice first", Toast.LENGTH_SHORT).show();
                    return;
                }
                RadioButton checkjawaban = findViewById(radioGroup.getCheckedRadioButtonId());
                String jawabanteks = checkjawaban.getText().toString();
                Toast.makeText(getApplicationContext(), jawabanteks, Toast.LENGTH_SHORT).show();

                if(jawabanteks.equals(answers[flag])){
                    correct++;
                    Toast.makeText(getApplicationContext(),"Correct", Toast.LENGTH_SHORT).show();
                }
                else{
                    wrong++;
                    Toast.makeText(getApplicationContext(),"Wrong", Toast.LENGTH_SHORT).show();
                }

                flag++;



                if(flag < questions.length){
                    soalSoal.setText(questions[flag]);
                    rb1.setText(opt[flag*4]);
                    rb2.setText(opt[flag*4 + 1]);
                    rb3.setText(opt[flag*4 + 2]);
                    rb4.setText(opt[flag*4 + 3]);
                }
//                else
//                {
//                    marks=correct;
//                    Intent in = new Intent(getApplicationContext(), DashboardFragment.class);
//                    startActivity(in);
//                }
                radioGroup.clearCheck();


            }
        });
    }

}

