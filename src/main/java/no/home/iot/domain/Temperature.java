package no.home.iot.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document()
public class Temperature {

    @Id
    private String id;

    private String temp;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTemp() {
        return temp;
    }

    public void setTemp(String temp) {
        this.temp = temp;
    }

    @Override
    public String toString() {
        return "Temperature{" +
                "id=" + id +
                ", temp='" + temp + '\'' +
                '}';
    }
}
