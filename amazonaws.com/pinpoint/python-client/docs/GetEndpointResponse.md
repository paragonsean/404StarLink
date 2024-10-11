# GetEndpointResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**endpoint_response** | [**EndpointResponse**](EndpointResponse.md) |  | 

## Example

```python
from openapi_client.models.get_endpoint_response import GetEndpointResponse

# TODO update the JSON string below
json = "{}"
# create an instance of GetEndpointResponse from a JSON string
get_endpoint_response_instance = GetEndpointResponse.from_json(json)
# print the JSON string representation of the object
print(GetEndpointResponse.to_json())

# convert the object into a dict
get_endpoint_response_dict = get_endpoint_response_instance.to_dict()
# create an instance of GetEndpointResponse from a dict
get_endpoint_response_from_dict = GetEndpointResponse.from_dict(get_endpoint_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


