package com.prox.demokolingst

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.prox.demokolingst.databinding.ActivityDetailBinding

class DetailActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDetailBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val intent = intent
//        val hoTen: String? = intent.getStringExtra("data")
//        val so: Int = intent.getIntExtra("data", 0)
//        val mangSo: IntArray? = intent.getIntArrayExtra("data");
        val pt : PhuongTien = intent.getSerializableExtra("data") as PhuongTien
        binding.ivPT.setImageResource(R.drawable.ic_launcher_foreground)
        binding.tvTen.text = pt.ten
        binding.tvMau.text = pt.mau
    }
}