package com.example.myapplication

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.RecyclerView
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout
import com.example.myapplication.databinding.FragmentFirstBinding
import com.example.myapplication.myviewmodels.NewsListViewModel
import com.example.myapplication.recycleradapter.NewsItemAdapter
import retrofit2.Retrofit

/**
 * A simple [Fragment] subclass as the default destination in the navigation.
 */
class FirstFragment : Fragment(),SwipeRefreshLayout.OnRefreshListener {

    private lateinit var viewBinding: FragmentFirstBinding;
    private lateinit var swipeRefreshLayout: SwipeRefreshLayout;
    private lateinit var recyclerView: RecyclerView;
    private var newsListViewModel:NewsListViewModel = NewsListViewModel();
    private lateinit var adapter: NewsItemAdapter;

    private lateinit var retrofit:Retrofit;

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        retrofit = Retrofit.Builder().build();

        viewBinding = FragmentFirstBinding.inflate(inflater);
        swipeRefreshLayout = viewBinding.swipeRefreshLayout;
        recyclerView = viewBinding.newsRecyclerView;
        return viewBinding.root;
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        swipeRefreshLayout.setOnRefreshListener(this);
//        view.findViewById<Button>(R.id.button_first).setOnClickListener {
//            findNavController().navigate(R.id.action_FirstFragment_to_SecondFragment)
//        }


    }

    override fun onRefresh() {
        TODO("Not yet implemented")

    }
}