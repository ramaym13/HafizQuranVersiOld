package org.d3ifcool.hafizquran.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import org.d3ifcool.hafizquran.R;

import android.hardware.Sensor;

import android.hardware.SensorEvent;

import android.hardware.SensorEventListener;

import android.hardware.SensorManager;

import android.view.animation.Animation;

import android.view.animation.RotateAnimation;

import android.widget.ImageView;

import android.widget.TextView;
public class KompasActivity extends AppCompatActivity implements SensorEventListener{

    private ImageView img;

    private float currentDegree = 0f;

    private SensorManager mSensorManager;

    TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kompas);

        img = (ImageView) findViewById(R.id.imgCompass);

        text = (TextView) findViewById(R.id.text);

        mSensorManager = (SensorManager) getSystemService(SENSOR_SERVICE);
    }

    @Override

    protected void onResume() {

        super.onResume();

        mSensorManager.registerListener(this, mSensorManager.getDefaultSensor(Sensor.TYPE_ORIENTATION),

                SensorManager.SENSOR_DELAY_GAME);

    }



    @Override

    protected void onPause() {

        super.onPause();

// untuk memberhentikan event listener

        mSensorManager.unregisterListener(this);

    }



    @Override

    public void onSensorChanged(SensorEvent event) {



// mendapatkan derajat sumbu z

        float degree = Math.round(event.values[0]);
        text.setText(Float.toString(degree) + "° ");


// membuat animasi rotasi

        RotateAnimation ra = new RotateAnimation(

                currentDegree,

                -degree,

                Animation.RELATIVE_TO_SELF, 0.5f,

                Animation.RELATIVE_TO_SELF,

                0.5f);



        ra.setDuration(210);



        ra.setFillAfter(true);



// memulai animasi

        img.startAnimation(ra);

        currentDegree = -degree;



    }

    @Override

    public void onAccuracyChanged(Sensor sensor, int accuracy) {

    }
}
