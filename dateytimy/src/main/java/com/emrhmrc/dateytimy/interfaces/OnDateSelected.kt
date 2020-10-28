package com.emrhmrc.dateytimy.interfaces

/**Created by hamurcuabi on 28,October,2020 **/
interface OnDateSelected {
    fun setSelectedDate(year: Int, month: Int, dayOfMonth: Int)
    fun gotoTimePicker()
}