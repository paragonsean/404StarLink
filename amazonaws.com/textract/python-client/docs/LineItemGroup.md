# LineItemGroup

A grouping of tables which contain LineItems, with each table identified by the table's <code>LineItemGroupIndex</code>.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**line_item_group_index** | **int** |  | [optional] 
**line_items** | **List** |  | [optional] 

## Example

```python
from openapi_client.models.line_item_group import LineItemGroup

# TODO update the JSON string below
json = "{}"
# create an instance of LineItemGroup from a JSON string
line_item_group_instance = LineItemGroup.from_json(json)
# print the JSON string representation of the object
print(LineItemGroup.to_json())

# convert the object into a dict
line_item_group_dict = line_item_group_instance.to_dict()
# create an instance of LineItemGroup from a dict
line_item_group_from_dict = LineItemGroup.from_dict(line_item_group_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


