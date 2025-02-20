package com.app.serviceprovidercust.boarding

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.app.serviceprovidercust.R

class OnBoardingFragment : Fragment() {
    private var position: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        position = arguments?.getInt(ARG_POSITION) ?: 0
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_on_boarding, container, false)
        val imageView = view.findViewById<ImageView>(R.id.imageview)
        val textViewTitle = view.findViewById<TextView>(R.id.title)
        val textViewDesc = view.findViewById<TextView>(R.id.description)

        when (position) {
            0 -> {
                imageView.setImageResource(R.drawable.services)
                textViewTitle.text = "Trusted App"
                textViewDesc.text = "Trusted and secure website for this app with lorum ipsum"
            }
            1 -> {
                imageView.setImageResource(R.drawable.secure)
                textViewTitle.text = "Secured App"
                textViewDesc.text = "Secure and safe payment and 99% people trust on us lorum ipsum ajhh kgh kjjjk Trusted and secure websi lorum ipsum"
            }
        }
        return view
    }


    companion object {
        private const val ARG_POSITION = "position"

        fun newInstance(position: Int): OnBoardingFragment {
            val fragment = OnBoardingFragment()
            val args = Bundle()
            args.putInt(ARG_POSITION, position)
            fragment.arguments = args
            return fragment
        }
    }


}