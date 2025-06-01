package repository;

import entity.Task;
import entity.Task.Status;
import entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {
    List<Task> findAllByUserAndStatus(Users user, Status status);
    List<Task> findAllByUser(Users user);
}
