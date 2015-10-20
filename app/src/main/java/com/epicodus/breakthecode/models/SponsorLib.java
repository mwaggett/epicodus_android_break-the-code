package com.epicodus.breakthecode.models;

import com.epicodus.breakthecode.R;
import java.util.ArrayList;

public class SponsorLib {
    private ArrayList<Sponsor> mSponsors;

    public SponsorLib() {
        setSponsors();
    }

    public ArrayList<Sponsor> getSponsors() {
        return mSponsors;
    }

    private void setSponsors() {
        mSponsors = new ArrayList<Sponsor>();

        mSponsors.add(new Sponsor(
                "Smarsh",
                "With over 20,000 customers, Smarsh is the leading provider of archiving & compliance solutions for companies in regulated and litigious industries.",
                "www.smarsh.com",
                R.drawable.smarsh
        ));

        mSponsors.add(new Sponsor(
                "Uncorked Studios",
                "A product design and development company focused on the relationship between digital environments and the physical world.",
                "https://uncorkedstudios.com/",
                R.drawable.uncorked
        ));
    }

    public Sponsor nextSponsor(Sponsor currentSponsor) {
        int index = mSponsors.indexOf(currentSponsor);
        if (index == mSponsors.size()-1) {
            return mSponsors.get(0);
        } else {
            return mSponsors.get(index+1);
        }
    }
}
