class CuentaJoven(
    numeroCuenta: Int,
    cliente: Cliente,
    saldoInicial: Double,
    var descuento: Double
) : CuentaBancaria(numeroCuenta, cliente, saldoInicial) {

    override fun mostraTipoCuenta() {
        println("Número de cuenta Joven")
        println("Descuento: $descuento%")
    }

}