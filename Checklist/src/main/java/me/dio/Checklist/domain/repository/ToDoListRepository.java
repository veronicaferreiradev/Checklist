package me.dio.Checklist.domain.repository;

import me.dio.Checklist.domain.model.ToDoList;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ToDoListRepository extends JpaRepository<ToDoList, Long>{


}
