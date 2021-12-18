package top.umeh.service;

import org.springframework.stereotype.Service;
import top.umeh.proj.TimeLocation;

import java.util.List;

@Service
public interface TimeLocationService {

    public List<TimeLocation> getAll();

    public TimeLocation getById(Long id);

    public List<TimeLocation> getByDate(String date);

    public List<TimeLocation> getByTime(String time);

    public List<TimeLocation> getByLocation(String location);

    public TimeLocation getByDateTimeLocation(String date, String time, String location);
}
