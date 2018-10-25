package com.jianshu.service.impl;

import com.jianshu.dao.CommentMapper;
import com.jianshu.model.Comment;
import com.jianshu.service.CommentService;
import com.jianshu.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by taoranran on 2018/10/25.
 */
@Service
@Transactional
public class CommentServiceImpl extends AbstractService<Comment> implements CommentService {
    @Resource
    private CommentMapper commentMapper;

}
