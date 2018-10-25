package com.jianshu.service.impl;

import com.jianshu.dao.SysUserMapper;
import com.jianshu.model.SysUser;
import com.jianshu.service.SysUserService;
import com.jianshu.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by taoranran on 2018/10/25.
 */
@Service
@Transactional
public class SysUserServiceImpl extends AbstractService<SysUser> implements SysUserService {
    @Resource
    private SysUserMapper sysUserMapper;

}
