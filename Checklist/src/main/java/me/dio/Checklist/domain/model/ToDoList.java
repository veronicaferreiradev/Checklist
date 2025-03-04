package me.dio.Checklist.domain.model;

import jakarta.persistence.*;

import java.awt.*;
import java.util.List;

@Entity(name = "tb_todolist")
public class ToDoList {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    //1:n
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<News> news;

    //1:n
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Features> features;

    //1:1
    @OneToOne(cascade = CascadeType.ALL)
    private TaskDetails taskDetails;

    //1:n
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Tasks> tasks;

    public List<Features> getFeatures() {
        return features;
    }

    public String getName() {
        return name;
    }

    public List<News> getNews() {
        return news;
    }

    public TaskDetails getTaskDetails() {
        return taskDetails;
    }

    public List<Tasks> getTasks() {
        return tasks;
    }

    public void setFeatures(List<Features> features) {
        this.features = features;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNews(List<News> news) {
        this.news = news;
    }

    public void setTaskDetails(TaskDetails taskDetails) {
        this.taskDetails = taskDetails;
    }

    public void setTasks(List<Tasks> tasks) {
        this.tasks = tasks;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}


