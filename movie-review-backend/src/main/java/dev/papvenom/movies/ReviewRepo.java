package dev.papvenom.movies;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ReviewRepo extends MongoRepository<Review, ObjectId> {
    List<Review> findReviewByImdbId(String imdbId);
}
