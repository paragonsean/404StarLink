

# GoogleCloudRecaptchaenterpriseV1EndpointVerificationInfo

Information about a verification endpoint that can be used for 2FA.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**emailAddress** | **String** | Email address for which to trigger a verification request. |  [optional] |
|**lastVerificationTime** | **String** | Output only. Timestamp of the last successful verification for the endpoint, if any. |  [optional] [readonly] |
|**phoneNumber** | **String** | Phone number for which to trigger a verification request. Should be given in E.164 format. |  [optional] |
|**requestToken** | **String** | Output only. Token to provide to the client to trigger endpoint verification. It must be used within 15 minutes. |  [optional] [readonly] |



