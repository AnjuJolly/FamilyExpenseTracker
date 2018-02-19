package com.familyexpensetracker.android.ui.expense

import android.content.Context
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Toast
import com.familyexpensetracker.android.R
import kotlinx.android.synthetic.main.add_expense.*

/**
 * @author Anju
 */
class AddExpenseActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.add_expense)

        addBtn.setOnClickListener {
            clearEditTexts()
            Toast.makeText(this,"Added Expense!", Toast.LENGTH_LONG).show()
        }

        clearBtn.setOnClickListener {
            clearEditTexts()
        }
    }

    private fun clearEditTexts() {
        expenseNameEditText.text.clear()
        amountSpentEditText.text.clear()
    }

}