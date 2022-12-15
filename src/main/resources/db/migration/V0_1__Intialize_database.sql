--1.begin with creating the team table
create table "team"
(
    id_team serial,
    name varchar,
    primary key (id_team)
);

--2.creating the sponsor table
create table sponsor
(
    id_sponsor serial,
    name varchar,
    primary key (id_sponsor)
);

--3.creating player table
create table "player"
(
    id_player serial,
    name varchar,
    number integer,
    team_id integer,
    primary key (id_player),
    constraint fk_team_id
        foreign key(team_id)
        references team(id_team)
);

--4.creating have relation to table
create table "have"
(
    id_have serial,
    sponsor_id integer,
    team_id integer,
    primary key(id_have),
    constraint fk_sponsor_id
        foreign key(sponsor_id)
        references sponsor(id_sponsor),
    constraint fk_team_id
        foreign key(team_id)
        references team(id_team)
);

--5.creating play_against relation to table
create table play_against
(
    id_play serial,
    team_one integer,
    team_two integer,
    date_time timestamp,
    stadium varchar,
    primary key(id_play),
    constraint fk_team_one
        foreign key(team_one)
        references team(id_team),
    constraint fk_team_two
        foreign key(team_two)
        references team(id_team)
);