#include <stdio.h>
#include <stdlib.h>
#include <time.h>

int tempoCaminhada;
int minutosTrote;
int minutosCaminhada;
int caloriasCaminhada = 6;
int caloriasTrote = 10;
int gastoCaloriasTotal;



int main (){

printf("Quanto tempo voce treinou? ");
scanf("%d", &tempoCaminhada);

printf("Quanto tempo voce caminhou? ");
scanf("%d", &minutosCaminhada);

minutosTrote = tempoCaminhada - minutosCaminhada;

gastoCaloriasTotal = (caloriasCaminhada * minutosCaminhada + caloriasTrote * minutosTrote);

printf("Gasto total de %d calorias, caminhando %d minutos e %d minutos de trotes." , gastoCaloriasTotal, minutosCaminhada, minutosTrote);

return 0;

}
 
