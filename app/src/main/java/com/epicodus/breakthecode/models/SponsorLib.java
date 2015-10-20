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
                "The Clymb",
                "Every day The Clymb shares new personalized sales events featuring incredible deals on the premium outdoor equipment and fresh adventure lifestyle looks you love",
                "http://www.theclymb.com/",
                R.drawable.clymb
        ));

        mSponsors.add(new Sponsor(
                "Columbia Ultimate",
                "Columbia Ultimate offers an end-to-end line of collection software and services to help organizations automate, analyze, manage and handle accounts. Collection agencies, banks, healthcare, and retail organizations, along with state, county, and local governments nationwide all rely on Columbia Ultimate solutions to maximize collection performance, reduce costs, and collect more dollars.",
                "https://www.columbiaultimate.com/",
                R.drawable.columbia_ultimate
        ));

        mSponsors.add(new Sponsor(
                "CrowdCompass",
                "CrowdCompass is the world's largest developer of mobile event apps and conference apps.",
                "http://www.crowdcompass.com/",
                R.drawable.crowd_compass
        ));

        mSponsors.add(new Sponsor(
                "DevelopmentNow",
                "DevelopmentNow is an award-winning digital product solutions agency that integrates mobile, web, and hardware solutions to fit any use case, bringing innovative products to market and helping companies improve existing products.",
                "http://developmentnow.com/",
                R.drawable.development_now
        ));

        mSponsors.add(new Sponsor(
                "GlobeSherpa",
                "Started in 2010, GlobeSherpa provides a secure, mobile ticketing platform for transit systems interested in moving to open payments, open data, and mobile fare collection with minimal infrastructure investment. GlobeSherpa is using that same technology to create easy-to-use mobile ticketing systems for parking, events, and local destinations.",
                "http://www.globesherpa.com/",
                R.drawable.globe_sherpa
        ));

        mSponsors.add(new Sponsor(
                "Jive",
                "Jive is the leading provider of modern communication and collaboration solutions for business.",
                "https://www.jivesoftware.com/",
                R.drawable.jive
        ));

        mSponsors.add(new Sponsor(
                "Thetus Corporation",
                "Semantic modeling technologies are poised to revolutionize the world of information management, and Thetus is committed to leading the way into this exciting new space.",
                "https://www.thetus.com/",
                R.drawable.thetus
        ));

        mSponsors.add(new Sponsor(
                "Simple",
                "Simple offers a bank account that has all the tools you need to manage your money built right in. The funds in your Simple account are held by our partner bank, The Bancorp Bank, Member FDIC. Simple provides everything else, including the Simple Visa® Card, our powerful iOS and Android apps, a beautifully designed web interface, and customer support that really cares.",
                "https://www.simple.com/",
                R.drawable.simple
        ));

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
