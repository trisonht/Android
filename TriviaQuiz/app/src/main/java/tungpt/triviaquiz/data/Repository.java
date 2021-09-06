package tungpt.triviaquiz.data;

import android.util.Log;

import com.android.volley.Request;
import com.android.volley.toolbox.JsonArrayRequest;

import org.json.JSONException;

import java.util.ArrayList;
import java.util.List;

import tungpt.triviaquiz.controller.AppController;
import tungpt.triviaquiz.model.Question;

public class Repository {
    ArrayList<Question> questionArrayList = new ArrayList<>();
    String url = "https://raw.githubusercontent.com/curiousily/simple-quiz/master/script/statements-data.json";

    public List<Question> getQuestions(final AnswerListAsyncResponse callBack){
        JsonArrayRequest jsonArrayRequest = new JsonArrayRequest(Request.Method.GET, url,
                null, response -> {
            for (int i = 0; i < response.length(); i++) {
                try {
                    Question question = new Question(response.getJSONArray(i).get(0).toString(), response.getJSONArray(i).getBoolean(1));
                    questionArrayList.add(question);
//                    Log.d("Trivia Repository", "getQuestions:[" + i +"] " + question);
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
            if (null != callBack) callBack.processFinished(questionArrayList);
        }, error -> {});
        AppController.getInstance().addToRequestQueue(jsonArrayRequest);
        return questionArrayList;
    }
}
