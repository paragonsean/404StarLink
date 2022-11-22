

# GoogleCloudRecaptchaenterpriseV1WebKeySettings

Settings specific to keys that can be used by websites.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**allowAllDomains** | **Boolean** | If set to true, it means allowed_domains will not be enforced. |  [optional] |
|**allowAmpTraffic** | **Boolean** | If set to true, the key can be used on AMP (Accelerated Mobile Pages) websites. This is supported only for the SCORE integration type. |  [optional] |
|**allowedDomains** | **List&lt;String&gt;** | Domains or subdomains of websites allowed to use the key. All subdomains of an allowed domain are automatically allowed. A valid domain requires a host and must not include any path, port, query or fragment. Examples: &#39;example.com&#39; or &#39;subdomain.example.com&#39; |  [optional] |
|**challengeSecurityPreference** | [**ChallengeSecurityPreferenceEnum**](#ChallengeSecurityPreferenceEnum) | Settings for the frequency and difficulty at which this key triggers captcha challenges. This should only be specified for IntegrationTypes CHECKBOX and INVISIBLE. |  [optional] |
|**integrationType** | [**IntegrationTypeEnum**](#IntegrationTypeEnum) | Required. Describes how this key is integrated with the website. |  [optional] |



## Enum: ChallengeSecurityPreferenceEnum

| Name | Value |
|---- | -----|
| CHALLENGE_SECURITY_PREFERENCE_UNSPECIFIED | &quot;CHALLENGE_SECURITY_PREFERENCE_UNSPECIFIED&quot; |
| USABILITY | &quot;USABILITY&quot; |
| BALANCE | &quot;BALANCE&quot; |
| SECURITY | &quot;SECURITY&quot; |



## Enum: IntegrationTypeEnum

| Name | Value |
|---- | -----|
| INTEGRATION_TYPE_UNSPECIFIED | &quot;INTEGRATION_TYPE_UNSPECIFIED&quot; |
| SCORE | &quot;SCORE&quot; |
| CHECKBOX | &quot;CHECKBOX&quot; |
| INVISIBLE | &quot;INVISIBLE&quot; |



