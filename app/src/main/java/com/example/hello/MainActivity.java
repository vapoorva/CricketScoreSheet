package com.example.hello;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    private Button inc1,dec1,inc2,dec2,inc3,dec3,inc4,dec4,inc5,dec5,inc6,dec6,inc_nb,inc_wd,dec_wd,dec_nb,score;
    private TextView one,two,three,four,five,six,NB,WD,total;
    private int quantity1=0,quantity2=0,quantity3=0,quantity4=0,quantity5=0,quantity6=0,quantitynb=0,quantitywd=0,total_score=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //buttons
        inc1 = findViewById(R.id.inc_one);
        dec1 = findViewById(R.id.dec_one);
        inc2 = findViewById(R.id.inc_two);
        dec2 = findViewById(R.id.dec_two);
        inc3 = findViewById(R.id.inc_three);
        dec3 = findViewById(R.id.dec_three);
        inc4 = findViewById(R.id.inc_four);
        dec4 = findViewById(R.id.dec_four);
        inc5 = findViewById(R.id.inc_five);
        dec5 = findViewById(R.id.dec_five);
        inc6 = findViewById(R.id.inc_six);
        dec6 = findViewById(R.id.dec_six);
        inc_nb = findViewById(R.id.inc_nb);
        dec_nb = findViewById(R.id.dec_nb);
        inc_wd =  findViewById(R.id.inc_wd);
        dec_wd = findViewById(R.id.dec_wd);
        score=findViewById(R.id.total_score);
        //txtview
        one = findViewById(R.id.one);
        two = findViewById(R.id.two);
        three = findViewById(R.id.three);
        four =findViewById(R.id.four);
        five = findViewById(R.id.five);
        six = findViewById(R.id.six);
        NB = findViewById(R.id.no_ball);
        WD = findViewById(R.id.wide);
        //final
        total = findViewById(R.id.score_display);
//one run
        inc1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(quantity1>=0){
                    quantity1++;
                    total_score++;
                    one.setText(quantity1+"");
                }
            }

        });
        dec1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(quantity1== 0)
                {
                    Toast.makeText(MainActivity.this, "Cannot Reduce More",Toast.LENGTH_SHORT).show();
                }
                else{
                    --quantity1;
                    --total_score;
                    one.setText(quantity1+"");
                }
            }
        });
//two runs
        inc2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(quantity2>=0){
                    quantity2++;
                    total_score=total_score+2;
                    two.setText(quantity2+"");
                }
            }
        });

        dec2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(quantity2 == 0)
                {
                    Toast.makeText(MainActivity.this, "Cannot Reduce More",Toast.LENGTH_SHORT).show();
                }
                else{
                    --quantity2;
                    total_score=total_score-2;
                    two.setText(quantity2+"");
                }
            }
        });

 //three runs

        inc3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(quantity3>=0){
                    quantity3++;
                    total_score=total_score+3;
                    three.setText(quantity3+"");
                }
            }
        });

        dec3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(quantity3 == 0)
                {
                    Toast.makeText(MainActivity.this, "Cannot Reduce More",Toast.LENGTH_SHORT).show();
                }
                else{
                    --quantity3;
                    total_score=total_score-3;
                    three.setText(quantity3+"");
                }
            }
        });
//four Runs

        inc4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(quantity4>=0){
                    quantity4++;
                    total_score=total_score+4;
                    four.setText(quantity4+"");
                }
            }
        });

        dec4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(quantity4 == 0)
                {
                    Toast.makeText(MainActivity.this, "Cannot Reduce More",Toast.LENGTH_SHORT).show();
                }
                else{
                    --quantity4;
                    total_score=total_score-4;
                    four.setText(quantity4+"");
                }
            }
        });

//five runs

        inc5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(quantity5>=0){
                    quantity5++;
                    total_score=total_score+5;
                    five.setText(quantity5+"");
                }
            }
        });

        dec5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(quantity5 == 0)
                {
                    Toast.makeText(MainActivity.this, "Cannot Reduce More",Toast.LENGTH_SHORT).show();
                }
                else{
                    --quantity5;
                    total_score=total_score-5;
                    five.setText(quantity5+"");
                }
            }
        });

//six runs

        inc6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(quantity6>=0){
                    quantity6++;
                    total_score=total_score+6;
                    six.setText(quantity6+"");
                }
            }
        });

        dec6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(quantity6 == 0)
                {
                    Toast.makeText(MainActivity.this, "Cannot Reduce More",Toast.LENGTH_SHORT).show();
                }
                else{
                    --quantity6;
                    total_score=total_score-6;
                    six.setText(quantity6+"");
                }
            }
        });
//No Ball
         inc_nb.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 quantitynb++;
                 NB.setText(quantitynb+"");
             }
         });

         dec_nb.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 if(quantitynb == 0)
                 {
                     Toast.makeText(MainActivity.this, "Cannot Reduce More",Toast.LENGTH_SHORT).show();
                 }
                 else{
                     --quantitynb;
                     NB.setText(quantitynb+"");
                 }
             }
         });
//wide ball
        inc_wd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                quantitywd++;
                total_score=total_score+1;
                WD.setText(quantitywd+"");
            }
        });
        dec_wd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(quantitywd == 0)
                {
                    Toast.makeText(MainActivity.this, "Cannot Reduce More",Toast.LENGTH_SHORT).show();
                }
                else{
                    --quantitywd;
                    total_score=total_score-1;
                    WD.setText(quantitywd+"");
                }
            }
        });
        //final score button
        score.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    total.setText(total_score+"");

            }
        });
    }
}
