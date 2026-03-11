package dev.papvenom.movies;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "reviews")
public class Review {

    @Id
    private ObjectId id;

    private String imdbId;   // 🔥 THIS IS REQUIRED
    private String body;

    // No-args constructor
    public Review() {}

    public Review(String imdbId, String body) {
        this.imdbId = imdbId;
        this.body = body;
    }

    // Getters and setters
    public ObjectId getId() {
        return id;
    }

    public String getImdbId() {
        return imdbId;
    }

    public void setImdbId(String imdbId) {
        this.imdbId = imdbId;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }
}
