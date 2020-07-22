CREATE DATABASE department_db;

\c department_db;

CREATE TABLE department(name VARCHAR, address VARCHAR, phone VARCHAR, email VARCHAR );
CREATE DATABASE_db_test WITH TEMPLATE department_db;