package pc.mukhtarif.materialtab;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

import pc.mukhtarif.materialtab.adapter.TabFragmentPagerAdapter;

public class MainActivity extends AppCompatActivity {
    private Toolbar toolbar;
    private TabLayout tabs;
    private ViewPager pager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //setup toolbar
        toolbar = (Toolbar)findViewById(R.id.tool_bar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Info Angkot");

        //inisialisasi pager dan tab
        pager = (ViewPager)findViewById(R.id.pager);
        tabs = (TabLayout)findViewById(R.id.tabs);

        //set object adapter kedalam viewpager
        pager.setAdapter(new TabFragmentPagerAdapter(getSupportFragmentManager()));

        //manipulasi sedikit untuk set textColor pada tab
        tabs.setTabTextColors(getResources().getColor(R.color.colorPrimaryDark),getResources().getColor(android.R.color.white));

        //set tab ke viewpager
        tabs.setupWithViewPager(pager);

        //konfigurasi gravity fill untuk tab berada di posisi  yang proporsional
        tabs.setTabGravity(TabLayout.GRAVITY_FILL);
    }
}
