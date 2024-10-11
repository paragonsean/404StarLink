

# Connector

Definition of a Serverless VPC Access connector.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**connectedProjects** | **List&lt;String&gt;** | Output only. List of projects using the connector. |  [optional] [readonly] |
|**ipCidrRange** | **String** | The range of internal addresses that follows RFC 4632 notation. Example: &#x60;10.132.0.0/28&#x60;. |  [optional] |
|**machineType** | **String** | Machine type of VM Instance underlying connector. Default is e2-micro |  [optional] |
|**maxInstances** | **Integer** | Maximum value of instances in autoscaling group underlying the connector. |  [optional] |
|**maxThroughput** | **Integer** | Maximum throughput of the connector in Mbps. Default is 300, max is 1000. |  [optional] |
|**minInstances** | **Integer** | Minimum value of instances in autoscaling group underlying the connector. |  [optional] |
|**minThroughput** | **Integer** | Minimum throughput of the connector in Mbps. Default and min is 200. |  [optional] |
|**name** | **String** | The resource name in the format &#x60;projects/_*_/locations/_*_/connectors/_*&#x60;. |  [optional] |
|**network** | **String** | Name of a VPC network. |  [optional] |
|**state** | [**StateEnum**](#StateEnum) | Output only. State of the VPC access connector. |  [optional] [readonly] |
|**subnet** | [**Subnet**](Subnet.md) |  |  [optional] |



## Enum: StateEnum

| Name | Value |
|---- | -----|
| STATE_UNSPECIFIED | &quot;STATE_UNSPECIFIED&quot; |
| READY | &quot;READY&quot; |
| CREATING | &quot;CREATING&quot; |
| DELETING | &quot;DELETING&quot; |
| ERROR | &quot;ERROR&quot; |
| UPDATING | &quot;UPDATING&quot; |



