package service;

import model.TeamMember;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.TeamMemberRepository;

import java.util.ArrayList;
import java.util.List;

@Service
public class TeamService {

    @Autowired
    TeamMemberRepository teamRepository;
    private static final List<TeamMember> team_members = new ArrayList<>();

    public TeamMember getTeamMember2 (String memberId) {
        return teamRepository.findById(memberId).get();
    }
}
