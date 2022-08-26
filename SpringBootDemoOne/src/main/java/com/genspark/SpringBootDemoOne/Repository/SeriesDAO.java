package com.genspark.SpringBootDemoOne.Repository;

import com.genspark.SpringBootDemoOne.Entities.Series;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SeriesDAO extends JpaRepository<Series, Integer>
{

}
