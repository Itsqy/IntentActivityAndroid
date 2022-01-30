package com.example.intenactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.intenactivity.databinding.ActivityMoveDataBinding

class MoveDataActivity : AppCompatActivity() {

    lateinit var binding: ActivityMoveDataBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMoveDataBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val nama = intent.getStringExtra("Name")
        val umur = intent.getIntExtra("Umur", 0)
        val tinggi = intent.getIntExtra("Tinggi", 0)

        binding.tvNama.text = nama
        binding.tvUmur.text = umur.toString()
        binding.tvTinggi.text = tinggi.toString()
    }
}

class ActivityMoveDataBinding {

}
