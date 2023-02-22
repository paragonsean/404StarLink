

# Experiment

JSON template for Analytics experiment resource.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**accountId** | **String** | Account ID to which this experiment belongs. This field is read-only. |  [optional] |
|**created** | **OffsetDateTime** | Time the experiment was created. This field is read-only. |  [optional] |
|**description** | **String** | Notes about this experiment. |  [optional] |
|**editableInGaUi** | **Boolean** | If true, the end user will be able to edit the experiment via the Google Analytics user interface. |  [optional] |
|**endTime** | **OffsetDateTime** | The ending time of the experiment (the time the status changed from RUNNING to ENDED). This field is present only if the experiment has ended. This field is read-only. |  [optional] |
|**equalWeighting** | **Boolean** | Boolean specifying whether to distribute traffic evenly across all variations. If the value is False, content experiments follows the default behavior of adjusting traffic dynamically based on variation performance. Optional -- defaults to False. This field may not be changed for an experiment whose status is ENDED. |  [optional] |
|**id** | **String** | Experiment ID. Required for patch and update. Disallowed for create. |  [optional] |
|**internalWebPropertyId** | **String** | Internal ID for the web property to which this experiment belongs. This field is read-only. |  [optional] |
|**kind** | **String** | Resource type for an Analytics experiment. This field is read-only. |  [optional] |
|**minimumExperimentLengthInDays** | **Integer** | An integer number in [3, 90]. Specifies the minimum length of the experiment. Can be changed for a running experiment. This field may not be changed for an experiments whose status is ENDED. |  [optional] |
|**name** | **String** | Experiment name. This field may not be changed for an experiment whose status is ENDED. This field is required when creating an experiment. |  [optional] |
|**objectiveMetric** | **String** | The metric that the experiment is optimizing. Valid values: \&quot;ga:goal(n)Completions\&quot;, \&quot;ga:adsenseAdsClicks\&quot;, \&quot;ga:adsenseAdsViewed\&quot;, \&quot;ga:adsenseRevenue\&quot;, \&quot;ga:bounces\&quot;, \&quot;ga:pageviews\&quot;, \&quot;ga:sessionDuration\&quot;, \&quot;ga:transactions\&quot;, \&quot;ga:transactionRevenue\&quot;. This field is required if status is \&quot;RUNNING\&quot; and servingFramework is one of \&quot;REDIRECT\&quot; or \&quot;API\&quot;. |  [optional] |
|**optimizationType** | **String** | Whether the objectiveMetric should be minimized or maximized. Possible values: \&quot;MAXIMUM\&quot;, \&quot;MINIMUM\&quot;. Optional--defaults to \&quot;MAXIMUM\&quot;. Cannot be specified without objectiveMetric. Cannot be modified when status is \&quot;RUNNING\&quot; or \&quot;ENDED\&quot;. |  [optional] |
|**parentLink** | [**ExperimentParentLink**](ExperimentParentLink.md) |  |  [optional] |
|**profileId** | **String** | View (Profile) ID to which this experiment belongs. This field is read-only. |  [optional] |
|**reasonExperimentEnded** | **String** | Why the experiment ended. Possible values: \&quot;STOPPED_BY_USER\&quot;, \&quot;WINNER_FOUND\&quot;, \&quot;EXPERIMENT_EXPIRED\&quot;, \&quot;ENDED_WITH_NO_WINNER\&quot;, \&quot;GOAL_OBJECTIVE_CHANGED\&quot;. \&quot;ENDED_WITH_NO_WINNER\&quot; means that the experiment didn&#39;t expire but no winner was projected to be found. If the experiment status is changed via the API to ENDED this field is set to STOPPED_BY_USER. This field is read-only. |  [optional] |
|**rewriteVariationUrlsAsOriginal** | **Boolean** | Boolean specifying whether variations URLS are rewritten to match those of the original. This field may not be changed for an experiments whose status is ENDED. |  [optional] |
|**selfLink** | **String** | Link for this experiment. This field is read-only. |  [optional] |
|**servingFramework** | **String** | The framework used to serve the experiment variations and evaluate the results. One of:   - REDIRECT: Google Analytics redirects traffic to different variation pages, reports the chosen variation and evaluates the results. - API: Google Analytics chooses and reports the variation to serve and evaluates the results; the caller is responsible for serving the selected variation. - EXTERNAL: The variations will be served externally and the chosen variation reported to Google Analytics. The caller is responsible for serving the selected variation and evaluating the results. |  [optional] |
|**snippet** | **String** | The snippet of code to include on the control page(s). This field is read-only. |  [optional] |
|**startTime** | **OffsetDateTime** | The starting time of the experiment (the time the status changed from READY_TO_RUN to RUNNING). This field is present only if the experiment has started. This field is read-only. |  [optional] |
|**status** | **String** | Experiment status. Possible values: \&quot;DRAFT\&quot;, \&quot;READY_TO_RUN\&quot;, \&quot;RUNNING\&quot;, \&quot;ENDED\&quot;. Experiments can be created in the \&quot;DRAFT\&quot;, \&quot;READY_TO_RUN\&quot; or \&quot;RUNNING\&quot; state. This field is required when creating an experiment. |  [optional] |
|**trafficCoverage** | **Double** | A floating-point number in (0, 1]. Specifies the fraction of the traffic that participates in the experiment. Can be changed for a running experiment. This field may not be changed for an experiments whose status is ENDED. |  [optional] |
|**updated** | **OffsetDateTime** | Time the experiment was last modified. This field is read-only. |  [optional] |
|**variations** | [**List&lt;ExperimentVariationsInner&gt;**](ExperimentVariationsInner.md) | Array of variations. The first variation in the array is the original. The number of variations may not change once an experiment is in the RUNNING state. At least two variations are required before status can be set to RUNNING. |  [optional] |
|**webPropertyId** | **String** | Web property ID to which this experiment belongs. The web property ID is of the form UA-XXXXX-YY. This field is read-only. |  [optional] |
|**winnerConfidenceLevel** | **Double** | A floating-point number in (0, 1). Specifies the necessary confidence level to choose a winner. This field may not be changed for an experiments whose status is ENDED. |  [optional] |
|**winnerFound** | **Boolean** | Boolean specifying whether a winner has been found for this experiment. This field is read-only. |  [optional] |



