package com.example.myapplication;

import com.parse.ParseClassName;
import com.parse.ParseFile;
import com.parse.ParseObject;
import com.parse.ParseUser;

@ParseClassName("Post")
public class Post extends ParseObject {

    public static final String KEY_DESCRIPTION = "description";
    public static final String KEY_IMAGE = "image";
    public static final String KEY_USER = "user";

    // Description
    // Getter
    public String getDescription() {
        return getString(KEY_DESCRIPTION);
    }
    // Setter
    public void setDescription(String description) {
        put(KEY_DESCRIPTION, description);
    }

    // Description
    // Getter
    public ParseFile getImage() {
        return getParseFile(KEY_IMAGE);
    }
    // Setter
    public void setImage(ParseFile parseFile) {
        put(KEY_IMAGE, parseFile);
    }

    // User
    // Getter
    public ParseUser getUser() {
        return getParseUser(KEY_USER);
    }
    // Setter
    public void setUser(ParseUser user) {
        put(KEY_USER, user);
    }
}
