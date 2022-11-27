# ItemResponseEndpointItemResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**message** | **str** |  | [optional] 
**status_code** | **int** |  | [optional] 

## Example

```python
from openapi_client.models.item_response_endpoint_item_response import ItemResponseEndpointItemResponse

# TODO update the JSON string below
json = "{}"
# create an instance of ItemResponseEndpointItemResponse from a JSON string
item_response_endpoint_item_response_instance = ItemResponseEndpointItemResponse.from_json(json)
# print the JSON string representation of the object
print(ItemResponseEndpointItemResponse.to_json())

# convert the object into a dict
item_response_endpoint_item_response_dict = item_response_endpoint_item_response_instance.to_dict()
# create an instance of ItemResponseEndpointItemResponse from a dict
item_response_endpoint_item_response_from_dict = ItemResponseEndpointItemResponse.from_dict(item_response_endpoint_item_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


