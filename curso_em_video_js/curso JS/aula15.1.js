let num = [5, 8, 2, 9, 3]



num[3] = 6
num.push(1)
num.sort()

console.log(`Nosso vetor é: ${num}`)
console.log(`O tamanho é: ${num.length} posições`)
console.log(`O primeiro valor do vetor é: ${num[0]}`)
let numb = num.indexOf(6)

if(numb == -1){
    console.log(`O valor não foi encontrado`)
}else {
    console.log('O valor está na posição: ', numb)
}


