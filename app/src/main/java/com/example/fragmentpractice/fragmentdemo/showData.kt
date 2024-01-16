package com.example.fragmentpractice.fragmentdemo

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.FrameLayout
import android.widget.TextView
import com.example.fragmentpractice.R


class showData : Fragment() {

    private lateinit var view : View

    private lateinit var framelayout : FrameLayout

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_show_data, container, false)

        val userName = view.findViewById<TextView>(R.id.username)
        val email = view.findViewById<TextView>(R.id.email)
        val number = view.findViewById<TextView>(R.id.number)
        val password = view.findViewById<TextView>(R.id.password)

//        val userNameEdit = view.findViewById<TextView>(R.id.editUserName)
//        val userEmailEdit = view.findViewById<TextView>(R.id.editUserEmail)
//        val userNumberEdit = view.findViewById<TextView>(R.id.editUserNumber)
//        val userPasswordEdit = view.findViewById<TextView>(R.id.editUserPassword)
//
//        userName.text=userNameEdit.text
//        email.text=userEmailEdit.text
//        number.text=userNumberEdit.text
//        password.text=userPasswordEdit.text

        val backBtn = view.findViewById<Button>(R.id.backBtn)
        backBtn.setOnClickListener() {
            val fragmentManager = parentFragmentManager
            val fragmentTransaction = fragmentManager.beginTransaction()
            fragmentTransaction.replace(R.id.framelayout, Login())
            fragmentTransaction.commit()
        }



        return view

    }


}