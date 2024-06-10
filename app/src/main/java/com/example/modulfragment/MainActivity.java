package com.example.modulfragment;

import android.os.Bundle;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.viewpager2.widget.ViewPager2;

public class MainActivity extends AppCompatActivity {

    private SectionStatePagerAdapter mSectionStatePagerAdapter;
    private ViewPager2 mViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        mViewPager = findViewById(R.id.container);
        setupViewPager(mViewPager);
    }

    private void setupViewPager(ViewPager2 viewPager) {
        mSectionStatePagerAdapter = new SectionStatePagerAdapter(this);
        mSectionStatePagerAdapter.addFragment(new Fragment01(), "Fragment01");
        mSectionStatePagerAdapter.addFragment(new Fragment02(), "Fragment02");
        mSectionStatePagerAdapter.addFragment(new Fragment03(), "Fragment03");
        viewPager.setAdapter(mSectionStatePagerAdapter);
    }

    public void setViewPager(int i) {
        mViewPager.setCurrentItem(i);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}
