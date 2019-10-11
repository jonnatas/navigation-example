package com.example.forumnavigator.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.example.forumnavigator.R
import kotlinx.android.synthetic.main.one_fragment.*


class OneFragment : Fragment() {

    companion object {
        fun newInstance() = OneFragment()
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.one_fragment, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        buttonToThree.setOnClickListener(
            Navigation.createNavigateOnClickListener(R.id.action_oneFragment_to_threeFragment)
        )
    }
}
