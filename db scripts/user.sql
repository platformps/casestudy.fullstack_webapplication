

# create a user casestudy with password 'casestudy'


CREATE USER 'casestudy'@'localhost' IDENTIFIED BY 'casestudy';

GRANT ALL PRIVILEGES ON * . * TO 'casestudy'@'localhost';

ALTER USER 'casestudy'@'localhost' IDENTIFIED WITH mysql_native_password BY 'casestudy';