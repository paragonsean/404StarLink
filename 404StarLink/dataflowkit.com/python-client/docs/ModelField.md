# ModelField


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**attrs** | **List[str]** | A set of attributes to extract from a Field. Find more information about attributes | 
**details** | [**Parserequest**](Parserequest.md) | Details themself represent independent Parse request that extracts data from linked pages. | [optional] 
**filters** | [**List[FieldFiltersInner]**](FieldFiltersInner.md) | Filters are used to pre-processing of text data when extracting. | [optional] 
**name** | **str** | Field name is used to aggregate results. | 
**selector** | **str** | Selector represents a CSS selector for data extraction within the given block. | 
**type** | **int** | Selector type. ( 0 - image, 1 - text, 2 - link) | 

## Example

```python
from openapi_client.models.model_field import ModelField

# TODO update the JSON string below
json = "{}"
# create an instance of ModelField from a JSON string
model_field_instance = ModelField.from_json(json)
# print the JSON string representation of the object
print(ModelField.to_json())

# convert the object into a dict
model_field_dict = model_field_instance.to_dict()
# create an instance of ModelField from a dict
model_field_from_dict = ModelField.from_dict(model_field_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


