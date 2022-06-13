package com.smartphonecodes.sassy

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.view.ViewGroup
import android.widget.Toast
import androidx.core.content.ContextCompat
import androidx.databinding.DataBindingUtil
import com.smartphonecodes.sassy.databinding.ActivityMainBinding

private var  _binding : ActivityMainBinding? = null
private val binding get() = _binding!!

class MainActivity : AppCompatActivity() {

    private var selectedLipstick:Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = DataBindingUtil.setContentView(this,R.layout.activity_main)

        val layout = layoutInflater.inflate(R.layout.custom_toast,findViewById(R.id.toastViewGrounp))

        binding.lipstick1.setOnClickListener {
            binding.lips.setColorFilter(ContextCompat.getColor(this,R.color.pink),android.graphics.PorterDuff.Mode.MULTIPLY)
            selectedLipstick = 1
        }

        binding.lipstick2.setOnClickListener {
            binding.lips.setColorFilter(ContextCompat.getColor(this,R.color.red1),android.graphics.PorterDuff.Mode.MULTIPLY)
            selectedLipstick = 2
        }

        binding.lipstick3.setOnClickListener {
            binding.lips.setColorFilter(ContextCompat.getColor(this,R.color.red2),android.graphics.PorterDuff.Mode.MULTIPLY)
            selectedLipstick = 3
        }

        binding.lipstick4.setOnClickListener {
            binding.lips.setColorFilter(ContextCompat.getColor(this,R.color.red3),android.graphics.PorterDuff.Mode.MULTIPLY)
            selectedLipstick = 4
        }

        binding.addToCartBtn.setOnClickListener{

            val customToast= Toast(applicationContext)
            customToast.apply {
                setGravity(Gravity.BOTTOM,0,0)
                duration = Toast.LENGTH_SHORT
                view = layout
            }

            customToast.show()

            }

        }

    }