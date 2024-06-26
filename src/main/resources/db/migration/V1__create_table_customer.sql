CREATE TABLE Customer (
  id BIGINT AUTO_INCREMENT NOT NULL,
   first_name VARCHAR(255) NOT NULL,
   last_name VARCHAR(255) NOT NULL,
   cpf VARCHAR(255) NOT NULL,
   income DECIMAL NOT NULL,
   email VARCHAR(255) NOT NULL,
   password VARCHAR(255) NOT NULL,
   zip_code VARCHAR(255) NOT NULL,
   street VARCHAR(255) NOT NULL,
   CONSTRAINT pk_customer PRIMARY KEY (id)
);

ALTER TABLE Customer ADD CONSTRAINT uc_customer_cpf UNIQUE (cpf);

ALTER TABLE Customer ADD CONSTRAINT uc_customer_email UNIQUE (email);