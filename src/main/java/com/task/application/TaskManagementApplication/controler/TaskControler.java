package com.task.application.TaskManagementApplication.controler;
import com.task.application.TaskManagementApplication.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.stereotype.Controller;
import com.task.application.TaskManagementApplication.entity.Task;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import java.util.List;
@Controller
@RestController
@RequestMapping("/api/task")
@Tag(name = "TMS001 - Task", description = "Provide endpoint for managing all task")
public class TaskControler {

        private final TaskService taskService;
        @Autowired
        public TaskControler(TaskService taskService) {
            this.taskService = taskService;
        }

    public TaskControler() {
        taskService = null;
    }

    @GetMapping
    @Operation(summary="These will list all task" , description="list all stored task in database")
        public List<Task> listTasks() {
            return taskService.listTasks();
        }

        @GetMapping("{id}")
        public java.util.Optional<com.task.application.TaskManagementApplication.entity.Task> findTaskById(@PathVariable Long id) {
            return taskService.findTaskById(id);
        }

        @PostMapping
        public com.task.application.TaskManagementApplication.entity.Task createTask(@RequestBody Task task) {
            return taskService.createTask(task);
        }

        @PutMapping("{id}")
        public Task updateTask(@PathVariable Long id, @RequestBody Task task) {
            return taskService.updateTask(id, task);
        }

        @DeleteMapping("{id}")
        public void deleteTask(@PathVariable Long id) {
            taskService.deleteTask(id);
        }
    }


