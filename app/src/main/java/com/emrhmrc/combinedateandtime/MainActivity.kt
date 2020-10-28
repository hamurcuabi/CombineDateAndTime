package com.emrhmrc.combinedateandtime

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.emrhmrc.dateytimy.pickers.DateTimePickerFragment
import com.emrhmrc.dateytimy.interfaces.OnDateTimePicker

class MainActivity : AppCompatActivity(), OnDateTimePicker {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        DateTimePickerFragment(this).show(supportFragmentManager, "DateTimePickerFragment")
    }

    override fun onDateTimePick(year: Int, month: Int, dayOfMonth: Int, hour: Int, minute: Int) {
        Toast.makeText(
            this,
            "Year:$year, Month:$month, DayOfMonth:$dayOfMonth, Hour:$hour, Minute:$minute",
            Toast.LENGTH_SHORT
        ).show()
    }


}