# DeleteUserEndpointsResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**endpoints_response** | [**EndpointsResponse**](EndpointsResponse.md) |  | 

## Example

```python
from openapi_client.models.delete_user_endpoints_response import DeleteUserEndpointsResponse

# TODO update the JSON string below
json = "{}"
# create an instance of DeleteUserEndpointsResponse from a JSON string
delete_user_endpoints_response_instance = DeleteUserEndpointsResponse.from_json(json)
# print the JSON string representation of the object
print(DeleteUserEndpointsResponse.to_json())

# convert the object into a dict
delete_user_endpoints_response_dict = delete_user_endpoints_response_instance.to_dict()
# create an instance of DeleteUserEndpointsResponse from a dict
delete_user_endpoints_response_from_dict = DeleteUserEndpointsResponse.from_dict(delete_user_endpoints_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


