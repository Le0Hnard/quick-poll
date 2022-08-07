package com.demo.quickpoll.repository;

import com.demo.quickpoll.domain.Vote;
import org.springframework.data.repository.CrudRepository;

public interface VoteRepository extends CrudRepository<Vote, Long> {
}
