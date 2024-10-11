

# GoogleCloudRecaptchaenterpriseV1ChallengeMetrics

Metrics related to challenges.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**failedCount** | **String** | Count of submitted challenge solutions that were incorrect or otherwise deemed suspicious such that a subsequent challenge was triggered. |  [optional] |
|**nocaptchaCount** | **String** | Count of nocaptchas (successful verification without a challenge) issued. |  [optional] |
|**pageloadCount** | **String** | Count of reCAPTCHA checkboxes or badges rendered. This is mostly equivalent to a count of pageloads for pages that include reCAPTCHA. |  [optional] |
|**passedCount** | **String** | Count of nocaptchas (successful verification without a challenge) plus submitted challenge solutions that were correct and resulted in verification. |  [optional] |



