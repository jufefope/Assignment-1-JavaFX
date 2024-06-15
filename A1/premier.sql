-- Create Database
CREATE DATABASE PremierLeagueStats;
USE PremierLeagueStats;
-- Crear la tabla para la temporada 2019/2020
CREATE TABLE SeasonStats2019_2020 (
    Team VARCHAR(50),
    Played INT,
    Wins INT,
    Draws INT,
    Losses INT,
    GoalsFor INT,
    GoalsAgainst INT,
    Points INT,
    PRIMARY KEY (Team)
);

-- Insertar datos en la tabla SeasonStats2019_2020
INSERT INTO SeasonStats2019_2020 VALUES ('Liverpool', 38, 32, 3, 3, 85, 33, 99);
INSERT INTO SeasonStats2019_2020 VALUES ('Manchester City', 38, 26, 3, 9, 102, 35, 81);
INSERT INTO SeasonStats2019_2020 VALUES ('Manchester United', 38, 18, 12, 8, 66, 36, 66);
INSERT INTO SeasonStats2019_2020 VALUES ('Chelsea', 38, 20, 6, 12, 69, 54, 66);
INSERT INTO SeasonStats2019_2020 VALUES ('Leicester City', 38, 18, 8, 12, 67, 41, 62);
INSERT INTO SeasonStats2019_2020 VALUES ('Tottenham Hotspur', 38, 16, 11, 11, 61, 47, 59);
INSERT INTO SeasonStats2019_2020 VALUES ('Wolverhampton Wanderers', 38, 15, 14, 9, 51, 40, 59);
INSERT INTO SeasonStats2019_2020 VALUES ('Arsenal', 38, 14, 14, 10, 56, 48, 56);
INSERT INTO SeasonStats2019_2020 VALUES ('Sheffield United', 38, 14, 12, 12, 39, 39, 54);
INSERT INTO SeasonStats2019_2020 VALUES ('Burnley', 38, 15, 9, 14, 43, 50, 54);
INSERT INTO SeasonStats2019_2020 VALUES ('Southampton', 38, 15, 7, 16, 51, 60, 52);
INSERT INTO SeasonStats2019_2020 VALUES ('Everton', 38, 13, 10, 15, 44, 56, 49);
INSERT INTO SeasonStats2019_2020 VALUES ('Newcastle United', 38, 11, 11, 16, 38, 58, 44);
INSERT INTO SeasonStats2019_2020 VALUES ('Crystal Palace', 38, 11, 10, 17, 31, 50, 43);
INSERT INTO SeasonStats2019_2020 VALUES ('Brighton & Hove Albion', 38, 9, 14, 15, 39, 54, 41);
INSERT INTO SeasonStats2019_2020 VALUES ('West Ham United', 38, 10, 9, 19, 49, 62, 39);
INSERT INTO SeasonStats2019_2020 VALUES ('Aston Villa', 38, 9, 8, 21, 41, 67, 35);
INSERT INTO SeasonStats2019_2020 VALUES ('Bournemouth', 38, 9, 7, 22, 40, 65, 34);
INSERT INTO SeasonStats2019_2020 VALUES ('Watford', 38, 8, 10, 20, 36, 64, 34);
INSERT INTO SeasonStats2019_2020 VALUES ('Norwich City', 38, 5, 6, 27, 26, 75, 21);

-- Crear la tabla para la temporada 2020/2021
CREATE TABLE SeasonStats2020_2021 (
    Team VARCHAR(50),
    Played INT,
    Wins INT,
    Draws INT,
    Losses INT,
    GoalsFor INT,
    GoalsAgainst INT,
    Points INT,
    PRIMARY KEY (Team)
);

