package com.example.cm.data.models;

import com.google.android.gms.maps.model.LatLng;

import java.util.ArrayList;
import java.util.List;

public class UserPOJO {
    private String id;
    private String username, firstName, lastName, email, bio, profileImageUrl;
    private List<String> friends;
    private List<Double> location;

    public UserPOJO() {

    }

    public UserPOJO(User user) {
        this.id = user.getId();
        this.username = user.getUsername();
        this.firstName = user.getFirstName();
        this.lastName = user.getLastName();
        this.email = user.getEmail();
        this.bio = user.getBio();
        this.profileImageUrl = user.getProfileImageUrl();
        this.friends = user.getFriends();

        this.location = new ArrayList<>();
        if (user.getLocation() != null) {
            this.location.add(user.getLocation().latitude);
            this.location.add(user.getLocation().longitude);
        }
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public String getProfileImageUrl() {
        return profileImageUrl;
    }

    public void setProfileImageUrl(String profileImageUrl) {
        this.profileImageUrl = profileImageUrl;
    }

    public List<String> getFriends() {
        return friends;
    }

    public void setFriends(List<String> friends) {
        this.friends = friends;
    }

    public List<Double> getLocation() {
        return location;
    }

    public void setLocation(List<Double> location) {
        this.location = location;
    }

    public User toObject() {
        User user = new User();
        user.setId(this.id);
        user.setUsername(this.username);
        user.setFirstName(this.firstName);
        user.setLastName(this.lastName);
        user.setEmail(this.email);
        user.setBio(this.bio);
        user.setProfileImageUrl(this.profileImageUrl);
        user.setFriends(this.friends);

        if (this.location != null) {
            LatLng location = new LatLng(this.location.get(0), this.location.get(1));
            user.setLocation(location);
        }

        return user;
    }
}
