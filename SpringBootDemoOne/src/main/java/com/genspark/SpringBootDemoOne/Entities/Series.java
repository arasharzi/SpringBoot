package com.genspark.SpringBootDemoOne.Entities;

import javax.persistence.*;


@Entity
@Table(name = "tbl_series")
public class Series
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String title;
    private String year;
    private int episodes;
    private double rating;


    public Series()
    {

    }

    public Series(String title, String year, int episodes, double rating)
    {
        this.title = title;
        this.year = year;
        this.episodes = episodes;
        this.rating = rating;
    }

    public int getId()
    {
        return id;
    }
    public void setId(int id)
    {
        this.id = id;
    }

    public String getTitle()
    {
        return title;
    }
    public void setTitle(String title)
    {
        this.title = title;
    }

    public String getYear()
    {
        return year;
    }
    public void setYear(String year)
    {
        this.year = year;
    }

    public int getEpisodes()
    {
        return episodes;
    }
    public void setEpisodes(int episodes)
    {
        this.episodes = episodes;
    }

    public double getRating()
    {
        return rating;
    }
    public void setRating(double rating)
    {
        this.rating = rating;
    }
}
