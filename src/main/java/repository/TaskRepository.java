package repository;

import model.TeamMember;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<TeamMember, String> {
}
