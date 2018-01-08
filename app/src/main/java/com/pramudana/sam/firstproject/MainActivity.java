package com.pramudana.sam.firstproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //tipe data

    String namaFirst = "Sam";
    String namaLast = "Pramudana";

    //deklarasi widget

    TextView txtWelcome;

    EditText etNama, etSekolah;
    Button btnSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        System.out.println("Fullname : " + namaFirst + namaLast);

        //memanggil id dari textView
        txtWelcome = (TextView) findViewById(R.id.txtWelcome);
        etNama = (EditText) findViewById(R.id.etNama);
        etSekolah = (EditText) findViewById(R.id.etSekolah);
        btnSubmit = (Button) findViewById(R.id.btnSubmit);

        //menambah aksi ketika btnSubmit di klik
      btnSubmit.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View view) {

              //mengambil nilai dari etNama dan etSekolah
              String nNama = etNama.getText().toString();
              String nSekolah = etSekolah.getText().toString();

              //menampilkan hasil ke textview
              txtWelcome.setText("Hallo, " + nNama + nSekolah);
          }
      });

        //menampilkan hasil teks ke widget textView
        txtWelcome.setText("Hy, " + namaFirst + namaLast);
    }
}
