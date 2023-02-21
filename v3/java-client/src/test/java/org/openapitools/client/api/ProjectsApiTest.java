/*
 * Cloud Monitoring API
 * Manages your Cloud Monitoring data and configurations.
 *
 * The version of the OpenAPI document: v3
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.api;

import org.openapitools.client.ApiException;
import org.openapitools.client.model.AlertPolicy;
import org.openapitools.client.model.CreateCollectdTimeSeriesRequest;
import org.openapitools.client.model.CreateCollectdTimeSeriesResponse;
import org.openapitools.client.model.CreateTimeSeriesRequest;
import org.openapitools.client.model.GetNotificationChannelVerificationCodeRequest;
import org.openapitools.client.model.GetNotificationChannelVerificationCodeResponse;
import org.openapitools.client.model.Group;
import org.openapitools.client.model.ListAlertPoliciesResponse;
import org.openapitools.client.model.ListGroupMembersResponse;
import org.openapitools.client.model.ListGroupsResponse;
import org.openapitools.client.model.ListMetricDescriptorsResponse;
import org.openapitools.client.model.ListMonitoredResourceDescriptorsResponse;
import org.openapitools.client.model.ListNotificationChannelDescriptorsResponse;
import org.openapitools.client.model.ListNotificationChannelsResponse;
import org.openapitools.client.model.ListSnoozesResponse;
import org.openapitools.client.model.ListTimeSeriesResponse;
import org.openapitools.client.model.ListUptimeCheckConfigsResponse;
import org.openapitools.client.model.MetricDescriptor;
import org.openapitools.client.model.NotificationChannel;
import org.openapitools.client.model.QueryTimeSeriesRequest;
import org.openapitools.client.model.QueryTimeSeriesResponse;
import org.openapitools.client.model.Snooze;
import org.openapitools.client.model.UptimeCheckConfig;
import org.openapitools.client.model.VerifyNotificationChannelRequest;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ProjectsApi
 */
@Disabled
public class ProjectsApiTest {

    private final ProjectsApi api = new ProjectsApi();

