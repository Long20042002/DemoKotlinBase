package com.prox.demokolingst.dialog

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.DialogFragment
import com.prox.demokolingst.R
import com.prox.demokolingst.callback.onDialogCallback
import com.prox.demokolingst.databinding.DialogUpdateBinding
import com.prox.demokolingst.model.PhuongTien

class DialogFragmentUpdate(private val callback: onDialogCallback, private val phuongTien: PhuongTien): DialogFragment() {
    private lateinit var binding: DialogUpdateBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setStyle(STYLE_NORMAL, R.style.Theme_Dialog)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = DialogUpdateBinding.inflate(layoutInflater, container, false)
        binding.edTen.setText(phuongTien.ten)
        binding.edMau.setText(phuongTien.mau)
        binding.btnUpdate.setOnClickListener {
            phuongTien.mau = binding.edMau.text.toString()
            callback.onUpdateClick(phuongTien)
            dismiss()
        }
        return binding.root
    }
}