package com.prox.demokolingst

import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.prox.demokolingst.database.PhuongTienViewModel
import com.prox.demokolingst.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), ItemClickListPhuongTien, onDialogCallback {
    val viewmodel : PhuongTienViewModel by viewModels()
    private lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
//        var ptien : PhuongTien = PhuongTien("Xe Dap", "Mau den", 2)
//
//        Log.d("TAG", "onCreate: ${ptien.ten} ${ptien.mau}")

//        var sv1 : SinhVien = SinhVien()
//        sv1.hoTen = "Nguyen Hoang Long"
//        sv1.diaChi = "Bac Giank"
//        sv1.namSinh = 2002
//        sv1.setNamSinh(1999)
//
//        Log.d("TAG", "onCreate: ${sv1.diaChi} ${sv1.hoTen} ${sv1.getNamSinh()} ${sv1.tinhTuoi()}")
//        var a : String = ""
//        a = "phat"
//        a.toInt()
//
//        val b : String = "phat"
//        b = "tuan"

//        var ten: String? = null!!
//        ten = "Long"

//        var a : Int = 10
//        var b : Int = 15
//
//        if (a > b){
//            Log.d("TAG", "onCreate: "+ a)
//        }else{
//            Log.d("TAG", "onCreate: "+ b)
//        }

//        var a : String = "Long"
//        when(a){
//            "hoang" -> Log.d("TAG", "onCreate: chao ban hoang")
//            "tuan" -> Log.d("TAG", "onCreate: chao ban tuan")
//            "Long" -> Log.d("TAG", "onCreate: chao ban Long dep trai")
//        }


//        var a : Int = 15
//        when(a){
//            in 1..3 -> Log.d("TAG", "onCreate: + Quy 1")
//            in 4..6 -> Log.d("TAG", "onCreate: + Quy 2")
//            in 7..9 -> Log.d("TAG", "onCreate: + Quy 3")
//            in 10..12 -> Log.d("TAG", "onCreate: + Quy 4")
//            else -> Log.d("TAG", "onCreate: Khong co gia tri nao")
//        }


//        var count : Int = 0
//        while ( count < 10){
//            Log.d("TAG", "onCreate: Lap lan thu$count")
//            count ++;
//        }

//        for (i in 0..10){
//            Log.d("TAG", "onCreate: $i")
//        }

//        var a : Int = 5
//        for (i in 0 until a){
//            Log.d("TAG", "onCreate: $i")
//        }


//        var a : Int = 5
//        for (i in a downTo 0){
//            Log.d("TAG", "onCreate: $i")
//        }

//        var a : Int = 10
//        for (i in 0.. a step 2){
//            Log.d("TAG", "onCreate: $i")
//        }

//        var mangso : IntArray = intArrayOf(1,2,3,4,5,6,7,8,9)
//        mangso.get(1)

//        var mangten : List<String> = listOf("Long", "Nguyen", "Hoang")
//        mangten.get(1)

//        var mangten : ArrayList<String> = ArrayList()
        //Them phan tu trong mang
//        mangten.add("Long")
//        mangten.add("Nguyen")
//        mangten.add("Hoang")

        //Kiem tra so luong phan tu trong mang
//        mangten.size
//        mangten.remove("Long")
//        mangten.removeAt(2)
//        mangten.set(2, "OKE")
//        Log.d("TAG", "onCreate: ${mangten.size} ${mangten.get(2)}")

//        showName("Long")
//        binding.textView.text = "Hello The Gioi"
//
//        binding.button.setOnClickListener{
//            Toast.makeText(this, "Chao may", Toast.LENGTH_SHORT).show()
//        }
//
//        binding.button.setOnClickListener(object : View.OnClickListener{
//            override fun onClick(v: View?) {
//
//            }
//        })
//        binding.btnCong.setOnClickListener {
//            val so1 = (binding.edSo1.text.toString()).toInt()
//            val so2 = (binding.edSo2.text.toString()).toInt()
//            val ketQua = so1 + so2
//            binding.tvKetQua.text = ketQua.toString()
//        }
//
//        binding.btnTru.setOnClickListener {
//            var so1 : Int = (binding.edSo1.text.toString()).toInt()
//            var so2 : Int = (binding.edSo2.text.toString()).toInt()
//            var ketQua : Int = so1 - so2
//            binding.tvKetQua.text = ketQua.toString()
//        }
//
//        binding.btnNhan.setOnClickListener {
//            var so1 : Int = (binding.edSo1.text.toString()).toInt()
//            var so2 : Int = (binding.edSo2.text.toString()).toInt()
//            var ketQua : Int = so1 * so2
//            binding.tvKetQua.text = ketQua.toString()
//        }
//
//        binding.btnChia.setOnClickListener {
//            var so1 : Int = (binding.edSo1.text.toString()).toInt()
//            var so2 : Int = (binding.edSo2.text.toString()).toInt()
//            var ketQua : Int = so1 / so2
//            binding.tvKetQua.text = ketQua.toString()
//        }
//        val abc = listOf(
//            PhuongTien("kljasg","liag",3),
//            PhuongTien("kljasg","liag",3),
//            PhuongTien("kljasg","liag",3),
//            PhuongTien("kljasg","liag",3),
//            PhuongTien("kljasg","liag",3),
//            PhuongTien("kljasg","liag",3),
//            PhuongTien("kljasg","liag",3),
//            PhuongTien("kljasg","liag",3),
//            PhuongTien("kljasg","liag",3),
//            PhuongTien("aaa","aaa",3),
//            PhuongTien("bbbb","bbb",3)
//        )
//        viewmodel = ViewModelProvider(this)[PhuongTienViewModel::class.java]
        viewmodel.addPT(PhuongTien("Long", "Den", 2))
        viewmodel.addPT(PhuongTien("Long1", "Den1", 21))
        viewmodel.addPT(PhuongTien("Long2", "Den2", 22))
        viewmodel.addPT(PhuongTien("Long3", "Den2", 23))
        viewmodel.addPT(PhuongTien("Long4", "Den3", 24))
        val adapter = AdapterRecycler(this)
        binding.rcvPhuongTien.adapter = adapter

        viewmodel.phuongTiens.observe(this) {
         adapter.mList= it as ArrayList<PhuongTien>
            adapter.notifyDataSetChanged()
        }


        binding.rcvPhuongTien.layoutManager = LinearLayoutManager(this)
        binding.rcvPhuongTien.setHasFixedSize(true)

    }

    override fun itemClickToDetail(phuongTien: PhuongTien) {
        val intent = Intent(this@MainActivity, DetailActivity::class.java)
//        val bundle: Bundle;
//        bundle.putSerializable("pt", phuongTien)
//        intent.putExtra("data", "Nguyễn Hoàng Long")
//        intent.putExtra("data", 2022)
//        val arrayNumber : IntArray = intArrayOf(12,323,4,4,55,123,33)
        intent.putExtra("data", phuongTien)
        startActivity(intent)
    }

    override fun deleteItem(phuongTien: PhuongTien) {
        viewmodel.deletePT(phuongTien)
    }

    override fun updateItem(phuongTien: PhuongTien) {
        val dialog = DialogFragmentUpdate(this, phuongTien)

        dialog.show(supportFragmentManager, "custom_dialog")
    }

    override fun onUpdateClick(pt: PhuongTien) {
        viewmodel.updatePT(pt)
    }


//    fun showName(ten : String){
//        Log.d("TAG", "showName: Oke ham fun show name thuc thi $ten")
//    }
}