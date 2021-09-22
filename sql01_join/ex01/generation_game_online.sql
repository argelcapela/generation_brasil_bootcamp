 
-- Atividade 1 --
-- Crie um banco de dados para um serviço de um game Online , o nome do banco deverá ter o seguinte nome db_generation_game_online, onde, o sistema trabalhará com as informações dos personagens desse game. 
CREATE DATABASE  db_generation_game_online;
USE db_generation_game_online;

-- O sistema trabalhará com 2 tabelas tb_personagem e tb_classe.
-- Crie uma tabela tb_classe utilizando a habilidade de abstração e determine 3 atributos relevantes da classe para se trabalhar com o serviço desse  game Online.
CREATE TABLE tb_classe(
	codClasse int auto_increment,
    nomeClasse varchar(255) not null,
    descricaoClasse varchar(255) not null,
    primary key (codClasse)
);

-- Crie uma tabela tb_personagem  e utilizando a habilidade de abstração e determine 5 atributos relevantes dos funcionários para se trabalhar com o serviço desse game Online (não esqueça de criar a foreign key de tb_classe nesta tabela).
DROP TABLE tb_personagem;

CREATE TABLE tb_personagem(
	codPersonagem bigint auto_increment,
    codClasse	int not null,
    nomePersonagem	varchar(255) not null,
    hpPersonagem int not null,
    mpPersonagem int not null,
    poderDeAtaque decimal not null,
    poderDeDefesa decimal not null,
    primary key (codPersonagem),
    foreign key (codClasse) references tb_classe(codClasse)
);

ALTER TABLE tb_personagem ALTER hpPersonagem SET DEFAULT 100;
ALTER TABLE tb_personagem ALTER mpPersonagem SET DEFAULT 100;
ALTER TABLE tb_personagem ALTER poderDeAtaque SET DEFAULT 50;
ALTER TABLE tb_personagem ALTER poderDeDefesa SET DEFAULT 50;

-- Popule esta tabela classe com até 5 dados.
INSERT INTO tb_classe (nomeClasse, descricaoClasse) VALUES ("Espada Chin", "Muito Hábil com espadas e na arte do combate!");
INSERT INTO tb_classe (nomeClasse, descricaoClasse) VALUES ("Arqueiro", "Dispara flechas fatais a distância!");
INSERT INTO tb_classe (nomeClasse, descricaoClasse) VALUES ("Mago", "Mestre das artes místicas!");
INSERT INTO tb_classe (nomeClasse, descricaoClasse) VALUES ("Ninja", "Especialista em mortes rápidas e silenciosas!");
INSERT INTO tb_classe (nomeClasse, descricaoClasse) VALUES ("Musa", "Encanta seus oponentes para depois tirar suas vidas!");

SELECT * FROM tb_classe;
DROP TABLE tb_classe;
ALTER TABLE tb_personagem DROP FOREIGN KEY tb_personagem_ibfk_1;
ALTER TABLE tb_personagem ADD FOREIGN KEY (codClasse) REFERENCES tb_classe(codClasse);

-- Popule esta tabela personagem com até 8 dados.
INSERT INTO tb_personagem (codClasse, nomePersonagem, poderDeAtaque, poderDeDefesa) VALUES (1, "detonador", 500, 200);
INSERT INTO tb_personagem (codClasse, nomePersonagem, poderDeAtaque, poderDeDefesa) VALUES (2, "destruidor65", 1000, 100); 
INSERT INTO tb_personagem (codClasse, nomePersonagem, poderDeAtaque, poderDeDefesa) VALUES (1, "demolidor", 300, 200);
INSERT INTO tb_personagem (codClasse, nomePersonagem, poderDeAtaque, poderDeDefesa) VALUES (2, "joaninha", 400, 300);
INSERT INTO tb_personagem (codClasse, nomePersonagem, poderDeAtaque, poderDeDefesa) VALUES (3, "susi", 400, 300);
INSERT INTO tb_personagem (codClasse, nomePersonagem, poderDeAtaque, poderDeDefesa) VALUES (2, "joia", 1000, 200);
INSERT INTO tb_personagem (codClasse, nomePersonagem, poderDeAtaque, poderDeDefesa) VALUES (1, "genmaster", 200, 300);
INSERT INTO tb_personagem (codClasse, nomePersonagem, poderDeAtaque, poderDeDefesa) VALUES (2, "genetrix", 400, 200);

-- Faça um select que retorne os personagens com o poder de ataque maior do que 2000.
SELECT * FROM tb_personagem;
SELECT * FROM tb_personagem WHERE poderDeAtaque > 2000;

-- Faça um select trazendo  os personagens com poder de defesa entre 1000 e 2000.
SELECT * FROM tb_personagem WHERE poderDeDefesa BETWEEN 1000 and 2000;

-- Faça um select  utilizando LIKE buscando os personagens com a letra C.
SELECT * FROM tb_personagem WHERE nomePersonagem LIKE "%C%";

-- Faça um um select com Inner join entre  tabela classe e personagem.
SELECT tb_personagem.codPersonagem, tb_personagem.nomePersonagem,
	   tb_classe.nomeClasse,
	   tb_personagem.hpPersonagem, tb_personagem.mpPersonagem, 
       tb_personagem.poderDeAtaque, tb_personagem.poderDeDefesa
FROM tb_personagem 
INNER JOIN tb_classe
on tb_personagem.codClasse = tb_classe.codClasse;

-- Faça um select onde traga todos os personagem de uma classe específica (exemplo todos os personagens que são arqueiros).
SELECT tb_personagem.codPersonagem, tb_personagem.nomePersonagem,
	   tb_classe.nomeClasse,
	   tb_personagem.hpPersonagem, tb_personagem.mpPersonagem, 
       tb_personagem.poderDeAtaque, tb_personagem.poderDeDefesa
FROM tb_personagem 
INNER JOIN tb_classe
on tb_personagem.codClasse = tb_classe.codClasse
WHERE tb_personagem.codClasse = 2;

-- salve as querys para cada uma dos requisitos do exercício em um arquivo .SQL ou texto e coloque no seu GitHuB pessoal e compartilhe esta atividade.


