--1.insert into team table
insert into "team" (name) values
('real madrid'), ('france'), ('argentine'), ('barca'), ('manchester city'), ('munich'), ('psg');

--2.insert into sponsor table
insert into sponsor (name) values
('coca cola'), ('bombom anglais'), ('addidas'), ('nike');

--3.insert into player table
insert into "player" (name, number, poste, team_id) values
('ronaldo', 7, 'AILIER', 1), ('messi', 10, 'AILIER', 3), ('aguero', 9, 'ATTAQUANT', 5), ('string', 1, 'GARDIEN', 3),
('modric', 10, 'MILLIEU', 1), ('neuer', 10, 'GARDIEN', 6), ('rodrigo de paul', 19, 'MILLIEU', 5), ('guardiola', 4, 'DEFENSE', 5);

--//.insert into score
insert into score (team_one_scored, team_two_scored) values
(3,2), (4,3);

--4.insert into play_against table
insert into play_against (team_one, team_two, date, stadium, score_id) values
(1, 3, '2020-06-22', 'qatar', 2), (1, 5, '2019-05-14', 'manchester', 1);

--5.inert into goal table
insert into goal (player_id, score_id, time) values
(3, 1, 90), (1, 1, 15), (3, 1, 20), (7, 1, 35), (5, 1, 70),
(2, 2, 15), (2, 2, 30), (2, 2, 43), (1, 2, 10), (1, 2, 85), (1, 2, 55), (5, 2, 72);