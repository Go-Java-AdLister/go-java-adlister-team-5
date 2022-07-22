USE adlister_db;

INSERT INTO users (id, username, email, password)
VALUES (1, 'bob', 'bob@123', 'hello'),
( 2 , 'admin','lineishagibson@gmail.com','$2a$12$5uEPkAEW08T2x0dGnUJXDuL.zdQb7YnbpjcEt9vIycrqxfCHYoDEK');


INSERT INTO ads (id, user_id, title, park_name, description, elevation, hike_distance, max_occupancy)
VALUES  (1, 1, 'Bastdrop', 'Bastdrop State Park', 'Established in 1938, come enjoy the loblolly pines and various wildlife', 1325, 8, 400),
        (2, 1, 'Cooper', 'Cooper Lake State Park', 'Bring your fishing pole, hiking shoes, or your swimsuit and enjoy all of the features the park has to offer', 450, 11, 275),
        (3, 1, 'Grapeland', 'Mission Tejas State Park', 'Tejas park offers historical information from the missions past and many other activities for all to enjoy', 764, 9, 325);


