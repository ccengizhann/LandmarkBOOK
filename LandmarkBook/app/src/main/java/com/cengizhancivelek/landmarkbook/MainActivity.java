package com.cengizhancivelek.landmarkbook;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.cengizhancivelek.landmarkbook.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    //static Landmark selectedLandmark;
    private ActivityMainBinding binding;
    ArrayList<Landmark> landmarkArrayList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);


        //Data

        landmarkArrayList = new ArrayList<>();

        Landmark pisa = new Landmark("Pisa","Italy",R.drawable.pisa);
        Landmark eiffel = new Landmark("Eiffel","France",R.drawable.eiffel);
        Landmark colosseum = new Landmark("Colloseum","Italy",R.drawable.colesseum);
        Landmark galata = new Landmark("London Bridge","UK",R.drawable.galata);

        landmarkArrayList.add(pisa);
        landmarkArrayList.add(eiffel);
        landmarkArrayList.add(colosseum);
        landmarkArrayList.add(galata);

        //RecyclerView

        binding.recyclerView.setLayoutManager(new LinearLayoutManager(this));
        LandmarkAdapter landmarkAdapter = new LandmarkAdapter(landmarkArrayList);
        binding.recyclerView.setAdapter(landmarkAdapter);



        /*
        //Not Efficient
        Bitmap pisa = BitmapFactory.decodeResource(getApplicationContext().getResources(),R.drawable.pisa);
        Bitmap eiffel = BitmapFactory.decodeResource(getApplicationContext().getResources(),R.drawable.eiffel);
        Bitmap colesseo = BitmapFactory.decodeResource(getApplicationContext().getResources(),R.drawable.colesseo);
        Bitmap londonBridge = BitmapFactory.decodeResource(getApplicationContext().getResources(),R.drawable.londonbridge);

         */


        /*
        //ListView

        ArrayAdapter arrayAdapter = new ArrayAdapter(MainActivity.this,android.R.layout.simple_list_item_1,landmarkArrayList.stream().map(landmark-> landmark.name).collect(Collectors.toList()));

        binding.listView.setAdapter(arrayAdapter);

        binding.listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                //System.out.println(landmarkNames.get(i));
                //System.out.println(countryNames.get(i));

                Intent intent = new Intent(MainActivity.this,DetailActivity.class);
                intent.putExtra("landmark", landmarkArrayList.get(i));
                startActivity(intent);

            }
        });

         */

    }
}