package models;

import leodagdag.play2morphia.Model;
import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;

@Entity
public class UploadToken extends Model {


    @Id
    public ObjectId id;

    String token;
    long timestamp;
    long userID;

    public UploadToken() {
        this.timestamp = 0;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }

    public long getUserID() {
        return userID;
    }

    public void setUserID(long userID) {
        this.userID = userID;
    }

    public static Finder<Long, UploadToken> find() {
        return new Finder<Long, UploadToken>(
                Long.class, UploadToken.class
        );
    }


}
