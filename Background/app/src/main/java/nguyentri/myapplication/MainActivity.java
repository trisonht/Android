package nguyentri.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

import java.util.Random;

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

    public void hotFace(View view) {
        Log.i("Info", "HotFace changing");

        Integer numImg = generateRandomIntRange(0, 3);
        Log.i("Info random", numImg.toString());

        int[] images = new int[] {R.drawable.img1, R.drawable.img2, R.drawable.img3, R.drawable.img4};
        ImageView image = findViewById(R.id.img);
        image.setImageResource(images[numImg]);
    }

    public static int generateRandomIntRange(int min, int max) {
        Random r = new Random();
        return r.nextInt((max - min) + 1) + min;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}