# EventsBatchEndpoint


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**address** | **str** |  | [optional] 
**attributes** | **Dict** |  | [optional] 
**channel_type** | [**ChannelType**](ChannelType.md) |  | [optional] 
**demographic** | [**UpdateEndpointRequestEndpointRequestDemographic**](UpdateEndpointRequestEndpointRequestDemographic.md) |  | [optional] 
**effective_date** | **str** |  | [optional] 
**endpoint_status** | **str** |  | [optional] 
**location** | [**UpdateEndpointRequestEndpointRequestLocation**](UpdateEndpointRequestEndpointRequestLocation.md) |  | [optional] 
**metrics** | **Dict** |  | [optional] 
**opt_out** | **str** |  | [optional] 
**request_id** | **str** |  | [optional] 
**user** | [**EndpointResponseUser**](EndpointResponseUser.md) |  | [optional] 

## Example

```python
from openapi_client.models.events_batch_endpoint import EventsBatchEndpoint

# TODO update the JSON string below
json = "{}"
# create an instance of EventsBatchEndpoint from a JSON string
events_batch_endpoint_instance = EventsBatchEndpoint.from_json(json)
# print the JSON string representation of the object
print(EventsBatchEndpoint.to_json())

# convert the object into a dict
events_batch_endpoint_dict = events_batch_endpoint_instance.to_dict()
# create an instance of EventsBatchEndpoint from a dict
events_batch_endpoint_from_dict = EventsBatchEndpoint.from_dict(events_batch_endpoint_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


