package top.umeh.mapper;

import org.apache.ibatis.annotations.*;
import top.umeh.proj.Schedule;

import java.util.List;

/**
 * @author Box
 */
@Mapper
public interface ScheduleMapper {

    @Select ("select * from schedule where id=#{id}")
    public Schedule getByID(Long id);

    @Select ("select * from schedule where teach=#{teach}")
    public List<Schedule> getByTeach(Long teach);

    @Select ("select * from schedule where time_location=#{timeLocation}")
    public List<Schedule> getByLocation(Long timeLocation);

    @Select ("select * from schedule where teach=#{teach} and time_location=#{timeLocation}")
    public List<Schedule> getByTeachAndTimeLocation(Long teach, Long timeLocation);

    @Select ("select * from schedule")
    public List<Schedule> getAll();

    @Insert ("insert into schedule(teach, time_location) VALUES (#{teach}, #{timeLocation})")
    public void insert(Schedule schedule);

    @Update ("update schedule set teach=#{teach}, time_location=#{timeLocation} where id=#{id}")
    public void update(Schedule schedule);

    @Delete ("delete from schedule where id=#{id}")
    public void delete(Schedule schedule);

}
