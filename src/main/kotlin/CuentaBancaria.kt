open class CuentaBancaria(
    val numeroCuenta: Int,
    val cliente: Cliente,
    var saldoInicial: Double
) {


    //Encapsulamiento = Proteger
    private var saldo: Double = saldoInicial

    fun obtenerSaldo(): Double{
        return saldo
    }

    fun depositar(monto: Double){
        if(monto<0){
            throw IllegalArgumentException("El monto debe ser mayor a 0")
        }

        saldo += monto

        println("Monto depositado correctamente")
    }

    //retiro
    fun retirar(monto: Double){
        if(monto<0){
            throw IllegalArgumentException("El monto debe ser mayor a 0")
        }
        if(monto>saldo){
            throw SaldoInsuficienteExeption("Saldo Insuficiente")
        }
        saldo -= monto

        println("Retiro exitoso")
    }

    //declara un metodo para apliucar polimorfismo
    open fun mostraTipoCuenta(){

    }
}