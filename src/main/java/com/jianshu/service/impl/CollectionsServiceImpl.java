package com.jianshu.service.impl;

import com.jianshu.dao.CollectionsMapper;
import com.jianshu.model.Collections;
import com.jianshu.service.CollectionsService;
import com.jianshu.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by taoranran on 2018/10/25.
 */
@Service
@Transactional
public class CollectionsServiceImpl extends AbstractService<Collections> implements CollectionsService {
    @Resource
    private CollectionsMapper collectionsMapper;

}
