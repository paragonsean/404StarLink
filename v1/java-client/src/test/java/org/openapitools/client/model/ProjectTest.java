/*
 * CircleCI REST API
 * The CircleCI API is a RESTful, fully-featured API that allows you to do almost anything in CircleCI. You can access all information and trigger all actions. The only thing we don’t provide access to is billing functions, which must be done from the CircleCI web UI. 
 *
 * The version of the OpenAPI document: v1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.net.URI;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.client.model.Aws;
import org.openapitools.client.model.ProjectFeatureFlags;
import org.openapitools.client.model.Scope;
import org.openapitools.jackson.nullable.JsonNullable;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

/**
 * Model tests for Project
 */
public class ProjectTest {
    private final Project model = new Project();

    /**
     * Model tests for Project
     */
    @Test
    public void testProject() {
        // TODO: test Project
    }

    /**
     * Test the property 'aws'
     */
    @Test
    public void awsTest() {
        // TODO: test aws
    }

    /**
     * Test the property 'branches'
     */
    @Test
    public void branchesTest() {
        // TODO: test branches
    }

    /**
     * Test the property 'campfireNotifyPrefs'
     */
    @Test
    public void campfireNotifyPrefsTest() {
        // TODO: test campfireNotifyPrefs
    }

    /**
     * Test the property 'campfireRoom'
     */
    @Test
    public void campfireRoomTest() {
        // TODO: test campfireRoom
    }

    /**
     * Test the property 'campfireSubdomain'
     */
    @Test
    public void campfireSubdomainTest() {
        // TODO: test campfireSubdomain
    }

    /**
     * Test the property 'campfireToken'
     */
    @Test
    public void campfireTokenTest() {
        // TODO: test campfireToken
    }

    /**
     * Test the property 'compile'
     */
    @Test
    public void compileTest() {
        // TODO: test compile
    }

    /**
     * Test the property 'defaultBranch'
     */
    @Test
    public void defaultBranchTest() {
        // TODO: test defaultBranch
    }

    /**
     * Test the property 'dependencies'
     */
    @Test
    public void dependenciesTest() {
        // TODO: test dependencies
    }

    /**
     * Test the property 'extra'
     */
    @Test
    public void extraTest() {
        // TODO: test extra
    }

    /**
     * Test the property 'featureFlags'
     */
    @Test
    public void featureFlagsTest() {
        // TODO: test featureFlags
    }

    /**
     * Test the property 'flowdockApiToken'
     */
    @Test
    public void flowdockApiTokenTest() {
        // TODO: test flowdockApiToken
    }

    /**
     * Test the property 'followed'
     */
    @Test
    public void followedTest() {
        // TODO: test followed
    }

    /**
     * Test the property 'hasUsableKey'
     */
    @Test
    public void hasUsableKeyTest() {
        // TODO: test hasUsableKey
    }

    /**
     * Test the property 'herokuDeployUser'
     */
    @Test
    public void herokuDeployUserTest() {
        // TODO: test herokuDeployUser
    }

    /**
     * Test the property 'hipchatApiToken'
     */
    @Test
    public void hipchatApiTokenTest() {
        // TODO: test hipchatApiToken
    }

    /**
     * Test the property 'hipchatNotify'
     */
    @Test
    public void hipchatNotifyTest() {
        // TODO: test hipchatNotify
    }

    /**
     * Test the property 'hipchatNotifyPrefs'
     */
    @Test
    public void hipchatNotifyPrefsTest() {
        // TODO: test hipchatNotifyPrefs
    }

    /**
     * Test the property 'hipchatRoom'
     */
    @Test
    public void hipchatRoomTest() {
        // TODO: test hipchatRoom
    }

    /**
     * Test the property 'ircChannel'
     */
    @Test
    public void ircChannelTest() {
        // TODO: test ircChannel
    }

    /**
     * Test the property 'ircKeyword'
     */
    @Test
    public void ircKeywordTest() {
        // TODO: test ircKeyword
    }

    /**
     * Test the property 'ircNotifyPrefs'
     */
    @Test
    public void ircNotifyPrefsTest() {
        // TODO: test ircNotifyPrefs
    }

    /**
     * Test the property 'ircPassword'
     */
    @Test
    public void ircPasswordTest() {
        // TODO: test ircPassword
    }

    /**
     * Test the property 'ircServer'
     */
    @Test
    public void ircServerTest() {
        // TODO: test ircServer
    }

    /**
     * Test the property 'ircUsername'
     */
    @Test
    public void ircUsernameTest() {
        // TODO: test ircUsername
    }

    /**
     * Test the property 'language'
     */
    @Test
    public void languageTest() {
        // TODO: test language
    }

    /**
     * Test the property 'oss'
     */
    @Test
    public void ossTest() {
        // TODO: test oss
    }

    /**
     * Test the property 'parallel'
     */
    @Test
    public void parallelTest() {
        // TODO: test parallel
    }

    /**
     * Test the property 'reponame'
     */
    @Test
    public void reponameTest() {
        // TODO: test reponame
    }

    /**
     * Test the property 'scopes'
     */
    @Test
    public void scopesTest() {
        // TODO: test scopes
    }

    /**
     * Test the property 'setup'
     */
    @Test
    public void setupTest() {
        // TODO: test setup
    }

    /**
     * Test the property 'slackApiToken'
     */
    @Test
    public void slackApiTokenTest() {
        // TODO: test slackApiToken
    }

    /**
     * Test the property 'slackChannel'
     */
    @Test
    public void slackChannelTest() {
        // TODO: test slackChannel
    }

    /**
     * Test the property 'slackChannelOverride'
     */
    @Test
    public void slackChannelOverrideTest() {
        // TODO: test slackChannelOverride
    }

    /**
     * Test the property 'slackNotifyPrefs'
     */
    @Test
    public void slackNotifyPrefsTest() {
        // TODO: test slackNotifyPrefs
    }

    /**
     * Test the property 'slackSubdomain'
     */
    @Test
    public void slackSubdomainTest() {
        // TODO: test slackSubdomain
    }

    /**
     * Test the property 'slackWebhookUrl'
     */
    @Test
    public void slackWebhookUrlTest() {
        // TODO: test slackWebhookUrl
    }

    /**
     * Test the property 'sshKeys'
     */
    @Test
    public void sshKeysTest() {
        // TODO: test sshKeys
    }

    /**
     * Test the property 'test'
     */
    @Test
    public void testTest() {
        // TODO: test test
    }

    /**
     * Test the property 'username'
     */
    @Test
    public void usernameTest() {
        // TODO: test username
    }

    /**
     * Test the property 'vcsType'
     */
    @Test
    public void vcsTypeTest() {
        // TODO: test vcsType
    }

    /**
     * Test the property 'vcsUrl'
     */
    @Test
    public void vcsUrlTest() {
        // TODO: test vcsUrl
    }

}
