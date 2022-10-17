# OutputGroupDetail

Contains details about the output groups specified in the job settings.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**output_details** | **List** |  | [optional] 

## Example

```python
from openapi_client.models.output_group_detail import OutputGroupDetail

# TODO update the JSON string below
json = "{}"
# create an instance of OutputGroupDetail from a JSON string
output_group_detail_instance = OutputGroupDetail.from_json(json)
# print the JSON string representation of the object
print(OutputGroupDetail.to_json())

# convert the object into a dict
output_group_detail_dict = output_group_detail_instance.to_dict()
# create an instance of OutputGroupDetail from a dict
output_group_detail_from_dict = OutputGroupDetail.from_dict(output_group_detail_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


