package com.example.premier;

import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MainController {
    @FXML
    private ComboBox<String> seasonComboBox; // Dropdown to select the season

    @FXML
    private ComboBox<String> teamComboBox; // Dropdown to select the team

    @FXML
    private TableView<TeamStats> dataTable; // Table to display team statistics

    @FXML
    private TableColumn<TeamStats, String> teamColumn; // Column for team names

    @FXML
    private TableColumn<TeamStats, Integer> playedColumn; // Column for games played

    @FXML
    private TableColumn<TeamStats, Integer> winsColumn; // Column for wins

    @FXML
    private TableColumn<TeamStats, Integer> drawsColumn; // Column for draws

    @FXML
    private TableColumn<TeamStats, Integer> lossesColumn; // Column for losses

    @FXML
    private TableColumn<TeamStats, Integer> goalsForColumn; // Column for goals scored

    @FXML
    private TableColumn<TeamStats, Integer> goalsAgainstColumn; // Column for goals conceded

    @FXML
    private TableColumn<TeamStats, Integer> pointsColumn; // Column for points

    @FXML
    public void initialize() {
        // Add seasons to the ComboBox
        seasonComboBox.getItems().addAll("seasonstats2023_2024", "seasonstats2022_2023", "seasonstats2021_2022", "seasonstats2020_2021", "seasonstats2019_2020");
        // Set the action to perform when a season is selected
        seasonComboBox.setOnAction(event -> loadSeasonData());

        // Set up the columns in the table to match the properties in the TeamStats class
        teamColumn.setCellValueFactory(new PropertyValueFactory<>("team"));
        playedColumn.setCellValueFactory(new PropertyValueFactory<>("played"));
        winsColumn.setCellValueFactory(new PropertyValueFactory<>("wins"));
        drawsColumn.setCellValueFactory(new PropertyValueFactory<>("draws"));
        lossesColumn.setCellValueFactory(new PropertyValueFactory<>("losses"));
        goalsForColumn.setCellValueFactory(new PropertyValueFactory<>("goalsFor"));
        goalsAgainstColumn.setCellValueFactory(new PropertyValueFactory<>("goalsAgainst"));
        pointsColumn.setCellValueFactory(new PropertyValueFactory<>("points"));
    }

    @FXML
    public void loadSeasonData() {
        // Get the selected season from the ComboBox
        String selectedSeason = seasonComboBox.getValue();
        if (selectedSeason != null) {
            // Clear existing data from the table and team ComboBox
            dataTable.getItems().clear();
            teamComboBox.getItems().clear();
            try {
                // Retrieve season statistics from the database
                ResultSet rs = DBUtility.getSeasonStats(selectedSeason);
                // Loop through the result set and add each team’s stats to the table
                while (rs.next()) {
                    TeamStats stats = new TeamStats(
                            rs.getString("Team"),
                            rs.getInt("Played"),
                            rs.getInt("Wins"),
                            rs.getInt("Draws"),
                            rs.getInt("Losses"),
                            rs.getInt("GoalsFor"),
                            rs.getInt("GoalsAgainst"),
                            rs.getInt("Points")
                    );
                    dataTable.getItems().add(stats); // Add stats to the table
                    teamComboBox.getItems().add(rs.getString("Team")); // Add team name to the team ComboBox
                }
            } catch (SQLException e) {
                // Print the stack trace if there is an SQL exception
                e.printStackTrace();
            }
        }
    }

    @FXML
    public void loadTeamStatsView() throws IOException {
        // Get the selected team from the ComboBox
        String selectedTeam = teamComboBox.getValue();
        if (selectedTeam != null) {
            // Load the team stats view FXML file
            FXMLLoader loader = new FXMLLoader(HelloApplication.class.getResource("team-stats-view.fxml"));
            Scene scene = new Scene(loader.load(), 800, 600);
            // Get the controller for the team stats view and set the selected team
            TeamStatsController controller = loader.getController();
            controller.setTeam(selectedTeam);

            // Set the new scene to the current stage
            Stage stage = (Stage) dataTable.getScene().getWindow();
            stage.setScene(scene);
        }
    }

    @FXML
    public void loadPieChartView() throws IOException {
        // Load the pie chart view FXML file
        FXMLLoader loader = new FXMLLoader(HelloApplication.class.getResource("pie-chart-view.fxml"));
        Scene scene = new Scene(loader.load(), 800, 600);

        // Set the new scene to the current stage
        Stage stage = (Stage) dataTable.getScene().getWindow();
        stage.setScene(scene);
    }
}
