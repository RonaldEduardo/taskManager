package com.gustmannRonald.taskManager.service;

import com.gustmannRonald.taskManager.model.Task;
import com.gustmannRonald.taskManager.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

// Anotação @Service indica que essa classe é um serviço
@Service
public class TaskService {
    // Aqui você pode implementar a lógica de negócios relacionada às tarefas.
    // Por exemplo, você pode ter métodos para criar, atualizar, excluir e buscar tarefas.
    // Você também pode usar o TaskRepository para interagir com o banco de dados.
    @Autowired
    private TaskRepository taskRepository;

    /*
    * Método para criar uma nova tarefa
    * @param task Tarefa a ser criada
     */
    public List<Task> getAllTasks() {
        return taskRepository.findAll();
    }
    /*
    * Método para buscar uma tarefa pelo ID
    * @param id ID da tarefa a ser buscada
    * */
    public Optional<Task> getTaskById(Long id) {
        return taskRepository.findById(id);
    }

    /*
    * Método para excluir uma tarefa pelo ID
    * @param id ID da tarefa a ser excluída
     */
    public  Task save(Task task) {
        return taskRepository.save(task);
    }
}
