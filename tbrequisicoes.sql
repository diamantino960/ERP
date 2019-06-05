create database erp;

use erp;


CREATE TABLE tbrequisicoes(
id int primary key not null auto_increment,
valorestimado double,
fornecedor VARCHAR(30),
projeto VARCHAR(15),
detrequisicao VARCHAR(500),
status VARCHAR(10),
motivo VARCHAR(500)
);

drop table tbrequisicoes;


SELECT * FROM tbrequisicoes WHERE status = 'pendente';

Select * from tbrequisicoes;

SELECT id FROM tbrequisicoes order by id desc LIMIT 1;


UPDATE tbrequisicoes SET motivo = 'blabla', status = 'rejeitado' WHERE tbrequisicoes.id = 1;