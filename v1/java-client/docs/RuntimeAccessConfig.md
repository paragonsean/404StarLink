

# RuntimeAccessConfig

Specifies the login configuration for Runtime

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**accessType** | [**AccessTypeEnum**](#AccessTypeEnum) | The type of access mode this instance. |  [optional] |
|**proxyUri** | **String** | Output only. The proxy endpoint that is used to access the runtime. |  [optional] [readonly] |
|**runtimeOwner** | **String** | The owner of this runtime after creation. Format: &#x60;alias@example.com&#x60; Currently supports one owner only. |  [optional] |



## Enum: AccessTypeEnum

| Name | Value |
|---- | -----|
| RUNTIME_ACCESS_TYPE_UNSPECIFIED | &quot;RUNTIME_ACCESS_TYPE_UNSPECIFIED&quot; |
| SINGLE_USER | &quot;SINGLE_USER&quot; |
| SERVICE_ACCOUNT | &quot;SERVICE_ACCOUNT&quot; |



