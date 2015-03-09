
//Numeros primos
def contador = 0

Long time_end
Long time_start

time_start= System.currentTimeMillis()

100.times {if (it>1)
    for ( i in 1..it) {
        if( it%i == 0){
            contador++
        }
    }
    if (contador == 2) {
        println "Primo: ${it}"
    }
    contador = 0
}

time_end= System.currentTimeMillis()
println ("Tiempo final:" + (time_end - time_start))