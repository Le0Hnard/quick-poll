package com.demo.quickpoll.repository;

import com.demo.quickpoll.domain.Option;
import org.springframework.data.repository.CrudRepository;

public interface OptionRepository extends CrudRepository<Option, Long> {
}
