package com.example.fragmentpractice.fragmentdemo

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.FrameLayout
import com.example.fragmentpractice.R

class Register : Fragment() {


    private lateinit var view : View

    private lateinit var framelayout : FrameLayout

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        view = inflater.inflate(R.layout.fragment_register, container, false)

        val login_tv = view.findViewById<Button>(R.id.login_tv)
        login_tv.setOnClickListener() {
            val fragmentManager = parentFragmentManager
            val fragmentTransaction = fragmentManager.beginTransaction()
            fragmentTransaction.replace(R.id.framelayout, showData())
            fragmentTransaction.commit()
        }



        return view
    }
}