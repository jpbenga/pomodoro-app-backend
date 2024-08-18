package fr.collab.pomodoro_app_backend.models;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "settings")
public class Settings {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @Column(name = "work_duration")
    private Integer workDuration;

    @Column(name = "short_break_duration")
    private Integer shortBreakDuration;

    @Column(name = "long_break_duration")
    private Integer longBreakDuration;

    @Column(name = "daily_goal")
    private Integer dailyGoal;

    @Column(name = "notification_enabled")
    private Boolean notificationEnabled;
}
