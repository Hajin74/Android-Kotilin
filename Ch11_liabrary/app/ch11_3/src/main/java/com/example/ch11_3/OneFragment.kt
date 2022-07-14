package com.example.ch11_3

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.ch11_3.databinding.FragmentOneBinding
//import com.example.ch11_3.databinding.FragmentTwoBinding

class OneFragment : Fragment() {
    lateinit var binding: FragmentOneBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return FragmentOneBinding.inflate(inflater, container, false).root
    }
}