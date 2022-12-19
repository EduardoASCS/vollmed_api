alter table pacientes
    add logradouro varchar(100) not null,
    add bairro varchar(100) not null,
    add cep varchar(9) not null,
    add complemento varchar(100),
    add numero varchar(20),
    add uf char(2) not null,
    add cidade varchar(100) not null;