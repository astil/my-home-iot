package no.home.iot.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Moisture extends Common
{
    @Id
    private String id;
    private Double analogValue;
    private Double analogVolts;

    public Double getAnalogValue()
    {
        return analogValue;
    }

    public void setAnalogValue(Double analogValue)
    {
        this.analogValue = analogValue;
    }

    public Double getAnalogVolts()
    {
        return analogVolts;
    }

    public void setAnalogVolts(Double analogVolts)
    {
        this.analogVolts = analogVolts;
    }
}
