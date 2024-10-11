# EndpointRequest

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
from openapi_client.models.endpoint_request import EndpointRequest

# TODO update the JSON string below
json = "{}"
# create an instance of EndpointRequest from a JSON string
endpoint_request_instance = EndpointRequest.from_json(json)
# print the JSON string representation of the object
print(EndpointRequest.to_json())

# convert the object into a dict
endpoint_request_dict = endpoint_request_instance.to_dict()
# create an instance of EndpointRequest from a dict
endpoint_request_from_dict = EndpointRequest.from_dict(endpoint_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


