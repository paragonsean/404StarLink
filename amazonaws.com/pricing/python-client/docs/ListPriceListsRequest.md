# ListPriceListsRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**service_code** | **str** |  | 
**effective_date** | **datetime** |  | 
**region_code** | **str** |  | [optional] 
**currency_code** | **str** |  | 
**next_token** | **str** |  | [optional] 
**max_results** | **int** |  | [optional] 

## Example

```python
from openapi_client.models.list_price_lists_request import ListPriceListsRequest

# TODO update the JSON string below
json = "{}"
# create an instance of ListPriceListsRequest from a JSON string
list_price_lists_request_instance = ListPriceListsRequest.from_json(json)
# print the JSON string representation of the object
print(ListPriceListsRequest.to_json())

# convert the object into a dict
list_price_lists_request_dict = list_price_lists_request_instance.to_dict()
# create an instance of ListPriceListsRequest from a dict
list_price_lists_request_from_dict = ListPriceListsRequest.from_dict(list_price_lists_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


