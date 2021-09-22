/*
Atividade 3

Crie um banco de dados para um registro de uma escola, onde o sistema trabalhará com as informações dos estudantes deste registro dessa escola. 

Crie uma tabela estudantes e utilizando a habilidade de abstração e determine 5 atributos relevantes dos estudantes para se trabalhar com o serviço dessa escola.

Popule esta tabela com até 8 dados;

Faça um select que retorne o/as estudantes  com a nota maior do que 7.

Faça um select que retorne o/as estudantes  com a nota menor do que 7.

Ao término atualize um dado desta tabela através de uma query de atualização.

salve as querys para cada uma dos requisitos o exercício em um arquivo .SQL ou texto e coloque no seu GitHuB pessoal e compartilhe esta atividade.
*/
use turma33java;

-- Cria a Tabela
 Create table tb_estudante(
	raEstudante int auto_increment,
    nomeEstudante varchar(255) not null,
    notaEstudante decimal not null,
    emailEstudante varchar(255) not null,
    turmaEstudante int not null,
    primary key (raEstudante)
);

drop table tb_estudante;

-- Popula a Tabela
insert into tb_estudante (nomeEstudante, notaEstudante, emailEstudante, turmaEstudante)
values ("Tati", 10, "tati@generation.org", 33);
insert into tb_estudante (nomeEstudante, notaEstudante, emailEstudante, turmaEstudante)
values ("Camila Cleane", 10, "camilacleane@generation.org", 33);
insert into tb_estudante (nomeEstudante, notaEstudante, emailEstudante, turmaEstudante)
values ("Ed", 10, "ed@generation.org", 33);
insert into tb_estudante (nomeEstudante, notaEstudante, emailEstudante, turmaEstudante)
values ("Iran", 9, "iran@generation.org", 33);
insert into tb_estudante (nomeEstudante, notaEstudante, emailEstudante, turmaEstudante)
values ("Cassia", 8, "cassia@generation.org", 33);

-- Deletar registro
delete  from tb_estudante where raEstudante =00001;

-- Retorna e faz os filtros
select * from tb_estudante;
select * from tb_estudante where notaEstudante > 7;
select * from tb_estudante where notaEstudante < 7;

-- Atualiza o banco
update tb_estudante set notaEstudante=3 where raEstudante=2;
update tb_estudante set emailEstudante="teste@gmail.com" where raEstudante=00002;
