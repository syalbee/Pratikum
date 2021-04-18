package com.example.pratikumi.views;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.pratikumi.R;
import com.squareup.picasso.Picasso;

public class HasilActivity extends AppCompatActivity {

    ImageView ivZodiak;
    Button btCeks;
    TextView tvZodiak, tvHai;

    private String date ="", zodiak = "";
    private String zozo,bln;
    private int bulan, tanggal = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hasil);

        ivZodiak = findViewById(R.id.ivZodiak);
        btCeks = findViewById(R.id.btCari);
        tvZodiak = findViewById(R.id.tvZodiak);
        tvHai = findViewById(R.id.tvHai);

        date = getIntent().getStringExtra("tanggal");
        zodiak = getIntent().getStringExtra("zodiak");

        bln = date.substring(3,4);

        if(date.substring(3,4).equals("0")){
            bln = date.substring(4,5);
        }
        bulan = Integer.parseInt(bln);


        if((tanggal >= 21 && bulan==3) || (tanggal<=19 && bulan==4 )){
            zozo = "aries";
            tvZodiak.setText("Aries");
            getGambar(zozo);
        }else if((tanggal >=20 && bulan == 4) || (tanggal <=20 && bulan == 5)){
            zozo = "taurus";
            tvZodiak.setText("Taurus");
            getGambar(zozo);
        }else if((tanggal >=21 && bulan == 5) || (tanggal <=20 && bulan == 6)){
            zozo = "gemini";
            tvZodiak.setText("Gemini");
            getGambar(zozo);
        }else if((tanggal >=21 && bulan == 6) || (tanggal <=22 && bulan == 7)){
            zozo = "cancer";
            tvZodiak.setText("Cancer");
            getGambar(zozo);
        }else if((tanggal >=23 && bulan == 7) || (tanggal <=22 && bulan == 8)){
            zozo = "leo";
            tvZodiak.setText("Leo");
            getGambar(zozo);
        }else if((tanggal >=23 && bulan == 8) || (tanggal <=22 && bulan == 9)){
            zozo = "virgo";
            tvZodiak.setText("Virgo");
            getGambar(zozo);
        }else if((tanggal >=23 && bulan == 9) || (tanggal <=22 && bulan == 10)){
            zozo = "libra";
            tvZodiak.setText("Libra");
            getGambar(zozo);
        }else if((tanggal >=23 && bulan == 10) || (tanggal <=21 && bulan == 11)){
            zozo = "scorpio";
            tvZodiak.setText("Scorpio");
            getGambar(zozo);
        }else if((tanggal >=22 && bulan == 11) || (tanggal <=21 && bulan == 12)){
            zozo = "sagitarius";
            tvZodiak.setText("Sagitarius");
            getGambar(zozo);
        }else if((tanggal >=22 && bulan == 12) || (tanggal <=19 && bulan == 1)){
            zozo = "capricorn";
            tvZodiak.setText("Capricorn");
            getGambar(zozo);
        }else if((tanggal >=20 && bulan == 1) || (tanggal <=18 && bulan == 2)){
            zozo = "aquarius";
            tvZodiak.setText("Aquarius");
            getGambar(zozo);
        }else if((tanggal >=19 && bulan == 2) || (tanggal <=20 && bulan == 3)){
            zozo = "aquarius";
            tvZodiak.setText("Pisces");
            getGambar(zozo);
        }else{
            Toast.makeText(getApplicationContext(),  "Salah Input !!!", Toast.LENGTH_SHORT).show();
        }

        btCeks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://www.fimela.com/zodiak/" + zozo;
                Intent bukaWeb = new Intent(Intent.ACTION_VIEW);
                bukaWeb.setData(Uri.parse(url));
                startActivity(bukaWeb);
            }
        });
    }

    private void getGambar(String url){
        Picasso.get()
                .load("https://preview-kly.akamaized.net/fimela/zodiak/"+ url+ ".jpg")
                .into(ivZodiak);
    }
}