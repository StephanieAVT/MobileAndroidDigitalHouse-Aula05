package br.com.digitalhousekotlin

class Conta(val numeroConta:Int, var saldoConta:Float, val titular :Cliente) {

    fun depositar(quantia:Float){
        saldoConta += quantia
        println("Deposito realizado")
        println("Novo saldo é de: $saldoConta")
    }

    fun sacar(quantia: Float){
        if(saldoConta < quantia){
            println("Saldo insuficiente na conta $numeroConta.")
        } else {
            saldoConta -=quantia
            println("Saque realizado.Novo saldo na conta é: $saldoConta")
        }
    }

}