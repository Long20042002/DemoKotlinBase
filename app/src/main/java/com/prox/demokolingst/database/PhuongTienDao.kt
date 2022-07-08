package com.prox.demokolingst.database

import androidx.lifecycle.LiveData
import androidx.room.*
import com.prox.demokolingst.model.PhuongTien

@Dao
interface PhuongTienDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertPT(pt : PhuongTien)

    @Update
    fun updatePT(pt : PhuongTien)

    @Delete
    fun deletePT(pt : PhuongTien)

    @Query("SELECT * FROM phuong_tien_table")
    fun getAllData(): LiveData<List<PhuongTien>>
}