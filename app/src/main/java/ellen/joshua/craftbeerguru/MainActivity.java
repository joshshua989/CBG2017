package ellen.joshua.craftbeerguru;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import android.support.v4.app.FragmentManager;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    DrawerLayout drawerLayout;
    NavigationView navigationView;
    FragmentManager FM;
    FragmentTransaction FT;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        drawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
        navigationView= (NavigationView) findViewById(R.id.nav_view);

        FM = getSupportFragmentManager();
        FT = FM.beginTransaction();
        FT.replace(R.id.container_view, new TabFragment()).commit();

        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                drawerLayout.closeDrawers();

                if (item.getItemId() == R.id.nav_home) {
                    FragmentTransaction fragmentTransaction = FM.beginTransaction();
                    // set TabFragment Arguments
                    TabFragment nav_frag = new TabFragment();
                    Bundle bundle = new Bundle();
                    bundle.putInt("item_key", 2);
                    nav_frag.setArguments(bundle);
                    fragmentTransaction.replace(R.id.container_view, nav_frag);
                    fragmentTransaction.commit();
                }
                if (item.getItemId()== R.id.nav_beer_facts)
                {
                    FragmentTransaction fragmentTransaction = FM.beginTransaction();
                    fragmentTransaction.addToBackStack(null);
                    fragmentTransaction.replace(R.id.container_view,new BeerFactsFragment()).commit();
                }
                if (item.getItemId()== R.id.nav_brewery_events)
                {
                    FragmentTransaction fragmentTransaction = FM.beginTransaction();
                    fragmentTransaction.addToBackStack(null);
                    fragmentTransaction.replace(R.id.container_view,new BreweryEventsFragment()).commit();
                }
                if (item.getItemId()== R.id.nav_my_profile)
                {
                    FragmentTransaction fragmentTransaction = FM.beginTransaction();
                    // set TabFragment Arguments
                    TabFragment nav_frag = new TabFragment();
                    Bundle bundle = new Bundle();
                    bundle.putInt("item_key", 1);
                    nav_frag.setArguments(bundle);
                    fragmentTransaction.replace(R.id.container_view, nav_frag);
                    fragmentTransaction.commit();
                }
                if (item.getItemId()==R.id.nav_my_messages)
                {
                    FragmentTransaction fragmentTransaction = FM.beginTransaction();
                    fragmentTransaction.addToBackStack(null);
                    fragmentTransaction.replace(R.id.container_view,new MyMessagesFragment()).commit();
                }
                if (item.getItemId()==R.id.nav_my_friends)
                {
                    FragmentTransaction fragmentTransaction = FM.beginTransaction();
                    fragmentTransaction.addToBackStack(null);
                    fragmentTransaction.replace(R.id.container_view,new MyFriendsFragment()).commit();
                }
                if (item.getItemId()==R.id.nav_my_favorites)
                {
                    FragmentTransaction fragmentTransaction = FM.beginTransaction();
                    fragmentTransaction.addToBackStack(null);
                    fragmentTransaction.replace(R.id.container_view,new MyFavoritesFragment()).commit();
                }
                if (item.getItemId()==R.id.nav_my_upcoming_events)
                {
                    FragmentTransaction fragmentTransaction = FM.beginTransaction();
                    fragmentTransaction.addToBackStack(null);
                    fragmentTransaction.replace(R.id.container_view,new MyUpcomingEventsFragment()).commit();
                }
                if (item.getItemId()==R.id.nav_cbg_store)
                {
                    FragmentTransaction fragmentTransaction = FM.beginTransaction();
                    // set TabFragment Arguments
                    TabFragment nav_frag = new TabFragment();
                    Bundle bundle = new Bundle();
                    bundle.putInt("item_key", 4);
                    nav_frag.setArguments(bundle);
                    fragmentTransaction.replace(R.id.container_view, nav_frag);
                    fragmentTransaction.commit();
                }
                if (item.getItemId()==R.id.nav_share)
                {
                    FragmentTransaction fragmentTransaction = FM.beginTransaction();
                    fragmentTransaction.addToBackStack(null);
                    fragmentTransaction.replace(R.id.container_view,new ShareFragment()).commit();
                }
                if (item.getItemId()==R.id.nav_subscribe)
                {
                    FragmentTransaction fragmentTransaction = FM.beginTransaction();
                    fragmentTransaction.addToBackStack(null);
                    fragmentTransaction.replace(R.id.container_view,new SubscribeFragment()).commit();
                }
                if (item.getItemId()==R.id.nav_upgrade_now)
                {
                    FragmentTransaction fragmentTransaction = FM.beginTransaction();
                    fragmentTransaction.addToBackStack(null);
                    fragmentTransaction.replace(R.id.container_view,new UpgradeNowFragment()).commit();
                }
                if (item.getItemId()==R.id.nav_my_settings)
                {
                    FragmentTransaction fragmentTransaction = FM.beginTransaction();
                    fragmentTransaction.addToBackStack(null);
                    fragmentTransaction.replace(R.id.container_view,new MySettingsFragment()).commit();
                }

                return false;
            }
        });

        android.support.v7.widget.Toolbar toolbar = (Toolbar)findViewById(R.id.toolbar);
        ActionBarDrawerToggle toggle= new ActionBarDrawerToggle(this,drawerLayout,toolbar,R.string.app_name,R.string.app_name);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();
    }

    // Handle back button pressed in fragments - all the FragmentTransaction are addToBackStack before commit:
    @Override
    public void onBackPressed() {
        int count = getFragmentManager().getBackStackEntryCount();
        if (count == 0) {
            super.onBackPressed();
//            // If a main tab is selected, display dialog - are you sure you wish to exit?
//            new AlertDialog.Builder(this)
//                    .setIcon(android.R.drawable.ic_dialog_alert)
//                    .setTitle("Leaving Craft Beer Guru")
//                    .setMessage("Are you sure you wish to exit?")
//                    .setPositiveButton("Yes", new DialogInterface.OnClickListener()
//                    {
//                        @Override
//                        public void onClick(DialogInterface dialog, int which) {
//                            finish();
//                        }
//
//                    })
//                    .setNegativeButton("No", null)
//                    .show();
        } else {
            getFragmentManager().popBackStack();
        }
    }

    public void bBreweryClicked(View v) {
        FragmentTransaction fragmentTransaction = FM.beginTransaction();
        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.replace(R.id.container_view,new BrowseNameFragment()).commit();
    }

    public void bFlavorClicked(View v) {
        FragmentTransaction fragmentTransaction = FM.beginTransaction();
        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.replace(R.id.container_view,new BrowseTasteFragment()).commit();
    }

    public void bStyleClicked(View v) {
        FragmentTransaction fragmentTransaction = FM.beginTransaction();
        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.replace(R.id.container_view,new BrowseStyleFragment()).commit();
    }
}
