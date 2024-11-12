package com.task.application.TaskManagementApplication.service;

import com.task.application.TaskManagementApplication.entity.Task;
import java.util.List;
import java.util.Optional;

public interface TaskService {
     public List<Task> listTasks();
     public Optional<Task> findTaskById(Long id);
     public Task createTask(Task task);
     public Task updateTask(Long id, Task task); // Updated to accept ID for update
     public void deleteTask(Long id);
}
