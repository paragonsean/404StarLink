

# CustomDataSource

JSON template for an Analytics custom data source.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**accountId** | **String** | Account ID to which this custom data source belongs. |  [optional] |
|**childLink** | [**CustomDataSourceChildLink**](CustomDataSourceChildLink.md) |  |  [optional] |
|**created** | **OffsetDateTime** | Time this custom data source was created. |  [optional] |
|**description** | **String** | Description of custom data source. |  [optional] |
|**id** | **String** | Custom data source ID. |  [optional] |
|**importBehavior** | **String** |  |  [optional] |
|**kind** | **String** | Resource type for Analytics custom data source. |  [optional] |
|**name** | **String** | Name of this custom data source. |  [optional] |
|**parentLink** | [**CustomDataSourceParentLink**](CustomDataSourceParentLink.md) |  |  [optional] |
|**profilesLinked** | **List&lt;String&gt;** | IDs of views (profiles) linked to the custom data source. |  [optional] |
|**schema** | **List&lt;String&gt;** | Collection of schema headers of the custom data source. |  [optional] |
|**selfLink** | **String** | Link for this Analytics custom data source. |  [optional] |
|**type** | **String** | Type of the custom data source. |  [optional] |
|**updated** | **OffsetDateTime** | Time this custom data source was last modified. |  [optional] |
|**uploadType** | **String** | Upload type of the custom data source. |  [optional] |
|**webPropertyId** | **String** | Web property ID of the form UA-XXXXX-YY to which this custom data source belongs. |  [optional] |



