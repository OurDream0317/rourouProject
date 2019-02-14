package rg.sqsf.project.mapper;

import org.apache.ibatis.annotations.Mapper;
import rg.sqsf.project.model.Admin;

import java.util.List;
@Mapper
public interface AdminMapper {
    List<Admin> findAdmins();
    int deleteByPrimaryKey(Integer adminid);

    int insert(Admin record);

    int insertSelective(Admin record);

    Admin selectByPrimaryKey(Integer adminid);

    int updateByPrimaryKeySelective(Admin record);

    int updateByPrimaryKey(Admin record);
}