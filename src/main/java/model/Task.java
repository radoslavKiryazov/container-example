package model;

import jakarta.persistence.*;

@Entity(name = "Task")
@Table(name = "task")
public class Task {
    @Id
    private String id;
    private String name;
    private String description;
    @ManyToOne(fetch = FetchType.LAZY)
    private TeamMember teamMember;

    public Task(){

    }
}
