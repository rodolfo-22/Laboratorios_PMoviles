package com.example.labo_03

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.AutoCompleteTextView
import android.widget.LinearLayout
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    //UI variables
    private lateinit var totalCountTextView: TextView;
    private lateinit var fiveCentView: LinearLayout;
    private lateinit var tenCentView: LinearLayout;
    private lateinit var quaterCentView: LinearLayout;
    private lateinit var dollarView: LinearLayout;

    //variable logica
    private var totalCount = 0.00;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportActionBar!!.hide();

        bind()
        addListener()
    }

    private fun bind() {
        totalCountTextView = findViewById(R.id.count_many_view);
        fiveCentView = findViewById(R.id.five_cents_linear_layout);
        tenCentView = findViewById(R.id.ten_cents_linear_layout);
        quaterCentView = findViewById(R.id.twenty_five_cent_linear_layout);
        dollarView = findViewById(R.id.one_dollar_linear_layout);
    }

    private fun addListener() {
        fiveCentView.setOnClickListener {
            calculateAmount(0.05)
            setTextValue();
        }
        tenCentView.setOnClickListener {
            calculateAmount(0.10)
            setTextValue();
        }
        quaterCentView.setOnClickListener {
            calculateAmount(0.25)
            setTextValue();
        }
        dollarView.setOnClickListener {
            calculateAmount(1.00)
            setTextValue();
        }
    }

    private fun calculateAmount(amount: Double) {
        totalCount += amount
    }

    @SuppressLint("StringFormatInvalid")
    private fun setTextValue(){
        totalCountTextView.text = getString(R.string.total_count, String.format("%.2f", totalCount));
    }

}