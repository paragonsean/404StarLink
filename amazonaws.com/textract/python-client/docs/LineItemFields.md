# LineItemFields

A structure that holds information about the different lines found in a document's tables.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**line_item_expense_fields** | **List** |  | [optional] 

## Example

```python
from openapi_client.models.line_item_fields import LineItemFields

# TODO update the JSON string below
json = "{}"
# create an instance of LineItemFields from a JSON string
line_item_fields_instance = LineItemFields.from_json(json)
# print the JSON string representation of the object
print(LineItemFields.to_json())

# convert the object into a dict
line_item_fields_dict = line_item_fields_instance.to_dict()
# create an instance of LineItemFields from a dict
line_item_fields_from_dict = LineItemFields.from_dict(line_item_fields_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


