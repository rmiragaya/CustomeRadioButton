package com.example.customradiobuttonscroll;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    RadioGroup radioGroup;
    RadioButton radioButton;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        radioGroup = findViewById(R.id.radioGroup);
        button = findViewById(R.id.buttonID);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(v.getContext(), getCategory() + " Seleccionado", Toast.LENGTH_SHORT).show();
            }
        });
    }

    private String getCategory(){

        int radioId = radioGroup.getCheckedRadioButtonId();
        radioButton = findViewById(radioId);

        String categoria;
        switch (radioButton.getText().toString().toLowerCase()){

            case "accesorios vehiculos":
                categoria = "MLA5725";
                break;
            case "animales":
                categoria = "MLA1071";
                break;
            case "antiguedades":
                categoria = "MLA1367";
                break;
            case "artesanias":
                categoria = "MLA1368";
                break;
            case "automotores":
                categoria = "MLA1743";
                break;
            case "bebés":
                categoria = "MLA1384";
                break;
            case "celulares":
                categoria = "MLA1051";
                break;
            case "hobbies":
                categoria = "MLA1798";
                break;
            case "computación":
                categoria = "MLA1648";
                break;
            case "video juegos":
                categoria = "MLA1144";
                break;
            case "cámaras":
                categoria = "MLA1039";
                break;
            case "delicatessen":
                categoria = "MLA1403";
                break;
            case "deportes":
                categoria = "MLA1276";
                break;
            case "electrodomésticos":
                categoria = "MLA5726";
                break;
            case "electrónica":
                categoria = "MLA1000";
                break;
            case "eventos":
                categoria = "MLA2547";
                break;
            case "hogar y jardin":
                categoria = "MLA1574";
                break;
            case "industrias":
                categoria = "MLA1499";
                break;
            case "inmuebles":
                categoria = "MLA1459";
                break;
                default:
                    categoria = "";

        }

        return categoria;

    }
}
