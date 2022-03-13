package com.example.cm.ui.meetup.MeetupList;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.GridLayoutManager;

import com.example.cm.databinding.FragmentMeetupListBinding;
import com.example.cm.ui.adapters.MeetupListAdapter;

public class MeetupListFragment extends Fragment {

    private FragmentMeetupListBinding binding;
    private MeetupListAdapter meetupListAdapter;

    @SuppressLint("NotifyDataSetChanged")
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        binding = FragmentMeetupListBinding.inflate(inflater, container, false);
        initUi();
        initViewModel();
        return binding.getRoot();
    }
  
    private void initUi() {
        GridLayoutManager gridLayout = new GridLayoutManager(getContext(), 2);
        binding.meetupListRecyclerView.setLayoutManager(gridLayout);
        binding.meetupListRecyclerView.setHasFixedSize(true);
    }

    @SuppressLint("NotifyDataSetChanged")
    private void initViewModel() {
        MeetupListViewModel meetupListViewModel = new ViewModelProvider(this).get(MeetupListViewModel.class);
        meetupListViewModel.getMeetups().observe(getViewLifecycleOwner(), meetups -> {
            if (meetups.size() == 0) {
                binding.noMeetupsWrapper.setVisibility(View.VISIBLE);
                binding.meetupListRecyclerView.setVisibility(View.GONE);
                return;
            }
            meetupListAdapter = new MeetupListAdapter(meetups);
            binding.meetupListRecyclerView.setAdapter(meetupListAdapter);
            binding.noMeetupsWrapper.setVisibility(View.GONE);
            binding.meetupListRecyclerView.setVisibility(View.VISIBLE);
        });
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}