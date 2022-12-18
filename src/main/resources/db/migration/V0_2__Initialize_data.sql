--1.insert into team table
insert into "team" (name) values
('real madrid'), ('france'), ('argentine'), ('barca'), ('manchester city');

--2.insert into sponsor table
insert into sponsor (name) values
('coca cola'), ('bombom anglais'), ('addidas'), ('nike');

--3.insert into player table
insert into "player" (name, number, team_id) values
('ronaldo', 7, 1), ('messi', 10, 3);

--4.insert into play_against table
insert into play_against (team_one, team_two, date_time, stadium) values
(1, 3, '2020-06-22 19:10:25-07', 'qatar');