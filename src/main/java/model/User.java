package model;

import Enums.Types.Technology;

import java.util.ArrayList;

public class User {
    private String username;
    private String password;
    private String nickname;
    private int score;
    private ArrayList<Technology> achievedTechnologies = new ArrayList<>();


    public User(String username, String password, String nickname) {
        this.username = username;
        this.password = password;
        this.nickname = nickname;
        this.score = 0;

    }


    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getNickname() {
        return nickname;
    }

    public int getScore() {
        return score;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public void addTechnology(Technology technology) {
        achievedTechnologies.add(technology);
    }

    public void setAchievedTechnologies(ArrayList<Technology> achievedTechnologies) {
        this.achievedTechnologies = achievedTechnologies;
    }

    public ArrayList<Technology> getAchievedTechnologies() {
        return achievedTechnologies;
    }
}
