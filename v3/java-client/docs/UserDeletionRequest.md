

# UserDeletionRequest

JSON template for a user deletion request resource.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**deletionRequestTime** | **OffsetDateTime** | This marks the point in time for which all user data before should be deleted |  [optional] [readonly] |
|**firebaseProjectId** | **String** | Firebase Project Id |  [optional] |
|**id** | [**UserDeletionRequestId**](UserDeletionRequestId.md) |  |  [optional] |
|**kind** | **String** | Value is \&quot;analytics#userDeletionRequest\&quot;. |  [optional] |
|**propertyId** | **String** | Property ID |  [optional] |
|**webPropertyId** | **String** | Web property ID of the form UA-XXXXX-YY. |  [optional] |



