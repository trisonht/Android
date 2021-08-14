package nguyentri.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    boolean isimg1 = true;
    public void changImg(View view) {
        Log.i("Info", "Change pressed");

        ImageView image = findViewById(R.id.img);
        if(isimg1) {
            image.setImageResource(R.drawable.img2);
            isimg1 = false;
        } else {
            image.setImageResource(R.drawable.img1);
            isimg1 = true;
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}