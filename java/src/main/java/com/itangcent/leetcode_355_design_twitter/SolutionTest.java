package com.itangcent.leetcode_355_design_twitter;

import java.util.Arrays;
import java.util.List;

/**
 * Test class for the solution to LeetCode problem #355: design-twitter
 */
public class SolutionTest {
    public static void main(String[] args) {
        Twitter twitter = new Twitter();

        System.out.println("Running tests for LeetCode problem #355: design-twitter");

        // Test case 1: Single user posts and gets news feed
        twitter.postTweet(1, 5);
        twitter.postTweet(1, 3);
        List<Integer> feed1 = twitter.getNewsFeed(1);
        System.out.println("Test case for single user posts: " +
                (feed1.equals(Arrays.asList(3, 5)) ? "PASSED" : "FAILED (Expected: [3, 5], Actual: " + feed1));

        // Test case 2: Follow and get feed
        twitter.postTweet(2, 6);
        twitter.follow(1, 2);
        List<Integer> feed2 = twitter.getNewsFeed(1);
        System.out.println("Test case for follow and get feed: " +
                (feed2.equals(Arrays.asList(6, 3, 5)) ? "PASSED" : "FAILED (Expected: [6, 3, 5], Actual: " + feed2));

        // Test case 3: Unfollow and get feed
        twitter.unfollow(1, 2);
        List<Integer> feed3 = twitter.getNewsFeed(1);
        System.out.println("Test case for unfollow and get feed: " +
                (feed3.equals(Arrays.asList(3, 5)) ? "PASSED" : "FAILED (Expected: [3, 5], Actual: " + feed3));

        // Test case 4: Empty feed for new user
        List<Integer> feed4 = twitter.getNewsFeed(3);
        System.out.println("Test case for empty feed: " + (feed4.isEmpty() ? "PASSED" : "FAILED (Expected: [], Actual: " + feed4));

        // Test case 5: Multiple follows
        twitter.postTweet(4, 1);
        twitter.postTweet(5, 2);
        twitter.follow(1, 4);
        twitter.follow(1, 5);
        List<Integer> feed5 = twitter.getNewsFeed(1);
        System.out.println("Test case for multiple follows: " +
                (feed5.equals(Arrays.asList(2, 1, 3, 5)) ? "PASSED" : "FAILED (Expected: [2, 1, 3, 5], Actual: " + feed5));

        // Test case 6: LeetCode sequence test
        Twitter twitter2 = new Twitter();
        twitter2.postTweet(1, 5);
        List<Integer> feed6a = twitter2.getNewsFeed(1);
        System.out.println("Test case 6a - initial post: " +
                (feed6a.equals(Arrays.asList(5)) ? "PASSED" : "FAILED (Expected: [5], Actual: " + feed6a));

        twitter2.follow(1, 2);
        twitter2.postTweet(2, 6);
        List<Integer> feed6b = twitter2.getNewsFeed(1);
        System.out.println("Test case 6b - after follow: " +
                (feed6b.equals(Arrays.asList(6, 5)) ? "PASSED" : "FAILED (Expected: [6, 5], Actual: " + feed6b));

        twitter2.unfollow(1, 2);
        List<Integer> feed6c = twitter2.getNewsFeed(1);
        System.out.println("Test case 6c - after unfollow: " +
                (feed6c.equals(Arrays.asList(5)) ? "PASSED" : "FAILED (Expected: [5], Actual: " + feed6c));
    }
}
