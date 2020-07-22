CREATE DATABASE department_db

\c department_db

CREATE  TABLE department(VARCHAR name, VARCHAR address, VARCHAR phone, VARCHAR email);
CREATE DATABASE_db_test WITH TEMPLATE department_db;