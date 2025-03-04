package me.dio.Checklist.domain.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity(name = "tb_taskdetails")
public class TaskDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String number;

    private String deadline;

    public String getDeadline() {
        return deadline;
    }

    public Long getId() {
        return id;
    }

    public String getNumber() {
        return number;
    }

    public void setDeadline(String deadline) {
        this.deadline = deadline;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}

