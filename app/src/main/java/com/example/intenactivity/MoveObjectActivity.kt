package com.example.intenactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.intenactivity.databinding.ActivityMoveObjectBinding
import com.example.intenactivity.siswa.ObjectSiswa

class MoveObjectActivity : AppCompatActivity() {

    lateinit var binding: ActivityMoveObjectBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMoveObjectBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val siswa = intent.getParcelableExtra<ObjectSiswa>("siswa")
        if (siswa != null){
            binding.tvNama.text = siswa.nama
            binding.tvUmur.text = siswa.umur.toString()
            binding.tvGender.text = siswa.gender.toString()
            binding.tvKelas.text = siswa.kelas
            binding.tvStatusLulus.text = if (siswa.lulus) "Lulus" else "Belum Lulus"
            binding.tvTinggi.text = siswa.tinggi.toString()
        }
    }

}