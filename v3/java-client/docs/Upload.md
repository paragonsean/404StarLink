

# Upload

Metadata returned for an upload operation.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**accountId** | **String** | Account Id to which this upload belongs. |  [optional] |
|**customDataSourceId** | **String** | Custom data source Id to which this data import belongs. |  [optional] |
|**errors** | **List&lt;String&gt;** | Data import errors collection. |  [optional] |
|**id** | **String** | A unique ID for this upload. |  [optional] |
|**kind** | **String** | Resource type for Analytics upload. |  [optional] |
|**status** | **String** | Upload status. Possible values: PENDING, COMPLETED, FAILED, DELETING, DELETED. |  [optional] |
|**uploadTime** | **OffsetDateTime** | Time this file is uploaded. |  [optional] |



