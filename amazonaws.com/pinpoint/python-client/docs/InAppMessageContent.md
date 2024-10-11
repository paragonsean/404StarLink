# InAppMessageContent

The configuration for the message content.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**background_color** | **str** |  | [optional] 
**body_config** | [**InAppMessageContentBodyConfig**](InAppMessageContentBodyConfig.md) |  | [optional] 
**header_config** | [**InAppMessageContentHeaderConfig**](InAppMessageContentHeaderConfig.md) |  | [optional] 
**image_url** | **str** |  | [optional] 
**primary_btn** | [**InAppMessageContentPrimaryBtn**](InAppMessageContentPrimaryBtn.md) |  | [optional] 
**secondary_btn** | [**InAppMessageContentSecondaryBtn**](InAppMessageContentSecondaryBtn.md) |  | [optional] 

## Example

```python
from openapi_client.models.in_app_message_content import InAppMessageContent

# TODO update the JSON string below
json = "{}"
# create an instance of InAppMessageContent from a JSON string
in_app_message_content_instance = InAppMessageContent.from_json(json)
# print the JSON string representation of the object
print(InAppMessageContent.to_json())

# convert the object into a dict
in_app_message_content_dict = in_app_message_content_instance.to_dict()
# create an instance of InAppMessageContent from a dict
in_app_message_content_from_dict = InAppMessageContent.from_dict(in_app_message_content_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


