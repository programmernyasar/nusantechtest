package co.nusantech.nusantechtest;

import androidx.appcompat.app.AppCompatActivity;

import android.media.tv.TvContentRating;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private TextView tv_hasil;
    private EditText edt_input1;
    private EditText edt_input2;
    private EditText edt_input3;
    private CheckBox cb_input1;
    private CheckBox cb_input2;
    private CheckBox cb_input3;
    private Button btn_plus;
    private Button btn_min;
    private Button btn_kali;
    private Button btn_bagi;
    private double input1=0;
    private double input2=0;
    private double input3=0;
    private double hasil;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initComponent();
        onClick();
    }

    private void initComponent(){
        tv_hasil=findViewById(R.id.tv_hasil);
        edt_input1=findViewById(R.id.edt_input1);
        edt_input2=findViewById(R.id.edt_input2);
        edt_input3=findViewById(R.id.edt_input3);
        cb_input1=findViewById(R.id.checkbox_input1);
        cb_input2=findViewById(R.id.checkbox_input2);
        cb_input3=findViewById(R.id.checkbox_input3);
        btn_plus=findViewById(R.id.btn_plus);
        btn_min=findViewById(R.id.btn_min);
        btn_kali=findViewById(R.id.btn_kali);
        btn_bagi=findViewById(R.id.btn_bagi);
    }

    private void onClick(){

        btn_plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(cb_input1.isChecked()&&!cb_input2.isChecked()&&!cb_input3.isChecked()){

                    Toast.makeText(getApplicationContext(),"Maaf Anda Hanya Menceklis 1 Inputan",Toast.LENGTH_SHORT).show();

                }else if(!cb_input1.isChecked()&&cb_input2.isChecked()&&!cb_input3.isChecked()){

                    Toast.makeText(getApplicationContext(),"Maaf Anda Hanya Menceklis 1 Inputan", Toast.LENGTH_SHORT).show();

                }else if(!cb_input1.isChecked()&&!cb_input2.isChecked()&&cb_input3.isChecked()){

                    Toast.makeText(getApplicationContext(),"Maaf Anda Hanya Menceklis 1 Inputan",Toast.LENGTH_SHORT).show();

                }else if(cb_input1.isChecked()&&cb_input2.isChecked()&&cb_input3.isChecked()){
                    input1=Double.parseDouble(edt_input1.getText().toString());
                    input2=Double.parseDouble(edt_input2.getText().toString());
                    input3=Double.parseDouble(edt_input3.getText().toString());
                    hasil=input1+input2+input3;
                    tv_hasil.setText(String.valueOf(hasil));

                }else if(cb_input1.isChecked()&&cb_input2.isChecked()&&!cb_input3.isChecked()){
                    input1=Double.parseDouble(edt_input1.getText().toString());
                    input2=Double.parseDouble(edt_input2.getText().toString());
                    hasil=input1+input2;
                    tv_hasil.setText(String.valueOf(hasil));

                }else if(cb_input1.isChecked()&&!cb_input2.isChecked()&&cb_input3.isChecked()){
                    input1=Double.parseDouble(edt_input1.getText().toString());
                    input3=Double.parseDouble(edt_input3.getText().toString());
                    hasil=input1+input3;
                    tv_hasil.setText(String.valueOf(hasil));

                }else if(!cb_input1.isChecked()&&!cb_input2.isChecked()&&cb_input3.isChecked()){
                    input2=Double.parseDouble(edt_input2.getText().toString());
                    input3=Double.parseDouble(edt_input3.getText().toString());
                    hasil=input2+input3;
                    tv_hasil.setText(String.valueOf(hasil));
                }
            }
        });

        btn_min.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(cb_input1.isChecked()&&!cb_input2.isChecked()&&!cb_input3.isChecked()){

                    Toast.makeText(getApplicationContext(),"Maaf Anda Hanya Menceklis 1 Inputan",Toast.LENGTH_SHORT).show();

                }else if(!cb_input1.isChecked()&&cb_input2.isChecked()&&!cb_input3.isChecked()){

                    Toast.makeText(getApplicationContext(),"Maaf Anda Hanya Menceklis 1 Inputan", Toast.LENGTH_SHORT).show();

                }else if(!cb_input1.isChecked()&&!cb_input2.isChecked()&&cb_input3.isChecked()){

                    Toast.makeText(getApplicationContext(),"Maaf Anda Hanya Menceklis 1 Inputan",Toast.LENGTH_SHORT).show();

                }else if(cb_input1.isChecked()&&cb_input2.isChecked()&&cb_input3.isChecked()){
                    input1=Double.parseDouble(edt_input1.getText().toString());
                    input2=Double.parseDouble(edt_input2.getText().toString());
                    input3=Double.parseDouble(edt_input3.getText().toString());
                    hasil=input1-input2-input3;
                    tv_hasil.setText(String.valueOf(hasil));

                }else if(cb_input1.isChecked()&&cb_input2.isChecked()&&!cb_input3.isChecked()){
                    input1=Double.parseDouble(edt_input1.getText().toString());
                    input2=Double.parseDouble(edt_input2.getText().toString());
                    hasil=input1-input2;
                    tv_hasil.setText(String.valueOf(hasil));

                }else if(cb_input1.isChecked()&&!cb_input2.isChecked()&&cb_input3.isChecked()){
                    input1=Double.parseDouble(edt_input1.getText().toString());
                    input3=Double.parseDouble(edt_input3.getText().toString());
                    hasil=input1-input3;
                    tv_hasil.setText(String.valueOf(hasil));

                }else if(!cb_input1.isChecked()&&!cb_input2.isChecked()&&cb_input3.isChecked()){
                    input2=Double.parseDouble(edt_input2.getText().toString());
                    input3=Double.parseDouble(edt_input3.getText().toString());
                    hasil=input2-input3;
                    tv_hasil.setText(String.valueOf(hasil));
                }
            }
        });

        btn_kali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(cb_input1.isChecked()&&!cb_input2.isChecked()&&!cb_input3.isChecked()){

                    Toast.makeText(getApplicationContext(),"Maaf Anda Hanya Menceklis 1 Inputan",Toast.LENGTH_SHORT).show();

                }else if(!cb_input1.isChecked()&&cb_input2.isChecked()&&!cb_input3.isChecked()){

                    Toast.makeText(getApplicationContext(),"Maaf Anda Hanya Menceklis 1 Inputan", Toast.LENGTH_SHORT).show();

                }else if(!cb_input1.isChecked()&&!cb_input2.isChecked()&&cb_input3.isChecked()){

                    Toast.makeText(getApplicationContext(),"Maaf Anda Hanya Menceklis 1 Inputan",Toast.LENGTH_SHORT).show();

                }else if(cb_input1.isChecked()&&cb_input2.isChecked()&&cb_input3.isChecked()){
                    input1=Double.parseDouble(edt_input1.getText().toString());
                    input2=Double.parseDouble(edt_input2.getText().toString());
                    input3=Double.parseDouble(edt_input3.getText().toString());
                    hasil=input1*input2*input3;
                    tv_hasil.setText(String.valueOf(hasil));

                }else if(cb_input1.isChecked()&&cb_input2.isChecked()&&!cb_input3.isChecked()){
                    input1=Double.parseDouble(edt_input1.getText().toString());
                    input2=Double.parseDouble(edt_input2.getText().toString());
                    hasil=input1*input2;
                    tv_hasil.setText(String.valueOf(hasil));

                }else if(cb_input1.isChecked()&&!cb_input2.isChecked()&&cb_input3.isChecked()){
                    input1=Double.parseDouble(edt_input1.getText().toString());
                    input3=Double.parseDouble(edt_input3.getText().toString());
                    hasil=input1*input3;
                    tv_hasil.setText(String.valueOf(hasil));

                }else if(!cb_input1.isChecked()&&!cb_input2.isChecked()&&cb_input3.isChecked()){
                    input2=Double.parseDouble(edt_input2.getText().toString());
                    input3=Double.parseDouble(edt_input3.getText().toString());
                    hasil=input2*input3;
                    tv_hasil.setText(String.valueOf(hasil));
                }
            }
        });

        btn_bagi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(cb_input1.isChecked()&&!cb_input2.isChecked()&&!cb_input3.isChecked()){

                    Toast.makeText(getApplicationContext(),"Maaf Anda Hanya Menceklis 1 Inputan",Toast.LENGTH_SHORT).show();

                }else if(!cb_input1.isChecked()&&cb_input2.isChecked()&&!cb_input3.isChecked()){

                    Toast.makeText(getApplicationContext(),"Maaf Anda Hanya Menceklis 1 Inputan", Toast.LENGTH_SHORT).show();

                }else if(!cb_input1.isChecked()&&!cb_input2.isChecked()&&cb_input3.isChecked()){

                    Toast.makeText(getApplicationContext(),"Maaf Anda Hanya Menceklis 1 Inputan",Toast.LENGTH_SHORT).show();

                }else if(cb_input1.isChecked()&&cb_input2.isChecked()&&cb_input3.isChecked()){
                    input1=Double.parseDouble(edt_input1.getText().toString());
                    input2=Double.parseDouble(edt_input2.getText().toString());
                    input3=Double.parseDouble(edt_input3.getText().toString());
                    hasil=input1/input2/input3;
                    tv_hasil.setText(String.valueOf(hasil));

                }else if(cb_input1.isChecked()&&cb_input2.isChecked()&&!cb_input3.isChecked()){
                    input1=Double.parseDouble(edt_input1.getText().toString());
                    input2=Double.parseDouble(edt_input2.getText().toString());
                    hasil=input1/input2;
                    tv_hasil.setText(String.valueOf(hasil));

                }else if(cb_input1.isChecked()&&!cb_input2.isChecked()&&cb_input3.isChecked()){
                    input1=Double.parseDouble(edt_input1.getText().toString());
                    input3=Double.parseDouble(edt_input3.getText().toString());
                    hasil=input1/input3;
                    tv_hasil.setText(String.valueOf(hasil));

                }else if(!cb_input1.isChecked()&&!cb_input2.isChecked()&&cb_input3.isChecked()){
                    input2=Double.parseDouble(edt_input2.getText().toString());
                    input3=Double.parseDouble(edt_input3.getText().toString());
                    hasil=input2/input3;
                    tv_hasil.setText(String.valueOf(hasil));
                }
            }
        });


    }



}