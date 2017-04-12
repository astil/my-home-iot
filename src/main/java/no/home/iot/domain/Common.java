package no.home.iot.domain;

import java.util.Date;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.format.annotation.DateTimeFormat;

public abstract class Common
{
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    @CreatedDate
    protected Date timestamp;
    protected String wiFiStrength;

    public Date getTimestamp()
    {
        return timestamp;
    }

    public void setTimestamp(Date timestamp)
    {
        this.timestamp = timestamp;
    }

    public String getWiFiStrength()
    {
        return wiFiStrength;
    }

    public void setWiFiStrength(String wiFiStrength)
    {
        this.wiFiStrength = wiFiStrength;
    }
}
