package com.dam1.ej51.src.clases

class EmpleadoFijo(nombre: String, edad: Int, id: String,val salarioFijo: Double, val pagadas: Int ): Empleado(nombre, edad, id){
    override fun calcularSalario(): Double {
        return salarioFijo / pagadas
    }
}
