package br.com.digitalhousekotlin

fun main(){
    var cliente1 = Cliente("Maria","Silva")
    var cliente2 = Cliente("João","Vieira")

    var conta1 = Conta(12345,100.50f,cliente1)
    var conta2 = Conta(98887,10000.0f,cliente2)

    conta1.depositar(50.0f)
    conta2.depositar(20.45f)

    conta1.sacar(1000.0f)
    conta2.sacar(100f)


}