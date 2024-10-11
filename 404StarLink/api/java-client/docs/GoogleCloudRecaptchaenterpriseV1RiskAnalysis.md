

# GoogleCloudRecaptchaenterpriseV1RiskAnalysis

Risk analysis result for an event.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**extendedVerdictReasons** | **List&lt;String&gt;** | Extended verdict reasons to be used for experimentation only. The set of possible reasons is subject to change. |  [optional] |
|**reasons** | [**List&lt;ReasonsEnum&gt;**](#List&lt;ReasonsEnum&gt;) | Reasons contributing to the risk analysis verdict. |  [optional] |
|**score** | **Float** | Legitimate event score from 0.0 to 1.0. (1.0 means very likely legitimate traffic while 0.0 means very likely non-legitimate traffic). |  [optional] |



## Enum: List&lt;ReasonsEnum&gt;

| Name | Value |
|---- | -----|
| CLASSIFICATION_REASON_UNSPECIFIED | &quot;CLASSIFICATION_REASON_UNSPECIFIED&quot; |
| AUTOMATION | &quot;AUTOMATION&quot; |
| UNEXPECTED_ENVIRONMENT | &quot;UNEXPECTED_ENVIRONMENT&quot; |
| TOO_MUCH_TRAFFIC | &quot;TOO_MUCH_TRAFFIC&quot; |
| UNEXPECTED_USAGE_PATTERNS | &quot;UNEXPECTED_USAGE_PATTERNS&quot; |
| LOW_CONFIDENCE_SCORE | &quot;LOW_CONFIDENCE_SCORE&quot; |
| SUSPECTED_CARDING | &quot;SUSPECTED_CARDING&quot; |
| SUSPECTED_CHARGEBACK | &quot;SUSPECTED_CHARGEBACK&quot; |



