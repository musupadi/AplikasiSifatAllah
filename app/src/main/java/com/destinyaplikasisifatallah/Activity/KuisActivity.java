package com.destinyaplikasisifatallah.Activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.destinyaplikasisifatallah.Model.Model;
import com.destinyaplikasisifatallah.Model.ModelKuis1;
import com.destinyaplikasisifatallah.Model.ModelKuis10;
import com.destinyaplikasisifatallah.Model.ModelKuis2;
import com.destinyaplikasisifatallah.Model.ModelKuis3;
import com.destinyaplikasisifatallah.Model.ModelKuis4;
import com.destinyaplikasisifatallah.Model.ModelKuis5;
import com.destinyaplikasisifatallah.Model.ModelKuis6;
import com.destinyaplikasisifatallah.Model.ModelKuis7;
import com.destinyaplikasisifatallah.Model.ModelKuis8;
import com.destinyaplikasisifatallah.Model.ModelKuis9;
import com.destinyaplikasisifatallah.R;

import java.util.ArrayList;

public class KuisActivity extends AppCompatActivity {
    Button A,B,C,D;
    TextView Soal,Tittle;
    private ArrayList<Model> pList = new ArrayList<>();
    private long mBackPressed;
    private static final int TIME_INTERVAL = 2000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kuis);
        Intent data = getIntent();
        String No = data.getStringExtra("NO");
        final String Score = data.getStringExtra("SCORE");
        final String Kuis = data.getStringExtra("KUIS");
        final int no = Integer.parseInt(No);
        A = (Button)findViewById(R.id.btnA);
        B = (Button)findViewById(R.id.btnB);
        C = (Button)findViewById(R.id.btnC);
        D = (Button)findViewById(R.id.btnD);
        Soal = (TextView)findViewById(R.id.tvSoal);
        Tittle = (TextView)findViewById(R.id.tvTittle);


        if (Kuis.equals("1")){
            pList.addAll(ModelKuis1.getListData());
        }else if(Kuis.equals("2")){
            pList.addAll(ModelKuis2.getListData());
        }else if(Kuis.equals("3")){
            pList.addAll(ModelKuis3.getListData());
        }else if(Kuis.equals("4")){
            pList.addAll(ModelKuis4.getListData());
        }else if(Kuis.equals("5")){
            pList.addAll(ModelKuis5.getListData());
        }else if(Kuis.equals("6")){
            pList.addAll(ModelKuis6.getListData());
        }else if(Kuis.equals("7")){
            pList.addAll(ModelKuis7.getListData());
        }else if(Kuis.equals("8")){
            pList.addAll(ModelKuis8.getListData());
        }else if(Kuis.equals("9")){
            pList.addAll(ModelKuis9.getListData());
        }else if(Kuis.equals("10")){
            pList.addAll(ModelKuis10.getListData());
        }
        A.setText(pList.get(no).getJawabana());
        B.setText(pList.get(no).getJawabanb());
        C.setText(pList.get(no).getJawabanc());
        D.setText(pList.get(no).getJawaband());
        Soal.setText(pList.get(no).getSoal());
        Tittle.setText("Soal "+pList.get(no).getNo());
        A.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (pList.get(no).getJawaban().equals("A")){
                    if (no >= pList.size()-1){
                        Intent goInput = new Intent(KuisActivity.this, ScoreActivity.class);
                        goInput.putExtra("SCORE",String.valueOf(Integer.parseInt(Score)+10));
                        startActivity(goInput);
                        finishAffinity();
                    }else{
                        Intent goInput = new Intent(KuisActivity.this, KuisActivity.class);
                        goInput.putExtra("NO",String.valueOf(no+1));
                        goInput.putExtra("SCORE",String.valueOf(Integer.parseInt(Score)+10));
                        goInput.putExtra("KUIS",Kuis);
                        KuisActivity.this.startActivities(new Intent[]{goInput});
                        finishAffinity();
                    }
                }else{
                    if (no >= pList.size()-1){
                        Intent goInput = new Intent(KuisActivity.this, ScoreActivity.class);
                        goInput.putExtra("SCORE",String.valueOf(Score));
                        startActivity(goInput);
                        finishAffinity();
                    }else{
                        Intent goInput = new Intent(KuisActivity.this, KuisActivity.class);
                        goInput.putExtra("NO",String.valueOf(no+1));
                        goInput.putExtra("SCORE",String.valueOf(Score));
                        goInput.putExtra("KUIS",Kuis);
                        KuisActivity.this.startActivities(new Intent[]{goInput});
                        finishAffinity();
                    }
                }
            }
        });
        B.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (pList.get(no).getJawaban().equals("B")){
                    if (no >= pList.size()-1){
                        Intent goInput = new Intent(KuisActivity.this, ScoreActivity.class);
                        goInput.putExtra("SCORE",String.valueOf(Integer.parseInt(Score)+10));
                        startActivity(goInput);
                        finishAffinity();
                    }else{
                        Intent goInput = new Intent(KuisActivity.this, KuisActivity.class);
                        goInput.putExtra("NO",String.valueOf(no+1));
                        goInput.putExtra("SCORE",String.valueOf(Integer.parseInt(Score)+10));
                        goInput.putExtra("KUIS",Kuis);
                        KuisActivity.this.startActivities(new Intent[]{goInput});
                        finishAffinity();
                    }
                }else{
                    if (no >= pList.size()-1){
                        Intent goInput = new Intent(KuisActivity.this, ScoreActivity.class);
                        goInput.putExtra("SCORE",String.valueOf(Score));
                        startActivity(goInput);
                        finishAffinity();
                    }else{
                        Intent goInput = new Intent(KuisActivity.this, KuisActivity.class);
                        goInput.putExtra("NO",String.valueOf(no+1));
                        goInput.putExtra("SCORE",String.valueOf(Score));
                        goInput.putExtra("KUIS",Kuis);
                        KuisActivity.this.startActivities(new Intent[]{goInput});
                        finishAffinity();
                    }
                }
            }
        });
        C.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (pList.get(no).getJawaban().equals("C")){
                    if (no >= pList.size()-1){
                        Intent goInput = new Intent(KuisActivity.this, ScoreActivity.class);
                        goInput.putExtra("SCORE",String.valueOf(Integer.parseInt(Score)+10));
                        startActivity(goInput);
                        finishAffinity();
                    }else{
                        Intent goInput = new Intent(KuisActivity.this, KuisActivity.class);
                        goInput.putExtra("NO",String.valueOf(no+1));
                        goInput.putExtra("SCORE",String.valueOf(Integer.parseInt(Score)+10));
                        goInput.putExtra("KUIS",Kuis);
                        KuisActivity.this.startActivities(new Intent[]{goInput});
                        finishAffinity();
                    }
                }else{
                    if (no >= pList.size()-1){
                        Intent goInput = new Intent(KuisActivity.this, ScoreActivity.class);
                        goInput.putExtra("SCORE",String.valueOf(Score));
                        startActivity(goInput);
                        finishAffinity();
                    }else{
                        Intent goInput = new Intent(KuisActivity.this, KuisActivity.class);
                        goInput.putExtra("NO",String.valueOf(no+1));
                        goInput.putExtra("SCORE",String.valueOf(Score));
                        goInput.putExtra("KUIS",Kuis);
                        KuisActivity.this.startActivities(new Intent[]{goInput});
                        finishAffinity();
                    }
                }
            }
        });
        D.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (pList.get(no).getJawaban().equals("D")){
                    if (no >= pList.size()-1){
                        Intent goInput = new Intent(KuisActivity.this, ScoreActivity.class);
                        goInput.putExtra("SCORE",String.valueOf(Integer.parseInt(Score)+10));
                        Toast.makeText(KuisActivity.this,Score,Toast.LENGTH_SHORT).show();
                        startActivity(goInput);
                        finishAffinity();
                    }else{
                        Intent goInput = new Intent(KuisActivity.this, KuisActivity.class);
                        goInput.putExtra("NO",String.valueOf(no+1));
                        goInput.putExtra("SCORE",String.valueOf(Integer.parseInt(Score)+10));
                        goInput.putExtra("KUIS",Kuis);
                        KuisActivity.this.startActivities(new Intent[]{goInput});
                        finishAffinity();
                    }
                }else{
                    if (no >= pList.size()-1){
                        Intent goInput = new Intent(KuisActivity.this, ScoreActivity.class);
                        goInput.putExtra("SCORE",String.valueOf(Score));
                        startActivity(goInput);
                        finishAffinity();
                    }else{
                        Intent goInput = new Intent(KuisActivity.this, KuisActivity.class);
                        goInput.putExtra("NO",String.valueOf(no+1));
                        goInput.putExtra("SCORE",String.valueOf(Score));
                        goInput.putExtra("KUIS",Kuis);
                        KuisActivity.this.startActivities(new Intent[]{goInput});
                        finishAffinity();
                    }
                }
            }
        });
    }

    @Override
    public void onBackPressed()
    {
        if (mBackPressed + TIME_INTERVAL > System.currentTimeMillis())
        {
            Intent intent = new Intent(KuisActivity.this,HomeActivity.class);
            startActivity(intent);
            finish();
            return;
        }
        else { Toast.makeText(getBaseContext(), "ketuk 2 kali bila ingin kembali ke Home", Toast.LENGTH_SHORT).show(); }

        mBackPressed = System.currentTimeMillis();
    }
}
