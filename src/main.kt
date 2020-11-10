fun main () {
    println("Bem vindo ao ByteBank")
    val contaAlex= Conta("Alex",1000 )
    contaAlex.deposita(200.0)

    val contaFran= Conta(numero = 1001, titular = "Fran")
    contaFran.deposita(300.0)


    println("Olá ${contaAlex.titular} seu saldo é de R$ ${contaAlex.saldo}");
    println("Olá ${contaFran.titular} seu saldo é de R$ ${contaFran.saldo}");

    println("Depositando na conta do ${contaAlex.titular}")
    contaAlex.deposita(50.0)
    println("Saldo é de R$ ${contaAlex.saldo}");
    contaAlex.saca(50.0)
    println("Saldo é de R$ ${contaAlex.saldo}");

    println("Transferencia de Fran para Alex")
    if(contaFran.transfere(10.0, contaAlex)) {
        println("Sucesso na transferencia")
        println("Saldo é de R$ ${contaAlex.saldo}");
    } else {
        println("faha na transferencia")
        println("Saldo é de R$ ${contaAlex.saldo}");
    }


}

class Conta(
    var titular: String,
    val numero: Int
){

    var saldo = 0.0
        private set

    fun deposita(saldo: Double){
        if(saldo>0) {
            this.saldo += saldo
        }
    }

    fun saca(saldo: Double){
        if(this.saldo >= saldo){
            this.saldo-= saldo
        } else {
            //faz algo
        }
    }

    fun transfere(valor : Double, destino: Conta): Boolean{
        if(this.saldo >= valor){
            saca(valor)
            destino.deposita(valor)
            return true
        }
        return false
    }
}

fun testaCopiasEReferencias(){
}

fun testaLacos(){
    var i = 0
    while (i<5){
        val titular: String  = "Alex $i"
        val numeroConta: Int = 1000 + i
        var saldo = i + 10.0

        println("Titular $titular")
        println("número da conta $numeroConta")
        println("Saldo da conta $saldo")
        println()
        i++
    }



    for(i in 5 downTo 1){
        val titular: String  = "Alex $i"
        val numeroConta: Int = 1000 + i
        var saldo = i + 10.0

        println("Titular $titular")
        println("número da conta $numeroConta")
        println("Saldo da conta $saldo")
        println()
    }


}

