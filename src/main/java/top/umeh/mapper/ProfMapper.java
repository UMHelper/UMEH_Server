package top.umeh.mapper;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import top.umeh.proj.Prof;

import java.util.List;

/**
 * @author Box
 */
@Mapper
public interface ProfMapper {
    @Select ("select * from prof where name=#{name}")
    public Prof getByName(String name);

    @Select ("select * from prof")
    public List<Prof> getAll();

    @Insert ("insert into prof(name) values (#{name})")
    public void insert(Prof prof);

    @Delete ("delete from prof where name=#{name}")
    public void delete(Prof prof);

    @Delete ("delete from prof where name=#{name}")
    public void delete(String name);
}
