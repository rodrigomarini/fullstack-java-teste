CREATE SCHEMA `fullstack_java` ;

CREATE  TABLE `fullstack_java`.`viagem` (
  `id_solicitacao` INT NOT NULL ,
  `nome_passageiro` VARCHAR(200) NULL ,
  `cia_aerea` VARCHAR(200) NULL ,
  `saida` DATETIME NULL ,
  `chegada` DATETIME NULL ,
  `cidade_origem` VARCHAR(200) NULL ,
  `cidade_destino` VARCHAR(200) NULL ,
  `status_consulta_ws` VARCHAR(15) NOT NULL ,
  PRIMARY KEY (`id_solicitacao`) ,
  UNIQUE INDEX `id_solicitacao_UNIQUE` (`id_solicitacao` ASC) );
