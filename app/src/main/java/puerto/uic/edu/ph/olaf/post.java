package puerto.uic.edu.ph.olaf;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class post extends Activity implements View.OnClickListener {

    LinearLayout l_h,l_s;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.post);

        l_h = findViewById(R.id.btn_h);
        l_s = findViewById(R.id.btn_s);

        l_h.setOnClickListener(this);
        l_s.setOnClickListener(this);
    }

    @Override
    public void onClick(View arg0) {switch (arg0.getId()) {
        case R.id.btn_h:
            Intent myIntent = new Intent(this, MainActivity.class);
            startActivity(myIntent);
            break;
        case R.id.btn_s:
            Intent myIntent2 = new Intent(this, search.class);
            startActivity(myIntent2);
            break;
    }}
}
