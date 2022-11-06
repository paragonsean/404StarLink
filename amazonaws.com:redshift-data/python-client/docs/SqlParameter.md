# SqlParameter

A parameter used in a SQL statement.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **str** |  | 
**value** | **str** |  | 

## Example

```python
from openapi_client.models.sql_parameter import SqlParameter

# TODO update the JSON string below
json = "{}"
# create an instance of SqlParameter from a JSON string
sql_parameter_instance = SqlParameter.from_json(json)
# print the JSON string representation of the object
print(SqlParameter.to_json())

# convert the object into a dict
sql_parameter_dict = sql_parameter_instance.to_dict()
# create an instance of SqlParameter from a dict
sql_parameter_from_dict = SqlParameter.from_dict(sql_parameter_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


