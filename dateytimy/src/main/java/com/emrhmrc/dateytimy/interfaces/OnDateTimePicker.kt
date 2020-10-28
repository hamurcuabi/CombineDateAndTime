package com.emrhmrc.dateytimy.interfaces

/**Created by hamurcuabi on 28,October,2020 **/
interface OnDateTimePicker {
    /**
    The Desciption of the method to explain what the method does
    @param [year]
    @param [month]
    @param [dayOfMonth]
    @param [hour]
    @param [minute]
     */
    fun onDateTimePick(year: Int, month: Int, dayOfMonth: Int, hour: Int, minute: Int)
}