fun main(){

    val cliente = Cliente("MArcelo", "21.756.200-7")

    val cuentaAhorro = CuentaAhorro(1001,cliente,100000.0,3.5)

    val cuentaCorriente = CuentaCorriente(2001,cliente,100000.0,500000.0)

    val cuentaJoven = CuentaJoven(1001,cliente,10000.0,15.4)


    //Polimorfismo
    val cuentas: List<CuentaBancaria> = listOf(
        cuentaCorriente,
        cuentaAhorro,
        cuentaJoven
    )
     var i = 0
    for(cuenta in cuentas){
        i ++
        println("Cuenta $i")
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