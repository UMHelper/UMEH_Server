package top.umeh.mapper;

import org.apache.ibatis.annotations.*;
import top.umeh.proj.Statistics;

import java.util.List;

/**
 * @author Box
 */
@Mapper
public interface StatisticsMapper {

    @Select ("select * from statistics")
    public List<Statistics> getAll();

    @Insert ("insert into statistics(course, comment) VALUES (#{course}, #{comment})")
    public void insert(Statistics statistics);

    @Update ("update statistics set course=#{course}, comment=#{comment} where name=#{name}")
    public void update(Statistics statistics);

    @Delete ("delete from statistics where name=#{name}")
    public void delete(Statistics statistics);

    @Delete ("delete from statistics where name=#{name}")
    public void delete(String name);
}
