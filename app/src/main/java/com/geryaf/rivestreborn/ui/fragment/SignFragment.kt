package com.geryaf.rivestreborn.ui.fragment

import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import com.geryaf.rivestreborn.R

class SignFragment : Fragment() {

    companion object {
        fun newInstance() = SignFragment()
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return inflater.inflate(R.layout.fragment_sign, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        //change statusbar color
        val window: Window = requireActivity().window
        window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS)
        window.statusBarColor = resources.getColor(R.color.crimson)
    }
}