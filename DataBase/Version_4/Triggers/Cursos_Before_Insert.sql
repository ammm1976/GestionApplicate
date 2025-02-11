DELIMITER $$

CREATE TRIGGER before_insert_cursos
BEFORE INSERT ON cursos
FOR EACH ROW
BEGIN
    SET NEW.plazas_disponibles = 25;
END $$

DELIMITER ;
