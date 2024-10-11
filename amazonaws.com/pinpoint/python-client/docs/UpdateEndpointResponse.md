# UpdateEndpointResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**message_body** | [**MessageBody**](MessageBody.md) |  | 

## Example

```python
from openapi_client.models.update_endpoint_response import UpdateEndpointResponse

# TODO update the JSON string below
json = "{}"
# create an instance of UpdateEndpointResponse from a JSON string
update_endpoint_response_instance = UpdateEndpointResponse.from_json(json)
# print the JSON string representation of the object
print(UpdateEndpointResponse.to_json())

# convert the object into a dict
update_endpoint_response_dict = update_endpoint_response_instance.to_dict()
# create an instance of UpdateEndpointResponse from a dict
update_endpoint_response_from_dict = UpdateEndpointResponse.from_dict(update_endpoint_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


