package com.example.StackFlow.Repositories;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.StackFlow.Model.Vote;

public interface VoteRepository extends JpaRepository<Vote, Long> {
}
