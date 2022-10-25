package com.example.sorts

fun insertion_sort(arr1: IntArray): IntArray {
    for (j in 1 until arr1.size) {
        val key = arr1[j]
        var i = j - 1

        while (i >= 0 && arr1[i] > key) {
            arr1[i + 1] = arr1[i]
            i--
        }

        arr1[i + 1] = key
    }

    return arr1
}