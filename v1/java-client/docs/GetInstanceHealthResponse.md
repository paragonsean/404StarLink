

# GetInstanceHealthResponse

Response for checking if a notebook instance is healthy.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**healthInfo** | **Map&lt;String, String&gt;** | Output only. Additional information about instance health. Example: healthInfo\&quot;: { \&quot;docker_proxy_agent_status\&quot;: \&quot;1\&quot;, \&quot;docker_status\&quot;: \&quot;1\&quot;, \&quot;jupyterlab_api_status\&quot;: \&quot;-1\&quot;, \&quot;jupyterlab_status\&quot;: \&quot;-1\&quot;, \&quot;updated\&quot;: \&quot;2020-10-18 09:40:03.573409\&quot; } |  [optional] [readonly] |
|**healthState** | [**HealthStateEnum**](#HealthStateEnum) | Output only. Runtime health_state. |  [optional] [readonly] |



## Enum: HealthStateEnum

| Name | Value |
|---- | -----|
| HEALTH_STATE_UNSPECIFIED | &quot;HEALTH_STATE_UNSPECIFIED&quot; |
| HEALTHY | &quot;HEALTHY&quot; |
| UNHEALTHY | &quot;UNHEALTHY&quot; |
| AGENT_NOT_INSTALLED | &quot;AGENT_NOT_INSTALLED&quot; |
| AGENT_NOT_RUNNING | &quot;AGENT_NOT_RUNNING&quot; |



