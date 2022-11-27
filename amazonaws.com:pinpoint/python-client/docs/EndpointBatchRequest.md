# EndpointBatchRequest

Specifies a batch of endpoints to create or update and the settings and attributes to set or change for each endpoint.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**item** | **List** |  | 

## Example

```python
from openapi_client.models.endpoint_batch_request import EndpointBatchRequest

# TODO update the JSON string below
json = "{}"
# create an instance of EndpointBatchRequest from a JSON string
endpoint_batch_request_instance = EndpointBatchRequest.from_json(json)
# print the JSON string representation of the object
print(EndpointBatchRequest.to_json())

# convert the object into a dict
endpoint_batch_request_dict = endpoint_batch_request_instance.to_dict()
# create an instance of EndpointBatchRequest from a dict
endpoint_batch_request_from_dict = EndpointBatchRequest.from_dict(endpoint_batch_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


