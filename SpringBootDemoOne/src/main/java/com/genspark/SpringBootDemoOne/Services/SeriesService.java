package com.genspark.SpringBootDemoOne.Services;

import com.genspark.SpringBootDemoOne.Entities.Series;
import com.genspark.SpringBootDemoOne.Repository.SeriesDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class SeriesService implements SeriesServiceInterface
{
    @Autowired
    private SeriesDAO seriesDao;

    public SeriesService()
    {}

    @Override
    public List<Series> getSeries()
    {
        return this.seriesDao.findAll();
    }

    @Override
    public Series getSeriesById(int id)
    {
        Optional<Series> s = this.seriesDao.findById(id);
        Series series = null;
        if (s.isPresent())
        {
            series = s.get();
        }
        return series;
    }

    @Override
    public Series addSeries(Series series)
    {
        return this.seriesDao.save(series);
    }

    @Override
    public Series updateSeries(Series series)
    {
        return this.seriesDao.save(series);
    }

    @Override
    public String deleteSeriesById(int id)
    {
        Optional<Series> s = this.seriesDao.findById(id);
        if (s.isPresent())
        {
            this.seriesDao.deleteById(id);
            return "Series removed.";
        }
        return "Series not found!";
    }
}
