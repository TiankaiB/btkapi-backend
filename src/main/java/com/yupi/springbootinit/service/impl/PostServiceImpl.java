package com.yupi.springbootinit.service.impl;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yupi.springbootinit.common.ErrorCode;

import com.yupi.springbootinit.exception.BusinessException;

import com.yupi.springbootinit.mapper.PostMapper;

import com.yupi.springbootinit.model.entity.Post;

import com.yupi.springbootinit.service.PostService;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

@Service
public class PostServiceImpl extends ServiceImpl<PostMapper, Post> implements PostService {

    @Override
    public void validPost(Post post, boolean add) {
        if (post == null) {
            throw new BusinessException(ErrorCode.PARAMS_ERROR);
        }
        String content = post.getContent();
        // 创建时，所有参数必须非空
        if (add) {
            if (StringUtils.isAnyBlank(content)) {
                throw new BusinessException(ErrorCode.PARAMS_ERROR);
            }
        }
        if (StringUtils.isNotBlank(content) && content.length() > 8192) {
            throw new BusinessException(ErrorCode.PARAMS_ERROR, "内容过长");
        }

    }
}





