/*
Atividade 6
Crie um banco de dados para um serviço de um site de cursos onlines, o nome do banco deverá ter o seguinte nome db_cursoDaMinhaVida, onde o sistema trabalhará com as informações dos produtos desta empresa. */
	CREATE DATABASE  db_curso_da_minha_vida;
	USE 			 db_curso_da_minha_vida;
    
-- O sistema trabalhará com 2 tabelas tb_curso e tb_categoria.
-- siga  exatamente esse passo a passo:
-- Crie uma tabela de categorias utilizando a habilidade de abstração e determine 3 atributos relevantes do tb_categoria para se trabalhar com o serviço deste site de cursos onlines.
	CREATE TABLE tb_categoria (
		codCategoria int auto_increment,
		nomeCategoria varchar(255) not null,
		descricaoCategoria varchar(255) not null,
		primary key (codCategoria)
	);
-- Crie uma tabela de tb_curso e utilizando a habilidade de abstração e determine 5 atributos relevantes dos tb_produto para se trabalhar com o serviço de um site de cursos onlines(não esqueça de criar a foreign key de tb_categoria nesta tabela).
	CREATE TABLE tb_curso(
		codCurso 				int auto_increment,
		codCategoria			int not null,
		nomeCurso				varchar(255) not null,
		precoCurso 				decimal not null,
        instrutorDoCurso 		varchar(255),
        facilitadorDeJornada	varchar(255),
		primary key (codCurso),
		foreign key (codCategoria) references tb_categoria(codCategoria)
	);

-- Popule esta tabela Categoria com até 5 dados.
INSERT INTO tb_categoria (nomeCategoria, descricaoCategoria) VALUES ("Tecnologia",  "Cursos para melhorar o conhecimento técnico!");
INSERT INTO tb_categoria (nomeCategoria, descricaoCategoria) VALUES ("Idioma", "As melhores técnicas para aprender idiomas estrangeiros!");
INSERT INTO tb_categoria (nomeCategoria, descricaoCategoria) VALUES ("Produtividade", "Como organizar melhor a vida!");
INSERT INTO tb_categoria (nomeCategoria, descricaoCategoria) VALUES ("Obras", "Como reformar casa!");
INSERT INTO tb_categoria (nomeCategoria, descricaoCategoria) VALUES ("Minimalismo", "Acompanhamento de salada!");

SELECT * FROM tb_categoria;

-- Popule esta tabela Produto com até 8 dados.
INSERT INTO tb_curso (codCategoria, nomeCurso, precoCurso, instrutorDoCurso, facilitadorDeJornada) VALUES (1, "Java Procedual", 500, "Ed", "Tati");
INSERT INTO tb_curso (codCategoria, nomeCurso, precoCurso, instrutorDoCurso, facilitadorDeJornada) VALUES (1, "Java POO", 500, "Ed", "Tati");
INSERT INTO tb_curso (codCategoria, nomeCurso, precoCurso, instrutorDoCurso, facilitadorDeJornada) VALUES (1, "Banco de Dados", 500, "Camila Cleane", "Tati");
INSERT INTO tb_curso (codCategoria, nomeCurso, precoCurso, instrutorDoCurso, facilitadorDeJornada) VALUES (1, "Spring", 500, "Camila Cleane", "Tati");

INSERT INTO tb_curso (codCategoria, nomeCurso, precoCurso, instrutorDoCurso, facilitadorDeJornada) VALUES (1, "Github: Compartilhe seu Código", 100, "Paulo", "Alura");
INSERT INTO tb_curso (codCategoria, nomeCurso, precoCurso, instrutorDoCurso, facilitadorDeJornada) VALUES (1, "Java e Eclipse", 100, "Paulo Silveiro", "Alura");

INSERT INTO tb_curso (codCategoria, nomeCurso, precoCurso, instrutorDoCurso, facilitadorDeJornada) VALUES (2, "Inglês - Pathway", 0, "Tati", "Tati");
INSERT INTO tb_curso (codCategoria, nomeCurso, precoCurso, instrutorDoCurso, facilitadorDeJornada) VALUES (5, "Organização Pessoal", 0, "Tati", "Tati");

-- Faça um select que retorne os Produtos com o valor maior do que 50 reais.
SELECT * FROM tb_curso;
SELECT * FROM  tb_curso where precoCurso > 50;

-- Faça um select trazendo  os Produtos com valor entre 3 e 60 reais.
SELECT * FROM tb_curso where precoCurso between 3 and 60;

-- Faça um select  utilizando LIKE buscando os Produtos com a letra J.
SELECT * FROM tb_curso where nomeCurso like "%C%";

-- Faça um um select com Inner join entre  tabela categoria e produto.
SELECT *
FROM tb_curso
INNER JOIN tb_categoria
ON tb_curso.codCategoria = tb_categoria.codCategoria;


-- Faça um select onde traga todos os Produtos de uma categoria específica (exemplo todos os produtos que são da categoria Java).
SELECT *
FROM tb_curso
INNER JOIN tb_categoria
ON tb_curso.codCategoria = tb_categoria.codCategoria
WHERE tb_categoria.codCategoria = 1;

-- Salve as querys para cada uma dos requisitos do exercício em um arquivo .SQL ou texto e coloque no seu GitHuB pessoal e compartilhe esta atividade.

