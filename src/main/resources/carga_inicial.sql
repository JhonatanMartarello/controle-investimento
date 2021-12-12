insert into tb_dom_dominio(dom_cod_dominio, dom_descricao) values (1, 'TIPO ATIVO');
insert into tb_reg_registro(reg_id_registro, reg_cod_dominio, reg_cod_registro, reg_descricao, reg_complemento) values (1, 1, 1, 'AÇÃO', 'Ação');
insert into tb_reg_registro(reg_id_registro, reg_cod_dominio, reg_cod_registro, reg_descricao, reg_complemento) values (2, 1, 2, 'FII', 'Fundo Imobiliário');


insert into tb_ati_ativo(ati_codigo_negociacao, ati_nome, ati_cnpj, ati_tipo_ativo) values ('BBAS3', 'Banco do Brasil', 00000000000191, 1);
insert into tb_ati_ativo(ati_codigo_negociacao, ati_nome, ati_cnpj, ati_tipo_ativo) values ('MGLU3', 'Magazine Luiza', 47960950000121, 1);