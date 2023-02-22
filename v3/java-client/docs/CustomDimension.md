

# CustomDimension

JSON template for Analytics Custom Dimension.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**accountId** | **String** | Account ID. |  [optional] |
|**active** | **Boolean** | Boolean indicating whether the custom dimension is active. |  [optional] |
|**created** | **OffsetDateTime** | Time the custom dimension was created. |  [optional] [readonly] |
|**id** | **String** | Custom dimension ID. |  [optional] |
|**index** | **Integer** | Index of the custom dimension. |  [optional] [readonly] |
|**kind** | **String** | Kind value for a custom dimension. Set to \&quot;analytics#customDimension\&quot;. It is a read-only field. |  [optional] [readonly] |
|**name** | **String** | Name of the custom dimension. |  [optional] |
|**parentLink** | [**CustomDimensionParentLink**](CustomDimensionParentLink.md) |  |  [optional] |
|**scope** | **String** | Scope of the custom dimension: HIT, SESSION, USER or PRODUCT. |  [optional] |
|**selfLink** | **String** | Link for the custom dimension |  [optional] [readonly] |
|**updated** | **OffsetDateTime** | Time the custom dimension was last modified. |  [optional] [readonly] |
|**webPropertyId** | **String** | Property ID. |  [optional] |



