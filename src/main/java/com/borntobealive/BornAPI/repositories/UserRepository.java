package com.borntobealive.BornAPI.repositories;

import java.util.List;

import com.borntobealive.BornAPI.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Integer>{

    /*@Query("SELECT a FROM Answer a,Choice c, Question q WHERE a.choice.id=c.id and c.question.id=q.id and q.id= :id")
    public List<User> findByQuestion(@Param("id") int idQuestion);*/
}