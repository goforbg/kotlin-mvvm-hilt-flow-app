package com.prasan.a500pxcodingchallenge.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.prasan.a500pxcodingchallenge.databinding.ActivityMainBinding
import dagger.hilt.android.AndroidEntryPoint

/**
 * This activity acts as the host for all fragments in the application
 * @author Prasan
 * @since 1.0
 */
@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(ActivityMainBinding.inflate(layoutInflater).root)
    }
}