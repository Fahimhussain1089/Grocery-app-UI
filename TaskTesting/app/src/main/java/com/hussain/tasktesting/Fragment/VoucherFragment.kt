package com.hussain.tasktesting.Fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.hussain.tasktesting.R
//
//import android.os.Bundle
//import android.view.LayoutInflater
//import android.view.View
//import android.view.ViewGroup
//import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.hussain.tasktesting.Adapter.Voucher
import com.hussain.tasktesting.Adapter.VoucherAdapter

class VoucherFragment : Fragment() {

    private lateinit var voucherAdapter: VoucherAdapter

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_voucher, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val recyclerView = view.findViewById<RecyclerView>(R.id.voucher_recycler_view)
        voucherAdapter = VoucherAdapter(getVoucherList())

        recyclerView.layoutManager = LinearLayoutManager(context)
        recyclerView.adapter = voucherAdapter
    }

    private fun getVoucherList(): List<Voucher> {
        return listOf(
            Voucher(
                title = "Special For You! Discount 25% max. IDR 25K",
                date = "27 Apr 2024",
                amount = "IDR 50.000"
            ),
            Voucher(
                title = "#WeekendCeria Discount 50% max. IDR 15K",
                date = "27 Apr 2024",
                amount = "IDR 48.000"
            ),
            Voucher(
                title = "#WeekendCeria Discount 50% max. IDR 15K (Pickup Only)",
                date = "27 Apr 2024",
                amount = "No Transaction"
            )
        )
    }
}