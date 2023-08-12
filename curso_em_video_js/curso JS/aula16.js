function parimp(n){
    if (n % 2==0){
        return 'O número é par!'
    }else{
        return 'O número é impar!'
    }
}
let res = parimp(11)
console.log(res)   // ou pode ser direto
console.log(parimp(256))

function soma(n1, n2){
    return n1 + n2
}
console.log(soma(2, 5))

let v = function(x){
    return x**2
}
console.log(v(5))

function fatorial(ft){
    let fat = 1
    for (let c = ft; c > 1; c--){
        fat *= c
    }
    return fat
}
console.log(fatorial(5))

function fatorial(f){
if( f == 1){
    return 1
}else{
    return f * fatorial (f-1)
}

}
console.log(fatorial(4))

// 5! = 5x4x3x2x1
// 5! = 5 * 4!
// f! = f * (f-1)!
// 1! = 1