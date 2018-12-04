USE [db_service_habilitados]

SET IDENTITY_INSERT [dbo].[paquete] ON 

INSERT [dbo].[paquete] ([paquete_id], [descripcion]) VALUES (1, 'Opcion 1')
INSERT [dbo].[paquete] ([paquete_id], [descripcion]) VALUES (2, 'Opcion 2')
INSERT [dbo].[paquete] ([paquete_id], [descripcion]) VALUES (3, 'Opcion 3')
INSERT [dbo].[paquete] ([paquete_id], [descripcion]) VALUES (4, 'Opcion 4')
INSERT [dbo].[paquete] ([paquete_id], [descripcion]) VALUES (5, 'Opcion 5')
INSERT [dbo].[paquete] ([paquete_id], [descripcion]) VALUES (6, 'Opcion 6')
INSERT [dbo].[paquete] ([paquete_id], [descripcion]) VALUES (7, 'Opcion 7')

SET IDENTITY_INSERT [dbo].[paquete] OFF
SET IDENTITY_INSERT [dbo].[tipo_habilitado] ON 

INSERT [dbo].[tipo_habilitado] ([tipo_habilitado_id], [descripcion]) VALUES (1, 'Embolsado 1 micra')
INSERT [dbo].[tipo_habilitado] ([tipo_habilitado_id], [descripcion]) VALUES (2, 'Etiquetado')
INSERT [dbo].[tipo_habilitado] ([tipo_habilitado_id], [descripcion]) VALUES (3, 'Ensobrado')
INSERT [dbo].[tipo_habilitado] ([tipo_habilitado_id], [descripcion]) VALUES (4, 'Doblado')
INSERT [dbo].[tipo_habilitado] ([tipo_habilitado_id], [descripcion]) VALUES (5, 'Inserto')
INSERT [dbo].[tipo_habilitado] ([tipo_habilitado_id], [descripcion]) VALUES (6, 'Embolsado 2 micras')
INSERT [dbo].[tipo_habilitado] ([tipo_habilitado_id], [descripcion]) VALUES (7, 'Etiquetado (3 etiquetas)')

SET IDENTITY_INSERT [dbo].[tipo_habilitado] OFF


INSERT [dbo].[paquete_tipo_habilitado] ( [paquete_id], [tipo_habilitado_id]) VALUES (1,1)
INSERT [dbo].[paquete_tipo_habilitado] ( [paquete_id], [tipo_habilitado_id]) VALUES (1,2)
INSERT [dbo].[paquete_tipo_habilitado] ( [paquete_id], [tipo_habilitado_id]) VALUES (2,1)
INSERT [dbo].[paquete_tipo_habilitado] ( [paquete_id], [tipo_habilitado_id]) VALUES (2,2)
INSERT [dbo].[paquete_tipo_habilitado] ( [paquete_id], [tipo_habilitado_id]) VALUES (2,3)
INSERT [dbo].[paquete_tipo_habilitado] ( [paquete_id], [tipo_habilitado_id]) VALUES (3,1)
INSERT [dbo].[paquete_tipo_habilitado] ( [paquete_id], [tipo_habilitado_id]) VALUES (3,2)
INSERT [dbo].[paquete_tipo_habilitado] ( [paquete_id], [tipo_habilitado_id]) VALUES (3,3)
INSERT [dbo].[paquete_tipo_habilitado] ( [paquete_id], [tipo_habilitado_id]) VALUES (3,4)
INSERT [dbo].[paquete_tipo_habilitado] ( [paquete_id], [tipo_habilitado_id]) VALUES (4,5)
INSERT [dbo].[paquete_tipo_habilitado] ( [paquete_id], [tipo_habilitado_id]) VALUES (4,1)
INSERT [dbo].[paquete_tipo_habilitado] ( [paquete_id], [tipo_habilitado_id]) VALUES (4,2)
INSERT [dbo].[paquete_tipo_habilitado] ( [paquete_id], [tipo_habilitado_id]) VALUES (5,3)
INSERT [dbo].[paquete_tipo_habilitado] ( [paquete_id], [tipo_habilitado_id]) VALUES (5,6)
INSERT [dbo].[paquete_tipo_habilitado] ( [paquete_id], [tipo_habilitado_id]) VALUES (5,2)
INSERT [dbo].[paquete_tipo_habilitado] ( [paquete_id], [tipo_habilitado_id]) VALUES (6,1)
INSERT [dbo].[paquete_tipo_habilitado] ( [paquete_id], [tipo_habilitado_id]) VALUES (6,7)
INSERT [dbo].[paquete_tipo_habilitado] ( [paquete_id], [tipo_habilitado_id]) VALUES (7,3)
INSERT [dbo].[paquete_tipo_habilitado] ( [paquete_id], [tipo_habilitado_id]) VALUES (7,6)
INSERT [dbo].[paquete_tipo_habilitado] ( [paquete_id], [tipo_habilitado_id]) VALUES (7,2)
INSERT [dbo].[paquete_tipo_habilitado] ( [paquete_id], [tipo_habilitado_id]) VALUES (7,5)




