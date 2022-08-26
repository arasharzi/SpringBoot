package com.genspark.SpringBootDemoTwo.Services;

import com.genspark.SpringBootDemoTwo.Entities.URLRecord;
import com.genspark.SpringBootDemoTwo.Repository.URLRecordDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class URLRecordmpl implements URLRecordService
{
    @Autowired
    private URLRecordDAO recordDAO;

    @Override
    public List<URLRecord> getRecords()
    {
        return this.recordDAO.findAll();
    }

    @Override
    public URLRecord getRecordById(int id)
    {
        Optional<URLRecord> r = this.recordDAO.findById(id);
        URLRecord record = null;
        if (r.isPresent())
        {
            record = r.get();
        }
        return record;
    }

    @Override
    public URLRecord addRecord(URLRecord record)
    {
        return this.recordDAO.save(record);
    }

    @Override
    public URLRecord updateRecord(URLRecord record)
    {
        return this.recordDAO.save(record);
    }

    @Override
    public String deleteRecordById(int id)
    {
        Optional<URLRecord> r = this.recordDAO.findById(id);
        if (r.isPresent())
        {
            this.recordDAO.deleteById(id);
            return "Record removed.";
        }
        return "Record not found.";
    }
}
