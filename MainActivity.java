package ga.asfanulla.designx;

import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.button.MaterialButton;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    MaterialButton add;

    LinearLayout inc;

    TextView t1, t2, t3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.add_button);

       add = findViewById(R.id.add);
       inc = findViewById(R.id.inc);
       t1 = findViewById(R.id.t1);
       t2 = findViewById(R.id.t2);
       t3 = findViewById(R.id.t3);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(add.getText().toString().equals("Add")){
                    add.setVisibility(View.GONE);
                    inc.setVisibility(View.VISIBLE);
                } else {
                    inc.setVisibility(View.GONE);
                    add.setVisibility(View.VISIBLE);
                }
            }
        });

        t1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                inc(false);
            }
        });

        t3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                inc(true);
            }
        });
    }

    private void inc(Boolean x){
        int y = Integer.parseInt(t2.getText().toString());
        if(x){
           y++;
           t2.setText(String.valueOf(y));
        }else {
            y--;
            if(y == 0){
                inc.setVisibility(View.GONE);
                add.setVisibility(View.VISIBLE);
            }else {
                t2.setText(String.valueOf(y));
            }
        }

        Toast.makeText(this, t2.getText(), Toast.LENGTH_SHORT).show();

    }
}
