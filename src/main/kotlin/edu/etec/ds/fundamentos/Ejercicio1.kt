package edu.etec.ds.fundamentos

import kotlin.math.abs

fun suma(a: Int, b: Int): Int {
    return a + b
    TODO("Implementar suma de dos enteros")
}

fun resta(a: Int, b: Int): Int {
    return a - b
    TODO("Implementar resta de dos enteros")
}

fun multiplicacion(a: Int, b: Int): Int {
    return a * b
    TODO("Implementar multiplicacion de dos enteros")
}

fun division(a: Int, b: Int): Int {
    return a / b
    TODO("Implementar division entera de dos enteros")
}

fun modulo(a: Int, b: Int): Int {
    return a % b
    TODO("Implementar modulo de dos enteros")
}

fun esMayorQue(a: Int, b: Int): Boolean {
    return a > b
    TODO("Retornar true si a es mayor que b")
}

fun esMenorQue(a: Int, b: Int): Boolean {
    return a < b
    TODO("Retornar true si a es menor que b")
}

fun sonIguales(a: Int, b: Int): Boolean {
    return a == b
    TODO("Retornar true si a y b son iguales")
}

fun esPar(numero: Int): Boolean {
    return (numero % 2) == 0
    TODO("Retornar true si el numero es par")
}

fun esImpar(numero: Int): Boolean {
    return (numero % 2) != 0
    TODO("Retornar true si el numero es impar")
}

fun valorAbsoluto(numero: Int): Int {
    return abs(numero)
}

fun maximo(a: Int, b: Int): Int {
    return if (a > b) a else b
    TODO("Retornar el mayor entre a y b")
}

fun minimo(a: Int, b: Int): Int {
    return if (a < b) a else b
    TODO("Retornar el menor entre a y b")
}
