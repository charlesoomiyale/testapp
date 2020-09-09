package com.example.myapplication.recycleradapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.R
import com.example.myapplication.models.Articles

class NewsItemAdapter(private var articles:ArrayList<Articles>) : RecyclerView.Adapter<NewsItemAdapter.NewsItemViweHolder>() {


    inner class NewsItemViweHolder(private val view: View):RecyclerView.ViewHolder(view){
        fun bindView(image:String,title:String){

        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NewsItemViweHolder {
        return NewsItemViweHolder(LayoutInflater.from(parent.context).inflate(R.layout.rv_news_item_layout, parent, false));
    }

    override fun onBindViewHolder(holder: NewsItemViweHolder, position: Int) {
       holder.bindView(articles[position].urlToImage,articles[position].title);
    }

    override fun getItemCount(): Int {
        return articles.size;
    }

}