-- Insertar datos en la tabla SeasonStats2020_2021
INSERT INTO SeasonStats2020_2021 VALUES ('Manchester City', 38, 27, 5, 6, 83, 32, 86);
INSERT INTO SeasonStats2020_2021 VALUES ('Manchester United', 38, 21, 11, 6, 73, 44, 74);
INSERT INTO SeasonStats2020_2021 VALUES ('Liverpool', 38, 20, 9, 9, 68, 42, 69);
INSERT INTO SeasonStats2020_2021 VALUES ('Chelsea', 38, 19, 10, 9, 58, 36, 67);
INSERT INTO SeasonStats2020_2021 VALUES ('Leicester City', 38, 20, 6, 12, 68, 50, 66);
INSERT INTO SeasonStats2020_2021 VALUES ('West Ham United', 38, 19, 8, 11, 62, 47, 65);
INSERT INTO SeasonStats2020_2021 VALUES ('Tottenham Hotspur', 38, 18, 8, 12, 68, 45, 62);
INSERT INTO SeasonStats2020_2021 VALUES ('Arsenal', 38, 18, 7, 13, 55, 39, 61);
INSERT INTO SeasonStats2020_2021 VALUES ('Leeds United', 38, 18, 5, 15, 62, 54, 59);
INSERT INTO SeasonStats2020_2021 VALUES ('Everton', 38, 17, 8, 13, 47, 48, 59);
INSERT INTO SeasonStats2020_2021 VALUES ('Aston Villa', 38, 16, 7, 15, 55, 46, 55);
INSERT INTO SeasonStats2020_2021 VALUES ('Newcastle United', 38, 12, 9, 17, 46, 62, 45);
INSERT INTO SeasonStats2020_2021 VALUES ('Wolverhampton Wanderers', 38, 12, 9, 17, 36, 52, 45);
INSERT INTO SeasonStats2020_2021 VALUES ('Crystal Palace', 38, 12, 8, 18, 41, 66, 44);
INSERT INTO SeasonStats2020_2021 VALUES ('Southampton', 38, 12, 7, 19, 47, 68, 43);
INSERT INTO SeasonStats2020_2021 VALUES ('Brighton & Hove Albion', 38, 9, 14, 15, 40, 46, 41);
INSERT INTO SeasonStats2020_2021 VALUES ('Burnley', 38, 10, 9, 19, 33, 55, 39);
INSERT INTO SeasonStats2020_2021 VALUES ('Fulham', 38, 5, 13, 20, 27, 53, 28);
INSERT INTO SeasonStats2020_2021 VALUES ('West Bromwich Albion', 38, 5, 11, 22, 35, 76, 26);
INSERT INTO SeasonStats2020_2021 VALUES ('Sheffield United', 38, 7, 2, 29, 20, 63, 23);

-- Crear la tabla para la temporada 2021/2022
CREATE TABLE SeasonStats2021_2022 (
    Team VARCHAR(50),
    Played INT,
    Wins INT,
    Draws INT,
    Losses INT,
    GoalsFor INT,
    GoalsAgainst INT,
    Points INT,
    PRIMARY KEY (Team)
);

