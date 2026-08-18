class CuentaCorriente(
    numeroCuenta: Int,
    cliente: Cliente,
    saldoInicial: Double,
    val limiteTranseferencia: Double
) : CuentaBancaria(numeroCuenta, cliente, saldoInicial) {

    override fun mostraTipoCuenta() {
        println("Esta es una cuenta corriente")

    }

}