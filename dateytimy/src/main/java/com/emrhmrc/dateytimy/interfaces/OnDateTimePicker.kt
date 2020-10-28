package com.emrhmrc.dateytimy.interfaces

/**Created by hamurcuabi on 28,October,2020 **/
interface OnDateTimePicker {
    /**
    The Desciption of the method to explain what the method does
    @param [year] for year
    @param [month] fro month
    @param [dayOfMonth] for dayOfMonth
    @param [hour] for hour
    @param [minute] for minute
     */
    fun onDateTimePick(year: Int, month: Int, dayOfMonth: Int, hour: Int, minute: Int)
}