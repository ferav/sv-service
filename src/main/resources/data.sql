

INSERT INTO tipo ( nombre, CREATED_AT, VERSION ) VALUES ('Equipo pesado','2018-04-10 14:46:19.282', 0);
INSERT INTO tipo ( nombre, CREATED_AT, VERSION ) VALUES ('Equipo agricola','2018-04-10 14:46:19.282', 0);
INSERT INTO equipo ( modelo,tipo_id,precio,vendido, CREATED_AT, VERSION ) VALUES ('323DL',1,40000,false,'2018-04-10 14:46:19.282', 0);
INSERT INTO equipo ( modelo,tipo_id,precio,vendido, CREATED_AT, VERSION ) VALUES ('320DL',1,35000,false,'2018-04-10 14:46:19.282', 0);

INSERT INTO costo ( costo_aduana,costo_equipo,costo_importacion,equipo_id, CREATED_AT, VERSION ) VALUES (12000,60000,10000,1,'2018-04-10 14:46:19.282', 0);
INSERT INTO costo ( costo_aduana,costo_equipo,costo_importacion,equipo_id, CREATED_AT, VERSION ) VALUES (12000,60000,10000,2,'2018-04-10 14:46:19.282', 0);


INSERT INTO cliente ( nombre, ci, apellidos, email, CREATED_AT, VERSION ) VALUES ('juan',2939239,'alvarez','juan@gmail.com','2018-04-10 14:46:19.282', 0);
INSERT INTO venta ( cliente_id, date, CREATED_AT, VERSION ) VALUES (1,'2018-01-01','2018-04-10 14:46:19.282', 0);
INSERT INTO venta ( cliente_id, date, CREATED_AT, VERSION ) VALUES (1,'2018-01-01','2018-04-10 14:46:19.282', 0);

INSERT INTO venta ( cliente_id, date, CREATED_AT, VERSION ) VALUES (1,'2018-01-01','2018-04-10 14:46:19.282', 0);

INSERT INTO detalle ( equipo_id, venta_id, CREATED_AT, VERSION ) VALUES (1,1,'2018-04-10 14:46:19.282', 0);
INSERT INTO detalle ( equipo_id, venta_id, CREATED_AT, VERSION ) VALUES (2,1,'2018-04-10 14:46:19.282', 0);






--INSERT INTO detalle ( venta_id, CREATED_AT, VERSION ) VALUES (1,'2018-04-10 14:46:19.282', 0);