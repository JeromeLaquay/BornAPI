insert into utilisateur (id,firstname,lastname,badge,password, email) values (1,'laquay','jerome','1234','1234', 'jl@mail.fr');

insert into car (id,marque, modele,personal, autonomy,power_max,organisation) values (1,'renault','zoe',true,50,24,null);

insert into station (id,name,power,marque,free, organisation) values (1,'rizomm 1',22, 'G2Mobility',true, 'la catho');

insert into reservation_car(id,date_start,date_end,user_id,car_id) values(1,'2019-06-01 10:00:00','2019-06-11 14:00:00' ,1,1)

insert into reservation_station(id,date_start,date_end,user_id,station_id) values(1,'2019-06-01 10:00:00','2019-06-11 14:00:00' ,1,1)
