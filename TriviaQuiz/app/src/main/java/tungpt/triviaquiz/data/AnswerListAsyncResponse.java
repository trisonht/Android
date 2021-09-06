package tungpt.triviaquiz.data;

import java.util.ArrayList;

import tungpt.triviaquiz.model.Question;

public interface AnswerListAsyncResponse {
    void processFinished(ArrayList<Question> questionArrayList);
}
