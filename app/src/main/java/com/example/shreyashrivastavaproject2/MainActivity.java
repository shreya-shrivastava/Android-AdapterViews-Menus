package com.example.shreyashrivastavaproject2;

import android.app.Activity;

import android.net.Uri;
import android.util.Log;
import android.view.MenuInflater;
import android.view.MenuItem;
import  android.view.ContextMenu;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;

import android.widget.ListView;

import androidx.annotation.NonNull;

public class MainActivity extends Activity {

    ListView list;
    String[] name = {
            "Tamasha", "Spotlight", "The Invisible Guest", "Newton", "Gifted", "A Dog's Purpose",
            "October", "Article 15", "Gully Boy", "Little Women", "The Sky is Pink", "Emma."
    };
    String[] year = {
            "2015", "2015", "2016", "2017", "2017", "2017", "2018", "2019", "2019",
            "2019", "2019", "2020", "2020"
    };
    int[] image = {
            R.drawable.tamasha, R.drawable.spotlight, R.drawable.theinvisibleguest,
            R.drawable.newton, R.drawable.gifted, R.drawable.adogspurpose, R.drawable.october,
            R.drawable.article15, R.drawable.gullyboy, R.drawable.littlewomen, R.drawable.theskyispink, R.drawable.emma
    };
    String[] website = {
            "https://www.imdb.com/title/tt3148502/", "https://www.imdb.com/title/tt1895587/",
            "https://www.imdb.com/title/tt4857264/", "https://www.imdb.com/title/tt6484982/",
            "https://www.imdb.com/title/tt4481414/", "https://www.imdb.com/title/tt1753383/",
            "https://www.imdb.com/title/tt7700730/", "https://www.imdb.com/title/tt10324144/",
            "https://www.imdb.com/title/tt2395469/", "https://www.imdb.com/title/tt3281548/",
            "https://www.imdb.com/title/tt8902990/", "https://www.imdb.com/title/tt9214832/"
    };

