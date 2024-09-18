package com.example.StackFlow.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.StackFlow.Model.Answer;
import com.example.StackFlow.Service.AnswerService;

@RestController
@RequestMapping("/api/answers")
public class AnswerController {

    @Autowired
    private AnswerService answerService;

    @PostMapping
    public ResponseEntity<Answer> postAnswer(@RequestBody Answer answer) {
        return ResponseEntity.ok(answerService.postAnswer(answer));
    }
}
