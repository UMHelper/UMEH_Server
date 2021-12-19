package top.umeh.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import top.umeh.mapper.ScheduleMapper;
import top.umeh.proj.Schedule;
import top.umeh.service.ScheduleService;

import java.util.List;

/**
 * @author Box
 */
public class ScheduleServiceImpl implements ScheduleService {

    @Autowired
    private ScheduleMapper scheduleMapper;

    @Override
    public Schedule getByID (Long id) {
        return scheduleMapper.getByID (id);
    }

    @Override
    public List<Schedule> getByTeach (Long teach) {
        return scheduleMapper.getByTeach (teach);
    }

    @Override
    public List<Schedule> getByLocation (Long timeLocation) {
        return scheduleMapper.getByLocation (timeLocation);
    }

    @Override
    public List<Schedule> getByTeachAndTimeLocation (Long teach, Long timeLocation) {
        return scheduleMapper.getByTeachAndTimeLocation (teach,timeLocation);
    }

    @Override
    public List<Schedule> getAll () {
        return scheduleMapper.getAll ();
    }

    @Override
    public void insert (Schedule schedule) {
        scheduleMapper.insert (schedule);
    }

    @Override
    public void update (Schedule schedule) {
        scheduleMapper.update (schedule);
    }

    @Override
    public void delete (Schedule schedule) {
        scheduleMapper.delete (schedule);
    }

    @Override
    public void delete (Long id) {
        scheduleMapper.delete (id);
    }
}
