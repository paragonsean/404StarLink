# TableMember

The properties of a table. 

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **str** |  | [optional] 
**var_schema** | **str** |  | [optional] 
**type** | **str** |  | [optional] 

## Example

```python
from openapi_client.models.table_member import TableMember

# TODO update the JSON string below
json = "{}"
# create an instance of TableMember from a JSON string
table_member_instance = TableMember.from_json(json)
# print the JSON string representation of the object
print(TableMember.to_json())

# convert the object into a dict
table_member_dict = table_member_instance.to_dict()
# create an instance of TableMember from a dict
table_member_from_dict = TableMember.from_dict(table_member_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


