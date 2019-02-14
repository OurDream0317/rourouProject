package rg.sqsf.project.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import rg.sqsf.project.mapper.UserMapper;
import rg.sqsf.project.model.User;
import rg.sqsf.project.service.impl.UserServicempl;

import java.util.List;
@Service
public class UserService implements UserServicempl {
@Autowired
private UserMapper userMapper;
    @Override
    public List<User> findUsers() {
        return userMapper.findUsers();
    }
}
