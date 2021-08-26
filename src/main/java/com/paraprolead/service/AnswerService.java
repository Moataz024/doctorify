package com.paraprolead.service;



import com.paraprolead.model.Answer;

import java.util.List;

public interface AnswerService {
    Answer getAnswerById(Long aid);
    List<Answer> getAllAnswers();
    void deleteAnswer(Long aid);
    Answer createAnswer(Answer answer);
    Answer updateAnswer(Answer answer);
}
