package com.genspark.SpringBootDemoTwo.Repository;

import com.genspark.SpringBootDemoTwo.Entities.URLRecord;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface URLRecordDAO extends JpaRepository<URLRecord, Integer>
{

}
