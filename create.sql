-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema DB_Tareas
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema DB_Tareas
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `DB_Tareas` DEFAULT CHARACTER SET utf8 ;
USE `DB_Tareas` ;

-- -----------------------------------------------------
-- Table `DB_Tareas`.`Tarea`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `DB_Tareas`.`Tarea` (
  `idTarea` INT NOT NULL AUTO_INCREMENT,
  `descripcion` VARCHAR(255) NULL,
  `flg_estado` TINYINT NULL,
  PRIMARY KEY (`idTarea`))
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
