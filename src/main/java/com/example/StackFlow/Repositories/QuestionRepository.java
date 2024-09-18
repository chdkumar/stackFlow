package com.example.StackFlow.Repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.StackFlow.Model.Question;

import java.util.List;

public interface QuestionRepository extends JpaRepository<Question, Long> {
    @Query("SELECT q FROM Question q WHERE LOWER(q.title) LIKE LOWER(CONCAT('%', :keyword, '%')) OR LOWER(q.body) LIKE LOWER(CONCAT('%', :keyword, '%'))")
    List<Question> searchQuestions(String keyword);
}
