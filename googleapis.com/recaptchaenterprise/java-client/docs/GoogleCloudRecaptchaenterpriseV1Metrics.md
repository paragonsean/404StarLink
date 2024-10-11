

# GoogleCloudRecaptchaenterpriseV1Metrics

Metrics for a single Key.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**challengeMetrics** | [**List&lt;GoogleCloudRecaptchaenterpriseV1ChallengeMetrics&gt;**](GoogleCloudRecaptchaenterpriseV1ChallengeMetrics.md) | Metrics will be continuous and in order by dates, and in the granularity of day. Only challenge-based keys (CHECKBOX, INVISIBLE), will have challenge-based data. |  [optional] |
|**name** | **String** | Output only. The name of the metrics, in the format \&quot;projects/{project}/keys/{key}/metrics\&quot;. |  [optional] [readonly] |
|**scoreMetrics** | [**List&lt;GoogleCloudRecaptchaenterpriseV1ScoreMetrics&gt;**](GoogleCloudRecaptchaenterpriseV1ScoreMetrics.md) | Metrics will be continuous and in order by dates, and in the granularity of day. All Key types should have score-based data. |  [optional] |
|**startTime** | **String** | Inclusive start time aligned to a day (UTC). |  [optional] |