-- Insertar datos en la tabla SeasonStats2021_2022
INSERT INTO SeasonStats2021_2022 VALUES ('Manchester City', 38, 29, 6, 3, 99, 26, 93);
INSERT INTO SeasonStats2021_2022 VALUES ('Liverpool', 38, 28, 8, 2, 94, 26, 92);
INSERT INTO SeasonStats2021_2022 VALUES ('Chelsea', 38, 21, 11, 6, 76, 33, 74);
INSERT INTO SeasonStats2021_2022 VALUES ('Tottenham Hotspur', 38, 22, 5, 11, 69, 40, 71);
INSERT INTO SeasonStats2021_2022 VALUES ('Arsenal', 38, 22, 3, 13, 61, 48, 69);
INSERT INTO SeasonStats2021_2022 VALUES ('Manchester United', 38, 16, 10, 12, 57, 57, 58);
INSERT INTO SeasonStats2021_2022 VALUES ('West Ham United', 38, 16, 8, 14, 60, 51, 56);
INSERT INTO SeasonStats2021_2022 VALUES ('Leicester City', 38, 14, 10, 14, 62, 59, 52);
INSERT INTO SeasonStats2021_2022 VALUES ('Brighton & Hove Albion', 38, 12, 15, 11, 42, 44, 51);
INSERT INTO SeasonStats2021_2022 VALUES ('Wolverhampton Wanderers', 38, 15, 6, 17, 38, 43, 51);
INSERT INTO SeasonStats2021_2022 VALUES ('Newcastle United', 38, 13, 10, 15, 44, 62, 49);
INSERT INTO SeasonStats2021_2022 VALUES ('Crystal Palace', 38, 11, 15, 12, 50, 46, 48);
INSERT INTO SeasonStats2021_2022 VALUES ('Brentford', 38, 13, 7, 18, 48, 56, 46);
INSERT INTO SeasonStats2021_2022 VALUES ('Aston Villa', 38, 13, 6, 19, 52, 54, 45);
INSERT INTO SeasonStats2021_2022 VALUES ('Southampton', 38, 9, 13, 16, 43, 67, 40);
INSERT INTO SeasonStats2021_2022 VALUES ('Everton', 38, 11, 6, 21, 43, 66, 39);
INSERT INTO SeasonStats2021_2022 VALUES ('Leeds United', 38, 9, 11, 18, 42, 79, 38);
INSERT INTO SeasonStats2021_2022 VALUES ('Burnley', 38, 7, 14, 17, 34, 53, 35);
INSERT INTO SeasonStats2021_2022 VALUES ('Watford', 38, 6, 5, 27, 34, 77, 23);
INSERT INTO SeasonStats2021_2022 VALUES ('Norwich City', 38, 5, 7, 26, 23, 84, 22);

-- Crear la tabla para la temporada 2022/2023
CREATE TABLE SeasonStats2022_2023 (
    Team VARCHAR(50),
    Played INT,
    Wins INT,
    Draws INT,
    Losses INT,
    GoalsFor INT,
    GoalsAgainst INT,
    Points INT,
    PRIMARY KEY (Team)
);

-- Insertar datos en la tabla SeasonStats2022_2023
INSERT INTO SeasonStats2022_2023 VALUES ('Manchester City', 38, 28, 5, 5, 94, 33, 89);
INSERT INTO SeasonStats2022_2023 VALUES ('Arsenal', 38, 26, 6, 6, 88, 36, 84);
INSERT INTO SeasonStats2022_2023 VALUES ('Manchester United', 38, 23, 6, 9, 58, 43, 75);
INSERT INTO SeasonStats2022_2023 VALUES ('Newcastle United', 38, 19, 14, 5, 68, 33, 71);
INSERT INTO SeasonStats2022_2023 VALUES ('Liverpool', 38, 19, 10, 9, 75, 47, 67);
INSERT INTO SeasonStats2022_2023 VALUES ('Brighton & Hove Albion', 38, 18, 8, 12, 72, 53, 62);
INSERT INTO SeasonStats2022_2023 VALUES ('Aston Villa', 38, 18, 7, 13, 51, 46, 61);
INSERT INTO SeasonStats2022_2023 VALUES ('Tottenham Hotspur', 38, 18, 6, 14, 70, 63, 60);
INSERT INTO SeasonStats2022_2023 VALUES ('Brentford', 38, 15, 14, 9, 58, 46, 59);
INSERT INTO SeasonStats2022_2023 VALUES ('Fulham', 38, 15, 7, 16, 55, 53, 52);
INSERT INTO SeasonStats2022_2023 VALUES ('Crystal Palace', 38, 11, 12, 15, 40, 49, 45);
INSERT INTO SeasonStats2022_2023 VALUES ('Chelsea', 38, 11, 11, 16, 38, 47, 44);
INSERT INTO SeasonStats2022_2023 VALUES ('Wolverhampton Wanderers', 38, 11, 8, 19, 31, 53, 41);
INSERT INTO SeasonStats2022_2023 VALUES ('West Ham United', 38, 11, 7, 20, 42, 55, 40);
INSERT INTO SeasonStats2022_2023 VALUES ('Bournemouth', 38, 11, 6, 21, 37, 71, 39);
INSERT INTO SeasonStats2022_2023 VALUES ('Nottingham Forest', 38, 9, 11, 18, 38, 68, 38);
INSERT INTO SeasonStats2022_2023 VALUES ('Everton', 38, 8, 12, 18, 34, 57, 36);
INSERT INTO SeasonStats2022_2023 VALUES ('Leicester City', 38, 9, 7, 22, 51, 68, 34);
INSERT INTO SeasonStats2022_2023 VALUES ('Leeds United', 38, 7, 10, 21, 48, 78, 31);
INSERT INTO SeasonStats2022_2023 VALUES ('Southampton', 38, 6, 7, 25, 32, 73, 25);

