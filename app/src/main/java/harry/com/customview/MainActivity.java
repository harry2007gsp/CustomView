package harry.com.customview;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView text1 = (TextView) findViewById(R.id.text1);
        harry.com.customview.MyText text2 = (harry.com.customview.MyText) findViewById(R.id.text2);
        text1.setText("text1");
        text2.setText("text2");
        text1.setTextColor(Color.GREEN);
        text2.setTextColor(Color.BLUE);
    }


}
