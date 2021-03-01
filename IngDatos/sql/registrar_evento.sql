CREATE OR REPLACE PROCEDURE REGISTRAR_EVENTO (cod_evento VARCHAR2,
                                                cod_proyecto VARCHAR2, 
                                                fecha DATE, 
                                                descripcion VARCHAR2)
AS
BEGIN
    INSERT INTO EVENTO VALUES (cod_evento, cod_proyecto, fecha, descripcion);
END;