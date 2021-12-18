package top.umeh.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import top.umeh.proj.TimeLocation;


import java.util.List;

/**
 * @author Box
 */
@Mapper
public interface TimeLocationMapper {

    @Select ("select * from time_location")
    public List<TimeLocation> getAll();

    @Select ("select * from time_location where id=#{id}")
    public TimeLocation getById(Long id);

    @Select ("select * from time_location where date=#{date}")
    public List<TimeLocation> getByDate(String date);

    @Select ("select * from time_location where time=#{time}")
    public List<TimeLocation> getByTime(String time);

    @Select ("select * from time_location where location=#{location}")
    public List<TimeLocation> getByLocation(String location);

    @Select ("select * from time_location where date=#{date} and time=#{time} and location=#{location}")
    public TimeLocation getByDateTimeLocation(String date, String time, String location);
}
