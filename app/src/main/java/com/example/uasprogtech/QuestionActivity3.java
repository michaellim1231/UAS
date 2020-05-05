package com.example.uasprogtech;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class QuestionActivity3 extends AppCompatActivity {
    TextView soalSoal;
    RadioGroup radioGroup;
    RadioButton rb1,rb2,rb3,rb4;
    Button tombolNext;

    String questions[] = {
            //soal1
            "Who was the male lead in Titanic",
            //soal2
            "Who was the first black President of the United States?",
            //soal3
            "Which of these women ran for President of the United States in 2016?",
            //soal4
            "He is known for his role in Big (1988), Philadelphia (1993) and Forrest Gump (1994)",
            //soal5
            "Who created Mickey Mouse?",
            //soal6
            "Which actor plays Harry Potter?",
            //soal7
            "Who is the founder and CEO of Dell inc.?",
            //soal8
            "Who wrote Harry Potter?",
            //soal9
            "Who is the co_founder of Apple Computer?",
            //soal10
            "Who played Edward Cullen in Twilight?"
    };
    String answers[] = {
            //jawaban soal 1
            "Leornardo DiCaprio",
            //jawaban soal 2
            "Barack Obama",
            //jawaban soal 3
            "Hilary Clinton",
            //jawaban soal 4
            "Tom Hanks",
            //jawaban soal 5
            "Walt Disney",
            //jawaban soal 6
            "Daniel Radcliffe",
            //jawaban soal 7
            "Michael Dell",
            //jawaban soal 8
            "J.K Rowling",
            //jawaban soal 9
            "Steve Jobs",
            //jawaban soal 10
            "Robert Pattinson"};
    String opt[] = {
            //pilihan soal 1
            "Leornardo DiCaprio","Johhny Depp","Brad Pitt","George Clooney",
            //pilihan soal 2
            "Will Smith","Barack Obama","Jessie Jackson","Tim Scott",
            //pilihan soal 3
            "Martha Stewart","Marilyn Dennis","Sarah Palin","Hilary Clinton",
            //pilihan soal 4
            "Tom Hanks","Bill Murray","Jimmy Kimmel","Colin Hanks",
            //pilihan soal 5
            "Vincent Price","Matt Groening","Alvy Ray Smith","Walt Disney",
            //pilihan soal 6
            "Tobey Maguire","Daniel Radcliffe","Robert Pattinson","Elijah Wood",
            //pilihan soal 7
            "Bill Gates","Michael Dell","Sergey Brin","Mark Cuban",
            //pilihan soal 8
            "J.K Rowling","Adele","Kylie Minogue","Sarah Jessica Parker",
            //pilihan soal 9
            "Michael Dell","Bill Gates","Steve Jobs","Mark Zuckerberg",
            //pilihan soal 10
            "Zac Efron","Robert Pattinson","Daniel Radcliffe","Taylor Lautner"
    };
    int flag=0;
    public static int marks=0,correct=0,wrong=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question3);

//        final TextView score = (TextView)findViewById(R.id.textView4);
        tombolNext =findViewById(R.id.tombol_next3);
        soalSoal=(TextView) findViewById(R.id.soal_soal3);

        radioGroup=(RadioGroup)findViewById(R.id.pilihan_group3);
        rb1=(RadioButton)findViewById(R.id.RadioButton_a);
        rb2=(RadioButton)findViewById(R.id.RadioButton_b);
        rb3=(RadioButton)findViewById(R.id.RadioButton_c);
        rb4=(RadioButton)findViewById(R.id.RadioButton_d);
        soalSoal.setText(questions[flag]);
        rb1.setText(opt[0]);
        rb2.setText(opt[1]);
        rb3.setText(opt[2]);
        rb4.setText(opt[3]);

        tombolNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (radioGroup.getCheckedRadioButtonId() == -1) {
                    Toast.makeText(getApplicationContext(), "Please select the choice first", Toast.LENGTH_SHORT).show();
                    return;
                }
                RadioButton checkjawaban = findViewById(radioGroup.getCheckedRadioButtonId());
                String jawabanteks = checkjawaban.getText().toString();
                Toast.makeText(getApplicationContext(), jawabanteks, Toast.LENGTH_SHORT).show();

                if (jawabanteks.equals(answers[flag])) {
                    correct++;
                    Toast.makeText(getApplicationContext(), "Correct", Toast.LENGTH_SHORT).show();
                } else {
                    wrong++;
                    Toast.makeText(getApplicationContext(), "Wrong", Toast.LENGTH_SHORT).show();
                }

                flag++;


                if (flag < questions.length) {
                    soalSoal.setText(questions[flag]);
                    rb1.setText(opt[flag * 4]);
                    rb2.setText(opt[flag * 4 + 1]);
                    rb3.setText(opt[flag * 4 + 2]);
                    rb4.setText(opt[flag * 4 + 3]);
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

