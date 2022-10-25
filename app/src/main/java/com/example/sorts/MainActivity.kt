package com.example.sorts

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun sirala(view: View){
        val sayi1 = et1.text.toString().toInt()
        val sayi2 = et2.text.toString().toInt()
        val sayi3 = et3.text.toString().toInt()
        val sayi4 = et4.text.toString().toInt()

        val list = bubble_sort(intArrayOf(sayi1,sayi2,sayi3,sayi4))

        var result2 = ""

        for (k in list){
            result2 = result2 + " ${k.toString()}"
        }

        result.text = result2
    }

    fun sirala2(view: View){
        val sayi1 = et1.text.toString().toInt()
        val sayi2 = et2.text.toString().toInt()
        val sayi3 = et3.text.toString().toInt()
        val sayi4 = et4.text.toString().toInt()

        val n = selection_sort()

        var list = intArrayOf(sayi1,sayi2,sayi3,sayi4)

        n.selection(list)

        var result2 = ""

        for (k in list){
            result2 = result2 + " ${k.toString()}"
        }

        result.text = result2

    }

    fun sirala3(view: View){
        val sayi1 = et1.text.toString().toInt()
        val sayi2 = et2.text.toString().toInt()
        val sayi3 = et3.text.toString().toInt()
        val sayi4 = et4.text.toString().toInt()

        val list = merge_sort(listOf(sayi1,sayi2,sayi3,sayi4))

        var result2 = ""

        for (k in list){
            result2 = result2 + " ${k.toString()}"
        }

        result.text = result2
    }

    fun sirala4(view: View){
        val sayi1 = et1.text.toString().toInt()
        val sayi2 = et2.text.toString().toInt()
        val sayi3 = et3.text.toString().toInt()
        val sayi4 = et4.text.toString().toInt()

        val n = selection_sort()

        var list = intArrayOf(sayi1,sayi2,sayi3,sayi4)

        n.selection(list)

        var result2 = ""

        for (k in list){
            result2 = result2 + " ${k.toString()}"
        }

        result.text = result2

    }


}




