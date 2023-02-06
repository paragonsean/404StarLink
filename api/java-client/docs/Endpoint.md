

# Endpoint

Endpoint describes a single IDS endpoint. It defines a forwarding rule to which packets can be sent for IDS inspection.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**createTime** | **String** | Output only. The create time timestamp. |  [optional] [readonly] |
|**description** | **String** | User-provided description of the endpoint |  [optional] |
|**endpointForwardingRule** | **String** | Output only. The fully qualified URL of the endpoint&#39;s ILB Forwarding Rule. |  [optional] [readonly] |
|**endpointIp** | **String** | Output only. The IP address of the IDS Endpoint&#39;s ILB. |  [optional] [readonly] |
|**labels** | **Map&lt;String, String&gt;** | The labels of the endpoint. |  [optional] |
|**name** | **String** | Output only. The name of the endpoint. |  [optional] [readonly] |
|**network** | **String** | Required. The fully qualified URL of the network to which the IDS Endpoint is attached. |  [optional] |
|**severity** | [**SeverityEnum**](#SeverityEnum) | Required. Lowest threat severity that this endpoint will alert on. |  [optional] |
|**state** | [**StateEnum**](#StateEnum) | Output only. Current state of the endpoint. |  [optional] [readonly] |
|**threatExceptions** | **List&lt;String&gt;** | List of threat IDs to be excepted from generating alerts. |  [optional] |
|**trafficLogs** | **Boolean** | Whether the endpoint should report traffic logs in addition to threat logs. |  [optional] |
|**updateTime** | **String** | Output only. The update time timestamp. |  [optional] [readonly] |



## Enum: SeverityEnum

| Name | Value |
|---- | -----|
| SEVERITY_UNSPECIFIED | &quot;SEVERITY_UNSPECIFIED&quot; |
| INFORMATIONAL | &quot;INFORMATIONAL&quot; |
| LOW | &quot;LOW&quot; |
| MEDIUM | &quot;MEDIUM&quot; |
| HIGH | &quot;HIGH&quot; |
| CRITICAL | &quot;CRITICAL&quot; |



## Enum: StateEnum

| Name | Value |
|---- | -----|
| STATE_UNSPECIFIED | &quot;STATE_UNSPECIFIED&quot; |
| CREATING | &quot;CREATING&quot; |
| READY | &quot;READY&quot; |
| DELETING | &quot;DELETING&quot; |
| UPDATING | &quot;UPDATING&quot; |



