CREATE TABLE book(
    id uuid NOT null PRIMARY KEY ,
    title VARCHAR NOT null,
    description VARCHAR NOT null,
    release_year INT NOT NULL
);