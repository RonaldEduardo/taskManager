package com.gustmannRonald.taskManager.repository;

import com.gustmannRonald.taskManager.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {
    // Interface que herda JpaRepository, recebendo:
    // 1º: o tipo da entidade (Task)
    // 2º: o tipo da chave primária (Long)

    // O Spring Data JPA automaticamente gera métodos como:
    // - findAll()
    // - findById(id)
    // - save(task)
    // - deleteById(id)
    // - count()
    // E você pode declarar métodos como:
    // - List<Task> findByStatus(String status);
}

