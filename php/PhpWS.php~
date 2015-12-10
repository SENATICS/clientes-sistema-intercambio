<?php

ini_set("soap.wsdl_cache_enabled", "0");
ini_set('soap.wsdl_cache_ttl', 0);

/*Credenciales desde un archivo de configuración*/
$fp = fopen("conexion.txt", "rb");
$datos = fread($fp, filesize("conexion.txt"));
$conect = explode("\r\n", $datos);

$usuario = $conect[0];
$contrasenha = $conect[1];

/*Cliente SOAP*/
$wsdl = "http://sii.senatics.gov.py:8080/mbohape/PersonaWS?wsdl";
$client = new SoapClient($wsdl, array (
		"trace" => 1,
		"exceptions" => 0,
		'login' => $usuario,
		'password' => $contrasenha,
		"connection_timeout" => 1));

$params = array('nroCedula' => $nro);

$result = $client->findPersonaByCedula($params);

print_r($result);

?>
