package top.umeh.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import top.umeh.mapper.StatisticsMapper;
import top.umeh.proj.Statistics;
import top.umeh.service.StatisticsService;

import java.util.List;

public class StatisticsServiceImpl implements StatisticsService {

    @Autowired
    private StatisticsMapper statisticsMapper;
    @Override
    public List<Statistics> getAll () {
        return statisticsMapper.getAll ();
    }
}
