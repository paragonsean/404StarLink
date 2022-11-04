# AddrecurrenceitemRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**frequency** | [**Frequency**](Frequency.md) |  | 
**quantity** | **int** |  | 
**seller** | **str** |  | 
**shipping_address_id** | **str** |  | 
**sku** | **str** |  | 

## Example

```python
from openapi_client.models.addrecurrenceitem_request import AddrecurrenceitemRequest

# TODO update the JSON string below
json = "{}"
# create an instance of AddrecurrenceitemRequest from a JSON string
addrecurrenceitem_request_instance = AddrecurrenceitemRequest.from_json(json)
# print the JSON string representation of the object
print(AddrecurrenceitemRequest.to_json())

# convert the object into a dict
addrecurrenceitem_request_dict = addrecurrenceitem_request_instance.to_dict()
# create an instance of AddrecurrenceitemRequest from a dict
addrecurrenceitem_request_from_dict = AddrecurrenceitemRequest.from_dict(addrecurrenceitem_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


