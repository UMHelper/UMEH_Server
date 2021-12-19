package top.umeh.mapper;

import org.apache.ibatis.annotations.*;
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

    @Insert ("insert into time_location(date, time, location) VALUES (#{date}, #{time}, #{location})")
    public void insert(TimeLocation timeLocation);

    @Update ("update time_location set date=#{date}, time=#{time}, location=#{location} where id=#{id}")
    public void update(TimeLocation timeLocation);

    @Delete ("delete from time_location where id=#{id}")
    public void delete(TimeLocation timeLocation);

}
