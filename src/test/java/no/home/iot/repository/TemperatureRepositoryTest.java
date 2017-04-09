package no.home.iot.repository;

import no.home.iot.MyHomeIotApplication;
import no.home.iot.domain.Temperature;
import org.bson.types.ObjectId;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(MyHomeIotApplication.class)
public class TemperatureRepositoryTest {

    @Autowired
    private TemperatureRepository temperatureRepository;

    @Before
    public void setUp() {
        Temperature temp = new Temperature();
        temp.setId(ObjectId.get().toString());
        temp.setTemp("23.1");

        temperatureRepository.save(temp);
    }

    @Test
    public void test() {
        List<Temperature> temperatures = temperatureRepository.findAll();

        assertThat(temperatures.size(), is(1));
    }
}
