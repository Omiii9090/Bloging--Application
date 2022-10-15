package com.cdac.blogapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;



import com.cdac.blogapp.entities.Comment;
public interface CommentRepo  extends JpaRepository<Comment	, Integer> {

}
