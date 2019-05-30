package puerto.uic.edu.ph.olaf;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class search extends Activity implements View.OnClickListener {

    LinearLayout l_h,l_p;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.search);

        l_h = findViewById(R.id.btn_h);
        l_p = findViewById(R.id.btn_p);

        l_h.setOnClickListener(this);
        l_p.setOnClickListener(this);
    }

    @Override
    public void onClick(View arg0) {switch (arg0.getId()) {
        case R.id.btn_h:
            Intent myIntent = new Intent(this, MainActivity.class);
            startActivity(myIntent);
            break;
        case R.id.btn_p:
            Intent myIntent2 = new Intent(this, post.class);
            startActivity(myIntent2);
            break;
    }}
}
