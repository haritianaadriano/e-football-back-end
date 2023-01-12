--1.insert into team table
insert into "team" (name) values
('real madrid'), ('france'), ('argentine'), ('barca'), ('manchester city'), ('munich'), ('psg');

--2.insert into sponsor table
insert into sponsor (name) values
('coca cola'), ('bombom anglais'), ('addidas'), ('nike');

--3.insert into player table
insert into "player" (name, number, position, team_id) values
('ronaldo', 7, 'AILIER', 1), ('messi', 10, 'AILIER', 3), ('aguero', 9, 'ATTAQUANT', 5), ('string', 1, 'GARDIEN', 3),
('modric', 10, 'MILLIEU', 1), ('neuer', 10, 'GARDIEN', 6), ('rodrigo de paul', 19, 'MILLIEU', 5), ('guardiola', 4, 'DEFENSE', 5);

--4.insert into play_against table
insert into play_against (team_one, team_two, date_time, stadium) values
(1, 3, '2017-09-03T10:15:30', 'manchester'), (1, 5, '2015-05-14T19:30:15', 'madrid');

--5.insert into score table
insert into "score" (time, CSC, player_id, match_id) values
(20, false, 1, 2), (35, false, 2, 2), (74, false, 2, 2),
(15, false, 3, 1), (75, false, 1, 1);