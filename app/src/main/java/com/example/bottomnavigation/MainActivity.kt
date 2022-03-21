package com.example.bottomnavigation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val bottomnavigationview = findViewById<BottomNavigationView>(R.id.bottomnavigationview)
        val navController = findNavController(R.id.fragmentContainerView)
        bottomnavigationview.setupWithNavController(navController)

        val appBarConfigurations= AppBarConfiguration(setOf(R.id.dashboardFragment,R.id.profileFragment,R.id.settingFragment))

        setupActionBarWithNavController(navController,appBarConfigurations)
    }
}