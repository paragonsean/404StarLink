

# GoogleCloudRecaptchaenterpriseV1WafSettings

Settings specific to keys that can be used for WAF (Web Application Firewall).

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**wafFeature** | [**WafFeatureEnum**](#WafFeatureEnum) | Required. The WAF feature for which this key is enabled. |  [optional] |
|**wafService** | [**WafServiceEnum**](#WafServiceEnum) | Required. The WAF service that uses this key. |  [optional] |



## Enum: WafFeatureEnum

| Name | Value |
|---- | -----|
| WAF_FEATURE_UNSPECIFIED | &quot;WAF_FEATURE_UNSPECIFIED&quot; |
| CHALLENGE_PAGE | &quot;CHALLENGE_PAGE&quot; |
| SESSION_TOKEN | &quot;SESSION_TOKEN&quot; |
| ACTION_TOKEN | &quot;ACTION_TOKEN&quot; |
| EXPRESS | &quot;EXPRESS&quot; |



## Enum: WafServiceEnum

| Name | Value |
|---- | -----|
| WAF_SERVICE_UNSPECIFIED | &quot;WAF_SERVICE_UNSPECIFIED&quot; |
| CA | &quot;CA&quot; |
| FASTLY | &quot;FASTLY&quot; |



