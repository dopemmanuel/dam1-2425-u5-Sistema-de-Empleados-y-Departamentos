package com.dam1.ej51.src.clases

/***
 * NOTA PARA DIEGO:
 * ESTA CLASE LA HICE DE PRUEBA PARA ENTENDER MEJOR LO DEL INIT, ABSTRACT CLASS U OPEN CLASS....
 * EN RESUMEN, EL CONTENIDO EN GENERAL DE LAS CLASES QUE NO COMPRENDO RE-CREO UNA DE PRUEBA Y LA AGREGO AL EJERCICIO PARA PROBAR
 * Y LUEGO LAS IMPLEMENTO OPCIONALMENTE EN EL EJERCICIO.
 *
 */


open class Persona(val nombre: String, val edad: Int){
    init {
        require(nombre.isNotEmpty())
        require(edad > 0)
    }
}