package io.vishal.ipldashboard.repository;

import org.springframework.data.repository.CrudRepository;

import io.vishal.ipldashboard.model.Team;

public interface TeamRepository extends CrudRepository<Team, Long>  {

    Team findByTeamName(String teamName);
    
}
