package com.example.renske.multipleactivities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    private Button button1, button2;
    private ImageView person1, person2, person3, person4, person5, person6;
    private TextView tperson1, tperson2, tperson3, tperson4, tperson5, tperson6;
    int requestcode = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        person1 = (ImageView) findViewById(R.id.pic2);
        person2 = (ImageView) findViewById(R.id.pic3);
        person3 = (ImageView) findViewById(R.id.pic6);
        person4 = (ImageView) findViewById(R.id.pic1);
        person5 = (ImageView) findViewById(R.id.pic4);
        person6 = (ImageView) findViewById(R.id.pic5);

        tperson1 = (TextView) findViewById(R.id.score1);
        tperson2 = (TextView) findViewById(R.id.score2);
        tperson3 = (TextView) findViewById(R.id.score3);
        tperson4 = (TextView) findViewById(R.id.score4);
        tperson5 = (TextView) findViewById(R.id.score5);
        tperson6 = (TextView) findViewById(R.id.score6);

    }
    
    public void openProfile(View v) { // Parameter v stands for the view that was clicked.

        // getId() returns this view's identifier.
        switch (v.getId()) {
            case R.id.pic1:
                Intent intent = new Intent(this, Main2Activity.class);
                intent.putExtra("persoon", 1);
                startActivityForResult(intent, 1);
                // PASS CURRENT RATING ALSO? THEN UPDATE RATING BAR IN PROFILE
                break;
            case R.id.pic2:
                Intent intent2 = new Intent(this, Main2Activity.class);
                intent2.putExtra("persoon", 2);
                startActivityForResult(intent2, 2);
                break;
            case R.id.pic3:
                Intent intent3 = new Intent(this, Main2Activity.class);
                intent3.putExtra("persoon", 3);
                startActivityForResult(intent3, 3);
                break;
            case R.id.pic4:
                Intent intent4 = new Intent(this, Main2Activity.class);
                intent4.putExtra("persoon", 4);
                startActivityForResult(intent4, 4);
                break;
            case R.id.pic5:
                Intent intent5 = new Intent(this, Main2Activity.class);
                intent5.putExtra("persoon", 5);
                startActivityForResult(intent5, 5);
                break;
            case R.id.pic6:
                Intent intent6 = new Intent(this, Main2Activity.class);
                intent6.putExtra("persoon", 6);
                startActivityForResult(intent6, 6);
                break;

        }

    }



    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
            if (resultCode == RESULT_OK) {
                String newrating = data.getStringExtra("givenrating");

                switch (requestCode) {
                    case 1:
                        tperson1.setText(newrating);
                        break;
                    case 2:
                        tperson2.setText(newrating);
                        break;
                    case 3:
                        tperson3.setText(newrating);
                        break;
                    case 4:
                        tperson4.setText(newrating);
                        break;
                    case 5:
                        tperson5.setText(newrating);
                        break;
                    case 6:
                        tperson6.setText(newrating);
                        break;


                }
            }

    }


}
