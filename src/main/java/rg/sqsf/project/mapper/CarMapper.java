package rg.sqsf.project.mapper;

import org.apache.ibatis.annotations.Mapper;
import rg.sqsf.project.model.Car;

import java.util.List;
@Mapper
public interface CarMapper {
    List<Car> findCars();
    int deleteByPrimaryKey(Integer id);

    int insert(Car record);

    int insertSelective(Car record);

    Car selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Car record);

    int updateByPrimaryKey(Car record);
}