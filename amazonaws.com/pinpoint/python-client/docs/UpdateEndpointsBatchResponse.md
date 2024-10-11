# UpdateEndpointsBatchResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**message_body** | [**MessageBody**](MessageBody.md) |  | 

## Example

```python
from openapi_client.models.update_endpoints_batch_response import UpdateEndpointsBatchResponse

# TODO update the JSON string below
json = "{}"
# create an instance of UpdateEndpointsBatchResponse from a JSON string
update_endpoints_batch_response_instance = UpdateEndpointsBatchResponse.from_json(json)
# print the JSON string representation of the object
print(UpdateEndpointsBatchResponse.to_json())

# convert the object into a dict
update_endpoints_batch_response_dict = update_endpoints_batch_response_instance.to_dict()
# create an instance of UpdateEndpointsBatchResponse from a dict
update_endpoints_batch_response_from_dict = UpdateEndpointsBatchResponse.from_dict(update_endpoints_batch_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


