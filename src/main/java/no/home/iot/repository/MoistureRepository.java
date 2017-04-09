package no.home.iot.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

import no.home.iot.domain.Moisture;
import no.home.iot.domain.Temperature;

@Repository
@RepositoryRestResource(collectionResourceRel = "moisture", path = "moisture")
public interface MoistureRepository extends MongoRepository<Moisture, String> {
}
