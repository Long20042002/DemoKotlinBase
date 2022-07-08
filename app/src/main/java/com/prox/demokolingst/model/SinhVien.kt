package com.prox.demokolingst.model

class SinhVien {
    var hoTen: String = ""
    var diaChi: String = ""
    private var namSinh : Int = 0

    fun setNamSinh(ns : Int){
        if (ns > 2002){
            namSinh = 2002
        }else{
            namSinh = ns
        }
    }

    fun getNamSinh() : Int{
        return namSinh;
    }

    fun tinhTuoi() : Int{
        return 2022 - namSinh
    }
}