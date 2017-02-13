package com.geniusnine.android.marathijokes.Graffiti;

/**
 * Created by Dev on 14-12-2016.
 */


import com.geniusnine.android.marathijokes.R;

import java.util.ArrayList;
import java.util.Random;


public class GraffitiImages {

    private Random randNo;
    private ArrayList<Integer> imageId;

    public GraffitiImages() {
        imageId = new ArrayList<Integer>();
        imageId.add(R.drawable.grap);
        imageId.add(R.drawable.shtruu);
        imageId.add(R.drawable.mulga);
        imageId.add(R.drawable.doctorr);
        imageId.add(R.drawable.book);
        imageId.add(R.drawable.vish);
        imageId.add(R.drawable.talent);

        imageId.add(R.drawable.hushar);

        imageId.add(R.drawable.zop);

        imageId.add(R.drawable.khar);


        imageId.add(R.drawable.vat);
        imageId.add(R.drawable.badal);
        imageId.add(R.drawable.maran);
        imageId.add(R.drawable.dev);
        imageId.add(R.drawable.bayko);
        imageId.add(R.drawable.khott);
    }




    public int getImageId() {
        randNo = new Random();
        return imageId.get(randNo.nextInt(imageId.size()));
    }

    public ArrayList<Integer> getImageItem() {
        return imageId;
    }
}
