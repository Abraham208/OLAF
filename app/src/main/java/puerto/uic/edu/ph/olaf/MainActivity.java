package puerto.uic.edu.ph.olaf;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    LinearLayout l_p,l_s;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        l_p = findViewById(R.id.btn_p);
        l_s = findViewById(R.id.btn_s);

        l_p.setOnClickListener(this);
        l_s.setOnClickListener(this);

    }
    @Override
    public void onClick(View arg0) {
        switch (arg0.getId()) {
            case R.id.btn_p:
                Intent myIntent = new Intent(this, post.class);
                startActivity(myIntent);
                break;
            case R.id.btn_s:
                Intent myIntent2 = new Intent(this, search.class);
                startActivity(myIntent2);
                break;
    }}

}
