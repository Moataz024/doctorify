package com.paraprolead.repos;

import com.paraprolead.model.Question;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface QuestionRepository extends JpaRepository<Question, Long> {

    List<Question> findAllByStatusContaining(String status);
    List<Question> findAllByStatus(String status);
    List<Question> findAllByTextContains(String text);
    List<Question> findAllByTextContaining(String text);
    List<Question> findAllByTextIsContainingAndStatus(String text,String Status);
    List<Question> findAllByTextOrderByCommentCountDesc(String Text);
    List<Question> findAllByStatusContainingAndOrderByCommentCountDesc(String Status);

}