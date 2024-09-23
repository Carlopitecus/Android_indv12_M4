package com.example.individual_11;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioGroup;
import android.widget.TextView;

public class FragmentRadius extends Fragment {

TextView respuesta;
RadioGroup radioGroup;

@Nullable
@Override
public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

    // Inflate the layout for this fragment
    return inflater.inflate(R.layout.fragment_radius, container, false);

}

@Override
public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
    super.onViewCreated(view, savedInstanceState);
    respuesta = view.findViewById(R.id.text_respuesta);
    radioGroup = view.findViewById(R.id.radio_group);

    radioGroup.setOnCheckedChangeListener((group, checkedId) -> {
        //RadioButton radioButton = view.findViewById(checkedId);
        //textView.setText(radioButton.getText());

        if (checkedId == R.id.radio_yes) {
            respuesta.setText(R.string.yes_message);

        } else if (checkedId == R.id.radio_no) {
            respuesta.setText(R.string.no_message);

        }
    });



}

}