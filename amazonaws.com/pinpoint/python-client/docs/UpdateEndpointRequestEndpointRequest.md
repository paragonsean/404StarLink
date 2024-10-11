# UpdateEndpointRequestEndpointRequest

Specifies the channel type and other settings for an endpoint.

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
**user** | [**UpdateEndpointRequestEndpointRequestUser**](UpdateEndpointRequestEndpointRequestUser.md) |  | [optional] 

## Example

```python
from openapi_client.models.update_endpoint_request_endpoint_request import UpdateEndpointRequestEndpointRequest

# TODO update the JSON string below
json = "{}"
# create an instance of UpdateEndpointRequestEndpointRequest from a JSON string
update_endpoint_request_endpoint_request_instance = UpdateEndpointRequestEndpointRequest.from_json(json)
# print the JSON string representation of the object
print(UpdateEndpointRequestEndpointRequest.to_json())

# convert the object into a dict
update_endpoint_request_endpoint_request_dict = update_endpoint_request_endpoint_request_instance.to_dict()
# create an instance of UpdateEndpointRequestEndpointRequest from a dict
update_endpoint_request_endpoint_request_from_dict = UpdateEndpointRequestEndpointRequest.from_dict(update_endpoint_request_endpoint_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


