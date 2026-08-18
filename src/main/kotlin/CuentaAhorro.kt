class CuentaAhorro(
    val numeroCueta: Int,
    cliente: Cliente,
    saldoInicial: Double,
    val tasaInteres: Double
) : CuentaBancaria(numeroCueta,cliente,saldoInicial) {

    override fun mostraTipoCuenta() {
        println("Esta es una cuenta de ahorro")
        println("Tasa de Interes: $tasaInteres")
    }

}