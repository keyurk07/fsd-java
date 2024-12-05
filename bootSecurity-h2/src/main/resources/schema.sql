CREATE table users(
username varchar_ignorecase(50) NOT NULL PRIMARY KEY,
password varchar_ignorecase(50) NOT NULL,
enabled BOOLEAN NOT NULL
);

CREATE TABLE authorities(
username varchar_ignorecase(50) not null,
authority varchar_ignorecase(50) not null,
constraint fk_authorities_users FOREIGN key(username) references users(username)
);

create unique index ix_auth_username on authorities (username, authority);