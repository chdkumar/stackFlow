package com.example.StackFlow.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.StackFlow.Model.Answer;
import com.example.StackFlow.Repositories.AnswerRepository;

@Service
public class AnswerService {

    @Autowired
    private AnswerRepository answerRepository;

    public Answer postAnswer(Answer answer) {
        return answerRepository.save(answer);
    }
}
