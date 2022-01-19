package com.example.cm.ui.profile;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.cm.data.models.User;
import com.example.cm.databinding.FragmentProfileBinding;
import com.example.cm.utils.Navigator;

public class ProfileFragment extends Fragment {

    private static final String TAG = "ProfileFragment";

    private ProfileViewModel profileViewModel;
    private Navigator navigator;
    private FragmentProfileBinding binding;
    private User user;


    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        binding = FragmentProfileBinding.inflate(inflater, container, false);
        initListener();
        initViewModel();

        return binding.getRoot();
    }

    private void initListener() {
        navigator = new Navigator(requireActivity());
        binding.btnToFriendsList.setOnClickListener(v -> navigator.navigateToFriends());

    }

    @SuppressLint("SetTextI18n")
    private void initViewModel() {
        profileViewModel = new ViewModelProvider(this).get(ProfileViewModel.class);

        profileViewModel.getCurrentUser().observe(getViewLifecycleOwner(), currentUser -> {
            if (currentUser == null) return;
            binding.tvName.setText(currentUser.getFirstName() + " " + currentUser.getLastName());
            binding.tvUsername.setText(currentUser.getUsername());
        });
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {

        Bundle bundle = this.getArguments();
        if (bundle != null) {
            if (bundle.containsKey("userId")) {

                binding.btnToFriendsList.setVisibility(View.GONE);
                String profileId = bundle.getString("userId");
                profileViewModel.getUserById(profileId);

            }
        }
    }


    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }


}
