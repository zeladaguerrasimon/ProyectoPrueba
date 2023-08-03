CREATE DATABASE gestionrestaurant;

USE gestionrestaurant;

CREATE TABLE Mesa (
  ID INT PRIMARY KEY,
  Numero INT,
  Capacidad INT,
  Ubicacion VARCHAR(255)
);

CREATE TABLE Camarero (
  ID INT PRIMARY KEY,
  Nombre VARCHAR(255),
  Edad INT,
  Fecha_Inicio DATE
);

CREATE TABLE Plato (
  ID INT PRIMARY KEY,
  Nombre VARCHAR(255),
  Descripcion VARCHAR(255),
  Precio DECIMAL(5,2),
  Categoria VARCHAR(255)
);

CREATE TABLE Pedido (
  ID INT PRIMARY KEY,
  Mesa_ID INT,
  Camarero_ID INT,
  Fecha DATE,
  Total DECIMAL(5,2),
  FOREIGN KEY (Mesa_ID) REFERENCES Mesa(ID),
  FOREIGN KEY (Camarero_ID) REFERENCES Camarero(ID)
);

CREATE TABLE Detalle_Pedido (
  Pedido_ID INT,
  Plato_ID INT,
  Cantidad INT,
  Subtotal DECIMAL(5,2),
  PRIMARY KEY (Pedido_ID, Plato_ID),
  FOREIGN KEY (Pedido_ID) REFERENCES Pedido(ID),
  FOREIGN KEY (Plato_ID) REFERENCES Plato(ID)
);
