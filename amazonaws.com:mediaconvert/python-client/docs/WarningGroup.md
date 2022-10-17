# WarningGroup

Contains any warning codes and their count for the job.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**code** | **int** |  | 
**count** | **int** |  | 

## Example

```python
from openapi_client.models.warning_group import WarningGroup

# TODO update the JSON string below
json = "{}"
# create an instance of WarningGroup from a JSON string
warning_group_instance = WarningGroup.from_json(json)
# print the JSON string representation of the object
print(WarningGroup.to_json())

# convert the object into a dict
warning_group_dict = warning_group_instance.to_dict()
# create an instance of WarningGroup from a dict
warning_group_from_dict = WarningGroup.from_dict(warning_group_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


