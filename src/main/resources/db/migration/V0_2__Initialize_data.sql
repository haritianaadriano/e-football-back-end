--1.insert into team table
insert into "team" (name) values
('real madrid'), ('france'), ('argentine'), ('barca'), ('manchester city'), ('munich'), ('psg');

--2.insert into sponsor table
insert into sponsor (name) values
('coca cola'), ('bombom anglais'), ('addidas'), ('nike');

--3.insert into player table
insert into "player" (name, number, poste, team_id) values
('ronaldo', 7, 'AILIER', 1), ('messi', 'AILIER', 10, 3), ('aguero', 'ATTAQUANT', 9, 5), ('string', 'GUARDIEN', 1, 3),
('modric', 10, 'MILLIEU', 1), ('neuer', 10, 'GUARDIEN', 6), ('rodrigo de paul', 19, 'MILLIEU', 5), ('guardiola', 4, 'DEFENSE', 5);

--4.insert into play_against table
insert into play_against (team_one, team_two, date_time, stadium) values
(1, 3, '2020-06-22', 'qatar'), (1, 5, '2019-05-14', 'manchester');