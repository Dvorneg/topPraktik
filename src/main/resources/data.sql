INSERT INTO USERS (name, email, password, calories_per_day)
VALUES ('User', 'user@yandex.ru', '{noop}password', 2005),
       ('Admin', 'admin@gmail.com', '{noop}admin', 1900);

INSERT INTO USER_ROLE (role, user_id)
VALUES ('USER', 1),
       ('ADMIN', 2),
       ('USER', 2);

INSERT INTO MEAL (date_time, description, calories, user_id)
VALUES ('2020-01-30 10:00:00', 'Завтрак', 500, 1),
       ('2020-01-30 13:00:00', 'Обед', 1000, 1),
       ('2020-01-30 20:00:00', 'Ужин', 500, 1),
       ('2020-01-31 0:00:00', 'Еда на граничное значение', 100, 1),
       ('2020-01-31 10:00:00', 'Завтрак', 500, 1),
       ('2020-01-31 13:00:00', 'Обед', 1000, 1),
       ('2020-01-31 20:00:00', 'Ужин', 510, 1),
       ('2020-01-31 14:00:00', 'Админ ланч', 510, 2),
       ('2020-01-31 21:00:00', 'Админ ужин', 1500, 2);

INSERT INTO RESTAURANT (NAME, ID)
VALUES ('Лиговский',0),
       ('Центральный',1);

INSERT INTO MENU (MENU_DATE, RESTAURANT_ID, ID)
VALUES ('2022-02-01 10:00:00',  0, 0),
       ('2022-02-01 13:00:00',  1, 1),
       ('2022-02-02 20:00:00',  0, 2),
       ('2022-02-02 0:00:00',   1, 3 ),
       ('2022-02-03 10:00:00',  0, 4);

INSERT INTO MENU_ITEM (NAME, PRICE, MENU_ID)
VALUES ('суп',      10, 0),
       ('компот',   20, 0),
       ('салат',    30, 0),
       ('суп1',     11, 1),
       ('компот1',  22, 1),
       ('салат1',   33, 1),
       ('суп2',     11, 2),
       ('компот2',  22, 2),
       ('салат2',   33, 2),
       ('суп3',     11, 3),
       ('компот3',  22, 3),
       ('салат3',   33, 3),
       ('суп4',     14, 4),
       ('компот4',  24, 4),
       ('салат4',   34, 4);

INSERT INTO VOTE (DATE_VOTE, RESTAURANT_ID, USER_ID)
VALUES ('2022-02-01 10:00:00',  0, 1),
       ('2022-02-01 13:00:00',  1, 2),
       ('2022-02-02 20:00:00',  0, 1),
       ('2022-02-02 0:00:00',   1, 2 ),
       ('2022-02-03 10:00:00',  0, 1);
