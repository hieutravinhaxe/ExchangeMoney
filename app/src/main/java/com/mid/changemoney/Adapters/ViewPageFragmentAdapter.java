package com.mid.changemoney.Adapters;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import com.mid.changemoney.AcountFragment;
import com.mid.changemoney.ExchangeFragment;
import com.mid.changemoney.ListRateFragment;

public class ViewPageFragmentAdapter extends FragmentStatePagerAdapter {

    public ViewPageFragmentAdapter(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new ListRateFragment();
            case 1:
                return new ExchangeFragment();
            case 2:
                return new AcountFragment();
            default:
                return new ListRateFragment();
        }
    }

    @Override
    public int getCount() {
        return 3;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        String title ="";
        switch (position){
            case 0:
                title = "Rates";
                break;
            case 1:
                title = "Exchange";
                break;
            case 2:
                title = "Account";
                break;
        }
        return title;
    }
}
