package com.syntax.haripertama;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.syntax.haripertama.model.Orang;

public class PassingObject extends AppCompatActivity {

    public static final String EXTRA_OBJECT = "OBJECT";

    // TODO 3.1 deklarasi
    TextView tvDataReceivedObj;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_passing_object);

        // TODO 3.2 inisialisasi/hub dengan id nya masing"
        tvDataReceivedObj = findViewById(R.id.tv_data_received_obj);

        // TODO 3.4 get data object orang dengan parcelable
        Orang objectOrang = getIntent().getParcelableExtra(EXTRA_OBJECT);

        // TODO 3.5 tampung dalam variable
        String tampung = "Name : " + objectOrang.getName()
                + "\nAge : " + objectOrang.getAge()
                + "\nJob : " + objectOrang.getJob()
                + "\nAsal : " + objectOrang.getAsal()
                + "\nTinggal : " + objectOrang.getTinggal();

        //TODO 3.6 show ke view
        tvDataReceivedObj.setText(tampung);
    }
}
