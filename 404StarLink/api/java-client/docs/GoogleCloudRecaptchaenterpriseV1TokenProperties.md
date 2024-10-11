

# GoogleCloudRecaptchaenterpriseV1TokenProperties

Properties of the provided event token.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**action** | **String** | Action name provided at token generation. |  [optional] |
|**androidPackageName** | **String** | The name of the Android package with which the token was generated (Android keys only). |  [optional] |
|**createTime** | **String** | The timestamp corresponding to the generation of the token. |  [optional] |
|**hostname** | **String** | The hostname of the page on which the token was generated (Web keys only). |  [optional] |
|**invalidReason** | [**InvalidReasonEnum**](#InvalidReasonEnum) | Reason associated with the response when valid &#x3D; false. |  [optional] |
|**iosBundleId** | **String** | The ID of the iOS bundle with which the token was generated (iOS keys only). |  [optional] |
|**valid** | **Boolean** | Whether the provided user response token is valid. When valid &#x3D; false, the reason could be specified in invalid_reason or it could also be due to a user failing to solve a challenge or a sitekey mismatch (i.e the sitekey used to generate the token was different than the one specified in the assessment). |  [optional] |



## Enum: InvalidReasonEnum

| Name | Value |
|---- | -----|
| INVALID_REASON_UNSPECIFIED | &quot;INVALID_REASON_UNSPECIFIED&quot; |
| UNKNOWN_INVALID_REASON | &quot;UNKNOWN_INVALID_REASON&quot; |
| MALFORMED | &quot;MALFORMED&quot; |
| EXPIRED | &quot;EXPIRED&quot; |
| DUPE | &quot;DUPE&quot; |
| MISSING | &quot;MISSING&quot; |
| BROWSER_ERROR | &quot;BROWSER_ERROR&quot; |



