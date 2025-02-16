package com.dam1.ej51.src.clases

abstract class Empleado(nombre: String, edad: Int, val id: String): Persona(nombre, edad){
    abstract fun calcularSalario(): Double

}