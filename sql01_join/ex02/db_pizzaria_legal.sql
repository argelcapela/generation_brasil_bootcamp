-- Atividade 2

-- Crie um banco de dados para um serviço de pizzaria de uma empresa, o nome do banco deverá ter o seguinte nome db_pizzaria_legal, onde o sistema trabalhará com as informações dos produtos desta empresa. 
CREATE DATABASE db_pizzaria_legal;
USE db_pizzaria_legal;

-- O sistema trabalhará com 2 tabelas tb_pizza e tb_categoria.
-- siga  exatamente esse passo a passo:
-- Crie uma tabela de categorias utilizando a habilidade de abstração e determine 3 atributos relevantes do tb_categoria para se trabalhar com o serviço dessa pizzaria.
CREATE TABLE tb_categoria (
	codCategoria int auto_increment,
    nomeCategoria varchar(255) not null,
    descricaoCategoria varchar(255) not null,
    primary key (codCategoria)
);

-- Crie uma tabela de tb_pizza e utilizando a habilidade de abstração e determine 5 atributos relevantes dos tb_produto para se trabalhar com o serviço dessa pizzaria(não esqueça de criar a foreign key de tb_categoria nesta tabela).
CREATE TABLE tb_pizza(
	codPizza 		int auto_increment,
    codCategoria	int not null,
    nomePizza		varchar(255) not null,
    precoPizza 		decimal not null,
    origemPizza 	varchar(255) not null,
    primary key (codPizza),
    foreign key (codCategoria) references tb_categoria(codCategoria)
);

ALTER TABLE tb_pizza DROP FOREIGN KEY codCategoria;

-- Popule esta tabela Categoria com até 5 dados.
INSERT INTO tb_categoria (nomeCategoria, descricaoCategoria) VALUES ("Tradicionais", "Pizzas mais populares do restaurante!");
INSERT INTO tb_categoria (nomeCategoria, descricaoCategoria) VALUES ("Vegatariana", "Pizzas com uma mistura de carne animal e vegetais!");
INSERT INTO tb_categoria (nomeCategoria, descricaoCategoria) VALUES ("Vegana", "0 carne de animal!");
INSERT INTO tb_categoria (nomeCategoria, descricaoCategoria) VALUES ("Doce", "Pizzas recheadas com doce!");

SELECT * FROM tb_categoria;
DROP TABLE tb_categoria;

-- Popule esta tabela pizza com até 8 dados.
INSERT INTO tb_pizza (codCategoria, nomePizza, precoPizza, origemPizza) VALUES (1, "Roma", 30, "Itália");
INSERT INTO tb_pizza (codCategoria, nomePizza, precoPizza, origemPizza) VALUES (1, "Napolitana", 70, "Itália");
INSERT INTO tb_pizza (codCategoria, nomePizza, precoPizza, origemPizza) VALUES (2, "Whatahealth Pizza", 80, "US");
INSERT INTO tb_pizza (codCategoria, nomePizza, precoPizza, origemPizza) VALUES (2, "Conspirancy Pizza", 30, "US");
INSERT INTO tb_pizza (codCategoria, nomePizza, precoPizza, origemPizza) VALUES (3, "100% SOJA", 35, "Peru");
INSERT INTO tb_pizza (codCategoria, nomePizza, precoPizza, origemPizza) VALUES (3, "Super Vegana", 60, "Itália");
INSERT INTO tb_pizza (codCategoria, nomePizza, precoPizza, origemPizza) VALUES (4, "Chocolate Amargo", 40, "Itália");
INSERT INTO tb_pizza (codCategoria, nomePizza, precoPizza, origemPizza) VALUES (4, "Beijinho", 10, "Itália");
DROP TABLE tb_pizza;

-- Faça um select que retorne os Produtos com o valor maior do que 45 reais.
SELECT * FROM tb_pizza;
SELECT * FROM  tb_pizza where precoPizza > 45;

-- Faça um select trazendo  os Produtos com valor entre 29 e 60 reais.
SELECT * FROM tb_pizza where precoPizza between 29 and 60;

-- Faça um select  utilizando LIKE buscando os Produtos com a letra C.
SELECT * FROM tb_pizza where nomePizza like "%C%";

-- Faça um um select com Inner join entre  tabela categoria e pizza.
SELECT *
FROM tb_pizza
INNER JOIN tb_categoria
ON tb_pizza.codCategoria = tb_categoria.codCategoria;

-- Faça um select onde traga todos os Produtos de uma categoria específica (exemplo todos os produtos que são pizza doce).
SELECT *
FROM tb_pizza
RIGHT JOIN tb_categoria
ON tb_pizza.codCategoria = tb_categoria.codCategoria
WHERE tb_categoria.codCategoria=4;

-- salve as querys para cada uma dos requisitos o exercício em um arquivo .SQL ou texto e coloque no seu GitHuB pessoal e compartilhe esta atividade.
