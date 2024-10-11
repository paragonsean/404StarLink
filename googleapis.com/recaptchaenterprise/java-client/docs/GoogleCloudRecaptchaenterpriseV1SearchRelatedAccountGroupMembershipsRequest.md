

# GoogleCloudRecaptchaenterpriseV1SearchRelatedAccountGroupMembershipsRequest

The request message to search related account group memberships.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**hashedAccountId** | **byte[]** | Optional. The unique stable hashed user identifier we should search connections to. The identifier should correspond to a &#x60;hashed_account_id&#x60; provided in a previous &#x60;CreateAssessment&#x60; or &#x60;AnnotateAssessment&#x60; call. |  [optional] |
|**pageSize** | **Integer** | Optional. The maximum number of groups to return. The service might return fewer than this value. If unspecified, at most 50 groups are returned. The maximum value is 1000; values above 1000 are coerced to 1000. |  [optional] |
|**pageToken** | **String** | Optional. A page token, received from a previous &#x60;SearchRelatedAccountGroupMemberships&#x60; call. Provide this to retrieve the subsequent page. When paginating, all other parameters provided to &#x60;SearchRelatedAccountGroupMemberships&#x60; must match the call that provided the page token. |  [optional] |



