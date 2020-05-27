package com.example.heaithskin.ui.dashboard

import android.graphics.drawable.ClipDrawable.VERTICAL
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.example.heaithskin.R
import kotlinx.android.synthetic.main.fragment_dashboard.*
import androidx.recyclerview.widget.LinearLayoutManager as LinearLayoutManager

class DashboardFragment : Fragment() {

    private lateinit var dashboardViewModel: DashboardViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        dashboardViewModel =
            ViewModelProviders.of(this).get(DashboardViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_dashboard, container, false)
        recyclerView_monitor.layoutManager = LinearLayoutManager(context)
        recyclerView_monitor.adapter = MonitorAdapter()
        //val textView: TextView = root.findViewById(R.id.text_dashboard)



        return root
    }


}
