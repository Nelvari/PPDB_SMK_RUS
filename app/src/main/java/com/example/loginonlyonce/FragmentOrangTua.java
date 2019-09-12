package com.example.loginonlyonce;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class FragmentOrangTua extends AppCompatActivity {

    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment_orang_tua);

        button = findViewById(R.id.btnSimpanOrangTua);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                DialogInterface.OnClickListener dialog = new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {

                        switch (i){
                            case DialogInterface.BUTTON_POSITIVE:
                                Toast.makeText(getApplicationContext(), "Sukses", Toast.LENGTH_LONG).show();
                                break;

                            case DialogInterface.BUTTON_NEGATIVE:
                                Toast.makeText(getApplicationContext(), "Gagal", Toast.LENGTH_LONG).show();
                                break;
                        }

                    }
                };

                AlertDialog.Builder builder = new AlertDialog.Builder(view.getContext());
                builder.setMessage("Apakah anda yakin ingin simpan data?").setPositiveButton("Ya", dialog)
                        .setNegativeButton("Tidak", dialog).show();


            }
        });

    }
}