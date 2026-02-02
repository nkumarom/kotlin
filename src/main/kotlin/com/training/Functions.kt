package com.training


// Single-expression function
fun singleExpressionFunction(x: Int, y: Int) = x + y

/*
* A lambda expression is an anonymous function (function without a name) written in a
* concise syntax. You can invoke a lambda expression by putting parentheses after it
* and passing the required arguments.
* Syntax: { parameters -> body }
*
* Every lambda expression has a function type, that represents how the expression should behave.
* Example:
* { (x: Int, y: Int) -> x + y } has function type (Int, Int) -> Int
* { (x: String) -> Boolean } has function type (String) -> Boolean
* */
fun lambdaExpressionFunctions() {
    // Predicate is a function which takes an input and returns a boolean
    // Function Type: Predicate<T> == Function1<T, Boolean> == (T) -> Boolean
    val predicateInJavaFormat: java.util.function.Predicate<String> = { it == "nitish" }
    val predicateInLambdaFormat: (String) -> Boolean = { it == "nitish" }
    val predicateInFunctionalFormat: Function1<String, Boolean> = { it == "nitish" }
    println("Usage: " + predicateInJavaFormat.test("nitish"))
    println("Usage: " + predicateInLambdaFormat("nitish"))
    println("Usage: " + predicateInFunctionalFormat("nitish"))

    // Consumer is a function which takes an input and returns nothing
    // Function Type: Consumer<T> == Function1<T, Unit> == (T) -> Unit
    val consumerInJavaFormat: java.util.function.Consumer<String> = { println("nitish") }
    val consumerInLambdaFormat: (String) -> Unit = { println("nitish") }
    val consumerInFunctionalFormat: Function1<String, Unit> = { println("nitish")  }
    println("Usage: " + consumerInJavaFormat.accept("nitish"))
    println("Usage: " + consumerInLambdaFormat("nitish"))
    println("Usage: " + consumerInFunctionalFormat("nitish"))

    // Supplier is a function which takes no input and returns a value
    // Function Type: Supplier<T> == Function0<T> == () -> T
    val supplierInJavaFormat: java.util.function.Supplier<String> = { "nitish" }
    val supplierInLambdaFormat: () -> String = { "nitish" }
    val supplierInFunctionalFormat: Function0<String> = { "nitish" }
    println("Usage: " + supplierInJavaFormat.get())
    println("Usage: " + supplierInLambdaFormat())
    println("Usage: " + supplierInFunctionalFormat())

    // Transformer is a function which takes an input and transforms it to output
    // Function Type: Function<T, R> == Function1<T, R> == (T) -> R
    val transformerInJavaFormat: java.util.function.Function<String, Int> = { it.length }
    val transformerInLambdaFormat: (String) -> Int = { it.length }
    val transformerInFunctionalFormat: Function1<String, Int> = { it.length }
    println("Usage: " + transformerInJavaFormat.apply("nitish"))
    println("Usage: " + transformerInLambdaFormat("nitish"))
    println("Usage: " + transformerInFunctionalFormat("nitish"))

    // BiFunction is a function which takes two inputs and returns a value
    // Function Type: BiFunction<T, U, R> == Function2<T, U, R> == (T, U) -> R
    val biFunctionInJavaFormat: java.util.function.BiFunction<Int, Int, Int> = { a, b -> a + b }
    val biFunctionInLambdaFormat: (Int, Int) -> Int = { a, b -> a + b }
    val biFunctionInFunctionalFormat: Function2<Int, Int, Int> = { a, b -> a + b }
    println("Usage: " + biFunctionInJavaFormat.apply(5, 3))
    println("Usage: " + biFunctionInLambdaFormat(5, 3))
    println("Usage: " + biFunctionInFunctionalFormat(5, 3))

    // Comparator is a function which takes two inputs and returns an Int
    // Function Type: Comparator<T> == Function2<T, T, Int> == (T, T) -> Int
    val comparatorInJavaFormat: java.util.Comparator<String> = { a, b -> a.compareTo(b) }
    val comparatorInLambdaFormat: (String, String) -> Int = { a, b -> a.compareTo(b) }
    val comparatorInFunctionalFormat: Function2<String, String, Int> = { a, b -> a.compareTo(b) }
    println("Usage: " + comparatorInJavaFormat.compare("a", "b"))
    println("Usage: " + comparatorInLambdaFormat("a", "b"))
    println("Usage: " + comparatorInFunctionalFormat("a", "b"))
}

fun main(args: Array<String>) {
    println("Single-expression function: " + singleExpressionFunction(1, 2))
    lambdaExpressionFunctions()
}