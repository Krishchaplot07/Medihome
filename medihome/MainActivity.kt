package com.krish.medihome

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.navigation.Navigation

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragment_homepage)


        val navController = Navigation.findNavController(this, androidx.navigation.fragment.R.id.nav_host_fragment_container)

    }
}