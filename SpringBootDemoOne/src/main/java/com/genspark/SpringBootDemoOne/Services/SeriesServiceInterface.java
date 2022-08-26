package com.genspark.SpringBootDemoOne.Services;

import com.genspark.SpringBootDemoOne.Entities.Series;

import java.util.List;

public interface SeriesServiceInterface
{
    List<Series> getSeries();
    Series getSeriesById(int id);
    Series addSeries(Series series);
    Series updateSeries(Series series);
    String deleteSeriesById(int id);
}
