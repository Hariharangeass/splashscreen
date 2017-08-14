package com.example.rahul.splashscreen;

import android.app.ProgressDialog;
import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.daimajia.androidanimations.library.Techniques;
import com.daimajia.androidanimations.library.YoYo;

import java.util.Random;

public class MainActivity extends AppCompatActivity {


    ImageView imageView1;
    ImageView imageView2;
    ImageView imageView3;
    ImageView imageView4;
    ImageView imageView5;
    Random random;
    int a;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView = (TextView) findViewById(R.id.textView2);


        random = new Random();
         a = random.nextInt(6)+1;
        button = (Button) findViewById(R.id.button);
        counter(a);

        imageView1 = (ImageView) findViewById(R.id.imageView3);
        imageView2 = (ImageView) findViewById(R.id.imageView4);
        imageView3 = (ImageView) findViewById(R.id.imageView5);
        imageView4 = (ImageView) findViewById(R.id.imageView6);
        imageView5 = (ImageView) findViewById(R.id.imageView7);

        counter(a+1);

        counter(a-1);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                imageView1.setVisibility(View.INVISIBLE);
                imageView2.setVisibility(View.INVISIBLE);
                imageView3.setVisibility(View.INVISIBLE);
                imageView4.setVisibility(View.INVISIBLE);
                imageView5.setVisibility(View.INVISIBLE);
                button.setVisibility(View.INVISIBLE);

                a = random.nextInt(6)+1;
                counter(a);
                counter(a+1);
                counter(a-1);
            }
        });




    }


    public void counter(int a)
    {


        final ProgressBar progressBar = (ProgressBar) findViewById(R.id.progressBar);
        progressBar.setVisibility(View.VISIBLE);







        switch (a)
        {
            case 1:

                new android.os.Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {

                        imageView1.setVisibility(View.VISIBLE);
                        YoYo.with(Techniques.FadeIn).duration(1000).repeat(1).playOn(findViewById(R.id.imageView3));
                        progressBar.setVisibility(View.INVISIBLE);
                        button.setVisibility(View.VISIBLE);
                    }
                }, 5000);

                break;

            case 2:
                new android.os.Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {

                        imageView2.setVisibility(View.VISIBLE);
                        YoYo.with(Techniques.FadeIn).duration(1000).repeat(1).playOn(imageView2);
                        progressBar.setVisibility(View.INVISIBLE);
                        button.setVisibility(View.VISIBLE);
                    }
                }, 5000);

                break;

            case 3:
                new android.os.Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {

                        imageView3.setVisibility(View.VISIBLE);
                        YoYo.with(Techniques.FadeIn).duration(1000).repeat(1).playOn(imageView3);
                        progressBar.setVisibility(View.INVISIBLE);
                        button.setVisibility(View.VISIBLE);
                    }
                }, 5000);

                break;

            case 4:
                new android.os.Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {

                        imageView4.setVisibility(View.VISIBLE);
                        YoYo.with(Techniques.FadeIn).duration(1000).repeat(1).playOn(imageView4);
                        progressBar.setVisibility(View.INVISIBLE);
                        button.setVisibility(View.VISIBLE);
                    }
                }, 5000);

                break;

            case 5:
                new android.os.Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {

                        imageView5.setVisibility(View.VISIBLE);
                        YoYo.with(Techniques.FadeIn).duration(1000).repeat(1).playOn(imageView5);
                        progressBar.setVisibility(View.INVISIBLE);
                        button.setVisibility(View.VISIBLE);
                    }
                }, 5000);

                break;

            default:

                //Toast.makeText(this,"No Searches Nearby",Toast.LENGTH_LONG).show();
                //button.setVisibility(View.VISIBLE);
                progressBar.setVisibility(View.INVISIBLE);
                break;



        }

    }
}
