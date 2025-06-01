package controller;

import entity.Task;
import entity.Users;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import repository.TaskRepository;

import java.util.List;

@RestController
public class TaskController {

    @Autowired
    private TaskRepository taskRepository;

    @GetMapping("/tasks")
    public List<Task> getTasks(Users user) {
        return taskRepository.findAllByUser(user);
    }


    @PostMapping("/tasks")
    public Task addTask(@RequestBody Task task) {
        return taskRepository.save(task);
    }
}
