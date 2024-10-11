

# GoogleCloudRecaptchaenterpriseV1FirewallAction

An individual action. Each action represents what to do if a policy matches.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**allow** | **Object** | An allow action continues processing a request unimpeded. |  [optional] |
|**block** | **Object** | A block action serves an HTTP error code a prevents the request from hitting the backend. |  [optional] |
|**redirect** | **Object** | A redirect action returns a 307 (temporary redirect) response, pointing the user to a ReCaptcha interstitial page to attach a token. |  [optional] |
|**setHeader** | [**GoogleCloudRecaptchaenterpriseV1FirewallActionSetHeaderAction**](GoogleCloudRecaptchaenterpriseV1FirewallActionSetHeaderAction.md) |  |  [optional] |
|**substitute** | [**GoogleCloudRecaptchaenterpriseV1FirewallActionSubstituteAction**](GoogleCloudRecaptchaenterpriseV1FirewallActionSubstituteAction.md) |  |  [optional] |



