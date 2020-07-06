package gaurav.thermometercricket;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    EditText etid;
    Button btn, morebtn;
    TextView tv2;
    DecimalFormat format;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    etid=findViewById(R.id.etid);
    morebtn=findViewById(R.id.morebtn);
    btn=findViewById(R.id.btn);
    tv2=findViewById(R.id.tv2);
    format=new DecimalFormat("#0.00");

    morebtn.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intent=new Intent(MainActivity.this,gaurav.thermometercricket.Activity2.class );
            startActivity(intent);
        }
    });

    btn.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            if (etid.getText().toString().isEmpty()){
                Toast.makeText(MainActivity.this, "Please fill all fields.", Toast.LENGTH_SHORT).show();
            }
            else {
                int chirp=Integer.parseInt(etid.getText().toString().trim());
                double temp=(chirp/3.0)+4;
                Toast.makeText(MainActivity.this, "Success", Toast.LENGTH_SHORT).show();
                String r="The approximate temperature outside is "+format.format(temp)+" degree Celcius.";
                tv2.setText(r);
            }
        }
    });
    }

}
