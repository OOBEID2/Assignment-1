package com.example.foodorderapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*



class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val edtxt1: EditText = findViewById(R.id.ednum1)
        var flag: String
        var flag2: Double = 0.0
        val resultTV: TextView = findViewById(R.id.textResult)
        val button: Button = findViewById(R.id.btResult)
        //val resultTextView: TextView = findViewById(R.id.textResult2)
        val spinner: Spinner = findViewById(R.id.spSelect)

        val prices: Spinner = findViewById(R.id.spSelect)
        var price = arrayOf(4.5, 5.0, 4.0, 5.5, 4.0, 3.5, 5.5, 5.0, 6.5, 7.0, 3.5, 5.0)

        val spinnerVal: Spinner = findViewById(R.id.spSelect)
        var options = arrayOf(
            "Pizza, Margherita",
            "Pizza, Beef",
            "Pizza, Veg",
            "Burger, BBQ",
            "Burger, Classic",
            "Burger, Chicken",
            "Taco, Beef",
            "Taco, Dynamite",
            "Taco, Shrimp",
            "SeaFood, Shrimp",
            "SeaFood, Soup",
            "SeaFood, Crab"
        )

        spinnerVal.adapter =
            ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, options)


        button.setOnClickListener { view ->
            var x: Double = edtxt1.text.toString().toDouble();
            resultTV.text = sum(flag2,x).toString()


        }

        spinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                flag = options.get(p2)
                flag2 = price.get(p2)
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
                //Empty
            }

        }
    }
}
    public fun sum(a: Double, b: Double): Double {
        return (a * b) + (a * b * 0.16)
    }


