package com.emrhmrc.dateytimy.pickers

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.emrhmrc.dateytimy.R
import com.emrhmrc.dateytimy.databinding.FragmentTimePickerBinding
import com.emrhmrc.dateytimy.interfaces.OnTimeSelected

/**Created by hamurcuabi on 28,October,2020 **/
class TimePickerFragment(val onTimeSelected: OnTimeSelected) :
    Fragment(R.layout.fragment_time_picker) {
    private var _binding: FragmentTimePickerBinding? = null
    private val binding get() = _binding!!

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding = FragmentTimePickerBinding.bind(view)
        binding.timePicker.setOnTimeChangedListener { timePicker, hour, minute ->
            onTimeSelected.setSelectedTime(hour, minute)
        }
    }

}
