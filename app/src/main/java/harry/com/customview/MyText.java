package harry.com.customview;

import android.content.Context;
import android.graphics.Color;
import android.widget.TextView;

/**
 * Created by Harry on 8/23/15.
 */
public class MyText extends TextView {

    public MyText(Context context) {
        super(context);
    }


    @Override
    public void setTextColor(int color) {
        this.setTextColor(Color.RED);
//        super.setTextColor(color);
    }
}
