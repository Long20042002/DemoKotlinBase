package com.prox.demokolingst.database

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.viewModelScope
import com.prox.demokolingst.model.PhuongTien
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class PhuongTienViewModel(application: Application) : AndroidViewModel(
    application
){

    private var db = PhuongTienDatabase.getInstance(application)
    private var phuongTienDao = db.phuongTienDao()

    val phuongTiens = phuongTienDao.getAllData()

    fun addPT(phuongTien: PhuongTien){
        viewModelScope.launch(Dispatchers.IO) {
            phuongTienDao.insertPT(phuongTien)
        }
    }

    fun deletePT(phuongTien: PhuongTien){
        viewModelScope.launch(Dispatchers.IO) {
            phuongTienDao.deletePT(phuongTien)
        }
    }

    fun updatePT(phuongTien: PhuongTien){
        viewModelScope.launch(Dispatchers.IO) {
            phuongTienDao.updatePT(phuongTien)
        }
    }
}