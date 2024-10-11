# InAppMessageContentSecondaryBtn


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**android** | [**InAppMessageButtonAndroid**](InAppMessageButtonAndroid.md) |  | [optional] 
**default_config** | [**InAppMessageButtonDefaultConfig**](InAppMessageButtonDefaultConfig.md) |  | [optional] 
**ios** | [**InAppMessageButtonAndroid**](InAppMessageButtonAndroid.md) |  | [optional] 
**web** | [**InAppMessageButtonAndroid**](InAppMessageButtonAndroid.md) |  | [optional] 

## Example

```python
from openapi_client.models.in_app_message_content_secondary_btn import InAppMessageContentSecondaryBtn

# TODO update the JSON string below
json = "{}"
# create an instance of InAppMessageContentSecondaryBtn from a JSON string
in_app_message_content_secondary_btn_instance = InAppMessageContentSecondaryBtn.from_json(json)
# print the JSON string representation of the object
print(InAppMessageContentSecondaryBtn.to_json())

# convert the object into a dict
in_app_message_content_secondary_btn_dict = in_app_message_content_secondary_btn_instance.to_dict()
# create an instance of InAppMessageContentSecondaryBtn from a dict
in_app_message_content_secondary_btn_from_dict = InAppMessageContentSecondaryBtn.from_dict(in_app_message_content_secondary_btn_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


