package com.genspark.SpringBootDemoTwo.Entities;


import javax.persistence.*;
import java.util.Date;


@Entity
@Table(name = "tbl_domains")
public class URLRecord
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String domainName;
    private String domainType;
    private Date createdDate;
    private Date updatedDate;
    private Date expiresDate;

    private String nameServer;
    private String whoisServer;
    private String registrarName;
    private String status;

    @OneToOne(cascade = CascadeType.ALL)
    private Contact contact;

    public URLRecord()
    {

    }

    public URLRecord(String domainName, String domainType, Date createdDate, Date updatedDate, Date expiresDate, String nameServer, String whoisServer, String registrarName, String status, Contact contact)
    {
        this.domainName = domainName;
        this.domainType = domainType;
        this.createdDate = createdDate;
        this.updatedDate = updatedDate;
        this.expiresDate = expiresDate;
        this.nameServer = nameServer;
        this.whoisServer = whoisServer;
        this.registrarName = registrarName;
        this.status = status;
        this.contact = contact;
    }

    public int getId()
    {
        return id;
    }
    public void setId(int id)
    {
        this.id = id;
    }

    public String getDomainName()
    {
        return domainName;
    }
    public void setDomainName(String domainName)
    {
        this.domainName = domainName;
    }

    public String getDomainType()
    {
        return domainType;
    }
    public void setDomainType(String domainType)
    {
        this.domainType = domainType;
    }

    public Date getCreatedDate()
    {
        return createdDate;
    }
    public void setCreatedDate(Date createdDate)
    {
        this.createdDate = createdDate;
    }

    public Date getUpdatedDate()
    {
        return updatedDate;
    }
    public void setUpdatedDate(Date updatedDate)
    {
        this.updatedDate = updatedDate;
    }

    public Date getExpiresDate()
    {
        return expiresDate;
    }
    public void setExpiresDate(Date expiresDate)
    {
        this.expiresDate = expiresDate;
    }

    public String getNameServer()
    {
        return nameServer;
    }
    public void setNameServer(String nameServer)
    {
        this.nameServer = nameServer;
    }

    public String getWhoisServer()
    {
        return whoisServer;
    }
    public void setWhoisServer(String whoisServer)
    {
        this.whoisServer = whoisServer;
    }

    public String getRegistrarName()
    {
        return registrarName;
    }
    public void setRegistrarName(String registrarName)
    {
        this.registrarName = registrarName;
    }

    public String getStatus()
    {
        return status;
    }
    public void setStatus(String status)
    {
        this.status = status;
    }

    public Contact getContact()
    {
        return contact;
    }
    public void setContact(Contact contact)
    {
        this.contact = contact;
    }
}