-- Crear la tabla para la temporada 2023/2024
CREATE TABLE SeasonStats2023_2024 (
    Team VARCHAR(50),
    Played INT,
    Wins INT,
    Draws INT,
    Losses INT,
    GoalsFor INT,
    GoalsAgainst INT,
    Points INT,
    PRIMARY KEY (Team)
);
-- Insertar datos en la tabla SeasonStats2023_2024
INSERT INTO SeasonStats2023_2024 VALUES ('Manchester City', 38, 28, 7, 3, 96, 34, 91);
INSERT INTO SeasonStats2023_2024 VALUES ('Arsenal', 38, 28, 5, 5, 91, 29, 89);
INSERT INTO SeasonStats2023_2024 VALUES ('Liverpool', 38, 24, 10, 4, 86, 41, 82);
INSERT INTO SeasonStats2023_2024 VALUES ('Aston Villa', 38, 20, 8, 10, 76, 61, 68);
INSERT INTO SeasonStats2023_2024 VALUES ('Tottenham', 38, 20, 6, 12, 74, 61, 66);
INSERT INTO SeasonStats2023_2024 VALUES ('Chelsea', 38, 18, 9, 11, 77, 63, 63);
INSERT INTO SeasonStats2023_2024 VALUES ('Newcastle', 38, 18, 6, 14, 85, 62, 60);
INSERT INTO SeasonStats2023_2024 VALUES ('Manchester United', 38, 18, 6, 14, 57, 58, 60);
INSERT INTO SeasonStats2023_2024 VALUES ('West Ham', 38, 14, 10, 14, 60, 74, 52);
INSERT INTO SeasonStats2023_2024 VALUES ('Crystal Palace', 38, 13, 10, 15, 57, 58, 49);
INSERT INTO SeasonStats2023_2024 VALUES ('Brighton', 38, 12, 12, 14, 55, 62, 48);
INSERT INTO SeasonStats2023_2024 VALUES ('Bournemouth', 38, 13, 9, 16, 54, 67, 48);
INSERT INTO SeasonStats2023_2024 VALUES ('Fulham', 38, 13, 8, 17, 55, 61, 47);
INSERT INTO SeasonStats2023_2024 VALUES ('Wolves', 38, 13, 7, 18, 50, 65, 46);
INSERT INTO SeasonStats2023_2024 VALUES ('Everton', 38, 13, 9, 16, 40, 51, 40);
INSERT INTO SeasonStats2023_2024 VALUES ('Brentford', 38, 10, 9, 19, 56, 65, 39);
INSERT INTO SeasonStats2023_2024 VALUES ('Nottingham Forest', 38, 9, 9, 20, 49, 67, 32);
INSERT INTO SeasonStats2023_2024 VALUES ('Luton', 38, 8, 8, 22, 52, 85, 32);
INSERT INTO SeasonStats2023_2024 VALUES ('Burnley', 38, 5, 9, 24, 41, 78, 24);
INSERT INTO SeasonStats2023_2024 VALUES ('Sheffield United', 38, 3, 7, 28, 35, 104, 16);

SELECT * FROM SeasonStats2023_2024 ORDER BY Points DESC;


