package com.example.quiz.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.quiz.entity.Quiz;

/** Quizテーブル：RepositoryImpl */
public interface QuizRepository extends CrudRepository<Quiz, Integer>{
		
	}

