

# Runtime

The definition of a Runtime for a managed notebook instance.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**accessConfig** | [**RuntimeAccessConfig**](RuntimeAccessConfig.md) |  |  [optional] |
|**createTime** | **String** | Output only. Runtime creation time. |  [optional] [readonly] |
|**healthState** | [**HealthStateEnum**](#HealthStateEnum) | Output only. Runtime health_state. |  [optional] [readonly] |
|**labels** | **Map&lt;String, String&gt;** | Optional. The labels to associate with this Managed Notebook or Runtime. Label **keys** must contain 1 to 63 characters, and must conform to [RFC 1035](https://www.ietf.org/rfc/rfc1035.txt). Label **values** may be empty, but, if present, must contain 1 to 63 characters, and must conform to [RFC 1035](https://www.ietf.org/rfc/rfc1035.txt). No more than 32 labels can be associated with a cluster. |  [optional] |
|**metrics** | [**RuntimeMetrics**](RuntimeMetrics.md) |  |  [optional] |
|**name** | **String** | Output only. The resource name of the runtime. Format: &#x60;projects/{project}/locations/{location}/runtimes/{runtimeId}&#x60; |  [optional] [readonly] |
|**softwareConfig** | [**RuntimeSoftwareConfig**](RuntimeSoftwareConfig.md) |  |  [optional] |
|**state** | [**StateEnum**](#StateEnum) | Output only. Runtime state. |  [optional] [readonly] |
|**updateTime** | **String** | Output only. Runtime update time. |  [optional] [readonly] |
|**virtualMachine** | [**VirtualMachine**](VirtualMachine.md) |  |  [optional] |



## Enum: HealthStateEnum

| Name | Value |
|---- | -----|
| HEALTH_STATE_UNSPECIFIED | &quot;HEALTH_STATE_UNSPECIFIED&quot; |
| HEALTHY | &quot;HEALTHY&quot; |
| UNHEALTHY | &quot;UNHEALTHY&quot; |
| AGENT_NOT_INSTALLED | &quot;AGENT_NOT_INSTALLED&quot; |
| AGENT_NOT_RUNNING | &quot;AGENT_NOT_RUNNING&quot; |



## Enum: StateEnum

| Name | Value |
|---- | -----|
| STATE_UNSPECIFIED | &quot;STATE_UNSPECIFIED&quot; |
| STARTING | &quot;STARTING&quot; |
| PROVISIONING | &quot;PROVISIONING&quot; |
| ACTIVE | &quot;ACTIVE&quot; |
| STOPPING | &quot;STOPPING&quot; |
| STOPPED | &quot;STOPPED&quot; |
| DELETING | &quot;DELETING&quot; |
| UPGRADING | &quot;UPGRADING&quot; |
| INITIALIZING | &quot;INITIALIZING&quot; |



