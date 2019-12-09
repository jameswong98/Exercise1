package com.example.exercise1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val Reset: Button = findViewById(R.id.buttonReset)
        Reset.setOnClickListener { reset() }


        val Cal: Button = findViewById(R.id.buttonCalculate)
        Cal.setOnClickListener { calculation() }
    }


    private fun calculation (){

    val CarPrice: EditText = findViewById(R.id.editTextCarPrice)
        val DownPayment: EditText = findViewById(R.id.editTextDownPayment)
        val LoanPeriod: EditText = findViewById(R.id.editTextLoanPeriod)
        val InterestR: EditText = findViewById(R.id.editTextInterestRate)

        val loan = CarPrice.text.toString().toInt() - DownPayment.text.toString().toInt()
        val interest = loan.toString().toDouble() * (InterestR.text.toString().toDouble() / 100) * LoanPeriod.text.toString().toInt()
        val montlypayment = (loan + interest) / LoanPeriod.text.toString().toInt() / 12

        textCarLoan.text = loan.toString()
        textInterest.text = interest.toString()
        textMontlyP.text = montlypayment.toString()

    }

    private fun reset (){
        val carPrice: EditText = findViewById(R.id.editTextCarPrice)
        carPrice.text = null
        val DownPayment: EditText = findViewById(R.id.editTextDownPayment)
        DownPayment.text = null
        val LoanPeriod: EditText = findViewById(R.id.editTextLoanPeriod)
        LoanPeriod.text = null
        val InterestR: EditText = findViewById(R.id.editTextInterestRate)
        InterestR.text = null

        val loan: TextView = findViewById(R.id.textCarLoan)
        loan.text = null
        val interest: TextView = findViewById(R.id.textInterest)
        interest.text = null
        val monthlypayment: TextView = findViewById(R.id.textMontlyP)
        monthlypayment.text = null
    }
}
