# ListPositionConfigurationsResponse

This operation is no longer supported.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**position_configuration_list** | **List** |  | [optional] 
**next_token** | **str** |  | [optional] 

## Example

```python
from openapi_client.models.list_position_configurations_response import ListPositionConfigurationsResponse

# TODO update the JSON string below
json = "{}"
# create an instance of ListPositionConfigurationsResponse from a JSON string
list_position_configurations_response_instance = ListPositionConfigurationsResponse.from_json(json)
# print the JSON string representation of the object
print(ListPositionConfigurationsResponse.to_json())

# convert the object into a dict
list_position_configurations_response_dict = list_position_configurations_response_instance.to_dict()
# create an instance of ListPositionConfigurationsResponse from a dict
list_position_configurations_response_from_dict = ListPositionConfigurationsResponse.from_dict(list_position_configurations_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


