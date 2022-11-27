# InAppMessageContentHeaderConfig


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**alignment** | [**Alignment**](Alignment.md) |  | 
**header** | **str** |  | 
**text_color** | **str** |  | 

## Example

```python
from openapi_client.models.in_app_message_content_header_config import InAppMessageContentHeaderConfig

# TODO update the JSON string below
json = "{}"
# create an instance of InAppMessageContentHeaderConfig from a JSON string
in_app_message_content_header_config_instance = InAppMessageContentHeaderConfig.from_json(json)
# print the JSON string representation of the object
print(InAppMessageContentHeaderConfig.to_json())

# convert the object into a dict
in_app_message_content_header_config_dict = in_app_message_content_header_config_instance.to_dict()
# create an instance of InAppMessageContentHeaderConfig from a dict
in_app_message_content_header_config_from_dict = InAppMessageContentHeaderConfig.from_dict(in_app_message_content_header_config_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


