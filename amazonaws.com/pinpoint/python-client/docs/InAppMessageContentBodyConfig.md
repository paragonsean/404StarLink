# InAppMessageContentBodyConfig


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**alignment** | [**Alignment**](Alignment.md) |  | 
**body** | **str** |  | 
**text_color** | **str** |  | 

## Example

```python
from openapi_client.models.in_app_message_content_body_config import InAppMessageContentBodyConfig

# TODO update the JSON string below
json = "{}"
# create an instance of InAppMessageContentBodyConfig from a JSON string
in_app_message_content_body_config_instance = InAppMessageContentBodyConfig.from_json(json)
# print the JSON string representation of the object
print(InAppMessageContentBodyConfig.to_json())

# convert the object into a dict
in_app_message_content_body_config_dict = in_app_message_content_body_config_instance.to_dict()
# create an instance of InAppMessageContentBodyConfig from a dict
in_app_message_content_body_config_from_dict = InAppMessageContentBodyConfig.from_dict(in_app_message_content_body_config_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


