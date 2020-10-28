package com.emrhmrc.dateytimy.pickers

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.emrhmrc.dateytimy.R
import com.emrhmrc.dateytimy.databinding.FragmentDatePickerBinding
import com.emrhmrc.dateytimy.interfaces.OnDateSelected
import java.util.*

/**Created by hamurcuabi on 28,October,2020 **/
class DatePickerFragment(private val onDateSelected: OnDateSelected) :
    Fragment(R.layout.fragment_date_picker) {
    private var _binding: FragmentDatePickerBinding? = null
    private val binding get() = _binding!!
    private val c = Calendar.getInstance()
    private val year = c.get(Calendar.YEAR)
    private val month = c.get(Calendar.MONTH)
    private val day = c.get(Calendar.DAY_OF_MONTH)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding = FragmentDatePickerBinding.bind(view)
        binding.datePicker.init(
            year,
            month,
            day
        ) { datePicker, year, month, dayOfMonth ->
            //val date = "Date Year= $year Month=${(month + 1)}  day=$dayOfMonth"
            onDateSelected.setSelectedDate(year, (month + 1), dayOfMonth)
            onDateSelected.gotoTimePicker()
        }

    }
}