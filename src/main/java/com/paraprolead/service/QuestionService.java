package com.paraprolead.service;

import com.paraprolead.model.Question;
import com.paraprolead.model.User;

import java.util.List;

public interface QuestionService {

    Question getQuestionById(Long qid);
    List<Question> getAllQuestions();
    void deleteQuestion(Long qid);
    Question createQuestion(Question question);
    Question updateQuestion(Question question);

}
