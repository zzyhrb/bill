package com.ry.bill.sys.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ry.bill.sys.mapper.UserMapper;
import com.ry.bill.sys.service.UserService;
import com.ry.bill.sys.domain.User;
import org.springframework.stereotype.Service;

/**
 * @author: zzy
 * @Date: $ $
 * @Description:
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {
}
