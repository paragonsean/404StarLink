

# Event

The definition of an Event for a managed / semi-managed notebook instance.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**details** | **Map&lt;String, String&gt;** | Optional. Event details. This field is used to pass event information. |  [optional] |
|**reportTime** | **String** | Event report time. |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) | Event type. |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| EVENT_TYPE_UNSPECIFIED | &quot;EVENT_TYPE_UNSPECIFIED&quot; |
| IDLE | &quot;IDLE&quot; |
| HEARTBEAT | &quot;HEARTBEAT&quot; |
| HEALTH | &quot;HEALTH&quot; |
| MAINTENANCE | &quot;MAINTENANCE&quot; |



