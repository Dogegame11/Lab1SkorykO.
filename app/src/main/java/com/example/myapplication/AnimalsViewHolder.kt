package com.example.myapplication
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.view.menu.MenuView.ItemView
import androidx.constraintlayout.utils.widget.ImageFilterView
import androidx.recyclerview.widget.RecyclerView

class AnimalsRecyclerAdapter(private val names: List<AnimalData>, val activity: MainActivity):
    RecyclerView.Adapter<AnimalsRecyclerAdapter.AnimalsViewHolder>() {

    class AnimalsViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        var largeTextView: TextView = itemView.findViewById(R.id.textViewLarge)
        var smallTextView: TextView = itemView.findViewById(R.id.textViewSmall)
        var itemView: ImageView = itemView.findViewById(R.id.imageView)
        var button: Button = itemView.findViewById(R.id.button)
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AnimalsViewHolder {
        val itemView =
            LayoutInflater.from(parent.context)
                .inflate(R.layout.animal_item, parent, false)
        return AnimalsViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: AnimalsViewHolder, position: Int) {
        holder.largeTextView.text = names[position].name
        holder.smallTextView.text = names[position].descriptionShort
        holder.itemView.setBackgroundResource(names[position].imageId)
        holder.largeTextView.setTextColor(names[position].textColor)
        holder.smallTextView.setTextColor(names[position].textColor)

        holder.button.setOnClickListener {
            activity.startActivity(names[position].descriptionLong)
        }
    }

    override fun getItemCount(): Int {
        return names.size
    }
}