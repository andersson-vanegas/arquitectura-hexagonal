package com.hexagonal.tasks.application.services;

import com.hexagonal.tasks.domain.models.AdditionalTaskInfo;
import com.hexagonal.tasks.domain.models.Task;
import com.hexagonal.tasks.domain.ports.in.*;
import org.springframework.context.annotation.Bean;

import java.util.List;
import java.util.Optional;


public class TaskService implements CreateTaskUseCase, DeleteTaskUseCase, GetAdditionalTaskInfo, RetrieveTaskUseCase, UpdateTaskUseCase {

     private final CreateTaskUseCase createTasksUseCase;

      private final RetrieveTaskUseCase retrieveTaskUseCase;
      private final UpdateTaskUseCase updateTaskUseCase;
      private final DeleteTaskUseCase deleteTaskUseCase;
      private final GetAdditionalTaskInfo getAdditionaltaskInfo;

    public TaskService(CreateTaskUseCase createTasksUseCase, RetrieveTaskUseCase retrieveTaskUseCase, UpdateTaskUseCase updateTaskUseCase, DeleteTaskUseCase deleteTaskUseCase, GetAdditionalTaskInfo getAdditionaltaskInfo) {
        this.createTasksUseCase = createTasksUseCase;
        this.retrieveTaskUseCase = retrieveTaskUseCase;
        this.updateTaskUseCase = updateTaskUseCase;
        this.deleteTaskUseCase = deleteTaskUseCase;
        this.getAdditionaltaskInfo = getAdditionaltaskInfo;

    }


    @Override
    public Task createTask(Task task) {
        return null;
    }

    @Override
    public boolean deleteTask(long Id) {
        return false;
    }

    @Override
    public AdditionalTaskInfo getAdditionalTaskInfo(Long id) {
        return null;
    }

    @Override
    public Optional<Task> getTaskById(Long id) {
        return Optional.empty();
    }

    @Override
    public List<Task> getAllTasks() {
        return null;
    }

    @Override
    public Optional<Task> updateTask(Long id, Task updateTask) {
        return Optional.empty();
    }
}
