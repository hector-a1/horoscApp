package com.example.horoscopapp.ui.luck

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.horoscopapp.databinding.FragmentHoroscopBinding


class LuckFragment : Fragment() {

    private var _binding:FragmentHoroscopBinding?=null
    private val binding get()=_binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        _binding=FragmentHoroscopBinding.inflate(layoutInflater,container,false)
        return binding.root
    }

}