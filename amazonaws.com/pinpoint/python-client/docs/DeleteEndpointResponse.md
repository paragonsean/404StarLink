# DeleteEndpointResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**endpoint_response** | [**EndpointResponse**](EndpointResponse.md) |  | 

## Example

```python
from openapi_client.models.delete_endpoint_response import DeleteEndpointResponse

# TODO update the JSON string below
json = "{}"
# create an instance of DeleteEndpointResponse from a JSON string
delete_endpoint_response_instance = DeleteEndpointResponse.from_json(json)
# print the JSON string representation of the object
print(DeleteEndpointResponse.to_json())

# convert the object into a dict
delete_endpoint_response_dict = delete_endpoint_response_instance.to_dict()
# create an instance of DeleteEndpointResponse from a dict
delete_endpoint_response_from_dict = DeleteEndpointResponse.from_dict(delete_endpoint_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


