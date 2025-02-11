DELIMITER $$

CREATE TRIGGER before_insert_inscripciones
BEFORE INSERT ON inscripciones
FOR EACH ROW
BEGIN
    DECLARE plazas INT;
    
    -- Obtener las plazas disponibles del curso
    SELECT plazas_disponibles INTO plazas FROM cursos WHERE id_curso = NEW.id_curso;

    -- Verificar si hay plazas disponibles
    IF plazas <= 0 THEN
        SIGNAL SQLSTATE '45000'
        SET MESSAGE_TEXT = 'No hay plazas disponibles para este curso';
    ELSE
        -- Si hay plazas disponibles, reducir en 1
        UPDATE cursos
        SET plazas_disponibles = plazas_disponibles - 1
        WHERE id_curso = NEW.id_curso;
    END IF;
END $$

DELIMITER ;

