package com.example.uasprogtech;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class QuestionActivity2 extends AppCompatActivity {
    TextView soalSoal;
    RadioGroup radioGroup;
    RadioButton rb1,rb2,rb3,rb4;
    Button tombolNext;

    String questions[] = {
            //soal1
            "What is the highest mountain on Earth?",
            //soal2
            "What country did St.Patrick's Day originate from?",
            //soal3
            "What is the capital of italy?",
            //soal4
            "What is the largest country in the world?",
            //soal5
            "What is the capital of mexico?",
            //soal6
            "What country was Ikea founded in?",
            //soal7
            "What is the most populated country in the world?",
            //soal8
            "What city is also known as 'The Theme Park Capital of the World'?",
            //soal9
            "What is the capital of the United States?",
            //soal10
            "What landmark is known world-wide for its unintended tilt?"
    };
    String answers[] = {
            //jawaban soal 1
            "Mount Everest",
            //jawaban soal 2
            "Ireland",
            //jawaban soal 3
            "Rome",
            //jawaban soal 4
            "Russia",
            //jawaban soal 5
            "Mexico City",
            //jawaban soal 6
            "Sweden",
            //jawaban soal 7
            "China",
            //jawaban soal 8
            "Orlando",
            //jawaban soal 9
            "Washinton Dc",
            //jawaban soal 10
            "Tower of Pisa"};
    String opt[] = {
            //pilihan soal 1
            "Mount fuji","Mount Everest","Mount klimanjaro","Mount Krakatau",
            //pilihan soal 2
            "England","Iceland","Scotland","Ireland",
            //pilihan soal 3
            "Venice","Florence","Rome","Naples",
            //pilihan soal 4
            "China","Canada","Russia","United States of America",
            //pilihan soal 5
            "Mexico City","Tijuana","Guadalajara","Cancun",
            //pilihan soal 6
            "United States of America","Sweden","Switzerland","Ukraine",
            //pilihan soal 7
            "India","China","United States of America","Russia",
            //pilihan soal 8
            "San Francisco","Miami","Orlando","San Diego",
            //pilihan soal 9
            "Dallas","New York City","Washington Dc","Ottawa",
            //pilihan soal 10
            "Eiffel Tower","Tower of Pisa","Statue of Liberty","Big Ben"
    };
    int flag=0;
    public static int marks=0,correct=0,wrong=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question2);

//        final TextView score = (TextView)findViewById(R.id.textView4);
        tombolNext =findViewById(R.id.tombol_next2);
        soalSoal=(TextView) findViewById(R.id.soal_soal2);

        radioGroup=(RadioGroup)findViewById(R.id.pilihan_group2);
        rb1=(RadioButton)findViewById(R.id.radioButton_1);
        rb2=(RadioButton)findViewById(R.id.radioButton_2);
        rb3=(RadioButton)findViewById(R.id.radioButton_3);
        rb4=(RadioButton)findViewById(R.id.radioButton_4);
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

