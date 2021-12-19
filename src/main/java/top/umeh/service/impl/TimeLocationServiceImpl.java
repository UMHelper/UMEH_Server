package top.umeh.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import top.umeh.mapper.TimeLocationMapper;
import top.umeh.proj.TimeLocation;
import top.umeh.service.TimeLocationService;

import java.util.List;

/**
 * @author Box
 */
public class TimeLocationServiceImpl implements TimeLocationService {

    @Autowired
    private TimeLocationMapper timeLocationMapper;

    @Override
    public List<TimeLocation> getAll () {
        return timeLocationMapper.getAll ();
    }

    @Override
    public TimeLocation getById (Long id) {
        return timeLocationMapper.getById (id);
    }

    @Override
    public List<TimeLocation> getByDate (String date) {
        return timeLocationMapper.getByDate (date);
    }

    @Override
    public List<TimeLocation> getByTime (String time) {
        return timeLocationMapper.getByTime (time);
    }

    @Override
    public List<TimeLocation> getByLocation (String location) {
        return timeLocationMapper.getByLocation (location);
    }

    @Override
    public TimeLocation getByDateTimeLocation (String date, String time, String location) {
        return timeLocationMapper.getByDateTimeLocation (date, time, location);
    }

    @Override
    public void insert (TimeLocation timeLocation) {
        timeLocationMapper.insert (timeLocation);
    }

    @Override
    public void update (TimeLocation timeLocation) {
        timeLocationMapper.update (timeLocation);
    }

    @Override
    public void delete (TimeLocation timeLocation) {
        timeLocationMapper.delete (timeLocation);
    }

    @Override
    public void delete (Long id) {
        timeLocationMapper.delete (id);
    }
}
