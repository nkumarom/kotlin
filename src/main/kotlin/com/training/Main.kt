package com.training
// when() are like switch in java
fun useOfWhen() {
    val trafficLightState = "Gray"
    val trafficLightStateResult = when (trafficLightState) {
        "Green" -> "Go"
        "Yellow" -> "Slow down"
        "Red" -> "Stop"
        else -> "Malfunction"
    }
    println("trafficLightStateResult: $trafficLightStateResult")
}

// ranges() are like range in python
fun useOfRanges() {
    for (item in 1..4) { print(item) }
    println()
    for (item in 4 downTo 1) { print(item) }
    println()
    for (item in 'a'..'d') { print(item) }
    println()
    for (item in 'd' downTo 'a') { print(item) }
    println()
}

fun main(args: Array<String>) {
    useOfWhen()
    useOfRanges()
}