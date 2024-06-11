package com.kaicf.workshopspringmongo.repositories;

import com.kaicf.workshopspringmongo.domain.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends MongoRepository<User, String> {

}
