/*
 * Mastodon API Specification (https://github.com/mastodon/mastodon)
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 1.0
 * Contact: sardo@hey.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.api;

import org.openapitools.client.ApiException;
import org.openapitools.client.model.Account;
import org.openapitools.client.model.ApiV1AccountsIdFollowPostRequest;
import org.openapitools.client.model.ApiV1AccountsIdMutePostRequest;
import org.openapitools.client.model.ApiV1AccountsIdNotePostRequest;
import org.openapitools.client.model.ApiV1AccountsPostRequest;
import org.openapitools.client.model.ApiV1AccountsUpdateCredentialsPatchRequest;
import org.openapitools.client.model.Error;
import org.openapitools.client.model.FeaturedTag;
import org.openapitools.client.model.IdentityProof;
import org.openapitools.client.model.ModelList;
import org.openapitools.client.model.Relationship;
import org.openapitools.client.model.Status;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for AccountsApi
 */
@Disabled
public class AccountsApiTest {

    private final AccountsApi api = new AccountsApi();

    /**
     * Block the given account. Clients should filter statuses from this account if received (e.g. due to a boost in the Home timeline).
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void apiV1AccountsIdBlockPostTest() throws ApiException {
        String id = null;
        Relationship response = api.apiV1AccountsIdBlockPost(id);
        // TODO: test validations
    }

    /**
     * Tags featured by this account.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void apiV1AccountsIdFeaturedTagsGetTest() throws ApiException {
        String id = null;
        List<FeaturedTag> response = api.apiV1AccountsIdFeaturedTagsGet(id);
        // TODO: test validations
    }

    /**
     * Follow the given account. Can also be used to update whether to show reblogs or enable notifications.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void apiV1AccountsIdFollowPostTest() throws ApiException {
        String id = null;
        ApiV1AccountsIdFollowPostRequest apiV1AccountsIdFollowPostRequest = null;
        Relationship response = api.apiV1AccountsIdFollowPost(id, apiV1AccountsIdFollowPostRequest);
        // TODO: test validations
    }

    /**
     * Accounts which follow the given account, if network is not hidden by the account owner.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void apiV1AccountsIdFollowersGetTest() throws ApiException {
        String id = null;
        String maxId = null;
        String sinceId = null;
        Integer limit = null;
        List<Account> response = api.apiV1AccountsIdFollowersGet(id, maxId, sinceId, limit);
        // TODO: test validations
    }

    /**
     * Accounts which the given account is following, if network is not hidden by the account owner.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void apiV1AccountsIdFollowingGetTest() throws ApiException {
        String id = null;
        String maxId = null;
        String sinceId = null;
        Integer limit = null;
        List<Account> response = api.apiV1AccountsIdFollowingGet(id, maxId, sinceId, limit);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void apiV1AccountsIdGetTest() throws ApiException {
        String id = null;
        Account response = api.apiV1AccountsIdGet(id);
        // TODO: test validations
    }

    /**
     * Array of IdentityProof
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void apiV1AccountsIdIdentityProofsGetTest() throws ApiException {
        String id = null;
        List<IdentityProof> response = api.apiV1AccountsIdIdentityProofsGet(id);
        // TODO: test validations
    }

    /**
     * User lists that you have added this account to.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void apiV1AccountsIdListsGetTest() throws ApiException {
        String id = null;
        List<ModelList> response = api.apiV1AccountsIdListsGet(id);
        // TODO: test validations
    }

    /**
     * Mute the given account. Clients should filter statuses and notifications from this account, if received (e.g. due to a boost in the Home timeline).
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void apiV1AccountsIdMutePostTest() throws ApiException {
        String id = null;
        ApiV1AccountsIdMutePostRequest apiV1AccountsIdMutePostRequest = null;
        Relationship response = api.apiV1AccountsIdMutePost(id, apiV1AccountsIdMutePostRequest);
        // TODO: test validations
    }

    /**
     * Sets a private note on a user.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void apiV1AccountsIdNotePostTest() throws ApiException {
        String id = null;
        ApiV1AccountsIdNotePostRequest apiV1AccountsIdNotePostRequest = null;
        Relationship response = api.apiV1AccountsIdNotePost(id, apiV1AccountsIdNotePostRequest);
        // TODO: test validations
    }

    /**
     * Add the given account to the user&#39;s featured profiles. (Featured profiles are currently shown on the user&#39;s own public profile.)
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void apiV1AccountsIdPinPostTest() throws ApiException {
        String id = null;
        Relationship response = api.apiV1AccountsIdPinPost(id);
        // TODO: test validations
    }

    /**
     * Statuses posted to the given account.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void apiV1AccountsIdStatusesGetTest() throws ApiException {
        String id = null;
        List<Status> response = api.apiV1AccountsIdStatusesGet(id);
        // TODO: test validations
    }

    /**
     * Block the given account. Clients should filter statuses from this account if received (e.g. due to a boost in the Home timeline).
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void apiV1AccountsIdUnblockPostTest() throws ApiException {
        String id = null;
        Relationship response = api.apiV1AccountsIdUnblockPost(id);
        // TODO: test validations
    }

    /**
     * Unfollow the given account.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void apiV1AccountsIdUnfollowPostTest() throws ApiException {
        String id = null;
        Relationship response = api.apiV1AccountsIdUnfollowPost(id);
        // TODO: test validations
    }

    /**
     * Unmute the given account.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void apiV1AccountsIdUnmutePostTest() throws ApiException {
        String id = null;
        Relationship response = api.apiV1AccountsIdUnmutePost(id);
        // TODO: test validations
    }

    /**
     * Remove the given account from the user&#39;s featured profiles.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void apiV1AccountsIdUnpinPostTest() throws ApiException {
        String id = null;
        Relationship response = api.apiV1AccountsIdUnpinPost(id);
        // TODO: test validations
    }

    /**
     * Creates a user and account records. Returns an account access token for the app that initiated the request. The app should save this token for later, and should wait for the user to confirm their account by clicking a link in their email inbox.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void apiV1AccountsPost_0Test() throws ApiException {
        ApiV1AccountsPostRequest apiV1AccountsPostRequest = null;
        api.apiV1AccountsPost_0(apiV1AccountsPostRequest);
        // TODO: test validations
    }

    /**
     * Sets a private note on a user.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void apiV1AccountsRelationshipsGetTest() throws ApiException {
        List<String> id = null;
        List<Relationship> response = api.apiV1AccountsRelationshipsGet(id);
        // TODO: test validations
    }

    /**
     * Search for matching accounts by username or display name.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void apiV1AccountsSearchGetTest() throws ApiException {
        String q = null;
        Integer limit = null;
        String resolve = null;
        Boolean following = null;
        List<Account> response = api.apiV1AccountsSearchGet(q, limit, resolve, following);
        // TODO: test validations
    }

    /**
     * Update the user&#39;s display and preferences.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void apiV1AccountsUpdateCredentialsPatchTest() throws ApiException {
        ApiV1AccountsUpdateCredentialsPatchRequest apiV1AccountsUpdateCredentialsPatchRequest = null;
        Account response = api.apiV1AccountsUpdateCredentialsPatch(apiV1AccountsUpdateCredentialsPatchRequest);
        // TODO: test validations
    }

    /**
     * Test to make sure that the user token works.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void apiV1AccountsVerifyCredentialsGetTest() throws ApiException {
        Account response = api.apiV1AccountsVerifyCredentialsGet();
        // TODO: test validations
    }

}
