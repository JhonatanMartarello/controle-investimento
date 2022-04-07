insert into tb_dominio(dom_cod_dominio, dom_descricao) values (1, 'Tipo Movimento');
insert into tb_registro(reg_cod_registro, reg_cod_dominio, reg_id_registro, reg_descricao, reg_complemento) values (1, 1, 1, 'Compra', '');
insert into tb_registro(reg_cod_registro, reg_cod_dominio, reg_id_registro, reg_descricao, reg_complemento) values (2, 1, 2, 'Venda', '');

insert into tb_dominio(dom_cod_dominio, dom_descricao) values (2, 'Mercado');
insert into tb_registro(reg_cod_registro, reg_cod_dominio, reg_id_registro, reg_descricao, reg_complemento) values (3, 2, 1, 'Mercado à Vista', '');
insert into tb_registro(reg_cod_registro, reg_cod_dominio, reg_id_registro, reg_descricao, reg_complemento) values (4, 2, 2, 'Mercado Fracionário', '');

insert into tb_dominio(dom_cod_dominio, dom_descricao) values (3, 'Tipo Operacao');
insert into tb_registro(reg_cod_registro, reg_cod_dominio, reg_id_registro, reg_descricao, reg_complemento) values (5, 3, 1, 'DayTrade', '');
insert into tb_registro(reg_cod_registro, reg_cod_dominio, reg_id_registro, reg_descricao, reg_complemento) values (6, 3, 2, 'SwingTrade', '');

insert into tb_dominio(dom_cod_dominio, dom_descricao) values (4, 'Entrada/Saída');
insert into tb_registro(reg_cod_registro, reg_cod_dominio, reg_id_registro, reg_descricao, reg_complemento) values (7, 4, 1, 'Credito', '');
insert into tb_registro(reg_cod_registro, reg_cod_dominio, reg_id_registro, reg_descricao, reg_complemento) values (8, 4, 2, 'Debito', '');

insert into tb_dominio(dom_cod_dominio, dom_descricao) values (5, 'Movimentação');
insert into tb_registro(reg_cod_registro, reg_cod_dominio, reg_id_registro, reg_descricao, reg_complemento) values (9, 5, 1, 'Rendimento', '');

insert into tb_dominio(dom_cod_dominio, dom_descricao) values (6, 'Tipo Ativo');
insert into tb_registro(reg_cod_registro, reg_cod_dominio, reg_id_registro, reg_descricao, reg_complemento) values (10, 6, 1, 'Ação', 'Ação');
insert into tb_registro(reg_cod_registro, reg_cod_dominio, reg_id_registro, reg_descricao, reg_complemento) values (11, 6, 2, 'Fii', 'Fundo Imobiliário');

insert into tb_ativo(ati_codigo_negociacao, ati_nome, ati_cnpj, ati_tipo_ativo) values ('BBAS3', 'Banco do Brasil', 00000000000191, 10);
insert into tb_ativo(ati_codigo_negociacao, ati_nome, ati_cnpj, ati_tipo_ativo) values ('MGLU3', 'Magazine Luiza', 47960950000121, 10);