package com.example.renske.multipleactivities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.RatingBar.OnRatingBarChangeListener;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    String userrating = " ";
    private RatingBar ratingBar;
    private ImageView profilepic;
    private TextView profilename, profiledesc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        addListenerOnRatingBar();

        profilepic = (ImageView) findViewById(R.id.profilepic);
        profilename = (TextView) findViewById(R.id.textView);
        profiledesc = (TextView) findViewById(R.id.textView2);

        Bundle extras = getIntent().getExtras();
        int persoonnr = extras.getInt("persoon");

        switch (persoonnr) {
            case 1:
                profilepic.setImageResource(R.mipmap.jammfraser);
                profilename.setText("Jamie Fraser");
                profiledesc.setText("Loves: swordfighting, duels, building things, horses, food.");
                break;
            case 2:
                // zet juiste plaatje text etc neer
                profilepic.setImageResource(R.mipmap.murtaghfitzfraser);
                profilename.setText("Murtagh Fitzgibbons");
                profiledesc.setText("Loves: horseriding, cooking, hiking along the countryside.");
                break;
            case 3:
                // zet juiste plaatje text etc neer
                profilepic.setImageResource(R.mipmap.clairebeauchamp);
                profilename.setText("Claire Beauchamp");
                profiledesc.setText("Loves: being a doctor, herbology, fresh air, new discoveries.");
                break;
            case 4:
                // zet juiste plaatje text etc neer
                profilepic.setImageResource(R.mipmap.geillisduncan);
                profilename.setText("Geillis Duncan");
                profiledesc.setText("Loves: witchcraft, mystical things, time travel, money");
                break;
            case 5:
                // zet juiste plaatje text etc neer
                profilepic.setImageResource(R.mipmap.bjrandall);
                profilename.setText("Jonathan Randall");
                profiledesc.setText("Loves: nothing except for nasty things, don't date him.");
                break;
            case 6:
                // zet juiste plaatje text etc neer
                profilepic.setImageResource(R.mipmap.jennymurray);
                profilename.setText("Jenny Murray");
                profiledesc.setText("Loves: taking the lead, farming, good food, children.");
                break;

        }


    }




    //source http://www.mkyong.com/android/android-rating-bar-example/
    public void addListenerOnRatingBar() {

        ratingBar = (RatingBar) findViewById(R.id.ratingBar);

        ratingBar.setOnRatingBarChangeListener(new OnRatingBarChangeListener() {
            public void onRatingChanged(RatingBar ratingBar, float rating,
                                        boolean fromUser) {

                userrating = (String.valueOf(rating));
                Intent intentrate = new Intent(Main2Activity.this, MainActivity.class);
                intentrate.putExtra("givenrating", userrating);
                setResult(RESULT_OK, intentrate);

            }
        });

    }



}


