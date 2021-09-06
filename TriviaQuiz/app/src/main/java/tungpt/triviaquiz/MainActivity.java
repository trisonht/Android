package tungpt.triviaquiz;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;
import android.util.Log;

import com.android.volley.Request;
import com.android.volley.toolbox.JsonArrayRequest;

import java.util.ArrayList;
import java.util.List;

import tungpt.triviaquiz.controller.AppController;
import tungpt.triviaquiz.data.Repository;
import tungpt.triviaquiz.databinding.ActivityMainBinding;
import tungpt.triviaquiz.model.Question;

public class MainActivity extends AppCompatActivity {
    String url = "https://raw.githubusercontent.com/curiousily/simple-quiz/master/script/statements-data.json";
    private ActivityMainBinding binding;
    private int currentQuestionIndex = 0;
    List<Question> questionList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        questionList = new  Repository().getQuestions(questionArrayList -> {
//            Log.d("Main", "onCreate" + questionArrayList);
            binding.questionTextview.setText(questionArrayList.get(currentQuestionIndex).getAnswer());
        });

        binding.buttonNext.setOnClickListener(view -> {
            currentQuestionIndex = (currentQuestionIndex + 1) % questionList.size();
            updateQuestion();
        });

        binding.buttonTrue.setOnClickListener(view -> {

        });

        binding.buttonFalse.setOnClickListener(view -> {

        });
    }

    private void updateQuestion(){
        String question = questionList.get(currentQuestionIndex).getAnswer();
        binding.questionTextview.setText(question);
    }

    private void checkAnswer(boolean userChoseCorrect){

    }

    private void updateCounter(ArrayList<Question> questionArrayList){

    }

    private void fadeAnimation(){

    }

    private void shakeAnimation(){

    }
}