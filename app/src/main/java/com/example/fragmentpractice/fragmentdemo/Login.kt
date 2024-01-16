package com.example.fragmentpractice.fragmentdemo

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.FrameLayout
import androidx.fragment.app.FragmentManager
import com.example.fragmentpractice.R



class Login : Fragment() {

    private lateinit var view : View

     private lateinit var framelayout : FrameLayout


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        view = inflater.inflate(R.layout.fragment_login, container, false)

        val register_tv = view.findViewById<Button>(R.id.register_tv)

        register_tv.setOnClickListener(){
            val fragmentManager = parentFragmentManager
            val fragmentTransaction =fragmentManager.beginTransaction()
            fragmentTransaction.replace(R.id.framelayout,Register())
            fragmentTransaction.commit()
        }



        return view
    }


}