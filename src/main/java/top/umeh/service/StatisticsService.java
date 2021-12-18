package top.umeh.service;

import org.springframework.stereotype.Service;
import top.umeh.proj.Statistics;

import java.util.List;

@Service
public interface StatisticsService {
    public List<Statistics> getAll();
}
