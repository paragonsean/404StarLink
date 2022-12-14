# ListPriceListsResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**price_lists** | **List** |  | [optional] 
**next_token** | **str** |  | [optional] 

## Example

```python
from openapi_client.models.list_price_lists_response import ListPriceListsResponse

# TODO update the JSON string below
json = "{}"
# create an instance of ListPriceListsResponse from a JSON string
list_price_lists_response_instance = ListPriceListsResponse.from_json(json)
# print the JSON string representation of the object
print(ListPriceListsResponse.to_json())

# convert the object into a dict
list_price_lists_response_dict = list_price_lists_response_instance.to_dict()
# create an instance of ListPriceListsResponse from a dict
list_price_lists_response_from_dict = ListPriceListsResponse.from_dict(list_price_lists_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


