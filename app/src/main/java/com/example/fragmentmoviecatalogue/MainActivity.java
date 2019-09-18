package com.example.fragmentmoviecatalogue;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.example.fragmentmoviecatalogue.Fragment.FragmentMovie;
import com.example.fragmentmoviecatalogue.Fragment.FragmentTvShow;
import com.example.fragmentmoviecatalogue.adapter.ViewPagerAdapter;
import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {

    private TabLayout tabLayout;
    private ViewPager viewPager;
    private ViewPagerAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tabLayout = (TabLayout) findViewById(R.id.tablayout_id);
        viewPager = (ViewPager) findViewById(R.id.viewpager_id);
        adapter = new ViewPagerAdapter(getSupportFragmentManager());

        //TODO menambahkan fragment
        adapter.AddFragment(new FragmentMovie(), "");
        adapter.AddFragment(new FragmentTvShow(),"");
        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);

        tabLayout.getTabAt(0).setIcon(R.drawable.ic_star);
        tabLayout.getTabAt(1).setIcon(R.drawable.ic_laptop);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setElevation(0);
    }
}
