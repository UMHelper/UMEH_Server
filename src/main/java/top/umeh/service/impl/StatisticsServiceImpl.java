package top.umeh.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import top.umeh.mapper.StatisticsMapper;
import top.umeh.proj.Statistics;
import top.umeh.service.StatisticsService;

import java.util.List;

/**
 * @author Box
 */
public class StatisticsServiceImpl implements StatisticsService {

    @Autowired
    private StatisticsMapper statisticsMapper;
    @Override
    public List<Statistics> getAll () {
        return statisticsMapper.getAll ();
    }

    @Override
    public void insert (Statistics statistics) {
        statisticsMapper.insert (statistics);
    }

    @Override
    public void update (Statistics statistics) {
        statisticsMapper.update (statistics);
    }

    @Override
    public void delete (Statistics statistics) {
        statisticsMapper.delete (statistics);
    }

}
