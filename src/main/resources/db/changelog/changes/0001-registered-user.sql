--liquibase formatted sql

--changeset verners:1

CREATE TABLE registered_user
(
    id SERIAL PRIMARY KEY,
    firstname VARCHAR(255) NOT NULL,
    lastname VARCHAR(255) NOT NULL,
    email VARCHAR(255) NOT NULL,
    password VARCHAR(255) NOT NULL,
    gender VARCHAR(10) NOT NULL,
    country VARCHAR(255) NOT NULL,
    agreeToTerms BOOLEAN NOT NULL
);