package com.dam1.ej51.src.clases

class EmpleadoPorHora(nombre: String, edad: Int, id: String, val horasTrabajadas: Int, val tarifaHoras: Double): Empleado(nombre, edad, id){
    override fun calcularSalario(): Double {
        return horasTrabajadas * tarifaHoras
    }
}