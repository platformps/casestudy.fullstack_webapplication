create table employee
(
    id INT NOT NULL auto_increment PRIMARY KEY,
    first_name VARCHAR(50) not null,
    last_name VARCHAR(50) null,
    email VARCHAR(50) null,
    department VARCHAR(50) null,
    position VARCHAR(50) null,
    salary DOUBLE(7,2) null,
    password VARCHAR(50) not null
);

create unique index employee_email_uindex
    on employee (email);

create unique index employee_id_uindex
    on employee (id);

create table department
(
    id int NOT NULL auto_increment PRIMARY KEY ,
    manager VARCHAR(50) null,
    name VARCHAR(50) not null,
    budget DOUBLE(7,2) null
);

create unique index department_id_uindex
    on department (id);







