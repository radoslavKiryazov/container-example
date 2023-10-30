package controllers;

import model.TeamMember;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import service.TeamService;

@RestController
public class TeamController {

    private TeamService teamService;

    public TeamController(TeamService teamService){
        this.teamService = teamService;
    }

    @GetMapping("/members/{memberId}")
    public TeamMember getTaskDetails(@PathVariable String memberId){
        return teamService.getTeamMember2(memberId);
    }
}
