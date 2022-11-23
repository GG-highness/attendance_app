package com.example.attendance_app.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import java.util.Calendar

class DayViewModel : ViewModel(){
    var calendar: MutableLiveData<Calendar> = MutableLiveData()
}
