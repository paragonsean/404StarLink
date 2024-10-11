# UpdateEndpointsBatchRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**endpoint_batch_request** | [**UpdateEndpointsBatchRequestEndpointBatchRequest**](UpdateEndpointsBatchRequestEndpointBatchRequest.md) |  | 

## Example

```python
from openapi_client.models.update_endpoints_batch_request import UpdateEndpointsBatchRequest

# TODO update the JSON string below
json = "{}"
# create an instance of UpdateEndpointsBatchRequest from a JSON string
update_endpoints_batch_request_instance = UpdateEndpointsBatchRequest.from_json(json)
# print the JSON string representation of the object
print(UpdateEndpointsBatchRequest.to_json())

# convert the object into a dict
update_endpoints_batch_request_dict = update_endpoints_batch_request_instance.to_dict()
# create an instance of UpdateEndpointsBatchRequest from a dict
update_endpoints_batch_request_from_dict = UpdateEndpointsBatchRequest.from_dict(update_endpoints_batch_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