    String[] date =
            {"November-27-2015", "November-20-2015", "January-06-2017", "September-22-2017", "April-12-2017", "January-27-2017",
                    "April-13-2018", "June-28-2019", "February-14-2019", "December-25-2019", "October-11-2019","February-14-2020"
            };
    String[] duration =
            {"139 minutes", "129 minutes", "106 minutes", "106 minutes", "101 minutes", "100 minutes", "153 minutes",
              "115 minutes", "130 minutes", "135 minutes", "143 minutes", "125 minutes"
            };
    String[] director =
            {"Imtiaz Ali", "Tom McCarthy", "Oriol Paulo", "Amit Masurkar", "Marc Webb", "Lasse Hallström",
             "Shoojit Sircar", "Anubhav Sinha", "Zoya Akhtar", "Greta Gerwig", "Shonali Bose", "Autumn de Wilde"
            };
    String[] star =
            {"Deepika Padukone, Ranbir Kapoor", "Mark Ruffalo, Michael Keaton, Rachel McAdams", "Mario Casas, Ana Wagener, Jose Coronado",
             "Rajkummar Rao, Pankaj Tripathi, Anjali Patil ", "Chris Evans, Mckenna Grace, Lindsay Duncan", "Josh Gad, Dennis Quaid, Peggy Lipton",
                    " Varun Dhawan, Banita Sandhu, Gitanjali Rao ", "Ayushmann Khurrana, Nassar, Manoj Pahwa ",
                    "Ranveer Singh, Alia Bhatt, Siddhant Chaturvedi " ,"Saoirse Ronan, Emma Watson, Florence Pugh ",
                    "Priyanka Chopra, Farhan Akhtar, Zaira Wasim", "Anya Taylor-Joy, Johnny Flynn, Bill Nighy "

         };
    String[] rating1 = {"7.3 / 10", "8.1 / 10" ,"7.7 / 10", "7.6 / 10","7.2 / 10",   "7.5 / 10", "8.2 / 10", "8.2 / 10", "8.0 / 10","7.5 / 10","6.9 / 10" };
    String[] rating2 = {"67%", "97%", "67%", "94%", "73%", "35%", "90%", "89%", "95%", "95%", "72%", "85%"};
    String[] trailer = {"https://www.youtube.com/watch?v=o-e5eWVCzx8", "https://www.youtube.com/watch?v=56jw6tasomc",
            "https://www.youtube.com/watch?v=epCg2RbyF80","https://www.youtube.com/watch?v=yU6zMPFd4UU","https://www.youtube.com/watch?v=tI01wBXGHUs",
            "https://www.youtube.com/watch?v=1jLOOCADTGs", "https://www.youtube.com/watch?v=7vracgLyJwI","https://www.youtube.com/watch?v=HKOJY0cU63E",
            "https://www.youtube.com/watch?v=JfbxcD6biOk","https://www.youtube.com/watch?v=AST2-4db4ic",
            "https://www.youtube.com/watch?v=prwUFBsDRLk", "https://www.youtube.com/watch?v=qsOwj0PR5Sk"

};
    String[] wikipedia = { "https://en.wikipedia.org/wiki/Imtiaz_Ali_(director)", "https://en.wikipedia.org/wiki/Tom_McCarthy_(director)",
                        "https://en.wikipedia.org/wiki/Oriol_Paulo", "https://en.wikipedia.org/wiki/Amit_V._Masurkar",
            "https://en.wikipedia.org/wiki/Marc_Webb", "https://en.wikipedia.org/wiki/Lasse_Hallstr%C3%B6m",
            "https://en.wikipedia.org/wiki/Shoojit_Sircar", "https://en.wikipedia.org/wiki/Anubhav_Sinha",
            "https://en.wikipedia.org/wiki/Zoya_Akhtar", "https://en.wikipedia.org/wiki/Greta_Gerwig",
            "https://en.wikipedia.org/wiki/Shonali_Bose","https://en.wikipedia.org/wiki/Autumn_de_Wilde"

    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.setTitle("My Movies");

        list =  findViewById(R.id.list);
        MyAdapter myAdapter = new MyAdapter(MainActivity.this, name, year, image);
        list.setAdapter(myAdapter);
        registerForContextMenu(list);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                                             @Override
                                             public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                                                 Intent intent = new Intent(MainActivity.this, ShowImage.class);
                                                 intent.putExtra("image",image[position]);
                                                 intent.putExtra("website",website[position]);
                                                 startActivity(intent);
                                             }
                                         }

        );
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View view, ContextMenu.ContextMenuInfo menuInfo) {

        super.onCreateContextMenu(menu, view, menuInfo);
        getMenuInflater().inflate(R.menu.menu,menu);
    }

    @Override
    public boolean onContextItemSelected( @NonNull MenuItem item) {
        AdapterView.AdapterContextMenuInfo info = (AdapterView.AdapterContextMenuInfo) item.getMenuInfo();
        switch (item.getItemId()) {
            case R.id.details: {
                Intent i = new Intent(MainActivity.this, ThirdActivity.class);
                i.putExtra("date", date[info.position]);
                i.putExtra("duration", duration[info.position]);
                i.putExtra("director", director[info.position]);
                i.putExtra("star", star[info.position]);
                i.putExtra("rating1", rating1[info.position]);
                i.putExtra("rating2", rating2[info.position]);
                startActivity(i);
            }
            return true;
            case R.id.trailer:
                {
                String url = trailer[info.position];
                Intent i = new Intent(Intent.ACTION_VIEW) ;
               i.setData(Uri.parse(url));
                startActivity(i);
            }
            return true;
            case R.id.wikipedia: {
                String url = wikipedia[info.position];
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(url));
                startActivity(intent);
            }
            return true;

            case R.id.imdb: {
                String url = website[info.position];
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(url));
                startActivity(intent);
            }
            return true;
            default:
                return super.onContextItemSelected(item);


        }
    }
}

