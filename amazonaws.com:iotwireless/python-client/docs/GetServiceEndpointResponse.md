# GetServiceEndpointResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**service_type** | [**WirelessGatewayServiceType**](WirelessGatewayServiceType.md) |  | [optional] 
**service_endpoint** | **str** |  | [optional] 
**server_trust** | **str** |  | [optional] 

## Example

```python
from openapi_client.models.get_service_endpoint_response import GetServiceEndpointResponse

# TODO update the JSON string below
json = "{}"
# create an instance of GetServiceEndpointResponse from a JSON string
get_service_endpoint_response_instance = GetServiceEndpointResponse.from_json(json)
# print the JSON string representation of the object
print(GetServiceEndpointResponse.to_json())

# convert the object into a dict
get_service_endpoint_response_dict = get_service_endpoint_response_instance.to_dict()
# create an instance of GetServiceEndpointResponse from a dict
get_service_endpoint_response_from_dict = GetServiceEndpointResponse.from_dict(get_service_endpoint_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


