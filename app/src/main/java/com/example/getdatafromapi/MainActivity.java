package com.example.getdatafromapi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
    Button btnGetData;
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnGetData = findViewById(R.id.btnGetData);
        listView = findViewById(R.id.listviewData);

        btnGetData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Api_interface api_interface=RetrofitClient.getRetrofitInstance().create(Api_interface.class);

                Call<model>call=api_interface.getAllData();

                call.enqueue(new Callback< model >() {


                    @Override
                    public void onResponse(Call<model> call, Response<model> response) {
                        ArrayList<model.data> data = response.body().getData();
                        String[] names = new String[data.size()];
                        for (int i = 0; i < data.size(); i++) {
                            names[i] = "Id : " + data.get(i).getId() + "\nName : " + data.get(i).getFirst_name() + " " + data.get(i).getLast_name() + "\nEmail : " + data.get(i).getEmail();
                        }
                        listView.setAdapter(new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_list_item_1, names));


                    }

                    @Override
                    public void onFailure(Call<model> call, Throwable t) {
                        Toast.makeText(getApplicationContext(), "An error has occured", Toast.LENGTH_LONG).show();


                    }

                });

            }
        });
    }
}