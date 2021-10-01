package com.example.dinnerdecider

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var foodList = ArrayList<String>()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initializeFoods()


        btnAdd.setOnClickListener {
            if(!foodList.contains(edtAddFood.text.toString())) {
                foodList.add(edtAddFood.text.toString())
                Toast.makeText(this, "Food added", Toast.LENGTH_SHORT).show()
            }else{
                Toast.makeText(this, "Food is already added", Toast.LENGTH_SHORT).show()
            }
        }
        btnDecide.setOnClickListener {
            var rndNum = (0..(foodList.size-1)).random()
            tv.text = foodList.get(rndNum)
            Toast.makeText(this,"Food decided",Toast.LENGTH_SHORT).show()

        }
    }

    private fun initializeFoods() {
        foodList.add("Hamburger")
        foodList.add("Pizza")
        foodList.add("American")
        foodList.add("Mexican")
        foodList.add("Chinese")
    }
}