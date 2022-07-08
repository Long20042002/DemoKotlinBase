package com.prox.demokolingst.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.io.Serializable

@Entity(tableName = "phuong_tien_table")
data class PhuongTien (
    @PrimaryKey
    var ten : String = "",
    var mau : String = "",
    var banh : Int = 0
) : Serializable
