package com.emrhmrc.dateytimy.pickers

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.DialogFragment
import com.emrhmrc.dateytimy.helper.ViewPagerAdapter
import com.emrhmrc.dateytimy.databinding.FragmentDateTimePickerBinding
import com.emrhmrc.dateytimy.interfaces.OnDateSelected
import com.emrhmrc.dateytimy.interfaces.OnDateTimePicker
import com.emrhmrc.dateytimy.interfaces.OnTimeSelected
import java.util.*

/**Created by hamurcuabi on 28,October,2020 **/
class DateTimePickerFragment(val onDateTimePicker: OnDateTimePicker) : DialogFragment(),
    OnDateSelected, OnTimeSelected {

    private lateinit var binding: FragmentDateTimePickerBinding
    private var year: Int = 0
    private var month: Int = 0
    private var dayOfMonth: Int = 0
    private var hour: Int = 0
    private var minute: Int = 0

    init {
        val cal = Calendar.getInstance();
        year = cal.get(Calendar.YEAR);
        month = cal.get(Calendar.MONTH) + 1
        hour = cal.get(Calendar.HOUR)
        minute = cal.get(Calendar.MINUTE)
        dayOfMonth = cal.get(Calendar.DAY_OF_MONTH)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentDateTimePickerBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        val adapter = ViewPagerAdapter(childFragmentManager)
        val datePickerFragment: DatePickerFragment = DatePickerFragment(this)
        val timePickerFragment: TimePickerFragment = TimePickerFragment(this)

        adapter.addFragment(datePickerFragment, "TARİH")
        adapter.addFragment(timePickerFragment, "SAAT")
        binding.viewPagerDateTime.adapter = adapter
        binding.tabLayput.setupWithViewPager(binding.viewPagerDateTime)

        binding.btnCancel.setOnClickListener { dismiss() }
        binding.btnOkey.setOnClickListener {
            onDateTimePicker.onDateTimePick(year, month, dayOfMonth, hour, minute)
            dismiss()
        }


    }

    override fun setSelectedDate(year: Int, month: Int, dayOfMonth: Int) {
        // Toast.makeText(requireContext(), "Date Year= $year Month=${month}  day=$dayOfMonth", Toast.LENGTH_SHORT).show()
        this.year = year
        this.month = month
        this.dayOfMonth = dayOfMonth
    }

    override fun gotoTimePicker() {
        binding.viewPagerDateTime.setCurrentItem(1, true)
    }

    override fun setSelectedTime(hour: Int, minute: Int) {
        //  Toast.makeText(requireContext(), "Hour:$hour , minute:$minute", Toast.LENGTH_SHORT).show()
        this.hour = hour
        this.minute = minute
        onDateTimePicker.onDateTimePick(year, month, dayOfMonth, hour, minute)
        dismiss()
    }


}