package com.genspark.SpringBootDemoTwo.Controllers;


import com.genspark.SpringBootDemoTwo.Entities.URLRecord;
import com.genspark.SpringBootDemoTwo.Services.URLRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class Controller
{
    @Autowired
    private URLRecordService record;

    @GetMapping("/")
    public String homePage()
    {
        return "<html><h1>Demo Application Two<h1><html>";
    }

    @GetMapping("/records")
    public List<URLRecord> getAllRecords()
    {
        return this.record.getRecords();
    }

    @GetMapping("/records/{id}")
    public URLRecord getRecord(@PathVariable String id)
    {
        return this.record.getRecordById(Integer.parseInt(id));
    }

    @PostMapping("/records")
    public URLRecord addRecord(@RequestBody URLRecord URLRecord)
    {
        return this.record.addRecord(URLRecord);
    }

    @PutMapping("/records")
    public URLRecord updateRecord(@RequestBody URLRecord URLRecord)
    {
        return this.record.updateRecord(URLRecord);
    }

    @DeleteMapping("/records/{id}")
    public String deleteRecord(@PathVariable String id)
    {
        return this.record.deleteRecordById(Integer.parseInt(id));
    }
}
