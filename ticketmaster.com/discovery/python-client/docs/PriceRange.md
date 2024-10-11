# PriceRange

PriceRange

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**currency** | **str** | Currency | [optional] 
**max** | **float** | Maximum price | [optional] 
**min** | **float** | Minimum price | [optional] 
**type** | **str** | Type of price | [optional] 

## Example

```python
from openapi_client.models.price_range import PriceRange

# TODO update the JSON string below
json = "{}"
# create an instance of PriceRange from a JSON string
price_range_instance = PriceRange.from_json(json)
# print the JSON string representation of the object
print(PriceRange.to_json())

# convert the object into a dict
price_range_dict = price_range_instance.to_dict()
# create an instance of PriceRange from a dict
price_range_from_dict = PriceRange.from_dict(price_range_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


