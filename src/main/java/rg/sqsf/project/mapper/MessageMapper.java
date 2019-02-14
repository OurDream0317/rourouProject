package rg.sqsf.project.mapper;

import rg.sqsf.project.model.Message;

public interface MessageMapper {
    int deleteByPrimaryKey(Integer msgid);

    int insert(Message record);

    int insertSelective(Message record);

    Message selectByPrimaryKey(Integer msgid);

    int updateByPrimaryKeySelective(Message record);

    int updateByPrimaryKey(Message record);
}