fun main (parametro : Array<String>){
    Ejercicios(8,8,8);
    zodiaco("diciembre",19)
    multiplicacion(2)
}

fun Ejercicios (n1:Int,n2:Int,n3:Int){
    var max = if (n1 > n2 && n1 > n3) println("El numero mayor es: $n1")
    else if(n2 > n1 && n2 > n3) println("El numero mayor es: $n2")
    else println("El numero mayor es: $n3")

    var min = if (n1 < n2 && n1 < n3) println("El numero menor es: $n1")
    else if (n2 < n1 && n2 < n3) println("El numero menor es: $n2")
    else println("El numero menor es: $n3")

    var igualdad = if (n1 == n2 && n1 == n3) println("Son iguales")
    else if (n2 == n3) println("Son iguales")
    else println("Son diferentes")
}

fun zodiaco (mes:String, dia:Int){
    var signo:String = ""

    if(mes == "diciembre" && (dia >= 22 && dia <= 31) || (mes == "enero" && dia <= 20))
        signo ="Capricornio"
    if (mes == "enero" && (dia >= 21 && dia <= 31) || (mes == "febrero" && dia <= 19))
        signo ="Acuario"
    if (mes == "febrero" && (dia >= 20 && dia <= 29) || (mes == "marzo" && dia <= 20))
        signo ="Pisis"
    if (mes == "marzo" && (dia >= 21 && dia <= 31) || (mes == "abril" && dia <= 20))
        signo ="Aries"
    if (mes == "abril" && (dia >= 21 && dia <= 30) || (mes == "mayo" && dia <= 20))
        signo ="Tauro"
    if (mes == "mayo" && (dia >= 1 && dia <= 31) || (mes == "junio" && dia <= 21))
        signo ="Geminis"
    if (mes == "junio" && (dia >= 22 && dia <= 30) || (mes == "julio" && dia <= 22))
        signo ="Cancer"
    if (mes == "julio" && (dia >= 23 && dia <= 31) || (mes == "agosto" && dia <= 22))
        signo ="Leo"
    if (mes == "agosto" && (dia >= 23 && dia <= 31) || (mes == "septiembre" && dia <= 22))
        signo ="Virgo"
    if (mes == "septiembre" && (dia >= 23 && dia <= 30) || (mes == "octubre" && dia <= 22))
        signo ="Libra"
    if (mes == "octubre" && (dia >= 23 && dia <= 31) || (mes == "noviembre" && dia <= 22))
        signo ="Escorpion"
    if (mes == "noviembre" && (dia >= 23 && dia <= 30) || (mes == "diciembre" && dia <= 21))
        signo ="Sagitario"

    println("Tu signo zodiacal es: $signo")
}

fun multiplicacion(n: Int){
    for (i in 0..10) {
        println("$n x $i = ${n * i}")
    }
}

