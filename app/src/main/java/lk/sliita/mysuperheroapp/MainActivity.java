package lk.sliita.mysuperheroapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    List<Hero> heroList = new ArrayList<>() ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        populateData();
        RecyclerView rv=findViewById(R.id.myrecylerview);
        //rv.setLayoutManager(new LinearLayoutManager(this));
        rv.setLayoutManager(new GridLayoutManager(this,2,RecyclerView.HORIZONTAL,false));
        HeroAdapter adapter=new HeroAdapter(this, heroList);
        rv.setAdapter(adapter);
    }
    private void populateData(){

        heroList.add(new Hero("Alan Scott","DC Comics", "Male", R.drawable.alan_scott, "https://en.wikipedia.org/wiki/Alan_Scott"));
        heroList.add(new Hero("Alan Scott","DC Comics", "Male", R.drawable.alan_scott, "https://en.wikipedia.org/wiki/Alan_Scott"));
        heroList.add(new Hero("Alan Scott","DC Comics", "Male", R.drawable.alan_scott, "https://en.wikipedia.org/wiki/Alan_Scott"));
        heroList.add(new Hero("Alan Scott","DC Comics", "Male", R.drawable.alan_scott, "https://en.wikipedia.org/wiki/Alan_Scott"));
        heroList.add(new Hero("Alan Scott","DC Comics", "Male", R.drawable.alan_scott, "https://en.wikipedia.org/wiki/Alan_Scott"));
        heroList.add(new Hero("Alan Scott","DC Comics", "Male", R.drawable.alan_scott, "https://en.wikipedia.org/wiki/Alan_Scott"));
        heroList.add(new Hero("Alan Scott","DC Comics", "Male", R.drawable.alan_scott, "https://en.wikipedia.org/wiki/Alan_Scott"));
        heroList.add(new Hero("Alan Scott","DC Comics", "Male", R.drawable.alan_scott, "https://en.wikipedia.org/wiki/Alan_Scott"));
        heroList.add(new Hero("Alan Scott","DC Comics", "Male", R.drawable.alan_scott, "https://en.wikipedia.org/wiki/Alan_Scott"));
        heroList.add(new Hero("Alan Scott","DC Comics", "Male", R.drawable.alan_scott, "https://en.wikipedia.org/wiki/Alan_Scott"));
    }
}



