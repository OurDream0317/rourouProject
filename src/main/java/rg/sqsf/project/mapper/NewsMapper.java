package rg.sqsf.project.mapper;

import org.apache.ibatis.annotations.Mapper;
import rg.sqsf.project.model.News;

import java.util.List;
@Mapper
public interface NewsMapper {
    List<News> findNews();
    int deleteByPrimaryKey(Integer newid);

    int insert(News record);

    int insertSelective(News record);

    News selectByPrimaryKey(Integer newid);

    int updateByPrimaryKeySelective(News record);

    int updateByPrimaryKey(News record);
}