    /**
     * Creates a new alerting policy.Design your application to single-thread API calls that modify the state of alerting policies in a single project. This includes calls to CreateAlertPolicy, DeleteAlertPolicy and UpdateAlertPolicy.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void monitoringProjectsAlertPoliciesCreateTest() throws ApiException {
        String name = null;
        String $xgafv = null;
        String accessToken = null;
        String alt = null;
        String paramCallback = null;
        String fields = null;
        String key = null;
        String oauthToken = null;
        Boolean prettyPrint = null;
        String quotaUser = null;
        String uploadProtocol = null;
        String uploadType = null;
        AlertPolicy alertPolicy = null;
        AlertPolicy response = api.monitoringProjectsAlertPoliciesCreate(name, $xgafv, accessToken, alt, paramCallback, fields, key, oauthToken, prettyPrint, quotaUser, uploadProtocol, uploadType, alertPolicy);
        // TODO: test validations
    }

    /**
     * Lists the existing alerting policies for the workspace.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void monitoringProjectsAlertPoliciesListTest() throws ApiException {
        String name = null;
        String $xgafv = null;
        String accessToken = null;
        String alt = null;
        String paramCallback = null;
        String fields = null;
        String key = null;
        String oauthToken = null;
        Boolean prettyPrint = null;
        String quotaUser = null;
        String uploadProtocol = null;
        String uploadType = null;
        String filter = null;
        String orderBy = null;
        Integer pageSize = null;
        String pageToken = null;
        ListAlertPoliciesResponse response = api.monitoringProjectsAlertPoliciesList(name, $xgafv, accessToken, alt, paramCallback, fields, key, oauthToken, prettyPrint, quotaUser, uploadProtocol, uploadType, filter, orderBy, pageSize, pageToken);
        // TODO: test validations
    }

    /**
     * Cloud Monitoring Agent only: Creates a new time series.This method is only for use by the Cloud Monitoring Agent. Use projects.timeSeries.create instead.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void monitoringProjectsCollectdTimeSeriesCreateTest() throws ApiException {
        String name = null;
        String $xgafv = null;
        String accessToken = null;
        String alt = null;
        String paramCallback = null;
        String fields = null;
        String key = null;
        String oauthToken = null;
        Boolean prettyPrint = null;
        String quotaUser = null;
        String uploadProtocol = null;
        String uploadType = null;
        CreateCollectdTimeSeriesRequest createCollectdTimeSeriesRequest = null;
        CreateCollectdTimeSeriesResponse response = api.monitoringProjectsCollectdTimeSeriesCreate(name, $xgafv, accessToken, alt, paramCallback, fields, key, oauthToken, prettyPrint, quotaUser, uploadProtocol, uploadType, createCollectdTimeSeriesRequest);
        // TODO: test validations
    }

    /**
     * Creates a new group.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void monitoringProjectsGroupsCreateTest() throws ApiException {
        String name = null;
        String $xgafv = null;
        String accessToken = null;
        String alt = null;
        String paramCallback = null;
        String fields = null;
        String key = null;
        String oauthToken = null;
        Boolean prettyPrint = null;
        String quotaUser = null;
        String uploadProtocol = null;
        String uploadType = null;
        Boolean validateOnly = null;
        Group group = null;
        Group response = api.monitoringProjectsGroupsCreate(name, $xgafv, accessToken, alt, paramCallback, fields, key, oauthToken, prettyPrint, quotaUser, uploadProtocol, uploadType, validateOnly, group);
        // TODO: test validations
    }

    /**
     * Lists the existing groups.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void monitoringProjectsGroupsListTest() throws ApiException {
        String name = null;
        String $xgafv = null;
        String accessToken = null;
        String alt = null;
        String paramCallback = null;
        String fields = null;
        String key = null;
        String oauthToken = null;
        Boolean prettyPrint = null;
        String quotaUser = null;
        String uploadProtocol = null;
        String uploadType = null;
        String ancestorsOfGroup = null;
        String childrenOfGroup = null;
        String descendantsOfGroup = null;
        Integer pageSize = null;
        String pageToken = null;
        ListGroupsResponse response = api.monitoringProjectsGroupsList(name, $xgafv, accessToken, alt, paramCallback, fields, key, oauthToken, prettyPrint, quotaUser, uploadProtocol, uploadType, ancestorsOfGroup, childrenOfGroup, descendantsOfGroup, pageSize, pageToken);
        // TODO: test validations
    }

    /**
     * Lists the monitored resources that are members of a group.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void monitoringProjectsGroupsMembersListTest() throws ApiException {
        String name = null;
        String $xgafv = null;
        String accessToken = null;
        String alt = null;
        String paramCallback = null;
        String fields = null;
        String key = null;
        String oauthToken = null;
        Boolean prettyPrint = null;
        String quotaUser = null;
        String uploadProtocol = null;
        String uploadType = null;
        String filter = null;
        String intervalEndTime = null;
        String intervalStartTime = null;
        Integer pageSize = null;
        String pageToken = null;
        ListGroupMembersResponse response = api.monitoringProjectsGroupsMembersList(name, $xgafv, accessToken, alt, paramCallback, fields, key, oauthToken, prettyPrint, quotaUser, uploadProtocol, uploadType, filter, intervalEndTime, intervalStartTime, pageSize, pageToken);
        // TODO: test validations
    }

    /**
     * Updates an existing group. You can change any group attributes except name.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void monitoringProjectsGroupsUpdateTest() throws ApiException {
        String name = null;
        String $xgafv = null;
        String accessToken = null;
        String alt = null;
        String paramCallback = null;
        String fields = null;
        String key = null;
        String oauthToken = null;
        Boolean prettyPrint = null;
        String quotaUser = null;
        String uploadProtocol = null;
        String uploadType = null;
        Boolean validateOnly = null;
        Group group = null;
        Group response = api.monitoringProjectsGroupsUpdate(name, $xgafv, accessToken, alt, paramCallback, fields, key, oauthToken, prettyPrint, quotaUser, uploadProtocol, uploadType, validateOnly, group);
        // TODO: test validations
    }

    /**
     * Creates a new metric descriptor. The creation is executed asynchronously. User-created metric descriptors define custom metrics (https://cloud.google.com/monitoring/custom-metrics). The metric descriptor is updated if it already exists, except that metric labels are never removed.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void monitoringProjectsMetricDescriptorsCreateTest() throws ApiException {
        String name = null;
        String $xgafv = null;
        String accessToken = null;
        String alt = null;
        String paramCallback = null;
        String fields = null;
        String key = null;
        String oauthToken = null;
        Boolean prettyPrint = null;
        String quotaUser = null;
        String uploadProtocol = null;
        String uploadType = null;
        MetricDescriptor metricDescriptor = null;
        MetricDescriptor response = api.monitoringProjectsMetricDescriptorsCreate(name, $xgafv, accessToken, alt, paramCallback, fields, key, oauthToken, prettyPrint, quotaUser, uploadProtocol, uploadType, metricDescriptor);
        // TODO: test validations
    }

    /**
     * Lists metric descriptors that match a filter.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void monitoringProjectsMetricDescriptorsListTest() throws ApiException {
        String name = null;
        String $xgafv = null;
        String accessToken = null;
        String alt = null;
        String paramCallback = null;
        String fields = null;
        String key = null;
        String oauthToken = null;
        Boolean prettyPrint = null;
        String quotaUser = null;
        String uploadProtocol = null;
        String uploadType = null;
        String filter = null;
        Integer pageSize = null;
        String pageToken = null;
        ListMetricDescriptorsResponse response = api.monitoringProjectsMetricDescriptorsList(name, $xgafv, accessToken, alt, paramCallback, fields, key, oauthToken, prettyPrint, quotaUser, uploadProtocol, uploadType, filter, pageSize, pageToken);
        // TODO: test validations
    }

    /**
     * Lists monitored resource descriptors that match a filter.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void monitoringProjectsMonitoredResourceDescriptorsListTest() throws ApiException {
        String name = null;
        String $xgafv = null;
        String accessToken = null;
        String alt = null;
        String paramCallback = null;
        String fields = null;
        String key = null;
        String oauthToken = null;
        Boolean prettyPrint = null;
        String quotaUser = null;
        String uploadProtocol = null;
        String uploadType = null;
        String filter = null;
        Integer pageSize = null;
        String pageToken = null;
        ListMonitoredResourceDescriptorsResponse response = api.monitoringProjectsMonitoredResourceDescriptorsList(name, $xgafv, accessToken, alt, paramCallback, fields, key, oauthToken, prettyPrint, quotaUser, uploadProtocol, uploadType, filter, pageSize, pageToken);
        // TODO: test validations
    }

    /**
     * Lists the descriptors for supported channel types. The use of descriptors makes it possible for new channel types to be dynamically added.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void monitoringProjectsNotificationChannelDescriptorsListTest() throws ApiException {
        String name = null;
        String $xgafv = null;
        String accessToken = null;
        String alt = null;
        String paramCallback = null;
        String fields = null;
        String key = null;
        String oauthToken = null;
        Boolean prettyPrint = null;
        String quotaUser = null;
        String uploadProtocol = null;
        String uploadType = null;
        Integer pageSize = null;
        String pageToken = null;
        ListNotificationChannelDescriptorsResponse response = api.monitoringProjectsNotificationChannelDescriptorsList(name, $xgafv, accessToken, alt, paramCallback, fields, key, oauthToken, prettyPrint, quotaUser, uploadProtocol, uploadType, pageSize, pageToken);
        // TODO: test validations
    }

    /**
     * Creates a new notification channel, representing a single notification endpoint such as an email address, SMS number, or PagerDuty service.Design your application to single-thread API calls that modify the state of notification channels in a single project. This includes calls to CreateNotificationChannel, DeleteNotificationChannel and UpdateNotificationChannel.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void monitoringProjectsNotificationChannelsCreateTest() throws ApiException {
        String name = null;
        String $xgafv = null;
        String accessToken = null;
        String alt = null;
        String paramCallback = null;
        String fields = null;
        String key = null;
        String oauthToken = null;
        Boolean prettyPrint = null;
        String quotaUser = null;
        String uploadProtocol = null;
        String uploadType = null;
        NotificationChannel notificationChannel = null;
        NotificationChannel response = api.monitoringProjectsNotificationChannelsCreate(name, $xgafv, accessToken, alt, paramCallback, fields, key, oauthToken, prettyPrint, quotaUser, uploadProtocol, uploadType, notificationChannel);
        // TODO: test validations
    }

    /**
     * Requests a verification code for an already verified channel that can then be used in a call to VerifyNotificationChannel() on a different channel with an equivalent identity in the same or in a different project. This makes it possible to copy a channel between projects without requiring manual reverification of the channel. If the channel is not in the verified state, this method will fail (in other words, this may only be used if the SendNotificationChannelVerificationCode and VerifyNotificationChannel paths have already been used to put the given channel into the verified state).There is no guarantee that the verification codes returned by this method will be of a similar structure or form as the ones that are delivered to the channel via SendNotificationChannelVerificationCode; while VerifyNotificationChannel() will recognize both the codes delivered via SendNotificationChannelVerificationCode() and returned from GetNotificationChannelVerificationCode(), it is typically the case that the verification codes delivered via SendNotificationChannelVerificationCode() will be shorter and also have a shorter expiration (e.g. codes such as \&quot;G-123456\&quot;) whereas GetVerificationCode() will typically return a much longer, websafe base 64 encoded string that has a longer expiration time.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void monitoringProjectsNotificationChannelsGetVerificationCodeTest() throws ApiException {
        String name = null;
        String $xgafv = null;
        String accessToken = null;
        String alt = null;
        String paramCallback = null;
        String fields = null;
        String key = null;
        String oauthToken = null;
        Boolean prettyPrint = null;
        String quotaUser = null;
        String uploadProtocol = null;
        String uploadType = null;
        GetNotificationChannelVerificationCodeRequest getNotificationChannelVerificationCodeRequest = null;
        GetNotificationChannelVerificationCodeResponse response = api.monitoringProjectsNotificationChannelsGetVerificationCode(name, $xgafv, accessToken, alt, paramCallback, fields, key, oauthToken, prettyPrint, quotaUser, uploadProtocol, uploadType, getNotificationChannelVerificationCodeRequest);
        // TODO: test validations
    }

    /**
     * Lists the notification channels that have been created for the project. To list the types of notification channels that are supported, use the ListNotificationChannelDescriptors method.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void monitoringProjectsNotificationChannelsListTest() throws ApiException {
        String name = null;
        String $xgafv = null;
        String accessToken = null;
        String alt = null;
        String paramCallback = null;
        String fields = null;
        String key = null;
        String oauthToken = null;
        Boolean prettyPrint = null;
        String quotaUser = null;
        String uploadProtocol = null;
        String uploadType = null;
        String filter = null;
        String orderBy = null;
        Integer pageSize = null;
        String pageToken = null;
        ListNotificationChannelsResponse response = api.monitoringProjectsNotificationChannelsList(name, $xgafv, accessToken, alt, paramCallback, fields, key, oauthToken, prettyPrint, quotaUser, uploadProtocol, uploadType, filter, orderBy, pageSize, pageToken);
        // TODO: test validations
    }

    /**
     * Causes a verification code to be delivered to the channel. The code can then be supplied in VerifyNotificationChannel to verify the channel.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void monitoringProjectsNotificationChannelsSendVerificationCodeTest() throws ApiException {
        String name = null;
        String $xgafv = null;
        String accessToken = null;
        String alt = null;
        String paramCallback = null;
        String fields = null;
        String key = null;
        String oauthToken = null;
        Boolean prettyPrint = null;
        String quotaUser = null;
        String uploadProtocol = null;
        String uploadType = null;
        Object body = null;
        Object response = api.monitoringProjectsNotificationChannelsSendVerificationCode(name, $xgafv, accessToken, alt, paramCallback, fields, key, oauthToken, prettyPrint, quotaUser, uploadProtocol, uploadType, body);
        // TODO: test validations
    }

    /**
     * Verifies a NotificationChannel by proving receipt of the code delivered to the channel as a result of calling SendNotificationChannelVerificationCode.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void monitoringProjectsNotificationChannelsVerifyTest() throws ApiException {
        String name = null;
        String $xgafv = null;
        String accessToken = null;
        String alt = null;
        String paramCallback = null;
        String fields = null;
        String key = null;
        String oauthToken = null;
        Boolean prettyPrint = null;
        String quotaUser = null;
        String uploadProtocol = null;
        String uploadType = null;
        VerifyNotificationChannelRequest verifyNotificationChannelRequest = null;
        NotificationChannel response = api.monitoringProjectsNotificationChannelsVerify(name, $xgafv, accessToken, alt, paramCallback, fields, key, oauthToken, prettyPrint, quotaUser, uploadProtocol, uploadType, verifyNotificationChannelRequest);
        // TODO: test validations
    }

    /**
     * Creates a Snooze that will prevent alerts, which match the provided criteria, from being opened. The Snooze applies for a specific time interval.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void monitoringProjectsSnoozesCreateTest() throws ApiException {
        String parent = null;
        String $xgafv = null;
        String accessToken = null;
        String alt = null;
        String paramCallback = null;
        String fields = null;
        String key = null;
        String oauthToken = null;
        Boolean prettyPrint = null;
        String quotaUser = null;
        String uploadProtocol = null;
        String uploadType = null;
        Snooze snooze = null;
        Snooze response = api.monitoringProjectsSnoozesCreate(parent, $xgafv, accessToken, alt, paramCallback, fields, key, oauthToken, prettyPrint, quotaUser, uploadProtocol, uploadType, snooze);
        // TODO: test validations
    }

    /**
     * Lists the Snoozes associated with a project. Can optionally pass in filter, which specifies predicates to match Snoozes.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void monitoringProjectsSnoozesListTest() throws ApiException {
        String parent = null;
        String $xgafv = null;
        String accessToken = null;
        String alt = null;
        String paramCallback = null;
        String fields = null;
        String key = null;
        String oauthToken = null;
        Boolean prettyPrint = null;
        String quotaUser = null;
        String uploadProtocol = null;
        String uploadType = null;
        String filter = null;
        Integer pageSize = null;
        String pageToken = null;
        ListSnoozesResponse response = api.monitoringProjectsSnoozesList(parent, $xgafv, accessToken, alt, paramCallback, fields, key, oauthToken, prettyPrint, quotaUser, uploadProtocol, uploadType, filter, pageSize, pageToken);
        // TODO: test validations
    }

    /**
     * Creates or adds data to one or more time series. The response is empty if all time series in the request were written. If any time series could not be written, a corresponding failure message is included in the error response.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void monitoringProjectsTimeSeriesCreateTest() throws ApiException {
        String name = null;
        String $xgafv = null;
        String accessToken = null;
        String alt = null;
        String paramCallback = null;
        String fields = null;
        String key = null;
        String oauthToken = null;
        Boolean prettyPrint = null;
        String quotaUser = null;
        String uploadProtocol = null;
        String uploadType = null;
        CreateTimeSeriesRequest createTimeSeriesRequest = null;
        Object response = api.monitoringProjectsTimeSeriesCreate(name, $xgafv, accessToken, alt, paramCallback, fields, key, oauthToken, prettyPrint, quotaUser, uploadProtocol, uploadType, createTimeSeriesRequest);
        // TODO: test validations
    }

    /**
     * Creates or adds data to one or more service time series. A service time series is a time series for a metric from a Google Cloud service. The response is empty if all time series in the request were written. If any time series could not be written, a corresponding failure message is included in the error response. This endpoint rejects writes to user-defined metrics. This method is only for use by Google Cloud services. Use projects.timeSeries.create instead.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void monitoringProjectsTimeSeriesCreateServiceTest() throws ApiException {
        String name = null;
        String $xgafv = null;
        String accessToken = null;
        String alt = null;
        String paramCallback = null;
        String fields = null;
        String key = null;
        String oauthToken = null;
        Boolean prettyPrint = null;
        String quotaUser = null;
        String uploadProtocol = null;
        String uploadType = null;
        CreateTimeSeriesRequest createTimeSeriesRequest = null;
        Object response = api.monitoringProjectsTimeSeriesCreateService(name, $xgafv, accessToken, alt, paramCallback, fields, key, oauthToken, prettyPrint, quotaUser, uploadProtocol, uploadType, createTimeSeriesRequest);
        // TODO: test validations
    }

    /**
     * Lists time series that match a filter.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void monitoringProjectsTimeSeriesListTest() throws ApiException {
        String name = null;
        String $xgafv = null;
        String accessToken = null;
        String alt = null;
        String paramCallback = null;
        String fields = null;
        String key = null;
        String oauthToken = null;
        Boolean prettyPrint = null;
        String quotaUser = null;
        String uploadProtocol = null;
        String uploadType = null;
        String aggregationAlignmentPeriod = null;
        String aggregationCrossSeriesReducer = null;
        List<String> aggregationGroupByFields = null;
        String aggregationPerSeriesAligner = null;
        String filter = null;
        String intervalEndTime = null;
        String intervalStartTime = null;
        String orderBy = null;
        Integer pageSize = null;
        String pageToken = null;
        String secondaryAggregationAlignmentPeriod = null;
        String secondaryAggregationCrossSeriesReducer = null;
        List<String> secondaryAggregationGroupByFields = null;
        String secondaryAggregationPerSeriesAligner = null;
        String view = null;
        ListTimeSeriesResponse response = api.monitoringProjectsTimeSeriesList(name, $xgafv, accessToken, alt, paramCallback, fields, key, oauthToken, prettyPrint, quotaUser, uploadProtocol, uploadType, aggregationAlignmentPeriod, aggregationCrossSeriesReducer, aggregationGroupByFields, aggregationPerSeriesAligner, filter, intervalEndTime, intervalStartTime, orderBy, pageSize, pageToken, secondaryAggregationAlignmentPeriod, secondaryAggregationCrossSeriesReducer, secondaryAggregationGroupByFields, secondaryAggregationPerSeriesAligner, view);
        // TODO: test validations
    }

    /**
     * Queries time series using Monitoring Query Language.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void monitoringProjectsTimeSeriesQueryTest() throws ApiException {
        String name = null;
        String $xgafv = null;
        String accessToken = null;
        String alt = null;
        String paramCallback = null;
        String fields = null;
        String key = null;
        String oauthToken = null;
        Boolean prettyPrint = null;
        String quotaUser = null;
        String uploadProtocol = null;
        String uploadType = null;
        QueryTimeSeriesRequest queryTimeSeriesRequest = null;
        QueryTimeSeriesResponse response = api.monitoringProjectsTimeSeriesQuery(name, $xgafv, accessToken, alt, paramCallback, fields, key, oauthToken, prettyPrint, quotaUser, uploadProtocol, uploadType, queryTimeSeriesRequest);
        // TODO: test validations
    }

    /**
     * Creates a new Uptime check configuration.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void monitoringProjectsUptimeCheckConfigsCreateTest() throws ApiException {
        String parent = null;
        String $xgafv = null;
        String accessToken = null;
        String alt = null;
        String paramCallback = null;
        String fields = null;
        String key = null;
        String oauthToken = null;
        Boolean prettyPrint = null;
        String quotaUser = null;
        String uploadProtocol = null;
        String uploadType = null;
        UptimeCheckConfig uptimeCheckConfig = null;
        UptimeCheckConfig response = api.monitoringProjectsUptimeCheckConfigsCreate(parent, $xgafv, accessToken, alt, paramCallback, fields, key, oauthToken, prettyPrint, quotaUser, uploadProtocol, uploadType, uptimeCheckConfig);
        // TODO: test validations
    }

    /**
     * Lists the existing valid Uptime check configurations for the project (leaving out any invalid configurations).
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void monitoringProjectsUptimeCheckConfigsListTest() throws ApiException {
        String parent = null;
        String $xgafv = null;
        String accessToken = null;
        String alt = null;
        String paramCallback = null;
        String fields = null;
        String key = null;
        String oauthToken = null;
        Boolean prettyPrint = null;
        String quotaUser = null;
        String uploadProtocol = null;
        String uploadType = null;
        String filter = null;
        Integer pageSize = null;
        String pageToken = null;
        ListUptimeCheckConfigsResponse response = api.monitoringProjectsUptimeCheckConfigsList(parent, $xgafv, accessToken, alt, paramCallback, fields, key, oauthToken, prettyPrint, quotaUser, uploadProtocol, uploadType, filter, pageSize, pageToken);
        // TODO: test validations
    }

}
