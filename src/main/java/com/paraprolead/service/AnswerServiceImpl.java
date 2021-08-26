package com.paraprolead.service;


import com.paraprolead.model.Answer;
import com.paraprolead.repos.AnswerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AnswerServiceImpl implements AnswerService{

    @Autowired
    AnswerRepository aRepo;


    @Override
    public Answer getAnswerById(Long aid) {
        return aRepo.getById(aid);
    }

    @Override
    public List<Answer> getAllAnswers() {
        return aRepo.findAll();
    }

    @Override
    public void deleteAnswer(Long aid) {
        aRepo.deleteById(aid);
    }

    @Override
    public Answer createAnswer(Answer answer) {
        return aRepo.save(answer);
    }

    @Override
    public Answer updateAnswer(Answer answer) {
        return aRepo.save(answer);
    }
}
