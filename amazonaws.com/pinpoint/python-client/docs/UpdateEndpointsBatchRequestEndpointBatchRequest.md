# UpdateEndpointsBatchRequestEndpointBatchRequest

Specifies a batch of endpoints to create or update and the settings and attributes to set or change for each endpoint.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**item** | **List** |  | [optional] 

## Example

```python
from openapi_client.models.update_endpoints_batch_request_endpoint_batch_request import UpdateEndpointsBatchRequestEndpointBatchRequest

# TODO update the JSON string below
json = "{}"
# create an instance of UpdateEndpointsBatchRequestEndpointBatchRequest from a JSON string
update_endpoints_batch_request_endpoint_batch_request_instance = UpdateEndpointsBatchRequestEndpointBatchRequest.from_json(json)
# print the JSON string representation of the object
print(UpdateEndpointsBatchRequestEndpointBatchRequest.to_json())

# convert the object into a dict
update_endpoints_batch_request_endpoint_batch_request_dict = update_endpoints_batch_request_endpoint_batch_request_instance.to_dict()
# create an instance of UpdateEndpointsBatchRequestEndpointBatchRequest from a dict
update_endpoints_batch_request_endpoint_batch_request_from_dict = UpdateEndpointsBatchRequestEndpointBatchRequest.from_dict(update_endpoints_batch_request_endpoint_batch_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


