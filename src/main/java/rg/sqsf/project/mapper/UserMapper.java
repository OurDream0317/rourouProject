package rg.sqsf.project.mapper;

import org.apache.ibatis.annotations.Mapper;
import rg.sqsf.project.model.User;

import java.util.List;
@Mapper
public interface UserMapper {
    List<User> findUsers();
    int deleteByPrimaryKey(Integer userid);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer userid);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}