

# GoogleCloudRecaptchaenterpriseV1TestingOptions

Options for user acceptance testing.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**testingChallenge** | [**TestingChallengeEnum**](#TestingChallengeEnum) | For challenge-based keys only (CHECKBOX, INVISIBLE), all challenge requests for this site will return nocaptcha if NOCAPTCHA, or an unsolvable challenge if CHALLENGE. |  [optional] |
|**testingScore** | **Float** | All assessments for this Key will return this score. Must be between 0 (likely not legitimate) and 1 (likely legitimate) inclusive. |  [optional] |



## Enum: TestingChallengeEnum

| Name | Value |
|---- | -----|
| TESTING_CHALLENGE_UNSPECIFIED | &quot;TESTING_CHALLENGE_UNSPECIFIED&quot; |
| NOCAPTCHA | &quot;NOCAPTCHA&quot; |
| UNSOLVABLE_CHALLENGE | &quot;UNSOLVABLE_CHALLENGE&quot; |



