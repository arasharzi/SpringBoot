package com.genspark.SpringBootDemoOne.Controllers;

import com.genspark.SpringBootDemoOne.Entities.Series;
import com.genspark.SpringBootDemoOne.Services.SeriesServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class Controller
{
    @Autowired
    private SeriesServiceInterface series;

    @GetMapping("/")
    public String homePage()
    {
        return "<html><h1>Demo Application One<h1><html>";
    }

    @GetMapping("/series")
    public List<Series> getAllSeries()
    {
        return this.series.getSeries();
    }

    @GetMapping("/series/{id}")
    public Series getSeries(@PathVariable String id)
    {
        return this.series.getSeriesById(Integer.parseInt(id));
    }

    @PostMapping("/series")
    public Series addSeries(@RequestBody Series series)
    {
        return this.series.addSeries(series);
    }

    @PutMapping("/series")
    public Series updateSeries(@RequestBody Series series)
    {
        return this.series.updateSeries(series);
    }

    @DeleteMapping("/series/{id}")
    public String deleteSeries(@PathVariable String id)
    {
        return this.series.deleteSeriesById(Integer.parseInt(id));
    }
}
