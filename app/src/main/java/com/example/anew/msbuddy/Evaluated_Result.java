package com.example.anew.msbuddy;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONObject;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Evaluated_Result extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_evaluated__result);

        final String server_url="C:\\xampp\\htdocs\\WebService.php";
        final String gre_V = getIntent().getStringExtra("gre_ver");
        final String gre_Q = getIntent().getStringExtra("gre_qun");
        String gre_A = getIntent().getStringExtra("gre_awa");
        final String Toefl_R = getIntent().getStringExtra("toefl_rea");
        final String Toefl_W = getIntent().getStringExtra("toefl_wri");
        final String Toefl_L = getIntent().getStringExtra("toefl_lis");
        final String Toefl_S = getIntent().getStringExtra("toefl_spe");
        final String UG = getIntent().getStringExtra("percentage");
        final String WE = getIntent().getStringExtra("workexp");
        final String RP = getIntent().getStringExtra("research");


      //  int Quant = Integer.parseInt(gre_Q);

        try {
            int Quant = Integer.parseInt(gre_Q);
            int Verbal = Integer.parseInt(gre_V);
            int total_gre= Quant+Verbal;
            int total_toefl= Integer.parseInt(Toefl_L)+Integer.parseInt(Toefl_R)+Integer.parseInt(Toefl_S)+Integer.parseInt(Toefl_W);
            int grade=Integer.parseInt(UG);
            int worl=Integer.parseInt(WE);
            int paper=Integer.parseInt(RP);
        } catch(NumberFormatException nfe) {
            System.out.println("Could not parse " + nfe);
        }

      //  TextView test = (TextView) findViewById(R.id.test);
        //EditText tt = (EditText) findViewById(R.id.editText_test);

      //  Toast.makeText(this,Quant,Toast.LENGTH_SHORT).show();
        Button result = (Button)findViewById(R.id.button);

        if(result!=null)
        {
             result.setOnClickListener(new View.OnClickListener() {
             public void onClick(View arg0) {
                 RequestQueue requestQueue= Volley.newRequestQueue(Evaluated_Result.this);

                 JsonObjectRequest jsonObjectRequest= new JsonObjectRequest(Request.Method.POST, server_url, null,
                         new Response.Listener<JSONObject>() {
                             @Override
                             public void onResponse(JSONObject response) {

                             }
                         }, new Response.ErrorListener() {
                     @Override
                     public void onErrorResponse(VolleyError error) {

                     }
                 })
                 {

                     protected Map<String, String> getParams() {
                         Map<String, String> params = new HashMap<String, String>();
                         params.put("gre_V",gre_V);
                         params.put("gre_Q",gre_Q);
                         params.put("toefl_S",Toefl_S);
                         params.put("toefl_L",Toefl_L);
                         params.put("toefl_W",Toefl_W);
                         params.put("toefl_R",Toefl_R);
                         params.put("UG",UG);
                         params.put("WE",WE);
                         params.put("RP",RP);

                         return params;
                     }
                 };
                 
             }
            });
            }

  //          Spinner spinner1 = (Spinner) findViewById(R.id.spinner);
        final AutoCompleteTextView autoCompleteTextView= (AutoCompleteTextView) findViewById(R.id.auto);
            ArrayAdapter<String> adapter;
            List<String> list;
            list = new ArrayList<String>();

        List<String> rows = new ArrayList<>();
        CSVReader csvReader = new CSVReader(getApplicationContext());


        try {
            rows = csvReader.readCSV();
            Toast.makeText(this,"moni",Toast.LENGTH_SHORT).show();
        } catch (IOException e) {
            Toast.makeText(this,e.toString(),Toast.LENGTH_SHORT).show();
            e.printStackTrace();
        }

        for (int i = 0; i < rows.size(); i++) {
            list.add(rows.get(i));
        }
            adapter = new ArrayAdapter<String>(getApplicationContext(),
                    android.R.layout.simple_spinner_item, list);
            adapter.setDropDownViewResource(android.R.layout.simple_list_item_1);
            if(autoCompleteTextView!=null) {
                autoCompleteTextView.setAdapter(adapter);

        }

        result.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str = autoCompleteTextView.getText().toString();

            }
        });
      //  test.setText("monika");
        //tt.setText(gre_A);

    }
}
