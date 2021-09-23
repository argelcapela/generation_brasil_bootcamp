-- Atividade 3
-- Crie um banco de dados para um serviço de farmácia de uma empresa, o nome do banco deverá ter o seguinte nome db_farmacia_do_bem, onde o sistema trabalhará com as informações dos produtos desta empresa. 
CREATE DATABASE db_farmacia_do_bem;
USE db_farmacia_do_bem;

/* O sistema trabalhará com 2 tabelas tb_produto e tb_categoria.
siga  exatamente esse passo a passo:
Crie uma tabela de categorias utilizando a habilidade de abstração e determine 3 atributos relevantes do tb_categoria para se trabalhar com o serviço desta farmacia. */
CREATE TABLE tb_categoria (
	codCategoria int auto_increment,
    nomeCategoria varchar(255) not null,
    descricaoCategoria varchar(255) not null,
    primary key (codCategoria)
);

/* Crie uma tabela de tb_produto e utilizando a habilidade de abstração e determine 5 atributos relevantes dos tb_produto para se trabalhar com o serviço deste farmacia(não esqueça de criar a foreign key de tb_categoria nesta tabela).*/
CREATE TABLE tb_produto(
	codProduto 		int auto_increment,
    codCategoria	int not null,
    nomeProduto		varchar(255) not null,
    precoProduto 	decimal not null,
    qtdNoEstoque 	varchar(255) not null,
    primary key (codProduto),
    foreign key (codCategoria) references tb_categoria(codCategoria)
);

-- Popule esta tabela Categoria com até 5 dados.
INSERT INTO tb_categoria (nomeCategoria, descricaoCategoria) VALUES ("Dentário", "Dente melhor!");
INSERT INTO tb_categoria (nomeCategoria, descricaoCategoria) VALUES ("Sex Shop", "Para ter noites mais apimentadas! kkk");
INSERT INTO tb_categoria (nomeCategoria, descricaoCategoria) VALUES ("Charópe", "Curar garganta!");
INSERT INTO tb_categoria (nomeCategoria, descricaoCategoria) VALUES ("Comprimido", "Aliviar!");
INSERT INTO tb_categoria (nomeCategoria, descricaoCategoria) VALUES ("Primeiros Socorros", "Aliviar!");


-- Popule esta tabela Produto com até 8 dados.
INSERT INTO tb_produto (codCategoria, nomeProduto, precoProduto, qtdNoEstoque) VALUES (1, "Escova de Dente", 10, 10);
INSERT INTO tb_produto (codCategoria, nomeProduto, precoProduto, qtdNoEstoque) VALUES (1, "Pasta de Dente", 15, 10);

INSERT INTO tb_produto (codCategoria, nomeProduto, precoProduto, qtdNoEstoque) VALUES (2, "Camisinha", 5, 10);
INSERT INTO tb_produto (codCategoria, nomeProduto, precoProduto, qtdNoEstoque) VALUES (2, "Camisola", 10, 10);

INSERT INTO tb_produto (codCategoria, nomeProduto, precoProduto, qtdNoEstoque) VALUES (3, "Cataflan", 10, 10);
INSERT INTO tb_produto (codCategoria, nomeProduto, precoProduto, qtdNoEstoque) VALUES (3, "Covid", 10, 10);

INSERT INTO tb_produto (codCategoria, nomeProduto, precoProduto, qtdNoEstoque) VALUES (4, "Doril", 10, 10);
INSERT INTO tb_produto (codCategoria, nomeProduto, precoProduto, qtdNoEstoque) VALUES (4, "Dorflex", 10, 10);

INSERT INTO tb_produto (codCategoria, nomeProduto, precoProduto, qtdNoEstoque) VALUES (5, "Ataduras", 10, 10);
INSERT INTO tb_produto (codCategoria, nomeProduto, precoProduto, qtdNoEstoque) VALUES (5, "Água Oxigenada", 10, 10);

-- Faça um select que retorne os Produtos com o valor maior do que 50 reais.
SELECT * FROM tb_produto;
SELECT * FROM  tb_produto where precoProduto > 50;

-- Faça um select trazendo  os Produtos com valor entre 3 e 60 reais.
SELECT * FROM tb_produto where precoProduto between 3 and 60;

-- Faça um select  utilizando LIKE buscando os Produtos com a letra B.
SELECT * FROM tb_produto where nomeProduto like "%B%";

-- Faça um um select com Inner join entre  tabela categoria e produto.
SELECT *
FROM tb_produto
INNER JOIN tb_categoria
ON tb_produto.codCategoria = tb_categoria.codCategoria;

-- Faça um select onde traga todos os Produtos de uma categoria específica (exemplo todos os produtos que são aves ou legumes).
SELECT *
FROM tb_produto
INNER JOIN tb_categoria
ON tb_produto.codCategoria = tb_categoria.codCategoria
WHERE tb_categoria.codCategoria = 2;

/* Faça um select onde traga todos os Produtos de uma categoria específica (exemplo todos os produtos que são cosméticos).
salve as querys para cada uma dos requisitos o exercício em um arquivo .SQL ou texto e coloque no seu GitHuB pessoal e compartilhe esta atividade.*/
