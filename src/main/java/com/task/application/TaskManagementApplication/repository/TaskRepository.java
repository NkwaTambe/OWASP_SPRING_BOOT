package com.task.application.TaskManagementApplication.repository;

import com.task.application.TaskManagementApplication.entity.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {
}
