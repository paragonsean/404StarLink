# InAppMessage

Provides all fields required for building an in-app message.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**content** | **List** |  | [optional] 
**custom_config** | **Dict** |  | [optional] 
**layout** | [**Layout**](Layout.md) |  | [optional] 

## Example

```python
from openapi_client.models.in_app_message import InAppMessage

# TODO update the JSON string below
json = "{}"
# create an instance of InAppMessage from a JSON string
in_app_message_instance = InAppMessage.from_json(json)
# print the JSON string representation of the object
print(InAppMessage.to_json())

# convert the object into a dict
in_app_message_dict = in_app_message_instance.to_dict()
# create an instance of InAppMessage from a dict
in_app_message_from_dict = InAppMessage.from_dict(in_app_message_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


