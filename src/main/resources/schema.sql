CREATE TABLE users (
	id uuid NOT NULL,
	username varchar NOT NULL,
	CONSTRAINT users_id PRIMARY KEY (id)
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