package me.dio.Checklist.domain.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity(name = "tb_tasks")
public class Tasks {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String categoria;

    private String progress;

    private String priority;

    public Long getId() {
        return id;
    }

    public String getCategoria() {
        return categoria;
    }

    public String getProgress() {
        return progress;
    }

    public String getPriority() {
        return priority;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public void setProgress(String progress) {
        this.progress = progress;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }
}
