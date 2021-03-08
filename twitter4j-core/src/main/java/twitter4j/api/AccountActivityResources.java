package twitter4j.api;

import twitter4j.TwitterException;

/**
 * @author songrunxin
 * @description
 */
public interface AccountActivityResources {
    /**
     * about webhook's crud， now deal with https://github.com/twitterdev/account-activity-dashboard
     */


    /**
     * Subscribes the provided application to all events for the provided environment for all message types. 
     * After activation, all events for the requesting user will be sent to the application’s webhook via POST request.
     * <br>This method calls https://api.twitter.com/1.1/account_activity/all/:env_name/subscriptions.json
     * 
     * @param envName
     * @throws TwitterException when Twitter service or network is unavailable
     * @see <a href="https://developer.twitter.com/en/docs/twitter-api/premium/account-activity-api/api-reference/aaa-premium#post-account-activity-all-env-name-subscriptions">POST account_activity/all/:env_name/subscriptions — Twitter Developers</a>
     * @since Twitter4J 4.0.7.plus
     */
    void addNewUserSubscription(String envName)
            throws TwitterException;

    /**
     * Removes the webhook from the provided application's all activities configuration. 
     * The webhook ID can be accessed by making a call to GET /1.1/account_activity/all/webhooks.
     *
     * @param envName config in twitter developer
     * @param webHookId
     * @throws TwitterException when Twitter service or network is unavailable
     * @see <a href="https://developer.twitter.com/en/docs/twitter-api/premium/account-activity-api/api-reference/aaa-premium#post-account-activity-all-env-name-subscriptions">DELETE account_activity/all/:env_name/webhooks/:webhook_id — Twitter Developers</a>
     * @since Twitter4J 4.0.7.plus
     */
    void removeUserSubscription(String envName, String webHookId)
            throws TwitterException;


    /**
     * Deactivates subscription for the specified webhook and user id. After deactivation, all events for the 
     * requesting user will no longer be sent to the webhook URL. Note, that this endpoint requires application-only 
     * OAuth, so requests should be made using a bearer token instead of user context.
     * <br>This method calls https://api.twitter.com/1.1/account_activity/all/:env_name/subscriptions/:user_id.json
     *
     * @param envName config in twitter developer
     * @param userId
     * @throws TwitterException when Twitter service or network is unavailable
     * @see <a href="https://developer.twitter.com/en/docs/twitter-api/premium/account-activity-api/api-reference/aaa-premium#post-account-activity-all-env-name-subscriptions">DELETE /account_activity/all/:env_name/subscriptions/:user_id.json — Twitter Developers</a>
     * @since Twitter4J 4.0.7.plus
     */
    void removeUserSubscriptionByApp(String envName, String userId)
            throws TwitterException;

}
