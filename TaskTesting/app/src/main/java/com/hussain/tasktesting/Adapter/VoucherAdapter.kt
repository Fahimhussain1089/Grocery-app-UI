package com.hussain.tasktesting.Adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.hussain.tasktesting.R

data class Voucher(
    val title: String,
    val date: String,
    val amount: String
)

class VoucherAdapter(private val vouchers: List<Voucher>) :
    RecyclerView.Adapter<VoucherAdapter.VoucherViewHolder>() {

    class VoucherViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val titleText: TextView = view.findViewById(R.id.voucher_title)
        val dateText: TextView = view.findViewById(R.id.voucher_date)
        val amountText: TextView = view.findViewById(R.id.voucher_amount)
        val applyButton: Button = view.findViewById(R.id.apply_button)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VoucherViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_voucher, parent, false)
        return VoucherViewHolder(view)
    }

    override fun onBindViewHolder(holder: VoucherViewHolder, position: Int) {
        val voucher = vouchers[position]
        holder.titleText.text = voucher.title
        holder.dateText.text = voucher.date
        holder.amountText.text = voucher.amount

        holder.applyButton.setOnClickListener {
            // Handle apply button click
        }
    }

    override fun getItemCount() = vouchers.size
}