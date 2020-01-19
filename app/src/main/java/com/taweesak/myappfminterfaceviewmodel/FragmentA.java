package com.taweesak.myappfminterfaceviewmodel;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class FragmentA extends Fragment {

    EditText editTextA,editTextB;
    TextView textView;
    Button button;
    MyViewModel myViewModel;

    public FragmentA() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_a, container, false);
        findView(v);
        myViewModel = ViewModelProviders.of(getActivity()).get(MyViewModel.class);

        myViewModel.getNumber().observe(getActivity(), new Observer<MyModel>() {
            @Override
            public void onChanged(MyModel myModel) {
                textView.setText(""+myModel.getResult());
            }
        });

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                try {
                    double a = Double.parseDouble(editTextA.getText().toString());
                    double b = Double.parseDouble(editTextB.getText().toString());
                    MyModel myModel = new MyModel(a,b);

                    myViewModel.setNumber(myModel);

                }catch (NumberFormatException e){
                    Toast.makeText(getActivity(),"Number Error "+e,Toast.LENGTH_SHORT).show();
                }
            }
        });

        return v;
    }

    private void findView(View v) {
        editTextA = v.findViewById(R.id.editTextA);
        editTextB = v.findViewById(R.id.editTextB);
        textView = v.findViewById(R.id.textView);
        button = v.findViewById(R.id.button);
    }
}
