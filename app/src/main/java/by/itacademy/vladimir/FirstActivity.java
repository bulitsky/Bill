package by.itacademy.vladimir;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class FirstActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

       final TextView text1 = findViewById(R.id.textView1);

       final TextView text2 = findViewById(R.id.textView2);

        text1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String text1Temp = text1.getText().toString();
                String text2Temp = text2.getText().toString();

                text1.setText(text2Temp);
                text2.setText(text1Temp);
            }
        });

    }
}
