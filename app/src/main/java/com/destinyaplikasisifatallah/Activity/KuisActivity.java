package com.destinyaplikasisifatallah.Activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.destinyaplikasisifatallah.Model.Model;
import com.destinyaplikasisifatallah.Model.ModelKuis;
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
        final int no = Integer.parseInt(No);
        A = (Button)findViewById(R.id.btnA);
        B = (Button)findViewById(R.id.btnB);
        C = (Button)findViewById(R.id.btnC);
        D = (Button)findViewById(R.id.btnD);
        Soal = (TextView)findViewById(R.id.tvSoal);
        Tittle = (TextView)findViewById(R.id.tvTittle);
        pList.addAll(ModelKuis.getListData());
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
                        goInput.putExtra("SCORE",String.valueOf(Integer.parseInt(Score)+1));
                        startActivity(goInput);
                        finish();
                    }else{
                        Intent goInput = new Intent(KuisActivity.this, KuisActivity.class);
                        goInput.putExtra("NO",String.valueOf(no+1));
                        goInput.putExtra("SCORE",String.valueOf(Integer.parseInt(Score)+1));
                        KuisActivity.this.startActivities(new Intent[]{goInput});
                        finish();
                    }
                }else{
                    if (no >= pList.size()-1){
                        Intent goInput = new Intent(KuisActivity.this, ScoreActivity.class);
                        goInput.putExtra("SCORE",String.valueOf(Score));
                        startActivity(goInput);
                        finish();
                    }else{
                        Intent goInput = new Intent(KuisActivity.this, KuisActivity.class);
                        goInput.putExtra("NO",String.valueOf(no+1));
                        goInput.putExtra("SCORE",String.valueOf(Score));
                        KuisActivity.this.startActivities(new Intent[]{goInput});
                        finish();
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
                        goInput.putExtra("SCORE",String.valueOf(Integer.parseInt(Score)+1));
                        startActivity(goInput);
                        finish();
                    }else{
                        Intent goInput = new Intent(KuisActivity.this, KuisActivity.class);
                        goInput.putExtra("NO",String.valueOf(no+1));
                        goInput.putExtra("SCORE",String.valueOf(Integer.parseInt(Score)+1));
                        KuisActivity.this.startActivities(new Intent[]{goInput});
                        finish();
                    }
                }else{
                    if (no >= pList.size()-1){
                        Intent goInput = new Intent(KuisActivity.this, ScoreActivity.class);
                        goInput.putExtra("SCORE",String.valueOf(Score));
                        startActivity(goInput);
                        finish();
                    }else{
                        Intent goInput = new Intent(KuisActivity.this, KuisActivity.class);
                        goInput.putExtra("NO",String.valueOf(no+1));
                        goInput.putExtra("SCORE",String.valueOf(Score));
                        KuisActivity.this.startActivities(new Intent[]{goInput});
                        finish();
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
                        goInput.putExtra("SCORE",String.valueOf(Integer.parseInt(Score)+1));
                        startActivity(goInput);
                        finish();
                    }else{
                        Intent goInput = new Intent(KuisActivity.this, KuisActivity.class);
                        goInput.putExtra("NO",String.valueOf(no+1));
                        goInput.putExtra("SCORE",String.valueOf(Integer.parseInt(Score)+1));
                        KuisActivity.this.startActivities(new Intent[]{goInput});
                        finish();
                    }
                }else{
                    if (no >= pList.size()-1){
                        Intent goInput = new Intent(KuisActivity.this, ScoreActivity.class);
                        goInput.putExtra("SCORE",String.valueOf(Score));
                        startActivity(goInput);
                        finish();
                    }else{
                        Intent goInput = new Intent(KuisActivity.this, KuisActivity.class);
                        goInput.putExtra("NO",String.valueOf(no+1));
                        goInput.putExtra("SCORE",String.valueOf(Score));
                        KuisActivity.this.startActivities(new Intent[]{goInput});
                        finish();
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
                        goInput.putExtra("SCORE",String.valueOf(Integer.parseInt(Score)+1));
                        Toast.makeText(KuisActivity.this,Score,Toast.LENGTH_SHORT).show();
                        startActivity(goInput);
                        finish();
                    }else{
                        Intent goInput = new Intent(KuisActivity.this, KuisActivity.class);
                        goInput.putExtra("NO",String.valueOf(no+1));
                        goInput.putExtra("SCORE",String.valueOf(Integer.parseInt(Score)+1));
                        KuisActivity.this.startActivities(new Intent[]{goInput});
                        finish();
                    }
                }else{
                    if (no >= pList.size()-1){
                        Intent goInput = new Intent(KuisActivity.this, ScoreActivity.class);
                        goInput.putExtra("SCORE",String.valueOf(Score));
                        startActivity(goInput);
                        finish();
                    }else{
                        Intent goInput = new Intent(KuisActivity.this, KuisActivity.class);
                        goInput.putExtra("NO",String.valueOf(no+1));
                        goInput.putExtra("SCORE",String.valueOf(Score));
                        KuisActivity.this.startActivities(new Intent[]{goInput});
                        finish();
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
