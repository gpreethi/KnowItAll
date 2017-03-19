package com.example.android.knowitall;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Preethi on 12/3/16.
 */

public class NewsAdapter extends ArrayAdapter<News> {

    /**
     * Constructs a new {@link NewsAdapter}.
     *
     * @param context of the app
     * @param news    is the list of earthquakes, which is the data source of the adapter
     */
    public NewsAdapter(Context context, List<News> news) {
        super(context, 0, news);
    }

    /**
     * Returns a list item view that displays information about the book at the given position
     * in the list of books.
     */
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if there is an existing list item view (called convertView) that we can reuse,
        // otherwise, if convertView is null, then inflate a new list item layout.
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.news_list_item, parent, false);
        }

        // Find the news at the given position in the list of news
        News currentNews = getItem(position);

        // Find the TextView with view ID magnitude
        TextView titleView = (TextView) listItemView.findViewById(R.id.title);
        // Display the magnitude of the current earthquake in that TextView

        Log.v("Adapter title", currentNews.getMarticle());
        Log.v("Adapter section", currentNews.getMsection());

        titleView.setText(currentNews.getMarticle());


        // Find the TextView with view ID magnitude
        TextView authorView = (TextView) listItemView.findViewById(R.id.authors);
        // Display the magnitude of the current earthquake in that TextView
        authorView.setText(currentNews.getMsection());

        // Return the list item view that is now showing the appropriate data
        return listItemView;
    }
}
