package net.senekal.craftylogger

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.RecyclerView

class PaintByNumbersList : AppCompatActivity() {
        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            enableEdgeToEdge()
            setContentView(R.layout.activity_paint_by_numbers_list)
            setupList()
            ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.recycler_view_paint_by_numbers_list)) { v, insets ->
                val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
                v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
                insets
            }
        }
        private fun setupList(){

            var myList= mutableListOf<PaintByNumbersListEntry>()
            myList.add( PaintByNumbersListEntry("Heading 1", "Description 1", R.drawable.paint_by_numbers_screen_image, 4.5f))
            myList.add( PaintByNumbersListEntry("Heading 2", "Description 2", R.drawable.paint_by_numbers_screen_image, 3.8f))
            myList.add( PaintByNumbersListEntry("Heading 1", "Description 1", R.drawable.paint_by_numbers_screen_image, 4.5f))
            myList.add( PaintByNumbersListEntry("Heading 2", "Description 2", R.drawable.paint_by_numbers_screen_image, 3.8f))
            myList.add( PaintByNumbersListEntry("Heading 1", "Description 1", R.drawable.paint_by_numbers_screen_image, 4.5f))
            myList.add( PaintByNumbersListEntry("Heading 2", "Description 2", R.drawable.paint_by_numbers_screen_image, 3.8f))
            myList.add( PaintByNumbersListEntry("Heading 1", "Description 1", R.drawable.paint_by_numbers_screen_image, 4.5f))
            myList.add( PaintByNumbersListEntry("Heading 2", "Description 2", R.drawable.paint_by_numbers_screen_image, 3.8f))
            myList.add( PaintByNumbersListEntry("Heading 1", "Description 1", R.drawable.paint_by_numbers_screen_image, 4.5f))
            myList.add( PaintByNumbersListEntry("Heading 2", "Description 2", R.drawable.paint_by_numbers_screen_image, 3.8f))
            myList.add( PaintByNumbersListEntry("Heading 1", "Description 1", R.drawable.paint_by_numbers_screen_image, 4.5f))
            myList.add( PaintByNumbersListEntry("Heading 2", "Description 2", R.drawable.paint_by_numbers_screen_image, 3.8f))
            myList.add( PaintByNumbersListEntry("Heading 1", "Description 1", R.drawable.paint_by_numbers_screen_image, 4.5f))
            myList.add( PaintByNumbersListEntry("Heading 2", "Description 2", R.drawable.paint_by_numbers_screen_image, 3.8f))


            val recyclerView: RecyclerView = findViewById(R.id.recycler_view_paint_by_numbers_list)
            val adapter =  PaintByNumbersListEntryAdapter(myList)
            recyclerView.adapter = adapter


        }
    }