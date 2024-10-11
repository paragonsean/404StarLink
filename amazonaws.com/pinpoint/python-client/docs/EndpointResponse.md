# EndpointResponse

Provides information about the channel type and other settings for an endpoint.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**address** | **str** |  | [optional] 
**application_id** | **str** |  | [optional] 
**attributes** | **Dict** |  | [optional] 
**channel_type** | [**ChannelType**](ChannelType.md) |  | [optional] 
**cohort_id** | **str** |  | [optional] 
**creation_date** | **str** |  | [optional] 
**demographic** | [**UpdateEndpointRequestEndpointRequestDemographic**](UpdateEndpointRequestEndpointRequestDemographic.md) |  | [optional] 
**effective_date** | **str** |  | [optional] 
**endpoint_status** | **str** |  | [optional] 
**id** | **str** |  | [optional] 
**location** | [**UpdateEndpointRequestEndpointRequestLocation**](UpdateEndpointRequestEndpointRequestLocation.md) |  | [optional] 
**metrics** | **Dict** |  | [optional] 
**opt_out** | **str** |  | [optional] 
**request_id** | **str** |  | [optional] 
**user** | [**EndpointResponseUser**](EndpointResponseUser.md) |  | [optional] 

## Example

```python
from openapi_client.models.endpoint_response import EndpointResponse

# TODO update the JSON string below
json = "{}"
# create an instance of EndpointResponse from a JSON string
endpoint_response_instance = EndpointResponse.from_json(json)
# print the JSON string representation of the object
print(EndpointResponse.to_json())

# convert the object into a dict
endpoint_response_dict = endpoint_response_instance.to_dict()
# create an instance of EndpointResponse from a dict
endpoint_response_from_dict = EndpointResponse.from_dict(endpoint_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


