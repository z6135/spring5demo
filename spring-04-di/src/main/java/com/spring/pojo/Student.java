package com.spring.pojo;

import java.util.*;

/**
 * @ProjectName: Spring5study
 * @Package: com.spring.pojo
 * @ClassName: Student
 * @Author: 张晟睿
 * @Date: 2022/2/2 12:41
 * @Version: 1.0
 */
public class Student {
    private String name;
    private Address address;
    private String []course;
    private List<String> hobbies;
    private Map<String,String> books;
    private Set<String> games;
    private String girlfriends;
    private Properties info;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String[] getCourse() {
        return course;
    }

    public void setCourse(String[] course) {
        this.course = course;
    }

    public List<String> getHobbies() {
        return hobbies;
    }

    public void setHobbies(List<String> hobbies) {
        this.hobbies = hobbies;
    }

    public Map<String, String> getBooks() {
        return books;
    }

    public void setBooks(Map<String, String> books) {
        this.books = books;
    }

    public Set<String> getGames() {
        return games;
    }

    public void setGames(Set<String> games) {
        this.games = games;
    }

    public String getGirlfriends() {
        return girlfriends;
    }

    public void setGirlfriends(String girlfriends) {
        this.girlfriends = girlfriends;
    }

    public Properties getInfo() {
        return info;
    }

    public void setInfo(Properties info) {
        this.info = info;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                "\n, address=" + address +
                "\n, course=" + Arrays.toString(course) +
                "\n, hobbies=" + hobbies +
                "\n, books=" + books +
                "\n, games=" + games +
                "\n, girlfriends='" + girlfriends + '\'' +
                "\n, info=" + info +
                '}';
    }
}
