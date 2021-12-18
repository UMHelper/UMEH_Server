package top.umeh.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
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
}
