 create table cartao(
  numero int PRIMARY KEY,
  codigo int,
  empresa varchar(50)
);

create table restaurante(
  nome varchar(50),
  telefone int PRIMARY KEY,
  tempo int
 );

create table clente (
  cpf int PRIMARY KEY,
  nome varchar(100),
  telefone int,
  email varchar(100),
  aniversario date,
  endereco varchar(500),
  n_cartao int
);

create table itens (
  n_item int,
  nome varchar(50),
  descricao varchar(500),
  valor real,
  decorador bool
);

create table pedidos (
  item int, 
  cpf int,
  data date
);
