package com.dam1.ej51.src.clases

class Departamento{
    private val empleLista = mutableListOf<Empleado>()

    fun addEmple(empleado: Empleado){
        empleLista.add(empleado)
    }
    fun calcularSalario(): Double{
        return empleLista.sumOf { it.calcularSalario() }
    }
    fun mostrarEmpleados(){
        for (empleado in empleLista){
            println("${empleado.nombre} con ID-${empleado.id} tiene un salario de %.2f al mes.".format(empleado.calcularSalario()))
        }
    }
}