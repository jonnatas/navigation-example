package com.example.forumnavigator.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.navigation.Navigation
import androidx.navigation.fragment.findNavController
import com.example.forumnavigator.R
import kotlinx.android.synthetic.main.fragment_home.*

class HomeFragment : Fragment() {

    private lateinit var homeViewModel: HomeViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        homeViewModel =
            ViewModelProviders.of(this).get(HomeViewModel::class.java)

        homeViewModel.text.observe(this, Observer {
            text_home.text = it
        })

        buttonOne.setOnClickListener {
            findNavController().navigate(R.id.oneFragment)
        }
        buttonTwo.setOnClickListener(
            Navigation.createNavigateOnClickListener(R.id.action_nav_home_to_twoFragment)
        )
        buttonThree.setOnClickListener {
            findNavController().navigate(R.id.action_nav_home_to_oneFragment)
        }
    }
}