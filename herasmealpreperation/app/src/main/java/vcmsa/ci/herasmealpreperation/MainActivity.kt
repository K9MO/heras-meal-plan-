package vcmsa.ci.herasmealpreperation

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val edtTimeOfDay = findViewById<EditText>(R.id.edtTime)
        val txtSuggestion = findViewById<TextView>(R.id.txtMealPlan)
        val btnSubmit = findViewById<Button>(R.id.btnSubmit)
        val btnClear = findViewById<Button>(R.id.btnSuggestMeal)
        val txtOutPut = findViewById<TextView>(R.id.txtOutPut)

        //txtOutPut.text = "Enter the time of day (Breakfast,Lunch,Dinner)"

        btnSubmit.setOnClickListener {
            val txtMealPlan = edtTimeOfDay.text.toString().trim().lowercase()

            if (txtMealPlan == "breakfast") {
                txtSuggestion.text = "Eggs,Olives & Tomatoes"
            } else if (txtMealPlan == "Brunch") {
                txtSuggestion.text = "Panini Bread & Turkey"
            } else if (txtMealPlan == "Lunch ") {
                txtSuggestion.text = "Bacon & Cheese Sandwich"
            } else if (txtMealPlan == "Dinner") {
                txtSuggestion.text = "Samp, baked Potatoes & Oxtail"
            } else if (txtMealPlan == "Dessert") {
                txtSuggestion.text = "red velvet cake"
            } else {
                txtSuggestion.text = "invalid"
            }


        }
























        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}