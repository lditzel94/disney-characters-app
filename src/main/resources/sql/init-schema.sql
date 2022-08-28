CREATE TABLE genre
(
    id         BIGINT AUTO_INCREMENT NOT NULL,
    image_url  VARCHAR(500)          NULL,
    created_at datetime              NULL,
    created_by VARCHAR(255)          NULL,
    updated_at datetime              NULL,
    updated_by VARCHAR(255)          NULL,
    name       VARCHAR(50)           NULL,
    CONSTRAINT pk_genre PRIMARY KEY (id)
);

CREATE TABLE movie
(
    id           BIGINT AUTO_INCREMENT NOT NULL,
    image_url    VARCHAR(500)          NULL,
    created_at   datetime              NULL,
    created_by   VARCHAR(255)          NULL,
    updated_at   datetime              NULL,
    updated_by   VARCHAR(255)          NULL,
    title        VARCHAR(50)           NULL,
    release_date VARCHAR(255)          NULL,
    rating       INT                   NULL,
    CONSTRAINT pk_movie PRIMARY KEY (id)
);

CREATE TABLE movie_character
(
    id         BIGINT AUTO_INCREMENT NOT NULL,
    image_url  VARCHAR(500)          NULL,
    created_at datetime              NULL,
    created_by VARCHAR(255)          NULL,
    updated_at datetime              NULL,
    updated_by VARCHAR(255)          NULL,
    name       VARCHAR(50)           NULL,
    age        VARCHAR(4)            NULL,
    weight     DOUBLE                NULL,
    story      VARCHAR(400)          NULL,
    CONSTRAINT pk_moviecharacter PRIMARY KEY (id)
);