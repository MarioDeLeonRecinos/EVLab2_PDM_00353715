package com.sovize.laboratorioevaluado2.fragments

import android.arch.lifecycle.ViewModelProviders
import android.graphics.Color
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.sovize.laboratorioevaluado2.models.BlankViewModel
import com.sovize.laboratorioevaluado2.R
import kotlinx.android.synthetic.main.blank_fragment.*


class BlankFragment : Fragment() {

    var color :Color?=Color()

    companion object {
        fun newInstance() = BlankFragment()
    }

    private lateinit var viewModel: BlankViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        /*color = Color.RED.toInt()
        btn_plus_color.setOnClickListener {
            color=

        }*/
        return inflater.inflate(R.layout.blank_fragment, container,false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(BlankViewModel::class.java)
        // TODO: Use the ViewModel
    }

}
