package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import java.util.Scanner;

public class MainActivity extends AppCompatActivity {
    Scanner scan = new Scanner(System.in);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        double KoeffC = scan.nextInt();
        double KoeffA = scan.nextInt();
        double KoeffB = scan.nextInt();
        double Answer1;
        double Answer2;
        if(KoeffB*KoeffB < KoeffA*KoeffC*4) {
            System.out.println("Error");
        }else{ Answer1 = -KoeffB/KoeffA/2;
            System.out.println(KoeffB);
        }else{ Answer1 = KoeffB*KoeffB - (KoeffA*KoeffC*4)
        };


    }
}
