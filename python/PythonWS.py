#!/usr/bin/env python
import os
from suds import WebFault
from suds.transport.https import HttpAuthenticated
from suds.client import Client

try:
	cwd = os.getcwd()
	path = os.path.abspath(os.path.join(cwd, "Documentos/Clientes WS para SII/python/conf.txt"))
	archivo=open(path, 'r')
	lineas=list(archivo)
	usuario=lineas[0]
	contrasenha=lineas[1]
except IOError, e:
	print (e)

transport = HttpAuthenticated(username=usuario, password=contrasenha)
client = Client("http://192.168.202.41:8080/mbohape/PersonaWS?wsdl", transport=transport)

try:
	result=client.service.findPersonaByCedula("111111")
	if result:
		print result
	else:
		print 'No se obtuvo ningun resultado para la busqueda'
except WebFault, e:
	print(e)
