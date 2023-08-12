var texto = "Texto atribuído à variável global";

imprimirTexto();

function imprimirTexto(){
	var texto = "Novo texto atribuído à variável dentro funcao";
	console.log(texto);
}

console.log(texto);