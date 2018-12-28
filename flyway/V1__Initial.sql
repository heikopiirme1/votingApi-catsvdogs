CREATE TABLE votes (
    id INT NOT NULL AUTO_INCREMENT,
    vote_name VARCHAR(50) NOT NULL,
    vote_count INT NOT NULL,
    PRIMARY KEY (id)
);

INSERT INTO votes(vote_name, vote_count) VALUES ('cats', 100), ('dogs', 100);