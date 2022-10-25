package com.example.sorts

class selection_sort {

    fun selection(sampleArray:IntArray){
        var n = sampleArray.size
        var temp : Int
        for (i in 0..n-1){
            var indexOfMin = i
            for (j in n-1 downTo i){
                if(sampleArray[j] < sampleArray[indexOfMin]){
                    indexOfMin = j
                }
            }
            if (i != indexOfMin){
                temp = sampleArray[i]

                sampleArray[i] = sampleArray[indexOfMin]
                sampleArray[indexOfMin] = temp
            }
        }
    }
}