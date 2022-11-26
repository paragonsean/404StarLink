

# GoogleCloudRecaptchaenterpriseV1AccountVerificationInfo

Information about account verification, used for identity verification.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**endpoints** | [**List&lt;GoogleCloudRecaptchaenterpriseV1EndpointVerificationInfo&gt;**](GoogleCloudRecaptchaenterpriseV1EndpointVerificationInfo.md) | Endpoints that can be used for identity verification. |  [optional] |
|**languageCode** | **String** | Language code preference for the verification message, set as a IETF BCP 47 language code. |  [optional] |
|**latestVerificationResult** | [**LatestVerificationResultEnum**](#LatestVerificationResultEnum) | Output only. Result of the latest account verification challenge. |  [optional] [readonly] |
|**username** | **String** | Username of the account that is being verified. Deprecated. Customers should now provide the hashed account ID field in Event. |  [optional] |



## Enum: LatestVerificationResultEnum

| Name | Value |
|---- | -----|
| RESULT_UNSPECIFIED | &quot;RESULT_UNSPECIFIED&quot; |
| SUCCESS_USER_VERIFIED | &quot;SUCCESS_USER_VERIFIED&quot; |
| ERROR_USER_NOT_VERIFIED | &quot;ERROR_USER_NOT_VERIFIED&quot; |
| ERROR_SITE_ONBOARDING_INCOMPLETE | &quot;ERROR_SITE_ONBOARDING_INCOMPLETE&quot; |
| ERROR_RECIPIENT_NOT_ALLOWED | &quot;ERROR_RECIPIENT_NOT_ALLOWED&quot; |
| ERROR_RECIPIENT_ABUSE_LIMIT_EXHAUSTED | &quot;ERROR_RECIPIENT_ABUSE_LIMIT_EXHAUSTED&quot; |
| ERROR_CRITICAL_INTERNAL | &quot;ERROR_CRITICAL_INTERNAL&quot; |
| ERROR_CUSTOMER_QUOTA_EXHAUSTED | &quot;ERROR_CUSTOMER_QUOTA_EXHAUSTED&quot; |
| ERROR_VERIFICATION_BYPASSED | &quot;ERROR_VERIFICATION_BYPASSED&quot; |
| ERROR_VERDICT_MISMATCH | &quot;ERROR_VERDICT_MISMATCH&quot; |



