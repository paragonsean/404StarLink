

# GoogleCloudRecaptchaenterpriseV1Event

The event being assessed.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**expectedAction** | **String** | Optional. The expected action for this type of event. This should be the same action provided at token generation time on client-side platforms already integrated with recaptcha enterprise. |  [optional] |
|**express** | **Boolean** | Optional. Flag for a reCAPTCHA express request for an assessment without a token. If enabled, &#x60;site_key&#x60; must reference a SCORE key with WAF feature set to EXPRESS. |  [optional] |
|**firewallPolicyEvaluation** | **Boolean** | Optional. Flag for enabling firewall policy config assessment. If this flag is enabled, the firewall policy will be evaluated and a suggested firewall action will be returned in the response. |  [optional] |
|**hashedAccountId** | **byte[]** | Optional. Unique stable hashed user identifier for the request. The identifier must be hashed using hmac-sha256 with stable secret. |  [optional] |
|**headers** | **List&lt;String&gt;** | Optional. HTTP header information about the request. |  [optional] |
|**ja3** | **String** | Optional. Optional JA3 fingerprint for SSL clients. |  [optional] |
|**requestedUri** | **String** | Optional. The URI resource the user requested that triggered an assessment. |  [optional] |
|**siteKey** | **String** | Optional. The site key that was used to invoke reCAPTCHA Enterprise on your site and generate the token. |  [optional] |
|**token** | **String** | Optional. The user response token provided by the reCAPTCHA Enterprise client-side integration on your site. |  [optional] |
|**transactionData** | [**GoogleCloudRecaptchaenterpriseV1TransactionData**](GoogleCloudRecaptchaenterpriseV1TransactionData.md) |  |  [optional] |
|**userAgent** | **String** | Optional. The user agent present in the request from the user&#39;s device related to this event. |  [optional] |
|**userIpAddress** | **String** | Optional. The IP address in the request from the user&#39;s device related to this event. |  [optional] |
|**wafTokenAssessment** | **Boolean** | Optional. Flag for running WAF token assessment. If enabled, the token must be specified, and have been created by a WAF-enabled key. |  [optional] |



