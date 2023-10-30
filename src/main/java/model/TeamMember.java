package model;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity(name = "TeamMember")
@Table(name = "team_member")

public class TeamMember {
@Id
private String id;
private String name;
private String email;
@OneToMany (
        fetch = FetchType.LAZY,
        mappedBy = "teamMember")

@JsonIgnore
    private List<Task> tasks = new ArrayList<>();
public TeamMember(){

}








}
