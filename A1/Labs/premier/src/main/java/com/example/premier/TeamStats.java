package com.example.premier;

public class TeamStats {
    // Fields to store team statistics
    private String team;
    private int played;
    private int wins;
    private int draws;
    private int losses;
    private int goalsFor;
    private int goalsAgainst;
    private int points;

    // Constructor to initialize the fields
    public TeamStats(String team, int played, int wins, int draws, int losses, int goalsFor, int goalsAgainst, int points) {
        this.team = team;
        this.played = played;
        this.wins = wins;
        this.draws = draws;
        this.losses = losses;
        this.goalsFor = goalsFor;
        this.goalsAgainst = goalsAgainst;
        this.points = points;
    }

    // Getter method to retrieve the team name
    public String getTeam() {
        return team;
    }

    // Getter method to retrieve the number of games played
    public int getPlayed() {
        return played;
    }

    // Getter method to retrieve the number of wins
    public int getWins() {
        return wins;
    }

    // Getter method to retrieve the number of draws
    public int getDraws() {
        return draws;
    }

    // Getter method to retrieve the number of losses
    public int getLosses() {
        return losses;
    }

    // Getter method to retrieve the number of goals scored
    public int getGoalsFor() {
        return goalsFor;
    }

    // Getter method to retrieve the number of goals conceded
    public int getGoalsAgainst() {
        return goalsAgainst;
    }

    // Getter method to retrieve the number of points
    public int getPoints() {
        return points;
    }
}
