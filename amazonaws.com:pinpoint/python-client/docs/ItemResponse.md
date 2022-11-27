# ItemResponse

Provides information about the results of a request to create or update an endpoint that's associated with an event.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**endpoint_item_response** | [**ItemResponseEndpointItemResponse**](ItemResponseEndpointItemResponse.md) |  | [optional] 
**events_item_response** | **Dict** |  | [optional] 

## Example

```python
from openapi_client.models.item_response import ItemResponse

# TODO update the JSON string below
json = "{}"
# create an instance of ItemResponse from a JSON string
item_response_instance = ItemResponse.from_json(json)
# print the JSON string representation of the object
print(ItemResponse.to_json())

# convert the object into a dict
item_response_dict = item_response_instance.to_dict()
# create an instance of ItemResponse from a dict
item_response_from_dict = ItemResponse.from_dict(item_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


