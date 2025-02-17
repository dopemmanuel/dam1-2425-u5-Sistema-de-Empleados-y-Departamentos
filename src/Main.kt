package com.dam1.ej51.src

import com.dam1.ej51.src.clases.Departamento
import com.dam1.ej51.src.clases.EmpleadoFijo
import com.dam1.ej51.src.clases.EmpleadoPorHora

/**
Ejercicio 2: Sistema de Empleados y Departamentos¶
Diseña una clase abstracta Empleado con propiedades como nombre, id, y un método abstracto
calculaSalario(). Crea clases derivadas como EmpleadoPorHora y EmpleadoFijo, que implementen
el método calculaSalario() de diferentes maneras. Considera añadir una clase Departamento que
tenga una lista de empleados y pueda calcular el salario total que se debe pagar a todos sus
empleados.

EmpleadoPorHora podría implementar dos propiedades cómo horasTrabajadas al mes y tarifaPorHora
para realizar el cálculo de su salario mensual. EmpleadoFijo podría tener a su vez dos
propiedades distintas, salarioFijo y numPagas del que podríamos calcular su salario mensual.

Departamento podría tener una lista de empleados y dos métodos: agregarEmpleado
y calculaSalarioTotal que tienen sus empleados al mes.

En el main crea una instancia de Departamento, agrega varios empleados, recorre la lista de
los empleados mostrando su información "Nombre con ID-0001 tiene un salario de 28697.96
al mes." (el id siempre con 4 posiciones numéricas y el salario con 2 decimales)

¿Se te ocurre alguna restricción lógica que podríamos introducir a las propiedades?

Objetivos:

Aprender a manejar la herencia y la implementación de métodos abstractos.
Comprender cómo diferentes subclases pueden tener implementaciones distintas de la misma
operación (polimorfismo).
Entender cómo agrupar múltiples objetos en una colección y realizar operaciones sobre ellos.
 * */

fun main(){
    val departamento = Departamento()
    val emp1 = EmpleadoPorHora("Carlos", 30, "A111111", 160, 15.5)
    val emp2 = EmpleadoFijo("Ana", 28, "B111111", 35000.0, 12)
    val emp3 = EmpleadoPorHora("Luis", 25, "C111111", 180, 12.0)
    val emp4 = EmpleadoFijo("Maria", 35, "D111111", 42000.0, 14)

    departamento.addEmple(emp1)
    departamento.addEmple(emp2)
    departamento.addEmple(emp3)
    departamento.addEmple(emp4)

    departamento.mostrarEmpleados()
    println("Salario total del departamento: %.2f".format(departamento.calcularSalario()))
}