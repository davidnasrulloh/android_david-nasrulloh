package com.davidnasrulloh.likesapp

import android.graphics.Bitmap
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView

class LatihanDuaFragment : Fragment(R.layout.fragment_latihan_dua) {

    private lateinit var bitmap: Bitmap
    private lateinit var canvas: Canvas

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_latihan_dua, container, false)

        val imageView = view.findViewById<ImageView>(R.id.my_image_view)

        // Membuat bitmap dengan ukuran sama dengan ImageView
        bitmap = Bitmap.createBitmap(1000, 1000, Bitmap.Config.ARGB_8888)

        // Membuat canvas dengan bitmap sebagai targetnya
        canvas = Canvas(bitmap)

        // Melakukan beberapa operasi pada canvas (contoh)
        val paint = Paint()
        paint.color = Color.RED
        canvas.drawRect(0F, 0F, imageView.width.toFloat(), imageView.height.toFloat(), paint)

        // Menampilkan bitmap di dalam ImageView
        imageView.setImageBitmap(bitmap)

        return view
    }

    companion object {
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            LatihanDuaFragment().apply {

            }
    }
}