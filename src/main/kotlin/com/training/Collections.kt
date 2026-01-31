package com.training

fun listTraining() {
    // listOf provides read only list which means that now you cannot remove elements from the list
    val readOnlyShapesList = listOf("triangle", "square", "circle")
    // readOnlyShapesList.remove() - not allowed
    println("readOnlyShapesList: $readOnlyShapesList")

    // mutableListOf provides mutable list which means that now you can remove elements from the list
    val mutableShapesList = mutableListOf("triangle", "square", "circle")
    mutableShapesList.removeAt(0)
    println("mutableShapesList: $mutableShapesList")

    // mutable list can be converted into read only by assigning it to a list `List<String>`. This is called casting.
    val mutableConvertedIntoReadOnlyList: List<String> = mutableShapesList
    // mutableConvertedIntoReadOnlyList.remove() - not allowed
    println("mutableShapesList: $mutableShapesList")
}

fun setTraining() {
    // setOf provides read only set which means that now you cannot remove elements from the set
    val readOnlyShapesSet = setOf("triangle", "square", "circle")
    // readOnlyShapesSet.remove() - not allowed
    println("readOnlyShapesSet: $readOnlyShapesSet")

    // mutableSetOf provides mutable set which means that now you can remove elements from the set
    val mutableShapesSet: MutableSet<String> = mutableSetOf("triangle", "square", "circle")
    mutableShapesSet.remove("triangle")
    println("mutableShapesSet: $mutableShapesSet")

    // mutable set can be converted into read only by assigning it to a set `Set<String>`. This is called casting.
    val mutableConvertedIntoReadOnlySet: Set<String> = mutableShapesSet
    // mutableConvertedIntoReadOnlySet.remove() - not allowed
    println("mutableConvertedIntoReadOnlySet: $mutableConvertedIntoReadOnlySet")
}

fun mapTraining() {
    // mapOf provides read only map which means that now you cannot remove any key from the map
    val readOnlyShapesMap = mapOf("triangle" to 1, "square" to 2, "circle" to 3)
    // readOnlyShapes["triangle"] = 4 - not allowed
    println("readOnlyShapesMap: $readOnlyShapesMap")

    // mutableMapOf provides mutable map which means that now you can update any entry in the map
    val mutableShapesMap: MutableMap<String, Int> = mutableMapOf("triangle" to 1, "square" to 2, "circle" to 3)
    mutableShapesMap.remove("triangle")
    println("mutableShapesMap: $mutableShapesMap")

    // mutable map can be converted into read only by assigning it to a map `Map<String, Int>`. This is called casting.
    val mutableConvertedIntoReadOnlyMap: Map<String, Int> = mutableShapesMap
    // mutableConvertedIntoReadOnlyMap.remove() - not allowed
    println("mutableConvertedIntoReadOnlyMap: $mutableConvertedIntoReadOnlyMap")

    println("To check that a key in a map, use the in operator: ${"square" in mutableConvertedIntoReadOnlyMap.keys}")
    println("To check that a value in a map, use the in operator: ${4 in mutableConvertedIntoReadOnlyMap.values}")
}

fun main(args: Array<String>) {
    listTraining()
    setTraining()
    mapTraining()
}




