package com.gustmannRonald.taskManager.model;

import java.time.LocalDate;
import jakarta.persistence.*;

@Entity
// informa ao Spring que essa classe é uma entidade
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    // informa ao Spring que o id é gerado automaticamente
    private Long id;

    private String title;
    private String description;
    private String status;
    private LocalDate deadLine;
}
