package com.paraprolead.service;


import com.paraprolead.model.Question;
import com.paraprolead.repos.QuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionServiceImpl implements QuestionService{


    @Autowired
    QuestionRepository qRepo;


    @Override
    public Question getQuestionById(Long qid) {
        return qRepo.getById(qid);
    }

    @Override
    public List<Question> getAllQuestions() {
        return qRepo.findAll();
    }

    @Override
    public void deleteQuestion(Long qid) {
        qRepo.deleteById(qid);
    }

    @Override
    public Question createQuestion(Question question) {
        return qRepo.save(question);
    }

    @Override
    public Question updateQuestion(Question question) {
        return qRepo.save(question);
    }
}
