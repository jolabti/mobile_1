package xyz.jncode.pertemuan1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tvHitung, tv_hasil_persegi, tv_hasil_lingkaran, tv_hasil_tambah, tv_hasil_kali;

    double phi = 3.14;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvHitung = findViewById(R.id.tv_hasil_segitiga);
        tv_hasil_persegi = findViewById(R.id.tv_hasil_persegi);
        tv_hasil_lingkaran = findViewById(R.id.tv_hasil_lingkaran);
        tv_hasil_tambah = findViewById(R.id.tv_hasil_tambah);
        tv_hasil_kali = findViewById(R.id.tv_hasil_kali);
        System.out.println("hasil kurang =" + Double.toString(kurangMethod(10.5,5.5)));
        System.out.println("hasil tambah =" + Double.toString(tambahMethod(10.5,5.5)));
        System.out.println("hasil bagi =" + Double.toString(bagiMethod(10.5,5.5)));
        System.out.println("hasil kali =" + Double.toString(kaliMethod(10.5,5.5)));
        System.out.println("hasil segitiga = " + Double.toString(segitigaMethod(10,5.5)));
        System.out.println("hasil lingkaran = " + Double.toString(lingkaranMethod(5.5)));
        System.out.println("hasil persegi = " + Double.toString(persegiMethod(10.5)));
        if (kaliMethod(20.3,10)<50){
            System.out.println(kaliMethod(20.3,10)+ "kesimpulan kurang dari 50");
        }
        else{

            System.out.println(kaliMethod(20.3,10)+ "kesimpulan lebih dari 50");

        }

        tvHitung.setText(Double.toString(segitigaMethod(10,5.5)));
        tv_hasil_lingkaran.setText(Double.toString(lingkaranMethod(5.5)));
        tv_hasil_persegi.setText(Double.toString(persegiMethod(5.5)));
        tv_hasil_tambah.setText(Double.toString(tambahMethod(5.5,10)));
        tv_hasil_kali.setText(Double.toString(kaliMethod(5.5,10)));

    }

    public Double kurangMethod(double var1, double var2 ){

        final double rumusKurang = var1 - var2;
        return rumusKurang;
    }

    public Double tambahMethod(double var1, double var2 ){

        final double rumusTambah = var1 + var2;
        return rumusTambah;
    }

    public Double bagiMethod(double var1, double var2 ){

        final double rumusBagi = var1 / var2;
        return rumusBagi;
    }

    public Double kaliMethod(double var1, double var2 ){

        final double rumusKali = var1 * var2;
        return rumusKali;
    }

    public Double segitigaMethod(double alas, double tinggi ){
        final double rumusSegitiga = alas * tinggi / 2;
        return rumusSegitiga;
    }

    public Double lingkaranMethod(double r){
        final double rumusLingkaran = phi * r * r;
        return rumusLingkaran;
    }

    public Double persegiMethod(double sisi){
        final double rumusPersegi = sisi * sisi;
        return rumusPersegi;
    }
}
