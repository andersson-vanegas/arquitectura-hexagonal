package com.hexagonal.tasks.domain.ports.in;

public interface DeleteTaskUseCase {
    boolean deleteTask(long Id);
}
