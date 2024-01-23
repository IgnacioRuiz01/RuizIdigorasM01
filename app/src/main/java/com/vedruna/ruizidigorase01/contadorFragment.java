package com.vedruna.ruizidigorase01;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link contadorFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class contadorFragment extends Fragment {

    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";
    private String mParam1;
    private String mParam2;
    private EditText numero;

    private int num;
    public contadorFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Contador_Fragment.
     */
    // TODO: Rename and change types and number of parameters
    public static contadorFragment newInstance(String param1, String param2) {
        contadorFragment fragment = new contadorFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_contador_, container, false);

      //  numero= numero.findViewById(num);
        // num= Integer.parseInt(numero.getText().toString());
    }

    public void sumar(View view){
        num++;
        numero.setText(String.valueOf(num));
    }

    public void reset(View view){
        num=0;
        numero.setText(String.valueOf(num));
    }

    public void resta(View view) {
        if (num > 0) {
            num--;
            numero.setText(String.valueOf(num));
        }

    }
}