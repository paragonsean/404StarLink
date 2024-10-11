# DefaultMessage

Specifies the default message for all channels.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**body** | **str** |  | [optional] 
**substitutions** | **Dict** |  | [optional] 

## Example

```python
from openapi_client.models.default_message import DefaultMessage

# TODO update the JSON string below
json = "{}"
# create an instance of DefaultMessage from a JSON string
default_message_instance = DefaultMessage.from_json(json)
# print the JSON string representation of the object
print(DefaultMessage.to_json())

# convert the object into a dict
default_message_dict = default_message_instance.to_dict()
# create an instance of DefaultMessage from a dict
default_message_from_dict = DefaultMessage.from_dict(default_message_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


