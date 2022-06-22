package com.example.gmailreplica

import android.graphics.Color
import android.graphics.Typeface
import android.graphics.Typeface.BOLD
import android.graphics.Typeface.NORMAL
import android.graphics.drawable.ShapeDrawable
import android.graphics.drawable.shapes.OvalShape
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.annotation.ColorInt
import androidx.recyclerview.widget.RecyclerView
import com.example.gmailreplica.model.Email


class EmailAdapter(val emails: MutableList<Email>) : RecyclerView.Adapter<EmailAdapter.EmailViewHolder>(){


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): EmailViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.email_item, parent, false)
        return EmailViewHolder(view)
    }

    override fun onBindViewHolder(holder: EmailViewHolder, position: Int) {
        holder.bind(emails[position])
    }

    override fun getItemCount(): Int = emails.size

    inner class EmailViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(email: Email) {
            with(email) {
                val hash = user.hashCode()
                itemView.findViewById<TextView>(R.id.txt_icon).text = user.first().toString()
                itemView.findViewById<TextView>(R.id.txt_icon).background = itemView.oval(Color.rgb(hash, hash/2, 0))
                itemView.findViewById<TextView>(R.id.txt_user).text = user
                itemView.findViewById<TextView>(R.id.txt_subject).text = subject
                itemView.findViewById<TextView>(R.id.txt_preview).text = preview
                itemView.findViewById<TextView>(R.id.txt_date).text = date

                itemView.findViewById<TextView>(R.id.txt_user).setTypeface(Typeface.DEFAULT, if (unread) BOLD else NORMAL)
                itemView.findViewById<TextView>(R.id.txt_subject).setTypeface(Typeface.DEFAULT, if (unread) BOLD else NORMAL)
                itemView.findViewById<TextView>(R.id.txt_date).setTypeface(Typeface.DEFAULT, if (unread) BOLD else NORMAL)


            }

        }
    }
}

fun View.oval(@ColorInt color: Int): ShapeDrawable {
    val oval = ShapeDrawable(OvalShape())
    with(oval) {
        intrinsicHeight = height
        intrinsicWidth = width
        paint.color = color
    }
    return oval
}

