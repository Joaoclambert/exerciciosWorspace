//Sintaxe: $.get(URL,callback);
$.get("https://www.cnnbrasil.com.br", function(data, status){
	alert("Dados Retornados: " + data + "\nStatus: " + status);
});