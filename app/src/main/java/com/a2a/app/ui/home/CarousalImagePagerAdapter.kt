package com.a2a.app.ui.home


import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import com.a2a.app.R


class CarousalImagePagerAdapter(
    val context: Context,
    private val images: List<Int>
) :
    androidx.viewpager.widget.PagerAdapter() {


    override fun instantiateItem(collection: ViewGroup, position: Int): View {
        val inflater = LayoutInflater.from(context)

        val layout = inflater.inflate(
            R.layout.single_slider_image,
            collection,
            false
        )
        val ivImage =
            layout.findViewById<ImageView>(R.id.ivImage)

        //ivImage.setActualImageResource(mResources[position])

        val image = images[position]
        ivImage.setImageResource(image)

       /* ivImage.setOnClickListener {
            val intent = Intent(context, ShopActivity::class.java)
            intent.putExtra("id", images[position].city._id)
            intent.putExtra("name", images[position].city.name)
            intent.putExtra("type", "City")
            context.startActivity(intent)

           *//* if(AppUtils(context).defaultAddress!=null) {
                val intent = Intent(context, ShopActivity::class.java)
                intent.putExtra("id", images[position].city._id)
                intent.putExtra("name", images[position].city.name)
                intent.putExtra("type", "City")
                context.startActivity(intent)
            }else{
                EventBus.getDefault().post(ShowError())
            }*//*
        }*/

        collection.addView(layout)
        return layout
    }

    override fun destroyItem(container: ViewGroup, position: Int, view: Any) {
        container.removeView(view as View)
    }

    override fun getCount(): Int {
        return this.images.size
    }

    override fun isViewFromObject(view: View, obj: Any): Boolean {
        return view == obj
    }

}