# RedshiftDestinationConfigurationCopyCommand


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**data_table_name** | **str** |  | 
**data_table_columns** | **str** |  | [optional] 
**copy_options** | **str** |  | [optional] 

## Example

```python
from openapi_client.models.redshift_destination_configuration_copy_command import RedshiftDestinationConfigurationCopyCommand

# TODO update the JSON string below
json = "{}"
# create an instance of RedshiftDestinationConfigurationCopyCommand from a JSON string
redshift_destination_configuration_copy_command_instance = RedshiftDestinationConfigurationCopyCommand.from_json(json)
# print the JSON string representation of the object
print(RedshiftDestinationConfigurationCopyCommand.to_json())

# convert the object into a dict
redshift_destination_configuration_copy_command_dict = redshift_destination_configuration_copy_command_instance.to_dict()
# create an instance of RedshiftDestinationConfigurationCopyCommand from a dict
redshift_destination_configuration_copy_command_from_dict = RedshiftDestinationConfigurationCopyCommand.from_dict(redshift_destination_configuration_copy_command_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


