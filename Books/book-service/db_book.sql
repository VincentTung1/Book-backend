CREATE TABLE `db_book` (
                           `bid` int(11) NOT NULL AUTO_INCREMENT,
                           `name` varchar(255) COLLATE utf8mb4_unicode_520_ci DEFAULT NULL,
                           `desc` varchar(255) COLLATE utf8mb4_unicode_520_ci DEFAULT NULL,
                           `author` varchar(255) COLLATE utf8mb4_unicode_520_ci DEFAULT NULL,
                           `year` varchar(255) COLLATE utf8mb4_unicode_520_ci DEFAULT NULL,
                           PRIMARY KEY (`bid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_520_ci;