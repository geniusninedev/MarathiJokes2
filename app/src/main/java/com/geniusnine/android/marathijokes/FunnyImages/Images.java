package com.geniusnine.android.marathijokes.FunnyImages;

/**
 * Created by Dev on 09-12-2016.
 */


import com.geniusnine.android.marathijokes.R;

import java.util.ArrayList;
import java.util.Random;


public class Images {

    private Random randNo;
    private ArrayList<Integer> imageId;

    public Images() {
     imageId = new ArrayList<Integer>();
        imageId.add(R.drawable.fun);

        imageId.add(R.drawable.sasu);
       imageId.add(R.drawable.mkk);
       imageId.add(R.drawable.bor);
        imageId.add(R.drawable.dhadadi);
        imageId.add(R.drawable.prashn);
        imageId.add(R.drawable.alis);
        imageId.add(R.drawable.shiksha);
        imageId.add(R.drawable.pagar);
        imageId.add(R.drawable.seva);
        imageId.add(R.drawable.gadhav);
        imageId.add(R.drawable.babu);
        imageId.add(R.drawable.khichadi);
        imageId.add(R.drawable.ioo);
        imageId.add(R.drawable.avgun);
        imageId.add(R.drawable.gatsphot);
        imageId.add(R.drawable.bolkya);
        imageId.add(R.drawable.icu);
        imageId.add(R.drawable.tuu);

    }




    public int getImageId() {
        randNo = new Random();
        return imageId.get(randNo.nextInt(imageId.size()));
    }

    public ArrayList<Integer> getImageItem() {
        return imageId;
    }
}
