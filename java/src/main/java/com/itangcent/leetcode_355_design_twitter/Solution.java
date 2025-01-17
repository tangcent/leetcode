package com.itangcent.leetcode_355_design_twitter;


/*
 * @lc app=leetcode id=355 lang=java
 *
 * [355] Design Twitter
 */

import java.util.*;
import java.util.stream.Collectors;

// @lc code=start
class Twitter {

    /**
     * Tracks outgoing following relationships
     * (key: subject user, value: list of target users being followed)
     */
    private final Map<Integer, Set<Integer>> followingMap = new HashMap<>();

    /**
     * Manages incoming follower relationships
     * (key: target user, value: list of subject users who follow)
     */
    private final Map<Integer, Set<Integer>> followersMap = new HashMap<>();

    private final Map<Integer, List<Post>> postsMap = new HashMap<>();

    private final Map<Integer, List<Post>> feedsMap = new HashMap<>();

    private static class Post {
        private static int indexSeed = 0;

        int tweetId;
        int index;

        public Post(int tweetId) {
            this.tweetId = tweetId;
            this.index = indexSeed++;
        }
    }

    public Twitter() {

    }

    public void postTweet(int userId, int tweetId) {
        Post post = new Post(tweetId);
        List<Post> posts = postsMap.computeIfAbsent(userId, k -> new ArrayList<>());
        posts.add(0, post);
        if (posts.size() > 10) {
            posts.remove(10);
        }

        updateFeed(userId, post);
        Set<Integer> followers = followersMap.get(userId);
        if (followers == null || followers.isEmpty()) return;
        for (Integer follower : followers) {
            updateFeed(follower, post);
        }
    }

    private void updateFeed(int userId, Post post) {
        List<Post> feeds = feedsMap.get(userId);
        if (feeds == null) {
            return;
        }
        feeds.add(0, post);
        if (feeds.size() > 10) {
            feeds.remove(10);
        }
    }

    public List<Integer> getNewsFeed(int userId) {
        if (!feedsMap.containsKey(userId)) {
            buildFeed(userId);
        }
        return feedsMap.get(userId).stream().map(post -> post.tweetId).collect(Collectors.toList());
    }

    private void buildFeed(int userId) {
        List<Integer> userIds = new ArrayList<>();
        Set<Integer> followings = followingMap.get(userId);
        if (followings != null) {
            userIds.addAll(followings);
        }
        userIds.add(userId);

        feedsMap.put(userId, new ArrayList<>());
        for (Integer uId : userIds) {
            List<Post> posts = postsMap.get(uId);
            if (posts == null || posts.isEmpty()) {
                continue;
            }
            for (Post post : posts) {
                if (tryUpdateFeed(userId, post)) {
                    continue;
                }
                break;
            }
        }
    }

    public void follow(int followerId, int followeeId) {
        followersMap.computeIfAbsent(followeeId, k -> new HashSet<>())
                .add(followerId);
        followingMap.computeIfAbsent(followerId, k -> new HashSet<>())
                .add(followeeId);

        List<Post> posts = postsMap.get(followeeId);
        if (posts == null) return;
        for (Post post : posts) {
            if (tryUpdateFeed(followerId, post)) {
                continue;
            }
            break;
        }
    }


    private boolean tryUpdateFeed(int userId, Post post) {
        List<Post> feeds = feedsMap.get(userId);
        if (feeds == null) {
            return false;
        }
        if (feeds.size() == 10 && feeds.get(feeds.size() - 1).index > post.index) {
            return false;
        }
        boolean added = false;
        for (int i = 0; i < feeds.size(); i++) {
            if (post.index > feeds.get(i).index) {
                feeds.add(i, post);
                added = true;
                break;
            }
        }
        if (!added) {
            feeds.add(post);
        }
        if (feeds.size() > 10) {
            feeds.remove(10);
        }
        return true;
    }

    public void unfollow(int followerId, int followeeId) {
        followersMap.computeIfAbsent(followeeId, k -> new HashSet<>())
                .remove(followerId);
        followingMap.computeIfAbsent(followerId, k -> new HashSet<>())
                .remove(followeeId);

        this.feedsMap.remove(followerId);
    }
}

/**
 * Your Twitter object will be instantiated and called as such:
 * Twitter obj = new Twitter();
 * obj.postTweet(userId,tweetId);
 * List<Integer> param_2 = obj.getNewsFeed(userId);
 * obj.follow(followerId,followeeId);
 * obj.unfollow(followerId,followeeId);
 */
// @lc code=end

