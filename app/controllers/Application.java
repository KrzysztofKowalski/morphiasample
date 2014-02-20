package controllers;

import models.UploadToken;
import play.*;
import play.mvc.*;
import views.html.*;

public class Application extends Controller {

    public static Result index() {

        String text = "not found", text2 = "not found";
        UploadToken uploadToken = new UploadToken();
        uploadToken.setToken("abc");
        uploadToken.setUserID(123);

        uploadToken.insert();
//        uploadToken.save();
        UploadToken existsToken = UploadToken.find().filter("token =", "abc").get();
        UploadToken doesNotExistToken = UploadToken.find().filter("token =", "abc2").get();
        if (existsToken != null) text = "found";
        if (doesNotExistToken != null) text2 = "found";

        return ok(index.render(text + ", " + text2));
    }

}
