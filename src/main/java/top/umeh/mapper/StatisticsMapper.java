package top.umeh.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import top.umeh.proj.Statistics;

import java.util.List;

/**
 * @author Box
 */
@Mapper
public interface StatisticsMapper {

    @Select ("select * from statistics")
    public List<Statistics> getAll();
}
