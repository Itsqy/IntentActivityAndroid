package com.example.intenactivity

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.intenactivity.databinding.ActivityMainBinding
import com.example.intenactivity.siswa.ObjectSiswa

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    val tag = "SiklusActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        Log.d(tag, "onCreate")

        binding.btnMove.setOnClickListener {
            startActivity(Intent(this, MoveActivity::class.java))

        }

        binding.btnMoveData.setOnClickListener {
            val Intent = Intent(this, MoveDataActivity::class.java)
            Intent.putExtra("Name", "Jokooooo")
            Intent.putExtra("Umur", 20)
            Intent.putExtra("Tinggi", 12)
            startActivity(Intent)
        }

        binding.btnMoveObject.setOnClickListener {
            val siswa = ObjectSiswa("Tioot", 28, 'L', "A2", true, 127.3)
            val Intent = Intent(this, MoveObjectActivity::class.java)
            Intent.putExtra("siswa", siswa)
            startActivity(Intent)
        }

        binding.btnMoveToResult.setOnClickListener {
            val i = Intent(this, MoveWithResultActivity::class.java)
            startActivityForResult(i, 100)
        }
        binding.btnMoveToApp.setOnClickListener {
            val telp = "085693254311"
            val intent = Intent(Intent.ACTION_DIAL)
            intent.data = Uri.parse("tel:$telp")
            startActivity(intent)
        }


    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        if (requestCode == 100) {
            if (resultCode == 200) {
                val name = data?.getStringExtra("DR")
                binding.tvHasil.text = name
            }
        }
    }

    override fun onStart() {
        super.onStart()
        Log.d(tag, "OnStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d(tag, "OnResume")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d(tag, "OnRestart")
    }

    override fun onPause() {
        super.onPause()
        Log.d(tag, "OnPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d(tag, "OnStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(tag, "OnDestroy")
    }
}