CREATE TABLE notification
(
    id          BIGINT AUTO_INCREMENT PRIMARY KEY,
    date_time   DATETIME     NOT NULL,
    destination VARCHAR(255) NOT NULL,
    message     TEXT         NOT NULL,
    channel_id  BIGINT,
    status_id   BIGINT,
    FOREIGN KEY (channel_id) REFERENCES channel (id),
    FOREIGN KEY (status_id) REFERENCES status (id)
);