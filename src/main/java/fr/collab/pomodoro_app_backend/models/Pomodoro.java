package fr.collab.pomodoro_app_backend.models;

import fr.collab.pomodoro_app_backend.enums.PomodoroType;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Data
public class Pomodoro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDateTime startTime;
    private LocalDateTime endTime;
    @Enumerated(EnumType.STRING)
    private PomodoroType type;
    @ManyToOne
    private boolean completed;
    private User user;
}
