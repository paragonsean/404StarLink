# EndpointItemResponse

Provides the status code and message that result from processing data for an endpoint.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**message** | **str** |  | [optional] 
**status_code** | **int** |  | [optional] 

## Example

```python
from openapi_client.models.endpoint_item_response import EndpointItemResponse

# TODO update the JSON string below
json = "{}"
# create an instance of EndpointItemResponse from a JSON string
endpoint_item_response_instance = EndpointItemResponse.from_json(json)
# print the JSON string representation of the object
print(EndpointItemResponse.to_json())

# convert the object into a dict
endpoint_item_response_dict = endpoint_item_response_instance.to_dict()
# create an instance of EndpointItemResponse from a dict
endpoint_item_response_from_dict = EndpointItemResponse.from_dict(endpoint_item_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


