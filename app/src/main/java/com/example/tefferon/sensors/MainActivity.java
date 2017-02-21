package com.example.tefferon.sensors;

import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.util.Iterator;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private SensorManager mSensorMgr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView textView = (TextView) findViewById(R.id.textview);

        mSensorMgr = (SensorManager) getSystemService(SENSOR_SERVICE);
        List<Sensor> sensorList = mSensorMgr.getSensorList(Sensor.TYPE_ALL);
        Iterator<Sensor> iSense = sensorList.iterator();

        String sense = "";

        while (iSense.hasNext()){
            Sensor s = iSense.next();
//            sense += s.getName() + "\n";
//            sense += s.getClass() + "\n";
//            sense += s.getVendor() + "\n";
//            sense += s.getMinDelay() + "\n";
//            sense += s.getReportingMode() + "\n";
//            sense += s.getFifoMaxEventCount() + "\n";
//            sense += s.getResolution() + "\n";
//            sense += s.getType() + "\n";
            sense += s.toString() + "\n\n\n";





//            sense += s.getPower() + "\n\n\n";


        }
        textView.setText(sense);

//        while (iSense.hasNext()){
//            Sensor s = iSense.next();
//            textView.append(s.getName() + "\n");
//        }
    }



}
