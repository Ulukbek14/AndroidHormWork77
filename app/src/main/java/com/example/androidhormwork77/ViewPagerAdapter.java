package com.example.androidhormwork77;

import android.content.Context;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

import java.util.List;

public class ViewPagerAdapter extends PagerAdapter {

    Context context;
    List<OnBoardModel> mlistBoardModel;

    public ViewPagerAdapter(Context context, List<OnBoardModel> listBoardModel) {
        this.context = context;
        this.mlistBoardModel = listBoardModel;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {

        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View layoutBoardModel = inflater.inflate(R.layout.activity_on_board, null);

        ImageView image = layoutBoardModel.findViewById(R.id.on_image_img);
        TextView title = layoutBoardModel.findViewById(R.id.txt_title);
        TextView description = layoutBoardModel.findViewById(R.id.txt_description);

        title.setText(mlistBoardModel.get(position).getTitle());
        description.setText(mlistBoardModel.get(position).getDescription());
        image.setImageResource(mlistBoardModel.get(position).getImage());

        container.addView(layoutBoardModel);

        return layoutBoardModel;


    }

    @Override
    public int getCount() {
        return mlistBoardModel.size();
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object o) {
        return view == o;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        super.destroyItem(container, position, object);

        container.removeView((View)object);
    }
}
