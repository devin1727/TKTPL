package com.example.helloworld;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.helloworld.databinding.FragmentTaskListBinding;

import java.util.ArrayList;
import java.util.List;

public class TaskListFragment extends Fragment {
    private FragmentTaskListBinding binding;
    private DetailsFragment detailsFragment = new DetailsFragment();

    public TaskListFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = DataBindingUtil.inflate(inflater,R.layout.fragment_task_list, container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        SharedViewModel viewModel = new ViewModelProvider(requireActivity()).get(SharedViewModel.class);
        List<Item> list = new ArrayList<>();
        list.add(new Item("Monday", "Lab TKTPL", "Deadline 23.55"));
        list.add(new Item("Thursday", "Forum IR", "Apa yang sudah dipelajari dan kesulitan yang dihadapi"));
        list.add(new Item("Friday", "Tugas IR", "Deadline 23.55"));

        RecyclerViewAdapter adapter = new RecyclerViewAdapter(list);
        binding.recycleView.setAdapter(adapter);
        adapter.setListener((v, position) -> {
            viewModel.setSelected(adapter.getItemAt(position));
            getParentFragmentManager().beginTransaction().replace(R.id.container,detailsFragment).addToBackStack(null).commit();
        });
    }
}