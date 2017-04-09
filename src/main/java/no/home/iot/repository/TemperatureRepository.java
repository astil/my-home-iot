package no.home.iot.repository;

import no.home.iot.domain.Temperature;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

@Repository
@RepositoryRestResource(collectionResourceRel = "temp", path = "temp")
public interface TemperatureRepository extends MongoRepository<Temperature, String> {
}
