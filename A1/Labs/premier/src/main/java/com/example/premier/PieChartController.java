package com.example.premier;

import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.scene.chart.PieChart;
import javafx.scene.control.ComboBox;
import javafx.stage.Stage;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

public class PieChartController {
    @FXML
    private PieChart pieChart; // Pie chart to display team statistics

    @FXML
    private ComboBox<String> seasonComboBox; // Dropdown to select the season

    @FXML
    private ComboBox<String> teamComboBox; // Dropdown to select the team

    private Map<String, String> teamMap = new HashMap<>(); // Map to store team names

    @FXML
    public void initialize() {
        // Add seasons to the season ComboBox
        seasonComboBox.getItems().addAll("seasonstats2023_2024", "seasonstats2022_2023", "seasonstats2021_2022", "seasonstats2020_2021", "seasonstats2019_2020");
        // Load team names into the team ComboBox
        loadTeams();
    }

    @FXML
    public void loadTeams() {
        try {
            // Retrieve season statistics for the 2023-2024 season from the database
            ResultSet rs = DBUtility.getSeasonStats("seasonstats2023_2024");
            while (rs.next()) {
                String team = rs.getString("Team");
                // Add team names to the team ComboBox if they are not already present
                if (!teamMap.containsKey(team)) {
                    teamMap.put(team, team);
                    teamComboBox.getItems().add(team);
                }
            }
        } catch (SQLException e) {
            // Print the stack trace if there is an SQL exception
            e.printStackTrace();
        }
    }

    @FXML
    public void loadSeasons() {
        // Get the selected team from the team ComboBox
        String selectedTeam = teamComboBox.getValue();
        if (selectedTeam != null) {
            // Load the pie chart with data for the selected team
            loadPieChart();
        }
    }

    @FXML
    public void loadPieChart() {
        // Get the selected season and team from the ComboBoxes
        String selectedSeason = seasonComboBox.getValue();
        String selectedTeam = teamComboBox.getValue();
        if (selectedSeason != null && selectedTeam != null) {
            // Clear existing data from the pie chart
            pieChart.getData().clear();
            // Hide the legend
            pieChart.setLegendVisible(false);
            // Load the team data for the selected season and team
            loadTeamData(selectedSeason, selectedTeam);
        }
    }

    private void loadTeamData(String tableName, String team) {
        try {
            // Retrieve season statistics from the database
            ResultSet rs = DBUtility.getSeasonStats(tableName);
            while (rs.next()) {
                if (rs.getString("Team").equals(team)) {
                    // Get the number of wins, draws, and losses for the selected team
                    int wins = rs.getInt("Wins");
                    int draws = rs.getInt("Draws");
                    int losses = rs.getInt("Losses");

                    // Create pie chart data for wins, draws, and losses
                    PieChart.Data winData = new PieChart.Data("Wins", wins);
                    PieChart.Data drawData = new PieChart.Data("Draws", draws);
                    PieChart.Data lossData = new PieChart.Data("Losses", losses);

                    // Set the data for the pie chart
                    pieChart.setData(FXCollections.observableArrayList(winData, drawData, lossData));

                    // Set the color for each slice of the pie chart
                    setColor(winData, "#4CAF50"); // Green for wins
                    setColor(drawData, "#FFEB3B"); // Yellow for draws
                    setColor(lossData, "#F44336"); // Red for losses

                    break;
                }
            }
        } catch (SQLException e) {
            // Print the stack trace if there is an SQL exception
            e.printStackTrace();
        }
    }

    private void setColor(PieChart.Data data, String color) {
        // Set the color for a pie chart slice
        data.getNode().setStyle("-fx-pie-color: " + color + ";");
    }

    @FXML
    public void goBack() throws IOException {
        // Get the current stage (window)
        Stage stage = (Stage) pieChart.getScene().getWindow();
        // Load the main view FXML file
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("main-view.fxml"));
        // Create a new scene with the main view layout
        Scene scene = new Scene(fxmlLoader.load(), 800, 600);
        // Set the scene to the current stage (window)
        stage.setScene(scene);
    }
}
