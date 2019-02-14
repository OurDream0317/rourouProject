package rg.sqsf.project.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import rg.sqsf.project.mapper.AdminMapper;
import rg.sqsf.project.model.Admin;
import rg.sqsf.project.service.impl.AdminServiceImpl;

import java.util.List;
@Service
public class AdminService implements AdminServiceImpl {
    @Autowired
    private AdminMapper adminMapper;
    @Override
    public List<Admin> findAdmins() {
        return adminMapper.findAdmins();
    }
}
