package com.example.springBootTutorial.repository;

import org.springframework.data.repository.CrudRepository;
import com.example.springBootTutorial.entity.articleEntity;

public interface articleRepository extends CrudRepository<articleEntity, Long> {

}
