package com.mytwitter.client;

import twitter4j.Query;
import twitter4j.QueryResult;
import twitter4j.Status;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;

import java.util.List;

/**
 * Created by ksaleh on 7/27/16.
 */
public class TestClass {

    public static void main(String[] args) {
        System.out.println("nishan");

        Twitter twitter = TwitterFactory.getSingleton();
        try {
            twitter.updateStatus("Test Tweet Tweet");
            Query query = new Query("#GoT");
            QueryResult queryResult = twitter.search(query);
            List<Status> list = queryResult.getTweets();
            list.forEach(e -> System.out.println(e.getCreatedAt() + e.getUser().getName() + e.getText()));
        } catch (TwitterException e) {
            e.printStackTrace();
        }

        System.out.println("yipppiiiii");
    }
}
