package top.umeh.service;

import org.springframework.stereotype.Service;
import top.umeh.proj.Schedule;

import java.util.List;

@Service
public interface ScheduleService {

    public Schedule getByID(Long id);

    public List<Schedule> getByTeach(Long teach);

    public List<Schedule> getByLocation(Long timeLocation);

    public List<Schedule> getByTeachAndTimeLocation(Long teach, Long timeLocation);

    public List<Schedule> getAll();

    public void insert(Schedule schedule);

    public void update(Schedule schedule);

    public void delete(Schedule schedule);

}
