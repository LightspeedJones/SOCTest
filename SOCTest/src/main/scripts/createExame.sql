CREATE TABLE `exame` (
  `id` int NOT NULL AUTO_INCREMENT,
  `paciente` varchar(100) DEFAULT NULL,
  `doutor` varchar(100) DEFAULT NULL,
  `tipo` varchar(50) DEFAULT NULL,
  `dataExame` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) 