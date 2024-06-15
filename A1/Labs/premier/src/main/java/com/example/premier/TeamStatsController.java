package com.example.premier;

import javafx.fxml.FXML;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.control.ComboBox;
import javafx.stage.Stage;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class TeamStatsController {
    @FXML
    private BarChart<String, Number> statChart; // Bar chart to display statistics

    @FXML
    private CategoryAxis xAxis; // X-axis for the bar chart

    @FXML
    private NumberAxis yAxis; // Y-axis for the bar chart

    @FXML
    private ComboBox<String> statisticComboBox; // Dropdown to select the statistic

    @FXML
    private ComboBox<String> teamComboBox; // Dropdown to select the team

    private String team; // Variable to store the selected team

    @FXML
    public void initialize() {
        // Add statistics options to the ComboBox
        statisticComboBox.getItems().addAll("Goals For", "Goals Against", "Wins", "Losses", "Draws");
        // Add team options to the ComboBox
        teamComboBox.getItems().addAll("Manchester City", "Liverpool", "Chelsea", "Tottenham Hotspur", "Arsenal", "Manchester United", "West Ham United", "Leicester City", "Brighton & Hove Albion", "Wolverhampton Wanderers", "Newcastle United", "Crystal Palace");

        // Set the action to perform when a team is selected
        teamComboBox.setOnAction(event -> loadStatistic());
    }

    // Method to set the selected team and load its statistics
    public void setTeam(String team) {
        this.team = team;
        loadStatistic();
    }

    @FXML
    public void loadStatistic() {
        // Get the selected statistic and team from the ComboBoxes
        String selectedStatistic = statisticComboBox.getValue();
        String selectedTeam = teamComboBox.getValue();
        if (selectedStatistic != null && selectedTeam != null) {
            team = selectedTeam;
            // Clear existing data from the bar chart
            statChart.getData().clear();
            // Load the team statistics across seasons
            loadTeamStatsAcrossSeasons(selectedStatistic);
        }
    }

    private void loadTeamStatsAcrossSeasons(String statistic) {
        // List of seasons to load data for
        List<String> seasons = List.of("seasonstats2023_2024", "seasonstats2022_2023", "seasonstats2021_2022", "seasonstats2020_2021", "seasonstats2019_2020");
        // List of colors for the bars
        List<Color> colors = List.of(Color.BLUE, Color.RED, Color.GREEN, Color.ORANGE, Color.PURPLE);

        // Loop through each season and load the corresponding data
        for (int i = 0; i < seasons.size(); i++) {
            String season = seasons.get(i);
            Color color = colors.get(i);

            XYChart.Series<String, Number> series = new XYChart.Series<>();
            series.setName(season);

            try {
                // Retrieve season statistics from the database
                ResultSet rs = DBUtility.getSeasonStats(season);
                while (rs.next()) {
                    if (rs.getString("Team").equals(team)) {
                        // Get the value of the selected statistic for the team
                        int value;
                        switch (statistic) {
                            case "Goals For":
                                value = rs.getInt("GoalsFor");
                                break;
                            case "Goals Against":
                                value = rs.getInt("GoalsAgainst");
                                break;
                            case "Wins":
                                value = rs.getInt("Wins");
                                break;
                            case "Losses":
                                value = rs.getInt("Losses");
                                break;
                            case "Draws":
                                value = rs.getInt("Draws");
                                break;
                            default:
                                value = 0;
                        }
                        XYChart.Data<String, Number> data = new XYChart.Data<>(season, value);
                        series.getData().add(data);

                        // Set the color for each bar
                        data.nodeProperty().addListener((obs, oldNode, newNode) -> {
                            if (newNode != null) {
                                newNode.setStyle("-fx-bar-fill: " + toRgbString(color) + ";");
                            }
                        });
                    }
                }
            } catch (SQLException e) {
                // Print the stack trace if there is an SQL exception
                e.printStackTrace();
            }

            // Add the series to the bar chart
            statChart.getData().add(series);
        }
    }

    // Helper method to convert Color to RGB string
    private String toRgbString(Color c) {
        return "rgb(" + (c.getRed() * 255) + "," + (c.getGreen() * 255) + "," + (c.getBlue() * 255) + ")";
    }

    @FXML
    public void goBack() throws IOException {
        // Get the current stage (window)
        Stage stage = (Stage) statChart.getScene().getWindow();
        // Load the main view FXML file
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("main-view.fxml"));
        // Create a new scene with the main view layout
        Scene scene = new Scene(fxmlLoader.load(), 800, 600);
        // Set the scene to the current stage (window)
        stage.setScene(scene);
    }
}
