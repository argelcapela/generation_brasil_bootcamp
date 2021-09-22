/*
Atividade 2

Crie um banco de dados para um e commerce, onde o sistema trabalhará com as informações dos produtos deste ecommerce. 

Crie uma tabela produtos e utilizando a habilidade de abstração e determine 5 atributos relevantes dos produtos para se trabalhar com o serviço deste ecommerce.

Popule esta tabela com até 8 dados;

Faça um select que retorne os produtos com o valor maior do que 500.

Faça um select que retorne os produtos com o valor menor do que 500.

Ao término atualize um dado desta tabela através de uma query de atualização.

salve as querys para cada uma dos requisitos o exercício em um arquivo .SQL ou texto e coloque no seu GitHuB pessoal e compartilhe esta atividade.
*/
-- Selecione o Banco de Dados a ser usado
use turma33java;

-- Cria a Tabela
 Create table tb_produto(
	codProduto bigint(5) auto_increment,
    nomeProduto varchar(255) not null,
    valorProduto varchar(255) not null,
    qtdProdutoNoEstoque varchar(255) not null,
    categoriaProduto bigint not null,
    primary key (codProduto)
);

-- Popula a Tabela
insert into tb_produto (nomeProduto, valorProduto, qtdProdutoNoEstoque, categoriaProduto)
values ("Notebook Acer", 5000.00, 10, 1);
insert into tb_produto (nomeProduto, valorProduto, qtdProdutoNoEstoque, categoriaProduto)
values ("Alexa", 500, 500, 2);
insert into tb_produto (nomeProduto, valorProduto, qtdProdutoNoEstoque, categoriaProduto)
values ("Macbook BigSur 11", 22.000, 10, 1);
insert into tb_produto (nomeProduto, valorProduto, qtdProdutoNoEstoque, categoriaProduto)
values ("Iphone 11", 11.000, 10, 2);
insert into tb_produto (nomeProduto, valorProduto, qtdProdutoNoEstoque, categoriaProduto)
values ("Speaker", 400, 10, 2);

-- Deletar registro
delete  from tb_produto where codFuncionarie = 2;

-- Retorna e faz os filtros
select * from tb_produto;
select * from tb_produto where valorProduto > 500;
select * from tb_produto where valorProduto < 500;

-- Atualiza o banco
update tb_produto set precoProduto=300 where codProduto=4;
update tb_produto set qtdProdutoNoEstoque=10 where codProduto=2;
