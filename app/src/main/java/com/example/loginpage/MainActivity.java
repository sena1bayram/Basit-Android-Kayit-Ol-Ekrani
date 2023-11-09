package com.example.loginpage;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {

    private EditText editTxtAd, editTxtSoyad, editTxtYas, editTxtSehir;
    private CheckBox checkBoxProgramlama, checkBoxOyun, checkBoxSpor;
    private RadioButton radioBtnK, radioBtnE;

    private String editAd, editSoyad, editYas, editSehir;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTxtAd = (EditText) findViewById(R.id.editTxtAd);
        editTxtSoyad = (EditText) findViewById(R.id.editTxtSoyad);
        editTxtSehir = (EditText) findViewById(R.id.editTxtSehir);
        editTxtYas = (EditText) findViewById(R.id.editTxtYas);

        checkBoxProgramlama = (CheckBox) findViewById(R.id.checkBoxProgramlama);
        checkBoxOyun = (CheckBox) findViewById(R.id.checkBoxOyun);
        checkBoxSpor = (CheckBox) findViewById(R.id.checkBoxSpor);

        radioBtnK = (RadioButton) findViewById(R.id.radioBtnK);
        radioBtnE = (RadioButton) findViewById(R.id.radioBtnE);


    }

    public void btnKayitOl(View v) {
        editAd = editTxtAd.getText().toString();
        editSoyad = editTxtSoyad.getText().toString();
        editYas = editTxtYas.getText().toString();
        editSehir = editTxtSehir.getText().toString();

        if (!TextUtils.isEmpty(editAd) && !TextUtils.isEmpty(editSoyad) && !TextUtils.isEmpty(editYas) && !TextUtils.isEmpty(editSehir)) {
            System.out.println("Adınız: "+ editAd);
            System.out.println("Soyadınız: "+ editSoyad);
            System.out.println("Yaşınız: "+ editYas);
            System.out.println("Şehriniz: " + editSehir);

            System.out.println("----HOBİLERİNİZ----");
            if (checkBoxProgramlama.isChecked()) {
                System.out.println(checkBoxProgramlama.getText().toString());
            }
            if (checkBoxSpor.isChecked()) {
                System.out.println(checkBoxSpor.getText().toString());
            }
            if (checkBoxOyun.isChecked()) {
                System.out.println(checkBoxOyun.getText().toString());
            }
            System.out.println("----CİNSİYETİNİZ----");
            if (radioBtnE.isChecked()) {
                System.out.println(radioBtnE.getText().toString());
            } else {
                System.out.println(radioBtnK.getText().toString());
            }
        }else {
            System.out.println("EGirilen Bilgiler Boş olamaz");
            System.out.println();
            System.out.println();
            System.out.println("Kayıt İşleminiz Başarı İle Gerçekleşti");
        }
    }
}