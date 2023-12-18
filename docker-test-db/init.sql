CREATE TABLE user (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255)
) ENGINE=InnoDB DEFAULT CHARSET=utf8m64 COLLATE=utf8mb4_unicode_ci;

INSERT INTO user (name) values ('지현');
INSERT INTO user (name) values ('혁');
INSERT INTO user (name) values ('현규');
INSERT INTO user (name) values ('수호');
