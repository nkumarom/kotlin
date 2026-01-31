package com.training

// Single-expression function
fun singleExpressionFunction(x: Int, y: Int) = x + y

// Lambda-expression function
// [(String) -> String] is equivalent to [Function1<String, String>]
fun lambdaExpressionFunction(): (String) -> String {
    return { text: String -> text.uppercase() }
}



fun main(args: Array<String>) {
    println("Single-expression function: " + singleExpressionFunction(1, 2))
    println("Lambda-expression function: " + lambdaExpressionFunction()("hello"))
}