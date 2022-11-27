# GetUserEndpointsResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**endpoints_response** | [**EndpointsResponse**](EndpointsResponse.md) |  | 

## Example

```python
from openapi_client.models.get_user_endpoints_response import GetUserEndpointsResponse

# TODO update the JSON string below
json = "{}"
# create an instance of GetUserEndpointsResponse from a JSON string
get_user_endpoints_response_instance = GetUserEndpointsResponse.from_json(json)
# print the JSON string representation of the object
print(GetUserEndpointsResponse.to_json())

# convert the object into a dict
get_user_endpoints_response_dict = get_user_endpoints_response_instance.to_dict()
# create an instance of GetUserEndpointsResponse from a dict
get_user_endpoints_response_from_dict = GetUserEndpointsResponse.from_dict(get_user_endpoints_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


