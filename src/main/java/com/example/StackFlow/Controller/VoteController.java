package com.example.StackFlow.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.StackFlow.Model.Vote;
import com.example.StackFlow.Service.VoteService;

@RestController
@RequestMapping("/api/votes")
public class VoteController {

    @Autowired
    private VoteService voteService;

    @PostMapping
    public ResponseEntity<Vote> castVote(@RequestBody Vote vote) {
        return ResponseEntity.ok(voteService.castVote(vote));
    }
}
