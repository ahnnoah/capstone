package com.cookandroid.capstone1;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;

public class MoveFragment extends Fragment {

    public MoveFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_move, container, false);

        //변수 생성
        RadioGroup move_group = (RadioGroup)view.findViewById(R.id.move_group);
        Spinner time_spi = (Spinner)view.findViewById(R.id.time_spi);
        Spinner room_spi = (Spinner)view.findViewById(R.id.room_spi);
        Button cancel_btn = (Button)view.findViewById(R.id.cancel_btn);
        Button ok_btn = (Button)view.findViewById(R.id.ok_btn);

        //스피너 안보이게
        time_spi.setVisibility(View.INVISIBLE);
        room_spi.setVisibility(View.INVISIBLE);

        //라디오버튼
        move_group.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                switch (i) {
                    case R.id.move_auto:    //자동
                        time_spi.setVisibility(View.INVISIBLE); //안보이게
                        room_spi.setVisibility(View.INVISIBLE); //안보이게
                        break;
                    case R.id.move_time:    //시간별
                        time_spi.setVisibility(View.VISIBLE);   //보이게
                        room_spi.setVisibility(View.INVISIBLE); //안보이게
                        break;
                    case R.id.move_random:  //임의 지정
                        time_spi.setVisibility(View.INVISIBLE); //안보이게
                        room_spi.setVisibility(View.VISIBLE);   //보이게
                        break;
                }
            }
        });

        return view;
    }
}