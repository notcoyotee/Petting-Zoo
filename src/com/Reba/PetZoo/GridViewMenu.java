package com.Reba.PetZoo;

import android.app.Activity;
import android.content.Context;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.Toast;
public class GridViewMenu extends Activity {
   @Override
   public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        final MediaPlayer mp_bullfrog=MediaPlayer.create(this,R.raw.bullfrog);
        final MediaPlayer mp_cat=MediaPlayer.create(this,R.raw.cat02);
        final MediaPlayer mp_chicken=MediaPlayer.create(this,R.raw.chickens);
        final MediaPlayer mp_chimp=MediaPlayer.create(this,R.raw.chimp);
        final MediaPlayer mp_cow=MediaPlayer.create(this,R.raw.cow);
        final MediaPlayer mp_dog=MediaPlayer.create(this,R.raw.dog);
        final MediaPlayer mp_donkey=MediaPlayer.create(this,R.raw.donkeyb);
        final MediaPlayer mp_duck=MediaPlayer.create(this,R.raw.duck);
        final MediaPlayer mp_elephant=MediaPlayer.create(this,R.raw.elephant);
        final MediaPlayer mp_goat=MediaPlayer.create(this,R.raw.goat);
        final MediaPlayer mp_horse=MediaPlayer.create(this,R.raw.horse);
        final MediaPlayer mp_lion=MediaPlayer.create(this,R.raw.lion);
        final MediaPlayer mp_owl1=MediaPlayer.create(this,R.raw.owl3);
        final MediaPlayer mp_pig=MediaPlayer.create(this,R.raw.pig);
        final MediaPlayer mp_rooster=MediaPlayer.create(this,R.raw.rooster);
        final MediaPlayer mp_sheep=MediaPlayer.create(this,R.raw.sheepbaa);
        
        GridView g = (GridView) findViewById(R.id.myGrid);
        g.setAdapter(new ImageAdapter(this));
        g.setOnItemClickListener(new OnItemClickListener() {
           public void onItemClick(AdapterView<?> parent, View v, int position, long id) {
              position=position+1;
              if(position==1){
            	  mp_bullfrog.start();
                  Toast.makeText(GridViewMenu.this, "Bullfrog", Toast.LENGTH_SHORT).show();
              }
              else if(position==2){
            	  mp_cat.start();
                  Toast.makeText(GridViewMenu.this, "Cat", Toast.LENGTH_SHORT).show();
              }
              else if(position==3){
            	  mp_chicken.start();
                  Toast.makeText(GridViewMenu.this, "Chicken", Toast.LENGTH_SHORT).show();
              }
              else if(position==4){
            	  mp_chimp.start();
                  Toast.makeText(GridViewMenu.this, "Chimpanzee", Toast.LENGTH_SHORT).show();
              }
              else if(position==5){
            	  mp_cow.start();
                  Toast.makeText(GridViewMenu.this, "Cow", Toast.LENGTH_SHORT).show();
              }
              else if(position==6){
            	  mp_dog.start();
                  Toast.makeText(GridViewMenu.this, "Dog", Toast.LENGTH_SHORT).show();
              }
              else if(position==7){
            	  mp_donkey.start();
                  Toast.makeText(GridViewMenu.this, "Donkey", Toast.LENGTH_SHORT).show();
              }
              else if(position==8){
            	  mp_duck.start();
                  Toast.makeText(GridViewMenu.this, "Duck", Toast.LENGTH_SHORT).show();
              }
              else if(position==9){
            	  mp_elephant.start();
                  Toast.makeText(GridViewMenu.this, "Elephant", Toast.LENGTH_SHORT).show();
              }
              else if(position==10){
            	  mp_goat.start();
                  Toast.makeText(GridViewMenu.this, "Goat", Toast.LENGTH_SHORT).show();
              }
              else if(position==11){
            	  mp_horse.start();
                  Toast.makeText(GridViewMenu.this, "Horse", Toast.LENGTH_SHORT).show();
              }
              else if(position==12){
            	  mp_lion.start();
                  Toast.makeText(GridViewMenu.this, "Lion", Toast.LENGTH_SHORT).show();
              }
              else if(position==13){
            	  mp_owl1.start();
                  Toast.makeText(GridViewMenu.this, "Owl", Toast.LENGTH_SHORT).show();
              }
              else if(position==14){
            	  mp_pig.start();
                  Toast.makeText(GridViewMenu.this, "Pig", Toast.LENGTH_SHORT).show();
              }
              else if(position==15){
            	  mp_rooster.start();
                  Toast.makeText(GridViewMenu.this, "Rooster", Toast.LENGTH_SHORT).show();
              }
              else if(position==16){
            	  mp_sheep.start();
                  Toast.makeText(GridViewMenu.this, "Sheep", Toast.LENGTH_SHORT).show();
              }              
              }
        });
   }
   public class ImageAdapter extends BaseAdapter {
        public ImageAdapter(Context c) {
                mContext = c;
        }
        public int getCount() {
                return mThumbIds.length;
        }
        public Object getItem(int position) {
                return position;
        }
        public long getItemId(int position) {
                return position;
        }
        public View getView(int position, View convertView, ViewGroup parent) {
                ImageView imageView;
                if (convertView == null) {
                   imageView = new ImageView(mContext);
                   imageView.setLayoutParams(new GridView.LayoutParams(110, 110));
                   imageView.setAdjustViewBounds(false);
                   imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
                  // imageView.setScaleType(ImageView.ScaleType.CENTER);
                   //imageView.setPadding(1, 1, 1, 1);
                   
                } else {
                   imageView = (ImageView) convertView;
                }
                imageView.setImageResource(mThumbIds[position]);
                return imageView;
        }
        private Context mContext;
        private Integer[] mThumbIds = {
                R.drawable.bullfrog, R.drawable.cat,
                R.drawable.chicken, R.drawable.chimp, R.drawable.cow,
                R.drawable.dog, R.drawable.donkey,
                R.drawable.duck, R.drawable.elephant,R.drawable.goat,
                R.drawable.horse, R.drawable.lion, R.drawable.owl1,
                R.drawable.pig, R.drawable.rooster,
                R.drawable.sheep, 
        };
    }
}