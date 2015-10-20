package com.epicodus.breakthecode.ui;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.epicodus.breakthecode.R;
import com.epicodus.breakthecode.models.PartnerLib;
import com.epicodus.breakthecode.models.Sponsor;
import com.epicodus.breakthecode.models.SponsorLib;

public class SponsorsActivity extends AppCompatActivity {

    private TextView mNameLabel;
    private TextView mDescriptionLabel;
    private ImageView mPartnerImage;
    private Button mNextButton;

    private SponsorLib mSponsorLib;
    private Sponsor mCurrentSponsor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sponsors);

        mNameLabel = (TextView) findViewById(R.id.sponsorNameLabel);
        mDescriptionLabel = (TextView) findViewById(R.id.sponsorDescription);
        mPartnerImage = (ImageView) findViewById(R.id.sponsorImage);
        mNextButton = (Button) findViewById(R.id.nextSponsorButton);

        mSponsorLib = new SponsorLib();
        mCurrentSponsor = mSponsorLib.getSponsors().get(0);

        setLayoutContent();

        mNextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mCurrentSponsor = mSponsorLib.nextSponsor(mCurrentSponsor);
                setLayoutContent();
            }
        });

        mPartnerImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(mCurrentSponsor.getWebsite()));
                startActivity(intent);
            }
        });
    }

    private void setLayoutContent() {
        mNameLabel.setText(mCurrentSponsor.getName());
        mDescriptionLabel.setText(mCurrentSponsor.getDescription());
        mPartnerImage.setImageResource(mCurrentSponsor.getImage());
    }
}
