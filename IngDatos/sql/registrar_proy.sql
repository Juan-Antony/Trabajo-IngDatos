CREATE OR REPLACE PROCEDURE REGISTRAR_PROYECTO (codigo NUMBER,
                                                    nombre VARCHAR2,
                                                    ruc VARCHAR2,
                                                    estado VARCHAR2,
                                                    fechaIn DATE,
                                                    fechaFin DATE,
                                                    monto NUMBER,
                                                    prototipo VARCHAR2)
AS
BEGIN
    INSERT INTO PROYECTO VALUES (codigo, nombre, ruc, estado, fechaIn, fechaFin, monto, prototipo);
END;