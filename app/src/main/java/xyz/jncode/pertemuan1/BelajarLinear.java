package xyz.jncode.pertemuan1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class BelajarLinear extends AppCompatActivity {

    TextView tv_hasil_kurang;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_belajar_linear);
        tv_hasil_kurang = findViewById(R.id.tv_linear_kurang);

        tv_hasil_kurang.setText(Double.toString(kurangMethod(100,15.5)));






    }




    public Double kurangMethod(double var1, double var2 ){

        final double rumusKurang = var1 - var2;
        return rumusKurang;
    }
}
