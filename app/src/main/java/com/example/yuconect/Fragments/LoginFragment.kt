package com.example.yuconect.Fragments

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.widget.AppCompatButton
import androidx.navigation.Navigation
import com.example.yuconect.LoginActivity
import com.example.yuconect.MainActivity
import com.example.yuconect.R
import kotlinx.coroutines.NonDisposableHandle.parent


class LoginFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?

    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_login, container, false)

        //setup

    }


}