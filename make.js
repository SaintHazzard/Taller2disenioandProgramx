function calcularImpuestos(edad, ingresos) {
    return edad >= 18 && ingresos >= 1000 ? ingresos*0.40 : 0
}


console.log(calcularImpuestos(18, 1000));



function asteriscos(str) {
    return (str.match(/\*/g) || []).length;  
}

console.log(asteriscos("H*o*l*a"))
// console.log((str.match(new RegExp(/\*/, "g")) || []).length);



function duplicar(array) {
    return array.map(x => x * 2)
}


console.log(duplicar([3, 12, 45, 7]));