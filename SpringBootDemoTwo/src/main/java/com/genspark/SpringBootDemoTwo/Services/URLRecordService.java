package com.genspark.SpringBootDemoTwo.Services;

import java.util.List;
import com.genspark.SpringBootDemoTwo.Entities.URLRecord;

public interface URLRecordService
{
    List<URLRecord> getRecords();
    URLRecord getRecordById(int id);
    URLRecord addRecord(URLRecord URLRecord);
    URLRecord updateRecord(URLRecord URLRecord);
    String deleteRecordById(int id);
}
