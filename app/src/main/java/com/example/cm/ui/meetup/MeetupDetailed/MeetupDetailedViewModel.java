package com.example.cm.ui.meetup.MeetupDetailed;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.cm.data.models.Meetup;
import com.example.cm.data.repositories.MeetupRepository;
import com.google.android.gms.maps.model.LatLng;

public class MeetupDetailedViewModel extends ViewModel {

    private MutableLiveData<Meetup> meetup;

    public MeetupDetailedViewModel(String meetupId) {
        MeetupRepository meetupRepository = new MeetupRepository();
        meetup = meetupRepository.getMeetup(meetupId);
    }

    public MutableLiveData<Meetup> getMeetup() {
        return meetup;
    }

    public LatLng getMeetupLocation() {
        if (meetup.getValue() == null) {
            return null;
        }
        return meetup.getValue().getLocation();
    }
}