package ellen.joshua.craftbeerguru;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import static ellen.joshua.craftbeerguru.TabFragment.int_items;

/**
 * Created by Admin on 3/1/2017.
 */

public class MyAdapter  extends FragmentPagerAdapter {


    public MyAdapter(FragmentManager fm)
    {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new MyCheckInsFragment();
            case 1:
                return new MyProfileFragment();
            case 2:
                return new HomeFragment();
            case 3:
                return new MyTrophiesFragment();
            case 4:
                return new CBGStoreFragment();
        }
        return null;
    }

    @Override
    public int getCount() {

        return int_items;
    }

    public CharSequence getPageTitle(int position){
        switch (position){
            case 0:
                return "Check-Ins";
            case 1:
                return "My Profile";
            case 2:
                return "Home";
            case 3:
                return "Trophies";
            case 4:
                return "CBG Store";
        }

        return null;
    }
}
