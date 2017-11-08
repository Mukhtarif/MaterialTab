package pc.mukhtarif.materialtab.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import pc.mukhtarif.materialtab.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class Tab2Fragment extends Fragment {
    private Button btnTab2;

    public Tab2Fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_tab2, container, false);
        btnTab2 = (Button)view.findViewById(R.id.btnTab2);
        return view;
    }

    public void onActivityCreated(Bundle savedInstanceState){
        super.onActivityCreated(savedInstanceState);
        btnTab2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(),"Hola",Toast.LENGTH_LONG).show();
            }
        });
    }

}
