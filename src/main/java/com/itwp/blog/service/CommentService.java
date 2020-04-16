package com.itwp.blog.service;

import com.itwp.blog.entity.Comment;

import java.util.List;

/**
 * Created by Carl Wu on 2020/3/29 2:09
 */ 
public interface CommentService{

    List<Comment> listCommentByBlogId(Long blogId);

    Comment saveComment(Comment comment);
}
