package com.demo.activity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import com.demo.R;

/**
 * Created by DEVASHREE on 3/19/2017.
 */
public class PlayVideoActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video);

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.main,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){

            case R.id.action_image:
                Intent v1 = new Intent(getApplicationContext(),GlideImageActivity.class);
                startActivity(v1);
                overridePendingTransition(R.anim.push_left_enter, R.anim.push_left_exit);

                break;
            case R.id.action_video:
                Intent v2 = new Intent(getApplicationContext(),PlayVideoActivity.class);
                startActivity(v2);
                overridePendingTransition(R.anim.push_left_enter, R.anim.push_left_exit);

                break;
            case R.id.action_github:
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://github.com/devashreerane/-Image-Video-Demo-"));
                startActivity(browserIntent);
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}