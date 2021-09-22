/*
Atividade 1

Crie um banco de dados para um serviço de RH de uma empresa, onde o sistema trabalhará com as informações dos funcionaries desta empresa. 

Crie uma tabela de funcionaries e utilizando a habilidade de abstração e determine 5 atributos relevantes dos funcionaries para se trabalhar com o serviço deste RH.

Popule esta tabela com até 5 dados;

Faça um select que retorne os funcionaries com o salário maior do que 2000.

Faça um select que retorne os funcionaries com o salário menor do que 2000.

Ao término atualize um dado desta tabela através de uma query de atualização.

salve as querys para cada uma dos requisitos do exercício em um arquivo .SQL ou texto e coloque no seu GitHuB pessoal e compartilhe esta atividade.
*/

-- Selecione o Banco de Dados a ser usado
use turma33java;

-- Cria a Tabela
 Create table tb_funcionarie(
	codFuncionarie bigint(5) auto_increment,
    nomeFuncionarie varchar(255) not null,
    emailFuncionarie varchar(255) not null,
    cargoFuncionarie varchar(255) not null,
    salarioFuncionarie decimal not null,
    primary key (codFuncionarie)
);

-- Popula a Tabela
insert into tb_funcionarie (nomeFuncionarie, emailFuncionarie, cargoFuncionarie, salarioFuncionarie)
values ("João", "joão@gmail.com", "Gerente RH", 8000.00);
insert into tb_funcionarie (nomeFuncionarie, emailFuncionarie, cargoFuncionarie, salarioFuncionarie)
values ("Esther", "estherrocha@gmail.com", "Estagio", 500.00);
insert into tb_funcionarie (nomeFuncionarie, emailFuncionarie, cargoFuncionarie, salarioFuncionarie)
values ("Danilo", "danilobraga@gmail.com", "Vendedor", 1000.00);
insert into tb_funcionarie (nomeFuncionarie, emailFuncionarie, cargoFuncionarie, salarioFuncionarie)
values ("Mariah", "mariahdamata@gmail.com", "Limpeza", 800.00);
insert into tb_funcionarie (nomeFuncionarie, emailFuncionarie, cargoFuncionarie, salarioFuncionarie)
values ("Alex", "alex123@gmail.com", "Desenvolvedor Júnior", 4000.00);

-- Deletar registro
delete  from tb_funcionarie where codFuncionarie = 2;

-- Retorna e faz os filtros
select * from tb_funcionarie;
select * from tb_funcionarie where salarioFuncionarie > 2000;
select * from tb_funcionarie where salarioFuncionarie < 2000;

-- Atualiza o banco
update tb_funcionarie set cargoFuncionarie="Desenvolvedor Junior" where codFuncionarie=3;
