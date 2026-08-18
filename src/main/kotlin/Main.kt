fun main(){

    val cliente = Cliente("MArcelo", "21.756.200-7")

    val cuentaAhorro = CuentaAhorro(1001,cliente,100000.0,3.5)

    val cuentaCorriente = CuentaCorriente(2001,cliente,100000.0,500000.0)

    //Polimorfismo
    val cuentas: List<CuentaBancaria> = listOf(
        cuentaCorriente,
        cuentaAhorro
    )

    for(cuenta in cuentas){
        cuenta.mostraTipoCuenta()
    }

    try{
        println("Ingresa el monto a retirar")
        val monto = readln().toDouble()
        cuentaAhorro.retirar(monto)
        println("Saldo: $ ${cuentaAhorro.obtenerSaldo()}")
    }catch (error: NumberFormatException){
        println("Error, Ingrese un número")
    }catch (error: SaldoInsuficienteExeption){
        println("Error: ${error.message}")
    }finally {
        println("Operación finalizada")
    }

    println("Programa finalizado")
}