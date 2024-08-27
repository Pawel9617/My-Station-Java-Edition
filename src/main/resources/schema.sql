CREATE TABLE IF NOT EXISTS users(
    id SERIAl PRIMARY KEY,
    username varchar(255) NOT NULL
);

CREATE TABLE IF NOT EXISTS station(
    id SERIAl PRIMARY KEY,
    name varchar(255) NOT NULL,
    max_power INT NOT NULL,
    vendor varchar(255) NOT NULL,
    configured BOOLEAN NOT NULL,
    status varchar(255) NOT NULL,
    owner_id INT NOT NULL,
    FOREIGN KEY (owner_id) REFERENCES users(id)
);