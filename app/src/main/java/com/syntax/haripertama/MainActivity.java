package com.syntax.haripertama;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.syntax.haripertama.model.Orang;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    //TODO 1.1 deklarasi widget/button yang mau digunakan
    Button btnMove, btnPassData, btnPassobject,
            btnCallBack, btnEmail, btnCall;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // TODO 1.2 inisialisasi/hub dengan id nya masing"
        btnMove = findViewById(R.id.btn_move);
        btnPassData = findViewById(R.id.btn_pass_data);
        btnPassobject = findViewById(R.id.btn_pass_object);
        btnCallBack = findViewById(R.id.btn_call_back);
        btnEmail = findViewById(R.id.btn_email);
        btnCall = findViewById(R.id.btn_call);

        // TODO 1.3 event click listener/button something to do
        btnMove.setOnClickListener(this);
        btnPassData.setOnClickListener(this);
        btnPassobject.setOnClickListener(this);
        btnCallBack.setOnClickListener(this);
        btnEmail.setOnClickListener(this);
        btnCall.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {

            case R.id.btn_move:
                move();
                break;

            case R.id.btn_pass_data:
                passData();
                break;

            case R.id.btn_pass_object:
                passObject();
                break;

            case R.id.btn_call_back:
                break;

            case R.id.btn_email:
                break;

            case R.id.btn_call:
                break;
        }
    }

    // TODO 3.3
    private void passObject() {
        Intent passObject = new Intent(
                MainActivity.this, PassingObject.class);

        /**
         * instance class orang
         * atau buat object dari class orang
         * */
        Orang objectOrang = new Orang();
        objectOrang.setName("Fiqri");
        objectOrang.setAge(15);
        objectOrang.setJob("Kerja");
        objectOrang.setAsal("Lampung");
        objectOrang.setTinggal("Slipi");

        passObject.putExtra(PassingObject.EXTRA_OBJECT, objectOrang);

        startActivity(passObject);

    }

    // TODO 2.3 kirim data nya
    private void passData() {
        Intent passData = new Intent(
                MainActivity.this, PassingData.class);

        /**
         * intent putExtra
         * param 1 key sbg penampung data
         * param 2 value yang akan dikirim dalam type data apapun
         * */
        passData.putExtra(PassingData.KEY_NAME, "Fiqri Hafzain");
        passData.putExtra(PassingData.KEY_AGE, 15);

        startActivity(passData);
    }

    private void move() {
        //TODO 1.4 intent to move activity
        /** param 1 class dari activity asal
         * param 2 class dari activity tujuan
         * */
        Intent move = new Intent(MainActivity.this, Move.class);
        startActivity(move);
    }
}