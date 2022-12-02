# CopyCommand

Describes a <code>COPY</code> command for Amazon Redshift.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**data_table_name** | **str** |  | 
**data_table_columns** | **str** |  | [optional] 
**copy_options** | **str** |  | [optional] 

## Example

```python
from openapi_client.models.copy_command import CopyCommand

# TODO update the JSON string below
json = "{}"
# create an instance of CopyCommand from a JSON string
copy_command_instance = CopyCommand.from_json(json)
# print the JSON string representation of the object
print(CopyCommand.to_json())

# convert the object into a dict
copy_command_dict = copy_command_instance.to_dict()
# create an instance of CopyCommand from a dict
copy_command_from_dict = CopyCommand.from_dict(copy_command_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


