# PublicEndpoint

Specifies the properties and attributes of an endpoint that's associated with an event.

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
from openapi_client.models.public_endpoint import PublicEndpoint

# TODO update the JSON string below
json = "{}"
# create an instance of PublicEndpoint from a JSON string
public_endpoint_instance = PublicEndpoint.from_json(json)
# print the JSON string representation of the object
print(PublicEndpoint.to_json())

# convert the object into a dict
public_endpoint_dict = public_endpoint_instance.to_dict()
# create an instance of PublicEndpoint from a dict
public_endpoint_from_dict = PublicEndpoint.from_dict(public_endpoint_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


