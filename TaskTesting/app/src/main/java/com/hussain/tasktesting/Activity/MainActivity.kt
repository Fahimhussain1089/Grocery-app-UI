package com.hussain.tasktesting.Activity

import android.os.Bundle

import androidx.appcompat.app.AppCompatActivity

import com.hussain.tasktesting.R

//class MainActivity : AppCompatActivity() {
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        enableEdgeToEdge()
//        setContentView(R.layout.activity_main2)
//
//    }
//}


import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.hussain.tasktesting.Fragment.AccountFragment
import com.hussain.tasktesting.Fragment.HomeFragment
import com.hussain.tasktesting.Fragment.OrderFragment
import com.hussain.tasktesting.Fragment.VoucherFragment

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val bottomNavigation = findViewById<BottomNavigationView>(R.id.bottom_navigation)

        // Set default fragment
        supportFragmentManager.beginTransaction()
            .replace(R.id.fragment_container, HomeFragment())
            .commit()

        bottomNavigation.setOnItemSelectedListener { item ->
            val fragment: Fragment = when(item.itemId) {
                R.id.nav_home -> HomeFragment()
                R.id.nav_voucher -> VoucherFragment()
                R.id.nav_order -> OrderFragment()
                R.id.nav_account -> AccountFragment()
                else -> HomeFragment()
            }

            supportFragmentManager.beginTransaction()
                .replace(R.id.fragment_container, fragment)
                .commit()

            true
        }
    }
}