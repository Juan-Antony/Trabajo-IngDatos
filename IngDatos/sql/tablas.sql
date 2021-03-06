CREATE TABLE CLIENTE(
    RUC VARCHAR2(11) PRIMARY KEY,
    NOMBRE_EMPRESA VARCHAR2(100) NOT NULL,
    RUBRO VARCHAR2(100) NOT NULL,
    INFO_ADCIONAL VARCHAR2(100)
);

CREATE TABLE CONTACTO(
    ID_CONTACTO VARCHAR2(4) PRIMARY KEY,
    NOMBRE_CONTACTO VARCHAR2(100) NOT NULL,
    RUC REFERENCES CLIENTE
);

CREATE TABLE CORREO_CONTACTO(
    CORREO_CONTACTO VARCHAR2(70),
    ID_CONTACTO REFERENCES CONTACTO,
    PRIMARY KEY(CORREO_CONTACTO, ID_CONTACTO)
);

CREATE TABLE TELEFONO_CONTACTO(
    TELEFONO_CONTACTO VARCHAR2(9),
    ID_CONTACTO REFERENCES CONTACTO,
    PRIMARY KEY(TELEFONO_CONTACTO, ID_CONTACTO)
);

CREATE TABLE PROYECTO(
    CODIGO_PROYECTO VARCHAR2(4) PRIMARY KEY,
    NOMBRE_PROYECTO VARCHAR2(100),
    RUC REFERENCES CLIENTE,
    ESTADO VARCHAR2(20),
    FECHA_INICIO DATE,
    FECHA_FIN DATE,
    MONTO NUMBER(12,2),
    PROTOTIPO VARCHAR2(10)
);

CREATE TABLE EVENTO(
    CODIGO_EVENTO VARCHAR2(3),
    CODIGO_PROYECTO REFERENCES PROYECTO,
    FECHA DATE NOT NULL,
    DESCRIPCION VARCHAR2(100),
    PRIMARY KEY(CODIGO_PROYECTO, CODIGO_EVENTO)
);

CREATE TABLE CONTRATO(
    CODIGO_CONTRATO VARCHAR2(3),
    CODIGO_PROYECTO REFERENCES PROYECTO,
    TIPO VARCHAR(30) NOT NULL,
    FECHA_INICIO DATE NOT NULL,
    FECHA_FIN DATE,
    PRIMARY KEY(CODIGO_CONTRATO, CODIGO_PROYECTO)
);
