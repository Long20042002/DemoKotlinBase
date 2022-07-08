package com.prox.demokolingst.callback

import com.prox.demokolingst.model.PhuongTien

interface ItemClickListPhuongTien {
    fun itemClickToDetail(phuongTien: PhuongTien)
    fun deleteItem(phuongTien: PhuongTien)
    fun updateItem(phuongTien: PhuongTien)

}