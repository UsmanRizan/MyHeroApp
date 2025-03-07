package lk.sliita.mysuperheroapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;
import com.squareup.picasso.Picasso;

import org.json.JSONException;
import org.json.JSONObject;

public class SingleHeroView extends AppCompatActivity {

    int id =1;
    String name,imageURL,des;
    RequestQueue queue;
    TextView tv,n;
    ImageView single_pic;
    String url = "https://akabab.github.io/superhero-api/api";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_single_hero_view);
        n = findViewById(R.id.tv_description);
        tv=findViewById(R.id.tv_name_single);
        single_pic=findViewById(R.id.img_single);
        queue = Volley.newRequestQueue(this);
    }

    public void LoadSuperHero (String id) {
        String singleHeroEndPoint = url + "/id/" + id + ".json";
        JsonObjectRequest jsonObjectRequest = new JsonObjectRequest(Request.Method.GET, singleHeroEndPoint, null, new Response.Listener<JSONObject>() {
            @Override
            public void onResponse(JSONObject response) {
                try {
                    name = response.getString("name");
                    imageURL = response.getJSONObject("images").getString("lg");
                    des = response.getString("powerstats");
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                String err = error.toString();
                tv.setText("Cannot Get Data"+error.toString());
            }
        });
        queue.add(jsonObjectRequest);
    }

    public void buttonTapped(View view) {
        id = id +1;
        LoadSuperHero(String.valueOf(id));
        tv.setText(name);
        n.setText(des);
        Picasso.get().load(imageURL).resize(700,700).into(single_pic);
    }
}





